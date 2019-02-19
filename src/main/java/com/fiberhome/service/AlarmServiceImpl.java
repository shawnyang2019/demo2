package com.fiberhome.service;

import org.springframework.stereotype.Service;

@Service("alarmServiceImpl")
public class AlarmServiceImpl implements IAlarmService {
    @Override
    public boolean report(String alarmContent) {
        System.out.println("上报告警>> " + alarmContent);
        return true;
    }
}
