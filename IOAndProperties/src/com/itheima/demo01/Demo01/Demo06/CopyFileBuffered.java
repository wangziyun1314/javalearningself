package com.itheima.demo01.Demo01.Demo06;

import java.io.*;

public class CopyFileBuffered {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\untitled\\IOAndProperties\\1.jpg");
        BufferedInputStream bis = new BufferedInputStream(fis);
        FileOutputStream fos = new FileOutputStream("D:\\untitled\\IOAndProperties\\2.jpg");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        int len = 0;
        long s = System.currentTimeMillis();
        while ((len=bis.read())!=-1){
            bos.write(len);
        }
        Long e = System.currentTimeMillis();
        System.out.println(e-s+"毫秒");
        bos.close();
        bis.close();
    }
}
