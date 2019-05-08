package com.company.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;


public class Schedule implements Serializable {

    private Map<String, Channel> weekSchedule = new HashMap<>();

    public Map<String, Channel> getWeekSchedule() {
        return weekSchedule;
    }

    public void setWeekSchedule(Map<String, Channel> weekSchedule) {
        this.weekSchedule = weekSchedule;
    }
}
