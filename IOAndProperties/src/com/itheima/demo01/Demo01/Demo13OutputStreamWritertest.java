package com.itheima.demo01.Demo01;

import java.io.*;

public class Demo13OutputStreamWritertest {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\untitled\\IOAndProperties\\g.txt"),"gbk");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\untitled\\IOAndProperties\\h.txt"),"utf-8");
        int len=0;
        while ((len=isr.read())!=-1){
            osw.write(len);
        }
        isr.close();
        osw.close();
    }

}
