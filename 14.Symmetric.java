/*Q) .Read a matrix from the console and check whether it is symmetric or not ?*/

import java.util.Scanner;
class Symmetric
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("\n Enter the size of  the square matrix : ");
int t=sc.nextInt();
int[][]matrix1= new int[t][t];
System.out.println(" Enter the matrix :");
for(int i=0;i<t;i++)
{
for(int j=0;j<t;j++)
{
matrix1[i][j]=sc.nextInt();
}
}
System.out.println("Matrix is : ");
for(int i=0;i<t;i++)
{
for(int j=0;j<t;j++)
{
System.out.print(matrix1[i][j] +"\t");
}
System.out.println();
}
for(int i=0;i<t;i++)
{
for(int j=0;j<t;j++)
{
if(matrix1[i][j] != matrix1[j][i])
{
System.out.println("Matrices are not symmetric");
return;
}
}
}
System.out.println("Matrices are  symmetric");
}
}

OUTPUT
------

ksb@ksb-ThinkCentre-Edge72:~/JAVA/14.Symmetric$ 
ksb@ksb-ThinkCentre-Edge72:~/JAVA/14.Symmetric$ java Symmetric

 Enter the size of  the square matrix : 3
 Enter the matrix :
1
0
1
0
1
0
1
0
1
Matrix is : 
1	0	1	
0	1	0	
1	0	1	
Matrices are  symmetric
ksb@ksb-ThinkCentre-Edge72:~/JAVA/14.Symmetric$ java Symmetric

 Enter the size of  the square matrix : 3
 Enter the matrix :
1
2
3
1
2
3
1
2
3
Matrix is : 
1	2	3	
1	2	3	
1	2	3	
Matrices are not symmetric
