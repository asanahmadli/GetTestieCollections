package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestHashMap {

    @Test
    public void put(){
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("a",1);
        hashMap.put("b",2);
        int actual = hashMap.get("a");
        int expected = 1;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void containsKey(){
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("a",1);
        hashMap.put("b",2);
        Assert.assertTrue(hashMap.containsKey("a"));
    }

    @Test
    public void containsValue(){
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("a",1);
        hashMap.put("b",2);
        Assert.assertTrue(hashMap.containsValue(1));
    }

    @Test
    public void overrideValue(){
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("a",1);
        hashMap.put("b",2);
        //if key exist it will override value if not exist then it will go create key and value
        hashMap.put("b",5);
        Assert.assertFalse(hashMap.containsValue(2));
    }

    @Test
    public void replace(){
        //replace method only change value if the key exist
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("a",1);
        hashMap.put("b",2);
        hashMap.replace("b",3); //use hashmap.putIfAbsent  if there is not key value
        Assert.assertFalse(hashMap.containsValue(2));
    }


    @Test
    public void remove(){
        //replace method only change value if the key exist
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("a",1);
        hashMap.put("b",2);
       hashMap.remove("a");
       Assert.assertFalse(hashMap.containsValue("a"));
    }

    @Test
    public void iterateMap(){
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("a",1);
        hashMap.put("b",2);

        //iterate map using Map>Entry<String,Integer>
        for(Map.Entry<String,Integer> entry:hashMap.entrySet()){
            System.out.print(entry.getKey());
            System.out.print(entry.getValue());
            System.out.print("\n");
        }


        //itereate map using set
       Set<String> set = hashMap.keySet();
       for(String key:set){
           System.out.println(hashMap.get(key));
       }


    }

}
