package com.company.services;

import com.company.model.*;

import java.util.Map;

public class Service {

    public void addChannelToSchedule(Schedule mySchedule, Channel myChannel){
        mySchedule.getWeekSchedule().put(myChannel.getName(), myChannel);
    }

    public void addProgramToChannelsDayProgram(Integer time, Program myProgram, Channel myChannel){
        myChannel.getDayProgram().put(time, myProgram);
    }

    public void addDayProgramToChannelsWeekProgram(Map<Integer, Program> dayProgram, WeekDays day, Channel myChannel){
        myChannel.getWeekProgram().put(day, dayProgram);
    }

    public Channel createNewChannel(String name){
        Channel myChannel = new Channel(name);
        return myChannel;
    }

    public Schedule createNewSchedule(){
        Schedule mySchedule = new Schedule();
        return mySchedule;
    }

    public void printChannel(Channel myChannel){
        System.out.println(myChannel.toString());
    }

    public void printProgram(Program myProgram){
        System.out.println(myProgram.toString());
    }

    public void printSchedule(Schedule mySchedule){
        System.out.println(mySchedule.toString());
    }

    public Program createNewProgram(String name, ProgramGenre programGenre){
        Program myProgram = new Program(name, programGenre);
        return myProgram;
    }

    public void print(Object o){
        System.out.println(o.toString());
        System.out.println();
    }
}
