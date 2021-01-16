package Demo04MethodReference;

public class Demo01Printable {
    public static void printString(Printable p ){
        p.print("helloworld");
    }
    public static void main(String[] args) {
        printString((s)->{
            System.out.println(s);
        });

    }
}
