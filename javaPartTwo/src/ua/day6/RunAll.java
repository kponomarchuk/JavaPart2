package ua.day6;

import java.util.ArrayList;

public class RunAll {
    //RUN
    static int size = 5;

    public static void main(String[] args) {

        ArrayList<Entry> list = new ArrayList<Entry>();
        for (int i = 0; i < 5; i++) {
            Name name = new Name("Name" + i);
            Phone phone = new Phone("Phone" + i);
            Entry entry = new Entry();
            entry.key = name;
            entry.value = phone;
           // System.out.println(entry.getHasKeyIndex(size));
            list.add(entry);
            Name key2 = new Name("Name" + 2);
            if (name.equalsMy(key2)) {
                System.out.println("My equals works" );
            }
        }

        Name key = new Name("Name" + 2);
        for (Entry entry : list) {
            if (entry.key.equals(key)) {
                System.out.println("value found for key" + entry.value);
            }

        }

//        System.out.println(list.get(0).equals(list.get(1)));
        System.out.println(list);
    }
}
