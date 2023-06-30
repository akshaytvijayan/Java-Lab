/*Program to Convert HashMap to TreeMap*/

import java.util.*;
class HMToTM {
public static void main(String args[]) {
// Create a object hash map.
HashMap<String,Integer> hm = new HashMap<String, Integer>(); //creting hashmap
// Put elements to the map
hm.put("Arun", 93);
hm.put("Vysak",87);
hm.put("Sabin",81);
hm.put("Nidhin",69);
System.out.println("\nHashMap: \n----------");
for(Map.Entry m:hm.entrySet()){
System.out.println(m.getKey()+":"+m.getValue()); //printing the hashmap
}
Map<String, Integer> tm = new TreeMap<>(); //creates object treemap
tm.putAll(hm);
//converting hashmap to treemap
System.out.println("\n\tAfter Conversion\nTreeMap\n----------");
for(Map.Entry m:tm.entrySet()){
System.out.println(m.getKey()+":"+m.getValue()); //printing the Treemap
}
}
}

