package Demo06.Predicate;

import java.util.function.Predicate;

public class Demo01Predicate {
    public static boolean checkString (String s, Predicate<String> pre){
        return pre.test(s);


    }

    public static void main(String[] args) {
        String s ="abcde";
        boolean b = checkString(s,(String str)->{
            return str.length()>5;


        });
        System.out.println(b);
    }
}
