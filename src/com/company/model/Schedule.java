package com.company.model;

import java.util.HashMap;
import java.util.Map;

public class Schedule {

    private Map<String, Channel> weekSchedule = new HashMap<>();

    public Map<String, Channel> getWeekSchedule() {
        return weekSchedule;
    }

    public void setWeekSchedule(Map<String, Channel> weekSchedule) {
        this.weekSchedule = weekSchedule;
    }
}
