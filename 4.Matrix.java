import java.util.Scanner;
public class Matrix
{
public static void main (String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Number of rows : ");
int m=sc.nextInt();
System.out.println("Number of colomns : ");
int n = sc.nextInt();
int [][] mat1=new int[m][n];
int [][] mat2=new int[m][n];
int [][] summat=new int[m][n];
int i,j;
System.out.println("Enter the first matrix : \n");
for( i=0; i<m; i++)
{
for(j=0; j<n; j++)
{
mat1[i][j]=sc.nextInt();
             }
          }
System.out.print("Enter the second matrix : \n");
for( i=0; i<m; i++)
{
for(j=0; j<n; j++)
{
mat2[i][j]=sc.nextInt();
 }
 }
 for( i=0; i<m; i++)
 {
for(j=0; j<n; j++)
 {
  summat[i][j]=mat1[i][j]+mat2[i][j];
             }
          }
    System.out.println("RESULT : ");
          for(i=0; i<m; i++)
          {
             for(j=0; j<n; j++)
             {
               System.out.print(summat[i][j]+"\t");
             }
System.out.println();
          }
}
}

OUTPUT
--------
ksb@ksb-OptiPlex-3060:~/telegram$ javac Matrix.java
ksb@ksb-OptiPlex-3060:~/telegram$ java Matrix
Number of rows : 
3
Number of colomns : 
3
Enter the first matrix : 

1 2 3
 4 5 6
7 8 9
Enter the second matrix : 
9 8 7
6 5 4
3 2 1
RESULT : 
10	10	10	
10	10	10	
10	10	10	
