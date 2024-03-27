package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.PriorityQueue;

public class TestPriorityQueue {

    @Test
    public void add(){
        PriorityQueue<Integer> que = new PriorityQueue<>();
        que.add(1);
        que.add(2);
        Assert.assertTrue(que.contains(1));
    }

    @Test
    public void poll(){
        PriorityQueue<Integer> que = new PriorityQueue<>();
        que.add(1);
        que.add(2);
        //remove element from head
        int removed = que.poll();
        Assert.assertFalse(que.contains(1));
    }

    @Test
    public void peek(){
        PriorityQueue<Integer> que = new PriorityQueue<>();
        que.add(1);
        que.add(2);
        //call element from head
        int removed = que.peek();
        Assert.assertTrue(que.contains(1));
    }


    @Test
    public void clear(){
        PriorityQueue<Integer> que = new PriorityQueue<>();
        que.add(1);
        que.add(2);
        //clear que
        que.clear();
        Assert.assertTrue(que.isEmpty());
    }
















}
