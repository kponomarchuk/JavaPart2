package ua.day6;
import java.util.ArrayList;
/**
 * Created by Ksu on 21.11.2016.
 */
public class HashMapSample {


        ArrayList<Entry1>[] array;
        int size;


        public HashMapSample() {
            array = new ArrayList[5];
            for (int i = 0; i < array.length; i++) {
                array[i] = new ArrayList();
            }
        }


        public void put(Object key, Object value) {
            int index = getIndex(key);
            ArrayList<Entry1> bucket = array[index];
            for (Entry1 entry : bucket) {
                if (entry.key.equals(key)) {
                    entry.value = value;
                    return;
                }
            }
            bucket.add(new Entry1(key, value));
            size++;
        }


        private int getIndex(Object key) {
            return Math.abs(key.hashCode() % array.length);
        }


        public Object get(Object key) {
            int index = getIndex(key);
            ArrayList<Entry1> bucket = array[index];
            for (Entry1 entry : bucket) {
                if (entry.key.equals(key)) {
                    return entry.value;
                }
            }


            return null;
        }


        static class Entry1 {
            Object key;
            Object value;


            public Entry1(Object key, Object value) {
                this.key = key;
                this.value = value;
            }
        }





}
