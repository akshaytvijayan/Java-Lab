/*Program to create a generic stack and do the Push and Pop operations.*/

import java.util.*;
class Stack<T> {
ArrayList<T> elements;
// stack pointer
int sp = -1;
int size;
Stack(int size ){
elements = new ArrayList<T>(size);
this.size = size;
}
//to push elements
void push( T element){
elements.add(element);
}
//to pop last enterd item
T pop(){
return elements.remove(elements.size()-1);
}
}
class GenStack { //main
public static void main(String args[]) {
Scanner s = new Scanner(System.in);
System.out.println("\nEnter size: ");
int size = s.nextInt();
// Stack object for Integer type
Stack<Integer> iStack = new Stack<Integer>(size);
System.out.println("------ Interger Stack -------");
System.out.println("\npush elements ");
for(int i=0;i<size;i++)
{
int e=s.nextInt();
iStack.push(e);
}
int p1 = iStack.pop();
System.out.println("poped element: " + p1);
p1 = iStack.pop();
System.out.println("poped element: " + p1);
p1 = iStack.pop();
System.out.println("poped element: " + p1);
p1 = iStack.pop();
// Stack object for String type
Stack<String> sStack = new Stack<String>(size);
System.out.println("------ String Stack -------");
System.out.println("\npush elements ");
for(int i=0;i<size;i++)
{
String e=s.nextLine();
sStack.push(e);
}
String sp1 = sStack.pop();
System.out.println("poped elements: " + sp1);
sp1 = sStack.pop();
System.out.println("poped elements: " + sp1);
sp1 = sStack.pop();
}
}

