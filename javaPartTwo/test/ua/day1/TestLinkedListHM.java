package ua.day1;

/**
 * Created by Ksu on 15.11.2016.
 */

import org.junit.Before;
import org.junit.Test;
import ua.day1.LinkedListHM;

import static junit.framework.Assert.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

 public class TestLinkedListHM {
    LinkedListHM linkedListHM;

    @Before
    public void before() {
        linkedListHM = new LinkedListHM();
        linkedListHM.add("Q");
        linkedListHM.add("W");
        linkedListHM.add("E");
    }

    @Test
    public void add() {
        String expectedVal= "size=3[Q,W,E]";
        linkedListHM.getClass();
        assertEquals(expectedVal,linkedListHM.toString());



    }
    }





