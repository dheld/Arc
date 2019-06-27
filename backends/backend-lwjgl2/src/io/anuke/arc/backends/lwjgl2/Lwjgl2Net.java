package io.anuke.arc.backends.lwjgl2;

import io.anuke.arc.Net;
import io.anuke.arc.function.Consumer;
import io.anuke.arc.util.NetJavaImpl;
import org.lwjgl.Sys;

public class Lwjgl2Net implements Net{
    NetJavaImpl impl = new NetJavaImpl();

    @Override
    public void http(HttpRequest httpRequest, Consumer<HttpResponse> success, Consumer<Throwable> failure){
        impl.http(httpRequest, success, failure);
    }

    @Override
    public boolean openURI(String URI){
        return Sys.openURL(URI);
    }

}