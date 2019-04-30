package com.company.model;

public enum ProgramGenre { // j = 10;

    CARTOON(0),
    ADVERTISING(0),
    NEWS(10),
    FILM(15),
    ADULT_FILM(21);

    private int ageLimit;

    public int getAgeLimit() {
        return ageLimit;
    }

    public void setAgeLimit(int ageLimit) {
        this.ageLimit = ageLimit;
    }

    ProgramGenre(int ageLimit){
        this.ageLimit = ageLimit;
    }
}
