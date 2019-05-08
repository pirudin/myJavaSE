package com.company.model;

import java.io.Serializable;

public class Program implements Serializable {

    private String name;

    private ProgramGenre programGenre;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProgramGenre getProgramGenre() {
        return programGenre;
    }

    public void setProgramGenre(ProgramGenre programGenre) {
        this.programGenre = programGenre;
    }

    public Program(String name, ProgramGenre programGenre) {
        this.name = name;
        this.programGenre = programGenre;
    }

    @Override
    public String toString() {
        return "Program{" +
                "name='" + name + '\'' +
                ", programGenre=" + programGenre +
                '}';
    }
}
