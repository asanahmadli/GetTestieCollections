package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import java.util.Stack;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    @Test
    public void push(){
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        int expected = 2;
        //return element without remove
        int actual = stack.peek();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void pop(){
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        int expected = 2;
        //return element with removing
        int actual = stack.pop();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void empty(){
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.clear();
        int actual = stack.search(0);
        int expected = -1;
        Assert.assertEquals(expected,actual);
    }

}
