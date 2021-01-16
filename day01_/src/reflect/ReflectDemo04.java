package reflect;

import domain.Person;

import java.lang.reflect.Method;

public class ReflectDemo04 {
    public static void main(String[] args) throws Exception {
        Class<Person> personClass = Person.class;
        Method eat = personClass.getMethod("eat");
        Person person = new Person();
        eat.invoke(person);
        Method eat1 = personClass.getMethod("eat", String.class);
        eat1.invoke(person,"p苹果");


    }
}
