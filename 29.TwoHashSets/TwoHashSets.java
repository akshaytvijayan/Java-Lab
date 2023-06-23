
/*Write a Java program to compare two hash set*/

import java.util.*;
public class TwoHashSets {
public static void main(String[] args) {
HashSet<String> set1 = new HashSet<String>();
set1.add("a");
set1.add("b");
set1.add("c");
set1.add("d");
set1.add("e");
Set<String> set2 = new HashSet<String>();
set2.add("a");
set2.add("b");
set2.add("c");
set2.add("d");
set2.add("e");
System.out.println("\nIs Set 1 & Set 2 equal ? : "+ set1.equals(set2));
}
}

