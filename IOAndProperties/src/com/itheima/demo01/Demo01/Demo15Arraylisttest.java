package com.itheima.demo01.Demo01;

import java.io.*;
import java.util.ArrayList;

public class Demo15Arraylisttest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<Person> list = new ArrayList<Person>();
        list.add(new Person("张三",18));
        list.add(new Person("李四",19));
        list.add(new Person("王五",20));
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\untitled\\IOAndProperties\\persontest.txt"));
        oos.writeObject(list);
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\untitled\\IOAndProperties\\persontest.txt"));
        Object o = ois.readObject();
        ArrayList<Person> list2 =(ArrayList<Person>)o;

        for (Person p : list2) {
            System.out.println(p);

        }
        oos.close();
        ois.close();


        }


    }

