package Demo05.Consumer;

import java.util.function.Consumer;

public class Demo02AndThen {
    public static void method(String s, Consumer<String> con1,Consumer<String> con2){
        con1.andThen(con2).accept(s);
    }

    public static void main(String[] args) {
        method("Hello",(t)->{
                    System.out.println(t.toUpperCase());

                },
                (t)->{
                    System.out.println(t.toLowerCase());
                });
    }

}
