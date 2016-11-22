package ua.day1;
/**
 * Created by Ksu on 15.11.2016.
 */
public class Run {

    public static void main(String[] args) {
        System.out.println("test");
        LinkedListHM list = new LinkedListHM();
        System.out.println(">>>>>>>>>>>>add method:  ");
        list.add("C");
        list.add("Z");
        list.add("X");
        System.out.println(">>>>>>>>>>>>get method by index:  ");
        list.get(2);
        System.out.println(">>>>>>>>>>>>get2 method by index:  ");
        list.get2(2);
        System.out.println(">>>>>>>>>>>>remove by index:  ");
        //TODO: System.out.println("!!!add method with index :  ");

        System.out.println(">>>>>>>>>>>>FINAL RESULT:  ");
        System.out.println(list);


    }
}
