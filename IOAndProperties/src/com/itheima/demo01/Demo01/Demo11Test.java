package com.itheima.demo01.Demo01;
/*练习：
    对文本内容进行排序
  分析：
    1.创建一个HashMap集合对象，key存储序号，value存储文本
    2.创建字符缓冲输入流对象，构造方法中绑定文件字符输入流
    3.创建字符缓冲输出流对象，构造方法中绑定文件字符输出流
    4.使用字符缓冲输入流对象中的方法realine,逐行读取文本
    5.对读取的文本进行分割，获取行中的序号和内容
    6.把切割好的序号和文本放到map中
    7.遍历Hashmap集合，获取每一个键值对
    8.把每一个键值对拼接为一个文本行
    9.把拼接好的文本用write写入文件中
    10.释放资源

 */

import java.io.*;
import java.util.HashMap;

public class Demo11Test {
    public static void main(String[] args) throws IOException {
        HashMap<String,String> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new FileReader("D:\\untitled\\IOAndProperties\\test.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\untitled\\IOAndProperties\\test2.txt"));
        String line;
        while ((line = br.readLine())!=null){
            String[] arr = line.split("\\.");
            map.put(arr[0],arr[1]);
        }
        for(String key:map.keySet()){
            String value =map.get(key);
            line = key+"."+value;
            bw.write(line);
            bw.newLine();
        }
        bw.close();
        br.close();

    }
}
