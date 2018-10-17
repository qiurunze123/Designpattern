package com.geekq.design.principle.dependenceinversion;

/**
 * Created by geekq
 */
public class Test {

    //v1
//    public static void main(String[] args) {
//        Geekq geekq = new Geekq();
//        geekq.studyJavaCourse();
//        geekq.studyFECourse();
//    }

    //v2
//    public static void main(String[] args) {
//        Geekq geekq = new Geekq();
//        geekq.studyImoocCourse(new JavaCourse());
//        geekq.studyImoocCourse(new FECourse());
//        geekq.studyImoocCourse(new PythonCourse());
//    }

    //v3
//    public static void main(String[] args) {
//        Geekq geekq = new Geekq(new JavaCourse());
//        geekq.studyImoocCourse();
//    }
    public static void main(String[] args) {
        Geekq geekq = new Geekq();
        geekq.setiCourse(new JavaCourse());
        geekq.studyImoocCourse();

        geekq.setiCourse(new FECourse());
        geekq.studyImoocCourse();

    }


}
