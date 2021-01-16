package Demo06.Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Demo05Predicate_test {
    public static ArrayList<String> filter(String[] array, Predicate<String> pre1, Predicate<String> pre2){
        ArrayList<String> list = new ArrayList<>();
        for (String s : array) {
            boolean b = pre1.and(pre2).test(s);
            if (b){
                list.add(s);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String[] arr ={"迪丽热巴，女","古力娜扎，女","马儿扎哈，男","赵丽颖，女"};
        ArrayList<String> list = filter(arr,(String s)->{
            return s.split("，")[0].length()==4;
        },(String s)->{
            return s.split("，")[1].equals("女");
        });
        System.out.println(list.toString());
    }
}
