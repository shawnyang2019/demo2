package com.fiberhome.service.aop;

import org.springframework.stereotype.Service;

@Service
public class TimeAdvice {

    public void printCurrentTime(){
        System.out.println(System.currentTimeMillis());
    }
    public void printCurrentTime2(){

        System.out.println(System.currentTimeMillis());
    }
}
