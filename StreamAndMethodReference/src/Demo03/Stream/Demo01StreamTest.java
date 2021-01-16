package Demo03.Stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Demo01StreamTest {
    public static void main(String[] args) {
        ArrayList<String> one1 = new ArrayList<>();
        one1.add("迪丽热巴");
        one1.add("宋远桥");
        one1.add("苏星河");
        one1.add("石破天");
        one1.add("石中玉");
        one1.add("老子");
        one1.add("庄子");
        one1.add("洪七公");
        Stream<String> stream1 = one1.stream().filter(name -> name.length() == 3).limit(3);
        ArrayList<String> one2 = new ArrayList<>();
        one2.add("古力娜扎");
        one2.add("张无忌");
        one2.add("赵丽颖");
        one2.add("张三丰");
        one2.add("尼古拉斯赵四");
        one2.add("张天爱");
        one2.add("张二狗");
        Stream<String> stream2 = one2.stream().filter(name -> name.startsWith("张")).skip(2);
        Stream.concat(stream1,stream2).map(name->new Person(name)).forEach(p-> System.out.println(p));

    }
}
