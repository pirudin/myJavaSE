package com.company.utils;

import java.io.*;

public class MyUtils {

    public static void serialize(Object o, String path) throws IOException{
        FileOutputStream fos = new FileOutputStream(path);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(o);
        oos.close();
        fos.close();
    }

    public static Object deserialize(String path) throws ClassNotFoundException, IOException{
        FileInputStream fis = new FileInputStream(path);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object o = ois.readObject();
        return o;
    }
}
