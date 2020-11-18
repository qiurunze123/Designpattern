package com.fengsao.pattern.design.principle.dependenceinversion;

/**
 * Created by geekq
 */
public class Geekq {

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    private ICourse iCourse;



    public void studyImoocCourse(){
        iCourse.studyCourse();
    }






}
