package demo04.Supplier;

import java.util.function.Supplier;

public class Demo01Supplier {
    public static String getString(Supplier<String> sup){
        return sup.get();
    }

    public static void main(String[] args) {
        String s =getString(()->{
            return "huge";
        });
        System.out.println(s);
        String t = getString(()->"赵丽颖");
        System.out.println(t);

    }
}
