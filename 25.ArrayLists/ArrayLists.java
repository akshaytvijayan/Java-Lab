/*Maintain a list of Strings using ArrayList from collection framework, perform built-in operations.*/ 

import java.util.*;
class ArrayLists 
{
public static void main(String args[])
{
// Create an array list object.
ArrayList<String> al = new ArrayList<String>();
System.out.println("\n\nInitial size of al: " + al.size());
// Add elements to the array list.
al.add("a");
al.add("b");
al.add("c");
al.add("d");
al.add("e");
al.add("f");
al.add(1, "a2");
System.out.println("\nSize of al after additions: " + al.size());
// Display the array list contents.
System.out.println("\nContents of al: " + al);
//The indexed get and set methods
String str = al.get(2);
al.set(2,str+" updated");
System.out.println("\nContents of al after updation: " + al);
// Remove elements from the array list.
al.remove("d");
al.remove(2);
System.out.println("\nSize of al after deletions: " + al.size());
System.out.println("\nContents of al: " + al);
}
}
