/*Program to demonstrate the creation of queue object using the PriorityQueue class*/

import java.util.*;
public class PriorityQueues{
public static void main(String args[]){
// PriorityQueue object
PriorityQueue<String> queue=new PriorityQueue<String>();
//Insert Values
queue.add("a");
queue.add("b");
queue.add("c");
queue.add("d");
// display queue elements
System.out.print("\n\nQueue Elements :\n");
Iterator<String> itr=queue.iterator();
while(itr.hasNext()){
System.out.print(itr.next()+" \n");
}
}
}
