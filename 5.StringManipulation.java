Q).Write a program to illustrate the following string manipulation methods

a) Create new string using 'new'
b) Getting string length
c) String concatenation
d) Character extraction
e) String comparison
f) Searching substring
g) Modifying a string
h) data conversion using valueOf()

******************************************************************************

import java.util.*;
import java.util.Scanner;
class StringManipulation
	{
		public static void main(String[]args)
	{
System.out.print("\n\n");
System.out.print("********************************************************CREATE NEW STRING USING NEW************************************");
char chs[]={'l','i','v','e',' ','w','i','t','h','o','u','t',' ','f','e','a','r'};
String newstr=new String(chs);
System.out.print("\n\nNew String from char[] using new :"+newstr);
byte asciis[]={65,66,67,68,69,70};
String newstr2=new String(asciis);
System.out.print("\n\nNew string of corresponding ascii value from asciis[] using new :"+newstr2);
String s1="think";
String s2="DIFFERENTLY";
System.out.print("\n\nString 1 :"+s1);
System.out.print("\nString 2 :"+s2);
System.out.print("\n\nLength of string 'good' :"+s1.length());
System.out.print("\n\n"+s1+" To Uppercase :"+s1.toUpperCase());
System.out.print("\n\n"+s2+" To Lowercase :"+s2.toLowerCase());
System.out.print("\n\n");
System.out.print("\n\n**********************************************************CONCATENATION********************************************");
System.out.print("\n\nUsing concat() :"+s1.concat(" "+s2));
System.out.print("\n\nUsing '+' operator :"+s1+" "+s2);
System.out.print("\n\n*********************************************CHARACTEREXTRACTION***************************************************");
System.out.print("\n\nCharacter at 3rd position :"+s1.charAt(3));
char c[]=new char[50];
s1.getChars(2,4,c,0);
System.out.print("\n\nCharcater between 2 and 4 :"+new String(c));
System.out.print("\n\n");
System.out.print("\n\n**************************************************CHARACTER COMPARISON*********************************************");
String x="manufacture";
String y="MANUFACTURE";
System.out.print("\n\nString 1 :"+x);
System.out.print("\nString 2 :"+y);
System.out.print("\n\n"+x+" Equals "+y+" :"+x.equals(y));
System.out.print("\n\n"+x+" Equals IgnoreCase "+y+" :"+x.equalsIgnoreCase(y));
System.out.print("\n\n"+x+" Compare to "+y+" :"+x.compareTo(y));
System.out.print("\n\n"+x+" Starts with w  :"+x.startsWith("w"));
System.out.print("\n\n");
System.out.print("\n\n******************************************************SEARCH SUBSTRINGS********************************************");
String z="someone told me,You have smile and attractive eyes";
System.out.print("\n\nstring  :"+z);
System.out.print("\n\nindex of 'attractive' word  :"+z.indexOf("attractive"));
System.out.print("\n\nsubstring :"+z.substring(16));
System.out.print("\n\n***************************************************STRING MODIFICATION*********************************************");
System.out.print("\n\n");
System.out.print("\n\nreplace 'eyes' to 'smile' :"+z.replace("eyes","smile"));
System.out.print("\n\n");
System.out.print("\n\n*******************************************************USING VALUE OF**********************************************");
float n=1003.23f;
System.out.print("\n\n"+n+" is converted to string "+String.valueOf(n));
System.out.print("\n\n");
}
}

OUTPUT
--------
ksb@ksb-OptiPlex-3060:~/javaLab/5.StringManipulation$ java StringManipulation


********************************************************CREATE NEW STRING USING NEW************************************

New String from char[] using new :live without fear

New string of corresponding ascii value from asciis[] using new :ABCDEF

String 1 :think
String 2 :DIFFERENTLY

Length of string 'good' :5

think To Uppercase :THINK

DIFFERENTLY To Lowercase :differently



**********************************************************CONCATENATION********************************************

Using concat() :think DIFFERENTLY

Using '+' operator :think DIFFERENTLY

*********************************************CHARACTEREXTRACTION***************************************************

Character at 3rd position :n

Charcater between 2 and 4 :in



**************************************************CHARACTER COMPARISON*********************************************

String 1 :manufacture
String 2 :MANUFACTURE

manufacture Equals MANUFACTURE :false

manufacture Equals IgnoreCase MANUFACTURE :true

manufacture Compare to MANUFACTURE :32

manufacture Starts with w  :false



******************************************************SEARCH SUBSTRINGS********************************************

string  :someone told me,You have smile and attractive eyes

index of 'attractive' word  :35

substring :You have smile and attractive eyes

***************************************************STRING MODIFICATION*********************************************



replace 'eyes' to 'smile' :someone told me,You have smile and attractive smile



*******************************************************USING VALUE OF**********************************************

1003.23 is converted to string 1003.23

ksb@ksb-OptiPlex-3060:~/javaLab/5.StringManipulation$ 



