package ua.day4;


import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
/**
 * Created by Ksu on 17.11.2016.
 */
public class ReflectionSample {




        public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InvocationTargetException {
            String[] personNames = new String[10];
            for (int i = 0; i < personNames.length; i++) {
                personNames[i] = "Vova";
            }


            String name = "Vova";
            Class clazz = name.getClass();
            clazz = String.class;
            clazz = Class.forName("java.lang.String");


            char[] array = {'v', 'o', 'v', 'a', '!', '!', '!'};
            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields) {
                if (field.getName().equals("value")) {
                    field.setAccessible(true);
                    Object value = field.get(name);
                    // Object value = name.value;
                    char[] chars = (char[]) value;
                    chars = new char[5];
                    chars[1] = 'i';
                    field.setAccessible(false);
                }
            }


            name.getClass().getMethods()[1].invoke(name);


            System.out.println(name);
            for (String personName : personNames) {
                System.out.println(personName);
            }


            Class clazz2 = Void.class;
            Class integerClass = int.class;


        }





}
