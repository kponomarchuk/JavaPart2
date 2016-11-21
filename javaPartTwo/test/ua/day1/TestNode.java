package ua.day1;

/**
 * Created by Ksu on 15.11.2016.
 */


import org.junit.Before;
import org.junit.Test;
import ua.day1.Node;

import static junit.framework.Assert.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;


public class TestNode {
    Node node;

    @Before
    public void before() {
        node = new Node("K");
    }

    @Test
    public void creationOfTheNodeTest() {
        String nodeValexpected = "K";
        assertEquals(nodeValexpected, node.value);
        assertFalse(node == null);
        assertTrue(node.next == null);
        assertTrue(node.prev == null);


    }


}



