package com.itheima.demo01.Demo01;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Demo14ObjectInputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\untitled\\IOAndProperties\\person.txt"));
        Object o = ois.readObject();
        System.out.println(o);
        ois.close();
    }
}
