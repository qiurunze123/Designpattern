package com.geekq.design.principle.liskovsubstitution.methodinput;

import java.util.HashMap;

/**
 * Created by geekq
 */
public class Base {
    public void method(HashMap map){
        System.out.println("父类被执行");
    }
}
