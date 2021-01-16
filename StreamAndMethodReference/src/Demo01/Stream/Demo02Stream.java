package Demo01.Stream;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;

public class Demo02Stream {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周紫若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
        list.stream()
                .filter(name->name.startsWith("张"))
                .filter(name->name.length()==3)
                .forEach(name-> System.out.println(name));

    }
}
