package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Queue;

public class TestArrayDeque {

    @Test
    public void addFirst(){
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.add("Mercedes");
        arrayDeque.addFirst("BMW");
        String expected  = "BMW";
        Assert.assertEquals(expected,arrayDeque.getFirst());
    }


    @Test
    public void addLast(){
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.add("BMW");
        arrayDeque.addLast("Toyota");

        String expected  = "Toyota";
        Assert.assertEquals(expected,arrayDeque.getLast());
    }

    @Test
    public void offerFirst(){
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.add("Mercedes");
        arrayDeque.addFirst("BMW");
        String expected  = "BMW";
        Assert.assertTrue(expected,arrayDeque.offerFirst("BMW"));
    }


    @Test
    public void offerLast(){
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.add("BMW");
        arrayDeque.addLast("Toyota");

        String expected  = "Toyota";
        Assert.assertTrue(expected,arrayDeque.offerLast("Toyota"));
    }

    @Test
    public void removeFirst(){
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.add("Mercedes");
        arrayDeque.addFirst("BMW");
        String expected  = "BMW";
        Assert.assertEquals(expected,arrayDeque.removeFirst());
    }


    @Test
    public void removeLast(){
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.add("BMW");
        arrayDeque.addLast("Toyota");

        String expected  = "Toyota";
        Assert.assertEquals(expected,arrayDeque.removeLast());
    }

    @Test
    public void pollFirst(){
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.add("Mercedes");
        arrayDeque.add("BMW");
        String expected  = "Mercedes";
        Assert.assertEquals(expected, arrayDeque.pollFirst());
    }


    @Test
    public void pollLast(){
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.add("BMW");
        arrayDeque.add("Toyota");

        String expected  = "Toyota";
        Assert.assertEquals(expected,arrayDeque.pollLast());
    }
    @Test
    public void peekFirst(){
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.add("Mercedes");
        arrayDeque.add("BMW");
        String expected  = "Mercedes";
        Assert.assertEquals(expected, arrayDeque.peekFirst());
    }


    @Test
    public void peekLast(){
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.add("BMW");
        arrayDeque.add("Toyota");

        String expected  = "Toyota";
        Assert.assertEquals(expected,arrayDeque.peekLast());
    }
    @Test
    public void size(){
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.add("BMW");
        arrayDeque.add("Toyota");

        int expected  = 2;
        Assert.assertEquals(expected,arrayDeque.size());
    }

    @Test
    public void isEmpty(){
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.add("BMW");
        arrayDeque.add("Toyota");

        boolean expected  = false;
        Assert.assertEquals(expected,arrayDeque.isEmpty());
    }


}
