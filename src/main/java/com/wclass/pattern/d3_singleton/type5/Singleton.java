package com.wclass.pattern.d3_singleton.type5;

public class Singleton {
    private static Singleton singleton;
    private Singleton(){
    }
    public static Singleton getInstance(){
        if (singleton == null){
            synchronized (Singleton.class){
                singleton = new Singleton();
            }
        }
        return singleton;
    }
}
