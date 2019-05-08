package com.company;

import com.company.log.MyLog;
import com.company.log.RecordLog;
import com.company.utils.MyUtils;


public class Main {

    public static void main(String[] args) throws Exception{

        //TestService ts = new TestService();
        //ts.addSome();
        //ts.printSome();

        //System.out.println(MyLog.getLog());
        //DateTime d = new DateTime();
        //System.out.println(d.getMonthOfYear());
        //System.out.println(d.getDayOfWeek());

        MyLog.addAction("try");
        int i = 100;
        while (i < 10000) i++;
        MyLog.addAction("try");
        MyLog.addAction("try");
        System.out.println(MyLog.getLog());

        RecordLog m = new RecordLog(MyLog.getLog());
        MyUtils.serialize(m, "res/output");

        RecordLog j = (RecordLog) MyUtils.deserialize("res/output");
        System.out.println(j.getLog());
    }
}
