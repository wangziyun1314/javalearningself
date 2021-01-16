package reflect;

import domain.Person;

import java.lang.reflect.Field;

public class ReflectDemo02 {
    public static void main(String[] args) throws Exception {
        Class<Person> personClass = Person.class;
        Field[] fields = personClass.getFields();//获取public修饰的成员变量
        for (Field field : fields) {
            System.out.println(field);

        }
        System.out.println("----------------------");
        Field a = personClass.getField("a");
        System.out.println(a);
        Person p = new Person();
        Object value = a.get(p);
        System.out.println(value);
        a.set(p,"张三");
        System.out.println(p);
        Field[] fields1 = personClass.getDeclaredFields();
        for (Field field : fields1) {
            System.out.println(field);
        }
        Field d = personClass.getDeclaredField("d");
        d.setAccessible(true);//暴力反射
        Object value2 = d.get(p);
        System.out.println(value2);


    }
    }

