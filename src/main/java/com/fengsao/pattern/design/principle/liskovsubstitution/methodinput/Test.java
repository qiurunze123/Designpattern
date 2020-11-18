package com.fengsao.pattern.design.principle.liskovsubstitution.methodinput;

import java.util.HashMap;

/**
 * Created by geekq
 */
public class Test {
    public static void main(String[] args) {
        Base child = new Child();
        HashMap hashMap = new HashMap();
        child.method(hashMap);
    }
}
