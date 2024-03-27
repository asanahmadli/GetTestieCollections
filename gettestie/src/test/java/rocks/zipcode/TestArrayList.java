package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class TestArrayList {

    @Test
    public void add(){
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("BMW");
        arrayList.add("Subaru");
        int size = 2;
        Assert.assertEquals(size,arrayList.size());
    }

    @Test
    public void set(){
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("BMW");
        arrayList.set(0,"Subaru");
        String expected  = "Subaru";
        Assert.assertEquals(expected,arrayList.get(0));
    }

    @Test
    public void contains(){
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Subaru");
        String expected  = "Subaru";
        Assert.assertTrue(expected,arrayList.contains("Subaru"));
    }

    @Test
    public void remove(){
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("BMW");
        arrayList.add("Subaru");
        arrayList.remove(1);
       String expected = "Subaru";
        Assert.assertFalse(expected,arrayList.contains("Subaru"));
    }

    @Test
    public void clear(){
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("BMW");
        arrayList.add("Subaru");
        arrayList.clear();
        boolean expected = true;
        Assert.assertEquals(expected,arrayList.isEmpty());
    }

    @Test
    public void iterate(){
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add("BMW");
            arrayList.add("Subaru");

        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }

}
