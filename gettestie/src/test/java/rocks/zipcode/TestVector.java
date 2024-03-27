package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Vector;

public class TestVector {
    @Test
    public void add(){
        Vector<Integer> vector = new Vector<>();
        vector.addElement(1);
        vector.addElement(2);
        vector.addElement(3);
        Assert.assertTrue(vector.contains(3));
    }

    @Test
    public void remove(){
        Vector<Integer> vector = new Vector<>();
        vector.addElement(1);
        vector.addElement(2);
        //you can pass obj
        vector.removeElement(3);
        //you can pass index
        //vector.removeElementAt(2);
        Assert.assertFalse(vector.contains(3));
    }

    @Test
    public void elementAt(){
        Vector<Integer> vector = new Vector<>();
        vector.addElement(1);
        vector.addElement(2);
        //you can pass obj
        int actual = vector.elementAt(1);
        int expected = 2;
        Assert.assertEquals(expected,actual);
        //vector dfault capacity is 10 even there less than 10 elements
        Assert.assertEquals(10,vector.capacity());
    }

    @Test
    public void isEmpty(){
        Vector<Integer> vector = new Vector<>();
        vector.addElement(1);
        vector.addElement(2);
        vector.clear();
        Assert.assertTrue(vector.isEmpty());
    }

}
