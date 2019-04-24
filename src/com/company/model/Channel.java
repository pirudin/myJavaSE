package com.company.model;

import java.util.HashMap;
import java.util.Map;

public class Channel {

    private String name;

    public Channel(String name) {
        this.name = name;
    }

    private Map<Integer, Program> dayProgram = new HashMap<>(); // для добавления в недельную программу

    private Map<WeekDays, Map<Integer, Program>> weekProgram = new HashMap<>();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Integer, Program> getDayProgram() {
        return dayProgram;
    }

    public void setDayProgram(Map<Integer, Program> dayProgram) {
        this.dayProgram = dayProgram;
    }

    public Map<WeekDays, Map<Integer, Program>> getWeekProgram() {
        return weekProgram;
    }

    public void setWeekProgram(Map<WeekDays, Map<Integer, Program>> weekProgram) {
        this.weekProgram = weekProgram;
    }

}
