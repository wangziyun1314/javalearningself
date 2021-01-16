package com.itheima.demo01.Demo01;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Demo10BufferedInputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\untitled\\IOAndProperties\\e.txt");
        BufferedInputStream bis = new BufferedInputStream(fis,2048);
        byte[] bytes = new byte[2048];
        int len = 0;
        while ((len=bis.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }


//        bis.read(bytes);
//        System.out.println(Arrays.toString(bytes));
        fis.close();
        bis.close();
    }
}
