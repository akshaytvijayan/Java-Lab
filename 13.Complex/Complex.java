/*Q).Java program to add two numbers that consist of two parts a real number and an imaginary number ?*/

import java.util.Scanner;
class Complex
{
private int real,imaginary;
Complex(){}
Complex(int real,int imaginary)
{
this.real=real;
this.imaginary=imaginary;
}
Complex sum(Complex n1,Complex n2)
{
return new Complex(n1.real + n2.real, n1.imaginary + n2.imaginary);
}
public static void main (String [] args)
{
Scanner sc = new Scanner(System.in);
Complex n1 = new Complex();
Complex n2 = new Complex();
System.out.println("---------------Enter First Number------------------");
System.out.print("\n Real:");
n1.real=sc.nextInt();
System.out.print(" Imaginary:");
n1.imaginary=sc.nextInt();
System.out.println("---------------Enter Second Number------------------");
System.out.print("\n Real:");
n2.real=sc.nextInt();
System.out.print(" Imaginary:");
n2.imaginary=sc.nextInt();
Complex sum = n1.sum(n1,n2);
System.out.println("\n Sum :"+sum.real+"+" +sum.imaginary+"i");
}
}
