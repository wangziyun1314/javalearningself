package demo02.Lambda;

public class Dem01Logger {
    public static void showlog(int level, String message){
        if(level==1){
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        String msg1="hello";
        String msg2="world";
        String msg3="java";

        showlog(1,msg1+msg2+msg3);
    }
}
