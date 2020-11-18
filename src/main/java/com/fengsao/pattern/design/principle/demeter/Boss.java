package com.fengsao.pattern.design.principle.demeter;


/**
 * Created by geelq
 */
public class Boss {

    public void commandCheckNumber(TeamLeader teamLeader){
        teamLeader.checkNumberOfCourses();
    }

}
