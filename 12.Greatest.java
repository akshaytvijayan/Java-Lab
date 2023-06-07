/*Q)Write a program that accepts three numbers from the user and prints "increasing" if the numbers are in increasing order, "decreasing" if the numbers are in decreasing order, and "Neither increasing or decreasing order" otherwise.*/

import java.util.Scanner;
public class Greatest
{
public static void main(String [] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("\n---------------Numbers Science--------------------\n");
System.out.println(" Enter First Number :");
int x = sc.nextInt();
System.out.println(" Enter Second Number :");
int y = sc.nextInt();
System.out.println(" Enter Third Number :");
int z = sc.nextInt();

if(x<y && y<z)
{
System.out.print("\n Increasing Order \n");
}
else if(x>y && y>z)
{
System.out.print("\n Dereasing Order \n");
}
else
{
System.out.print("\n Neither Increasing Order or Dereasing Order \n ");
}
}
}

OUTPUT
------
ksb@ksb-ThinkCentre-Edge72:~/JAVA/12.Greatest$ javac Greatest.java
ksb@ksb-ThinkCentre-Edge72:~/JAVA/12.Greatest$ java Greatest

---------------Numbers Science--------------------

 Enter First Number :
100
 Enter Second Number :
2
 Enter Third Number :

300

 Neither Increasing Order or Dereasing Order 
 ksb@ksb-ThinkCentre-Edge72:~/JAVA/12.Greatest$ java Greatest

---------------Numbers Science--------------------

 Enter First Number :
100
 Enter Second Number :
200
 Enter Third Number :
300

 Increasing Order 
ksb@ksb-ThinkCentre-Edge72:~/JAVA/12.Greatest$ java Greatest

---------------Numbers Science--------------------

 Enter First Number :
3
 Enter Second Number :
2
 Enter Third Number :
1

 Dereasing Order 
