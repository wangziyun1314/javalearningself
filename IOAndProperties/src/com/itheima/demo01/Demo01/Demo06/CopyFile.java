package com.itheima.demo01.Demo01.Demo06;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
*
* 文件复制练习
* */
public class CopyFile {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\untitled\\IOAndProperties\\1.jpg");
        FileOutputStream fos = new FileOutputStream("D:\\untitled\\IOAndProperties\\2.jpg");
/*        int len = 0;
        while ((len=fis.read())!=-1){
            fos.write(len);

        }*/
        long s =System.currentTimeMillis();
//        byte[] bytes = new byte[1024];
        int len = 0;
        long t =System.currentTimeMillis();
        while ((len=fis.read())!=-1){
            fos.write(len);
        }
        long e = System.currentTimeMillis();
        System.out.println(e-t+"毫秒");
        fos.close();
        fis.close();



    }

}
