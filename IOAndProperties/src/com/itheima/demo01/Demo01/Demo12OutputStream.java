package com.itheima.demo01.Demo01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Demo12OutputStream {
    public static void main(String[] args) throws IOException {
        wtite_utf_8();
        write_gbk();
    }
    private static void wtite_utf_8() throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\untitled\\IOAndProperties\\f.txt"),"UTF-8");

        osw.write("你好");
        osw.flush();
        osw.close();

    }
    private static void write_gbk() throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\untitled\\IOAndProperties\\g.txt"),"gbk");
        osw.write("你好世界");
        osw.flush();
        osw.close();

    }
}
