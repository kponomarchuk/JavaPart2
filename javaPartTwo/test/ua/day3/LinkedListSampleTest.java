package ua.day3;
import org.junit.Before;
import org.junit.Test;


import java.util.LinkedList;


import static junit.framework.Assert.assertEquals;
import static junit.framework.TestCase.assertFalse;
/**
 * Created by Ksu on 17.11.2016.
 */
public class LinkedListSampleTest {




        LinkedList list;


        @Before
        public void before() {
            list = new LinkedList();
            list.add("A");
            list.add("B");
            list.add("C");
        }


        @Test
        public void testGet() {
            assertEquals("A", list.get(0));
            assertEquals("B", list.get(1));
            assertEquals("C", list.get(2));
            assertFalse(list.isEmpty());
        }


        @Test(expected = IndexOutOfBoundsException.class)
        public void testGetFromIncorrectIndex() {
            list.get(-1);
        }




        @Test
        public void testRemove() {
            Object o = list.remove(1);
            assertEquals(o, "B");
            assertEquals(list.size(), 2);
            assertFalse(list.contains("B"));
        }
    }


