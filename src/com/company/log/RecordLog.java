package com.company.log;

import java.io.Serializable;

public class RecordLog implements Serializable {

    private String log;

    public String getLog(){
        return log;
    }

    public RecordLog(String log) {
        this.log = log;
    }
}
