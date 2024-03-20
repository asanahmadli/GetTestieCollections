package rocks.zipcode;

import gettestie.src.main.java.rocks.zipcode.Person;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class TestHashSet {

    @Test
    public void testAdd_Set1(){
        /**create hash set
         * then create object from Person class
         * then pass two parameters into person object
         * add birthyear into object
         * create itereator and iterater set
         * check for specific value and return true
         * */
        HashSet<Integer> set = new HashSet<>();
        Person person = new Person("Asan",1992);
        set.add(person.getYearOfBirth());

        Iterator<Integer> iterator = set.iterator();
        int setNumber = 0;
        while (iterator.hasNext()){
            setNumber = iterator.next();
        }
        Assert.assertEquals(1992,setNumber);
        Assert.assertTrue(set.contains(1992));
    }


    @Test
    public void testRemove_Set2(){
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(20);
        Assert.assertTrue(hashSet.contains(20));
        hashSet.remove(20);
        Assert.assertFalse(hashSet.contains(20));
    }

   @Test
   public void testIsEmpty_Set3(){
        HashSet<Integer> set = new HashSet<>();
        set.add(30);
        Assert.assertTrue(set.contains(30));
        set.remove(30);
        Assert.assertTrue(set.isEmpty());
   }

   @Test
    public void testSize(){
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        int expected = 2;
        int actual  = set.size();
        Assert.assertEquals(expected,actual);
   }

   @Test
    public void testClear(){
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.clear();
        Assert.assertTrue(set.isEmpty());
   }

   @Test
    public void testAddAll(){
        HashSet<Integer> set = new HashSet<>();
       ArrayList<Integer> list = new ArrayList<>();
       list.add(10);
       list.add(20);
       list.add(20);
       //add all element of list to set
       set.addAll(list);
       Assert.assertEquals(2,set.size());
   }

    @Test
    public void testContainAll(){
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        //add all element of list to set
        set.addAll(list);
        Assert.assertTrue(set.containsAll(list));
    }

    @Test
    public void testRemoveAll(){
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        //add all element of list to set
        set.removeAll(list);
        Assert.assertFalse(set.containsAll(list));
    }

    @Test
    public void testRetainAll(){

        //when you want to store only list elements in the set use retain all
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        set.add(10);
        set.add(20);
        set.add(35);
        //add all element of list to set
        set.retainAll(list);
        Assert.assertFalse(set.contains(35));
    }
}
