package com.geekq.design.principle.demeter;


/**
 * Created by geelq
 */
public class Boss {

    public void commandCheckNumber(TeamLeader teamLeader){
        teamLeader.checkNumberOfCourses();
    }

}
