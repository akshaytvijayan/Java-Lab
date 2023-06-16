/* Find the average of N positive integers, raising a user defined exception for each negative input. */

import java.util.Scanner; 
class NegativeIntegerException extends Exception
{ 
public NegativeIntegerException(String msg)
{ 
super(msg); 
	} 
} 

class Inputs{ 
public static void main(String[] args)
{ 
Scanner sc = new Scanner(System.in);
System.out.println("\n****************Average**************"); 
System.out.println("\n Enter the no. of integers: "); 
int l = sc.nextInt(); 
int sum = 0; 
System.out.println("Enter the numbers:"); 
try{ 
for(int i=0; i<l; i++)
{ 
int num = sc.nextInt(); 
						// Exception when number is negative 
if(num < 0) 
throw new NegativeIntegerException(num + " is negative, only positive integers are allowed!"); 
else { 
sum += num; 
	} 
} 
						//calculates average 
double average = sum / l; 
System.out.println("Average: "+ average); 
} catch(NegativeIntegerException e)
{ 
e.printStackTrace();
	} 
} 
}

OUTPUT
------
ksb@ksb-OptiPlex-3060:~/akshaytvijayan/javaLab/21$ javac Inputs.java
ksb@ksb-OptiPlex-3060:~/akshaytvijayan/javaLab/21$ java Inputs

****************Average**************

 Enter the no. of integers: 
5
Enter the numbers:
5
6
3
9
4
Average: 5.0
ksb@ksb-OptiPlex-3060:~/akshaytvijayan/javaLab/21$ 
