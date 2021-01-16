package Demo05.Consumer;

import java.util.function.Consumer;

public class Demo01Consumer {
    public static void method (String name, Consumer<String> con ){
        con.accept(name);
    }

    public static void main(String[] args) {
        method("gulinazha",(String name)->{
            String rename = new StringBuffer(name).reverse().toString();
            System.out.println(rename);
        });
    }
}
