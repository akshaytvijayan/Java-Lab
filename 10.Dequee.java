import java.util.*;
public class Dequee
{
public static void main(String[]args)
{
//initializing Deque object
Deque<String>deque=new ArrayDeque<String>();
//adding values
deque.add("A");
deque.add("B");
deque.add("C");
deque.add("D");
deque.add("E");
System.out.println("Elements in deque are : ");
for(String str:deque)
{
System.out.println(str +"");
}
deque.remove();
System.out.println("\n After first element deleted :");
for(String str:deque)
{
System.out.println(str +"");
}
deque.clear();
System.out.println("\n After all element deleted : ");
for(String str:deque)
{
System.out.println(str +"");
}
}
}

OUTPUT
-----------

ksb@ksb-OptiPlex-3060:~/javaLab/10.Dequee$ java Dequee
Elements in deque are : 
A
B
C
D
E

 After first element deleted :
B
C
D
E

 After all element deleted 
