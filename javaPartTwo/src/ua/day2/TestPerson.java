package ua.day2;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Ksu on 16.11.2016.
 */
public class TestPerson {

    public static void main(String[] args) {

        Person person1 = new Person();
        Phone phone1 = new Phone();
        phone1.code = "093";
        phone1.number = "12345";
        person1.salary = 0;
        person1.name = "Cat";
        person1.phone = phone1;

        Person person2 = new Person();
        Phone phone2 = new Phone();
        phone2.code = "093";
        phone2.number = "12345";
        person2.salary = 100;
        person2.name = "Cat";
        person2.phone = phone1;
        System.out.println(person1.equals(person2));


    }


}
