package com.ittheima.demo1.FunctionalInterface;

import javax.net.ssl.SNIHostName;

public class Demo {
    public static void show(MyFunctionalInterface myinter){
        myinter.method();
    }

    public static void main(String[] args) {
        show(new MyFunctionalInterface() {
            @Override
            public void method() {
                System.out.println("使用匿名内部类重写接口的抽象方法");
            }
        });

        show(new MyFunctionalInterfaceimpl());

        show(()->{
            System.out.println("使用Lambda表达式重写接口中的抽象方法");
        });
        show(()-> System.out.println("简化般的Lambda表达式"));
    }
}
