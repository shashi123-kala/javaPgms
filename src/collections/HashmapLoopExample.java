package collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashmapLoopExample {

    public static void main(String args[]) {
        

    // Creating a HashMap of String keys and String values
    HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
    hashmap.put(1, "ram");
    hashmap.put(2, "sita");
    Set<String> s = new HashSet<>();
    System.out.println("Iterating or looping map using foreach loop");
    // Iterating or looping using keySet() method
    for (Integer key : hashmap.keySet()) {
        System.out.println( key + " value: " + hashmap.get(key));
    }
    for (String v : hashmap.values()) {
        s.add(v);
    }
    System.out.println(s);
    
    for (Entry<Integer,String> entry : hashmap.entrySet()) 
        System.out.println("Key = " + entry.getKey() +
                         ", Value = " + entry.getValue());
}
  

}
