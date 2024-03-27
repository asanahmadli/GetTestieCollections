package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TestTreeSet {

    @Test
    public void first_treeSet1(){
        //returns first element in alphabetically it is same integers as well
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("apple");
        treeSet.add("banana");
        treeSet.add("john");
        treeSet.add("peach");
        Assert.assertEquals("apple",treeSet.first());

    }
    @Test
    public void last_treeSet2(){
        //returns last element in alphabetically it is same integers as well
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(3);
        treeSet.add(7);
        Assert.assertEquals(7,treeSet.last(),0.1);
    }

    @Test
    public void head_treeSet3() {
        //returns set from first element to element exclusive
        SortedSet<String> treeSet = new TreeSet<>();
        treeSet.add("banana");
        treeSet.add("apple");
        treeSet.add("john");
        treeSet.add("peach");
        Iterator<String> iterator = treeSet.iterator();
        while (iterator.hasNext()){
           // System.out.println(iterator.next());
            break;
        }
        SortedSet<String> headset = treeSet.headSet("john");
        Iterator<String> iterator1 = headset.iterator();
        while (iterator1.hasNext()){
            //System.out.println(iterator1.next());
            break;
        }
        Assert.assertEquals("apple", treeSet.first());
    }

    @Test
    public void tail_treeSet4() {
        //returns set from element inclusive to end of the set
        SortedSet<String> treeSet = new TreeSet<>();
        treeSet.add("banana1");
        treeSet.add("apple2");
        treeSet.add("john3");
        treeSet.add("peach4");
        Iterator<String> iterator = treeSet.iterator();
        while (iterator.hasNext()){
           // System.out.println(iterator.next());
            break;
        }
        SortedSet<String> tailSet = treeSet.tailSet("john");
        Iterator<String> iterator1 = tailSet.iterator();
        while (iterator1.hasNext()){
            //System.out.println(iterator1.next());
            break;
        }
        Assert.assertEquals("apple2", treeSet.first());
    }


    @Test
    public void subset_treeSet5() {
        //returns set from element inclusive and to element exclusive
        SortedSet<String> treeSet = new TreeSet<>();
        treeSet.add("banana1");
        treeSet.add("apple1");
        treeSet.add("john3");
        treeSet.add("peach4");
        treeSet.add("zoo5");
        Iterator<String> iterator = treeSet.iterator();
        while (iterator.hasNext()){
           // System.out.println(iterator.next());
            break;
        }
        SortedSet<String> subSet = treeSet.subSet("apple1","peach4");
        Iterator<String> iterator1 = subSet.iterator();
        while (iterator1.hasNext()){
            //System.out.println(iterator1.next());
            break;
        }
        Assert.assertEquals("apple1", treeSet.first());
    }
}
