package ua.day2;

/**
 * Created by Ksu on 16.11.2016.
 */
public class Person {
    Phone phone;
    String name;
    double salary;

    @Override
    public boolean equals(Object value) {

        if (value == null) {
            return false;

        }
        if (value == this) {
            return true;
        }

        Class personClass = Person.class;
        if (value.getClass() == personClass) {
            Person person = (Person) value;
            if (name == null && person.name == null) {
                return true;
            }
            if ((name != null && person.name == null) || (name == null && person.name != null)) {
                return false;
            }
//        if (salary == null&&person.salary==null){
//            return true;
//        }
            if (phone == null && person.phone == null) {
                return true;
            }
            if ((phone != null && person.phone == null) || (phone == null && person.phone != null)) {
                return false;
            }

            return name.equals(person.name) && salary == person.salary && phone.equals(person.phone);
        }
        return false;
    }

}

