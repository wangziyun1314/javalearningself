package Demo07Function;

import java.util.function.Function;

public class Demo01Function {
    public static void change(String s, Function<String,Integer> fun ){
        Integer in = fun.apply(s);
        System.out.println(in);
    }

    public static void main(String[] args) {
        String t= "34556";
        change(t,(String str )->{
            return Integer.parseInt(t);

        });
    }
}
