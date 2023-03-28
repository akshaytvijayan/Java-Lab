import java.util.Scanner;
class Product
{
int pcode,price;
String pname;
Product(int pcode,String pname,int price)
{
this.pcode=pcode;
this.pname=pname;
this.price=price;
}
}
class Products
{
public static void main (String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("\n Enter the Product Code  : ");
int pcode = sc.nextInt();
System.out.println("\n Enter the Product Name  : ");
String pname = sc.next();
System.out.println("\n Enter the Product Price  : ");
int price = sc.nextInt();

Product[]ps=new Product[3];
ps[0]=new Product(pcode,pname,price);
ps[1]=new Product(6741,"Pen",10);
ps[2]=new Product(5772,"Pencil",5);

int minprice=ps[0].price;
System.out.println("\nCode\tName\tPrice ");

for(Product p:ps)
{
System.out.println(p.pcode+"\t"+p.pname+"\t"+p.price);
if(minprice>p.price)
{
minprice=p.price;
}
}
System.out.println("\n Lower Cost Product \n");
for(Product p:ps)
{
if(minprice==p.price)
{
System.out.println("----------------------------------------------");
System.out.println("Product Code = "+p.pcode);
System.out.println("Product Name = "+p.pname);
System.out.println("Product Price = "+p.price);
System.out.println("----------------------------------------------");
}
}
}
}

OUTPUT
--------

 Enter the Product Code  : 
110

 Enter the Product Name  : 
soap

 Enter the Product Price  : 
56

Code	Name	Price 
110	soap	56
6741	Pen	10
5772	Pencil	5

 Lower Cost Product 

----------------------------------------------
Product Code = 5772
Product Name = Pencil
Product Price = 5
----------------------------------------------


