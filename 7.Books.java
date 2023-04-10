class Publisher{
String pubName;
Publisher(String pubName){
this.pubName=pubName;
}
void display(){
System.out.println("publisher\t:"+pubName);
}
}
class Book extends Publisher{
String title;
String author;
Book(String pubName,String title,String author){
super(pubName);
this.title=title;
this.author=author;
}
void display(){
super.display();
System.out.println("Title:\t\t:"+title);
System.out.println("Author:\t\t:"+author);
}
}
class Literature extends Book{
String type;
Literature(String pubName,String title,String author,String type){
super(pubName,title,author);
this.type=type;
}
void display(){
super.display();
System.out.println("Type:\t\t:"+type);
}
}
class Fiction extends Book{
String genre;
Fiction(String pubName,String titile,String author,String genre){
super(pubName,titile,author);
this.genre=genre;
}
void display(){
super.display();
System.out.println("Genre\t\t:"+genre);
}
}
class Books{
public static void main(String[]args){
Literature[]l=new Literature[2];
Fiction []f=new Fiction[2];
l[0]=new Literature("Harper collins","The Alchemist","paulo coelho","Drama");
l[1]=new Literature("DC Books","The Aarachaar","K.R Meera","Novel");
f[0]=new Fiction("Cassel","Macbeth","William Shakespeare","Tragedy");
f[1]=new Fiction("Penguin Books","The Legend of Khasak","O.V Vijayan","Magical Realism");

System.out.println("\t Literature");
for (int i=0;i<l.length;i++)
{
System.out.println("####"+(i+1));
l[i].display();
}
System.out.println("\t Fiction");
for (int i=0;i<f.length;i++)
{
System.out.println("####"+(i+1));
f[i].display();
}
}
}

OUTPUT
------
ksb@ksb-OptiPlex-3060:~/javaLab$ javac Books.java
ksb@ksb-OptiPlex-3060:~/javaLab$ java Books
	 Literature
####1
publisher	:Harper collins
Title:		:The Alchemist
Author:		:paulo coelho
Type:		:Drama
####2
publisher	:DC Books
Title:		:The Aarachaar
Author:		:K.R Meera
Type:		:Novel
	 Fiction
####1
publisher	:Cassel
Title:		:Macbeth
Author:		:William Shakespeare
Genre		:Tragedy
####2
publisher	:Penguin Books
Title:		:The Legend of Khasak
Author:		:O.V Vijayan
Genre		:Magical Realism
ksb@ksb-OptiPlex-3060:~/javaLab$ 

