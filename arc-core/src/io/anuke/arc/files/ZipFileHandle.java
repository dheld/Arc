package io.anuke.arc.files;

import io.anuke.arc.Files.*;
import io.anuke.arc.collection.*;
import io.anuke.arc.util.*;

import java.io.*;
import java.util.*;
import java.util.zip.*;

/** A FileHandle meant for easily representing and reading the contents of a zip/jar file.*/
public class ZipFileHandle extends FileHandle{
    private ZipFileHandle[] children = {};
    private ZipFileHandle parent;

    private final ZipEntry entry;
    private final ZipFile zip;

    public ZipFileHandle(FileHandle zipFileLoc){
        super(new File(""), FileType.Absolute);
        zip = null;
        entry = null;

        try{
            ZipFile zip = new ZipFile(zipFileLoc.file());
            Array<ZipFileHandle> handles = Array.with(Collections.list(zip.entries()).toArray(new ZipEntry[0])).map(entry -> new ZipFileHandle(entry, zip));
            handles.add(this);
            handles.each(f -> f.init(handles));
            parent = null;
            handles.each(f -> f.children = handles.select(z -> z.parent == f).toArray(ZipFileHandle.class));
        }catch(IOException e){
            throw new ArcRuntimeException(e);
        }
    }

    private ZipFileHandle(ZipEntry entry, ZipFile file){
        super(new File(entry.getName()), FileType.Absolute);
        this.entry = entry;
        this.zip = file;
    }

    private void init(Array<ZipFileHandle> files){
        parent = files.find(other -> other.isDirectory() && other != this && path().startsWith(other.path()) && !path().substring(1 + other.path().length()).contains("/"));
        if(parent == null){
            parent = files.peek();
        }
    }

    @Override
    public boolean exists(){
        return true;
    }

    @Override
    public FileHandle child(String name){
        for(ZipFileHandle child : children){
            if(child.name().equals(name)){
                return child;
            }
        }
        return new FileHandle(new File(file, name)){
            @Override
            public boolean exists(){
                return false;
            }
        };
    }

    @Override
    public String name(){
        return file.getName();
    }

    @Override
    public FileHandle parent(){
        return parent;
    }

    @Override
    public FileHandle[] list(){
        return children;
    }

    @Override
    public boolean isDirectory(){
        return entry == null || entry.isDirectory();
    }

    @Override
    public InputStream read(){
        if(entry == null) throw new RuntimeException("Not permitted.");
        try{
            return zip.getInputStream(entry);
        }catch(IOException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public long length(){
        return isDirectory() ? 0 : entry.getSize();
    }
}