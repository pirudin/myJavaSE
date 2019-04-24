package com.company.services;

import com.company.model.Channel;
import com.company.model.Program;
import com.company.model.ProgramGenre;
import com.company.model.Schedule;

public class TestService {

    public void addSome(){
        Service s = new Service();

        Schedule s1 = new Schedule();

        Channel c1 = new Channel("First");
        Channel c2 = new Channel("Second");
        Channel c3 = new Channel("Third");

        Program p1 = new Program("Hot Pepper", ProgramGenre.ADULT_FILM);
        Program p2 = new Program("Red Strike", ProgramGenre.FILM);
        Program p3 = new Program("Platoon", ProgramGenre.FILM);
        Program p4 = new Program("Cartoon", ProgramGenre.CARTOON);
        Program p5 = new Program("Tom and Jerry", ProgramGenre.CARTOON);
        Program p6 = new Program("News", ProgramGenre.NEWS);
        Program p7 = new Program("Spoons and forks", ProgramGenre.ADVERTISING);

        s.addProgramToChannelsDayProgram(0, p4, c1);
        s.addProgramToChannelsDayProgram(1, p7, c1);
        s.addProgramToChannelsDayProgram(2, p5, c1);

        s.addProgramToChannelsDayProgram(0, p2, c2);
        s.addProgramToChannelsDayProgram(1, p7, c2);
        s.addProgramToChannelsDayProgram(2, p3, c2);
        s.addProgramToChannelsDayProgram(3, p7, c2);

        s.addProgramToChannelsDayProgram(0, p1, c3);
        s.addProgramToChannelsDayProgram(1, p7, c3);
        s.addProgramToChannelsDayProgram(2, p6, c3);
        s.addProgramToChannelsDayProgram(3, p7, c3);


        s.addChannelToSchedule(s1, c1);
        s.addChannelToSchedule(s1, c2);
        s.addChannelToSchedule(s1, c3);

        s.print(p1);
        s.print(p2);
        s.print(p4);
        s.print(p7);

    }
}
