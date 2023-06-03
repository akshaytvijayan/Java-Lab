import java.util.Scanner;
class Multiplication extends Thread
{
public void run()
{
try{
for(int i=0;i<=10;i++)
{
System.out.println(i+"x 5="+(i*5));
Thread.sleep(500);
}
}catch(InterruptedException e)
{
System.out.println("Multiplication thread interrupted!");
}
}
}

class  Prime extends Thread
{
int limit,count,flag,i,j;
Prime(int limit)
{
this.limit=limit;
}
public void run()
{
try{
int j=2;
while(count<limit)
{
flag=1;
for(i=2;i<=(j-1);i++)
{
if(j%i==0)
{
flag=0;
break;
}}
if(flag==1)
{
System.out.println("Prime number:"+j);
count++;
}
j++;
Thread.sleep(500);}
}catch(InterruptedException e )
{
System.out.println("Prime thread interrupted!");
}
}
}

class Threads
{
public static void main (String[] args)
{
Multiplication mul=new Multiplication();
Scanner sc=new Scanner(System.in);
System.out.println("enter the limit:");
int l=sc.nextInt();
Prime p=new Prime(l);
mul.start();
p.start();
}
}

OUTPUT
-------

ksb@ksb-OptiPlex-3060:~/javaLab$ javac Threads.java
ksb@ksb-OptiPlex-3060:~/javaLab$ java Threads
enter the limit:
5
0x 5=0
Prime number:2
1x 5=5
Prime number:3
2x 5=10
Prime number:5
3x 5=15
4x 5=20
Prime number:7
5x 5=25
6x 5=30
7x 5=35
8x 5=40
Prime number:11
9x 5=45
10x 5=50
ksb@ksb-OptiPlex-3060:~/javaLab$ 
