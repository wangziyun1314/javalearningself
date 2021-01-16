package reflect;

import domain.Person;

import java.lang.reflect.Constructor;

public class ReflectDemo03 {
    public static void main(String[] args) throws Exception {
        Class<Person> personClass = Person.class;
        Constructor<Person> constructor = personClass.getConstructor(String.class, int.class);
        System.out.println(constructor);

        Person person = constructor.newInstance("张三", 23);
        System.out.println(person);

        Person person1 = personClass.newInstance();
        System.out.println(person1);
    }
}
