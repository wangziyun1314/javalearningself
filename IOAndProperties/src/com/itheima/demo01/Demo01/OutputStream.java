package com.itheima.demo01.Demo01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\untitled\\IOAndProperties\\a.txt");
//        fos.write(97);
      byte[] bytes = {65,66,67,68,69};//ABCDE

//        fos.write(bytes);
//        fos.write(bytes,1,2);
        byte[] bytes1 = "你好世界".getBytes();
        System.out.println(Arrays.toString(bytes1));
        fos.write(bytes1);



        fos.close();
    }
}
