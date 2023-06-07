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
