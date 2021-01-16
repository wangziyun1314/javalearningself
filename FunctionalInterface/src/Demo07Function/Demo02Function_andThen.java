package Demo07Function;

import java.util.function.Function;

public class Demo02Function_andThen {
    public static void change(String s, Function<String,Integer> fun1,Function<Integer,String> fun2){
        String t = fun1.andThen(fun2).apply(s);
        System.out.println(t);
    }

    public static void main(String[] args) {
        String s = "122";
        change(s,(String str )->{
            return Integer.parseInt(str)+10;
        },(Integer i )->{
            return i+" ";
        });
    }
}
