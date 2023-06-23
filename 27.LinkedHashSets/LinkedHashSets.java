/*Program to demonstrate the creation of Set object using the LinkedHashset class*/

import java.util.*;
public class LinkedHashSets{
public static void main(String args[]){
LinkedHashSet<String> set=new LinkedHashSet<String>();
set.add("a");
set.add("b");
set.add("c");
set.add("d");
Iterator<String> itr=set.iterator();
System.out.println("\nThe elements in the set :\n");
while(itr.hasNext()){
System.out.print(itr.next()+" \n");
}
}
}
