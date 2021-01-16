package demo02.Lambda;

public class Demo02Lambda {
    public static void showlog(int level,MessageBuilder mb){
        if(level==1){
            System.out.println(mb.buildermessage());
        }
    }

    public static void main(String[] args) {
        String msg1="hello";
        String msg2="world";
        String msg3="java";
        showlog(1,()->{
            return msg1+msg2+msg3;
        });
    }
}
