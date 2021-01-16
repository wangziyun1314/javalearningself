package Demo06.Predicate;

import java.util.function.Predicate;

public class Demo03Predicate_or {
    public static boolean checkString(String s, Predicate<String> pre1,Predicate<String> pre2){
        return pre1.or(pre2).test(s);

    }

    public static void main(String[] args) {
        String t ="sdfnvlassdfb";
        boolean b = checkString(t,(String str1)->{
            return str1.length()>5;
        },(String str2)->{
            return str2.contains("s");
        });
        System.out.println(b);
    }
}
