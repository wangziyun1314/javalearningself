package com.itheima.demo01.Demo01;

import java.io.*;

public class Demo41ObjectOutputStream {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\untitled\\IOAndProperties\\person.txt"));
        Person p = new Person("迪丽热巴",19);
        oos.writeObject(p);
        oos.close();
    }
}
