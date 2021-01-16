package com.itheima.demo01.Demo01;

import java.io.FileOutputStream;
import java.io.IOException;

/*
*    追加和换行
*
* */
public class Demo03OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\untitled\\IOAndProperties\\B.txt",true);
        for (int i = 0; i <10; i++) {
            fos.write("你好世界".getBytes());
            fos.write("\r\n".getBytes());
        }
        fos.write("你好世界".getBytes());
        fos.close();
    }

}
