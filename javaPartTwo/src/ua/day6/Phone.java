package ua.day6;

/**
 * Created by Ksu on 21.11.2016.
 */
public class Phone {
    String phone;


    public Phone() {
        this("DEFAULT_PHONE");
    }

    public Phone(String name) {

        this.phone = name;

    }

    @Override
    public String toString() {
        return phone;
    }
}
