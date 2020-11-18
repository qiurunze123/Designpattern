package com.fengsao.pattern.design.pattern.structural.flyweight;

/**
 * Created by geekq
 */
public class Test {
    private static final String departments[] = {"RD","QA","PM","BD"};

    public static void main(String[] args) {
//        for(int i=0; i<10; i++){
//            String department = departments[(int)(Math.random() * departments.length)];
//            Manager manager = (Manager) EmployeeFactory.getManager(department);
//            manager.report();
//
//        }
        Integer a = Integer.valueOf(100);
        Integer b = 100;

        Integer c = Integer.valueOf(1000);
        Integer d = 1000;

        System.out.println("a==b:"+(a==b));

        System.out.println("c==d:"+(c==d));

    }
}
