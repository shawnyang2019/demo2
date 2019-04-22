package important.socket.reflect;

import com.fiberhome.demo.Person;
import org.junit.jupiter.api.Test;


public class Fanshe1 {
    @Test
    public static void fansheTest(){
        Person person=new Person();

        Class clazz=person.getClass();
        System.out.println(clazz.getName());
        System.out.println(person.getClass().getName());
        Class clazz1=Person.class;
        System.out.println(clazz1.getName());
        try {
            Class clazz2=Class.forName("com.fiberhome.demo.Person");
            System.out.println(clazz2.getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
