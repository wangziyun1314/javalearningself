package Demo07Function;

import java.util.function.Function;

public class Demo03test {
    public static int change(String s,
                             Function<String,String> fun1 ,Function<String,Integer> fun2 ,Function<Integer,Integer> fun3){
        return fun1.andThen(fun2).andThen(fun3).apply(s);
    }

    public static void main(String[] args) {
        String t ="赵丽颖，20";
        int i = change(t,(String str )->{
            return str.split("，")[1];

        },(String str1)->{
           return Integer.parseInt(str1);
        },(Integer integer )->{
            return integer+100;
        });
        System.out.println(i);
    }
}
