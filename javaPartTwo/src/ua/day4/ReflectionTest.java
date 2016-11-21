package ua.day4;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by Ksu on 17.11.2016.
 */
public class ReflectionTest {
    public static void main(String[] args) throws ClassNotFoundException/* throws ClassNotFoundException, IllegalAccessException, InvocationTargetException*/ {

        /*Field[] fields = clas.getDeclaredFields();
        for (Field field : fields) {
            if (field.getName().equals("value")) {
                field.setAccessible(true);
                Object value = field.get(name);
                // Object value = name.value;
                char[] chars = (char[]) value;
                chars = new char[5];
                chars[1] = 'i';
                field.setAccessible(false);
            }*/

       // clas.
        Reflection reflection = new Reflection();
        Node node = new Node("A");
        reflection.createObject(node.getClass());
    }


}
