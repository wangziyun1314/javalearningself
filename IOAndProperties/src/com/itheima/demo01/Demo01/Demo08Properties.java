package com.itheima.demo01.Demo01;

import java.io.*;
import java.util.Properties;
import java.util.Set;

public class Demo08Properties {
    public static void main(String[] args) throws IOException {
        show01();
        show02();
        show03();


    }
    private static void show01(){
        Properties prop = new Properties();
        prop.setProperty("赵丽颖","1258");
        prop.setProperty("古力娜扎","658");
        prop.setProperty("迪丽热巴","5795");
        Set<String> set = prop.stringPropertyNames();
        for (String key : set) {
            String value = prop.getProperty(key);
            System.out.println(key+"="+value);

        }


    }
    private static void show02() throws IOException {
        Properties prop = new Properties();
        prop.setProperty("赵丽颖","1258");
        prop.setProperty("古力娜扎","658");
        prop.setProperty("迪丽热巴","5795");
        FileWriter fw = new FileWriter("D:\\untitled\\IOAndProperties\\C.txt");
        prop.store(fw,"save data");
        FileOutputStream fos = new FileOutputStream("D:\\untitled\\IOAndProperties\\d.txt");
        prop.store(fos,"");
        fw.close();
        fos.close();


    }
    private static void show03() throws IOException {
        Properties prop = new Properties();
        prop.load(new FileReader("D:\\untitled\\IOAndProperties\\C.txt"));
        Set<String> set = prop.stringPropertyNames();
        for (String key : set) {
            String value = prop.getProperty(key);
            System.out.println(key+"="+value);
        }
    }
}
