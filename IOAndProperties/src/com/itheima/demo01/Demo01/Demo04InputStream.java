package com.itheima.demo01.Demo01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo04InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\untitled\\IOAndProperties\\a.txt");
        int len = 0;
        while ((len=fis.read())!=-1){
            System.out.print((char) len);
        }
        fis.close();
    }


}
