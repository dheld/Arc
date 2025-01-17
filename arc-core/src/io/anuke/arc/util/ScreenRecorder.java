package io.anuke.arc.util;

import io.anuke.arc.Core;
import io.anuke.arc.files.FileHandle;
import io.anuke.arc.util.reflect.ClassReflection;
import io.anuke.arc.util.reflect.Method;

public class ScreenRecorder{
    private static Runnable record;

    static{
        try{
            Class<?> recorderClass = ClassReflection.forName("io.anuke.arc.recorder.GifRecorder");
            Object recorder = ClassReflection.getConstructor(recorderClass).newInstance();
            Method method = ClassReflection.getMethod(recorderClass, "setExportDirectory", FileHandle.class);
            method.invoke(recorder, Core.files.local("../../desktop/gifexport"));
            Method r = ClassReflection.getMethod(recorderClass, "update");
            Object[] args = {};
            record = () -> {
                try{
                    r.invoke(recorder, args);
                }catch(Exception ignored){
                }
            };
        }catch(Throwable ignored){}
    }

    public static void record(){
        if(record == null) return;
        record.run();
    }
}
