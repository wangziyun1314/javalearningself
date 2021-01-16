package reflect;

import domain.Person;

public class ReflectDemo01 {
    public static void main(String[] args) throws ClassNotFoundException {

        Class cls = Class.forName("domain.Person");
        System.out.println(cls);
        Class cls2 = Person.class;
        System.out.println(cls2);
        Person p = new Person();
        Class cls3 = p.getClass();
        System.out.println(cls3);
        System.out.println(cls==cls2);
        System.out.println(cls==cls3);//同一个字节码文件再一次程序运行中只会被加载一次，不论通过哪一种方式获取的Class对象都是同一个


    }
}
