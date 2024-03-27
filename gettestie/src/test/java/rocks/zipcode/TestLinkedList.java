package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

public class TestLinkedList {

    @Test
    public void add(){
        LinkedList<String> linkedList = new LinkedList<>();
        // Adding elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add(0,"BMW");
        String expected = "BMW";
        Assert.assertEquals(expected,linkedList.get(0));
    }

    @Test
    public void get(){
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        String expected = "Apple";
        Assert.assertEquals(expected,linkedList.get(0));
    }

    @Test
    public void clear(){
        LinkedList<String> linkedList = new LinkedList<>();
        // Adding elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.clear();
        Assert.assertTrue(linkedList.isEmpty());
    }


    @Test
    public void remove(){
        LinkedList<String> linkedList = new LinkedList<>();
        // Adding elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        //if you dont give index then it will remove first element from head
        linkedList.remove(0);
        Assert.assertFalse(linkedList.contains("Apple"));
    }



}
