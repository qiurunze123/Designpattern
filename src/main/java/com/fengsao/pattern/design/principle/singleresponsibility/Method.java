package com.fengsao.pattern.design.principle.singleresponsibility;

/**
 * Created by geekq
 */
public class Method {
    private void updateUserInfo(String userName,String address){
        userName = "geekq";
        address = "beijing";
    }

    private void updateUserInfo(String userName,String... properties){
        userName = "geekq";
//        address = "beijing";
    }

    private void updateUsername(String userName){
        userName = "geekq";
    }
    private void updateUserAddress(String address){
        address = "beijing";
    }

    private void updateUserInfo(String userName,String address,boolean bool){
        if(bool){
            //todo something1
        }else{
            //todo something2
        }


        userName = "geekq";
        address = "beijing";
    }


}
