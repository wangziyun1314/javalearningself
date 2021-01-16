package demo03.LambdaTest;

public class Demo01Runnable {
    public static void startThread(Runnable run){
        new Thread(run).start();

    }

    public static void main(String[] args) {
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"-->"+"线程qidongle");
            }
        });
        startThread(()->{
            System.out.println(Thread.currentThread().getName()+"-->"+"线程qidongle");
        });
        startThread(()-> System.out.println(Thread.currentThread().getName()+"-->"+"线程qidongle"));
    }

}

