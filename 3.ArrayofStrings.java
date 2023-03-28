import java.util.Scanner;
import java.util.Arrays;
class ArrayofStrings{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("******************************************************************************");
System.out.println("\n Enter the Number of Strings  : ");
int size = sc.nextInt();
String[]Strings=new String[size];
System.out.println("Enter the Strings  : ");
for(int i=0; i<size;i++){
Strings[i]=sc.next();
}

System.out.println("Choose : \n1.Bulid in Method       2.User Define Method\n");
System.out.print("Choose Your Option : ");

int opt = sc.nextInt();
switch(opt)
{

case 1:
System.out.println("-------------------------------------------------------------");
Arrays.sort(Strings);
break;
case 2:
System.out.println("-------------------------------------------------------------");
String temp;
for(int i=0;i<size;i++)
{
for(int j=i+1;j<size;j++)
{
if(Strings[i].compareTo(Strings[j]) >0)
{
temp=Strings[i];
Strings[i]=Strings[j];
Strings[j]=temp;
       }
      }
     }
break;
default:
System.out.println("invalid option");
break;
    }
for(int i=0;i<size;i++)
System.out.println(Strings[i]);
    }
    }

OUTPUT
-------
******************************************************************************

 Enter the Number of Strings  : 
3
Enter the Strings  : 
Gokul
Aswin
Hareesh
Choose : 
1.Bulid in Method       2.User Define Method

Choose Your Option : 2
Aswin
Gokul
Hareesh
ksb@ksb-OptiPlex-3060:~/javaLab$ java ArrayofStrings
******************************************************************************

 Enter the Number of Strings  : 
3
Enter the Strings  : 
Gokul
Aswin
Hareesh
Choose : 
1.Bulid in Method       2.User Define Method

Choose Your Option : 1
-------------------------------------------------------------
Aswin
Gokul
Hareesh
ksb@ksb-OptiPlex-3060:~/javaLab$ javac ArrayofStrings.java
ksb@ksb-OptiPlex-3060:~/javaLab$ java ArrayofStrings
******************************************************************************











