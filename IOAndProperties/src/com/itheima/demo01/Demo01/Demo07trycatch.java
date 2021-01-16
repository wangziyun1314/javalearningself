package com.itheima.demo01.Demo01;

import java.io.FileWriter;
import java.io.IOException;

public class Demo07trycatch {
    public static void main(String[] args) throws IOException {
        FileWriter fw = null;
        try {
            fw = new FileWriter("D:\\untitled\\IOAndProperties\\B.txt");
            for (int i = 0; i <10; i++) {
                fw.write("helloworld"+"\r\n");

            }
        }catch (IOException e){
            System.out.println(e);
        }finally {
            if(fw!=null){
                try {
                    fw.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }

        }

        }
    }


