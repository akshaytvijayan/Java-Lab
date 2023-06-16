/* Define 2 classes; one for generating Fibonacci numbers and other for displaying even numbers in a given range. Implement using threads. (Runnable Interface)*/ 

import java.util.Scanner; 
class Fibonacci implements Runnable{ 
int limit, n1= 1,n2= 0,n3; 
Fibonacci(int limit){
this.limit = limit; 
} 
public void run(){ 
try{ 
for(int i = 0; i <= limit; ++i){ 
n3= n1 + n2; 
System.out.println("Fibonacci number : "+n3); 
n1 = n2; 
n2 = n3; 
Thread.sleep(500); 
} 
} catch (InterruptedException e) { 
System.out.println("Fibonacci Thread Interrupted"); 
} 
} 
} 
class EvenNumbers implements Runnable{ 
int lowerLimit, upperLimit; 
EvenNumbers(int lower, int upper){ 
this.lowerLimit = lower; 
this.upperLimit = upper; 
} 
public void run(){ 
try{
for(int i = lowerLimit; i <= upperLimit; ++i){ 
if(i%2 == 0) 
System.out.println("Even number : "+i); 
Thread.sleep(500); 
} 
} catch (InterruptedException e) { 
System.out.println("EvenNumbers Thread Interrupted"); 
} 
} 
} 
class Threads{ 
public static void main(String[] args){ 
Scanner sc = new Scanner(System.in); 
System.out.print("Enter the no. of Fibonacci numbers: "); 
int fl = sc.nextInt(); 
Fibonacci fib = new Fibonacci(fl); 
System.out.print("Enter the range of Even numbers:- \nLower limit: "); 
int ll = sc.nextInt(); 
System.out.print("Upper limit: "); 
int ul = sc.nextInt(); 
EvenNumbers en = new EvenNumbers(ll, ul); 
Thread f = new Thread(fib); 
Thread e = new Thread(en);
f.start(); 
e.start(); 
} 
}

OUTPUT
-------
ksb@ksb-OptiPlex-3060:~/akshaytvijayan/javaLab/20$ java Threads
Enter the no. of Fibonacci numbers: 10
Enter the range of Even numbers:- 
Lower limit: 0
Upper limit: 10
Fibonacci number : 1
Even number : 0
Fibonacci number : 1
Fibonacci number : 2
Even number : 2
Fibonacci number : 3
Fibonacci number : 5
Even number : 4
Fibonacci number : 8
Even number : 6
Fibonacci number : 13
Fibonacci number : 21
Even number : 8
Fibonacci number : 34
Fibonacci number : 55
Even number : 10
Fibonacci number : 89
ksb@ksb-OptiPlex-3060:~/akshaytvijayan/javaLab/20$ 
