package com.geek.designpattern.singleton;

public class T implements Runnable {
    @Override
    public void run() {
//        LazySingleton lazySingleton = LazySingleton.getInstance();
        StaticInnerClassSingleton staticInnerClassSingleton= StaticInnerClassSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+""+ staticInnerClassSingleton);
    }
}
