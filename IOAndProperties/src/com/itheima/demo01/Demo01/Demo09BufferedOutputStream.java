package com.itheima.demo01.Demo01;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo09BufferedOutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\untitled\\IOAndProperties\\e.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos,102);
        bos.write("我把数据写入到内部缓冲区中".getBytes());
        bos.flush();
        fos.close();
        bos.close();
    }
}
