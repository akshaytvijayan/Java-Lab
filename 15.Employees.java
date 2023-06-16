 
import java.util.Scanner;
class Employee{
int empId,salary;
String name,address;
Employee(int empId,String name, String address, int salary){
this.empId = empId;
this.name = name;
this.address = address;
this.salary = salary;
}
Employee(){}
}
class Teacher extends Employee{
String department;
String subject;
Teacher(int empId,String name, String address, int salary, String department, String subject){
										//initializing parent class constructor
super(empId, name, address, salary); 
this.department = department;
this.subject = subject;
}
Teacher(){
super();
}
//function to display all teachers
void displayTeachers(Teacher[] teachers){
String format = "%-10s %-20s %-20s %-10s %-20s %-20s";
System.out.format(format,"empID","Name","Address","Salary","Department","Subjects");
System.out.println();
System.out.format(format,"-----","----","-------","------","----------","--------");
System.out.println();
for(Teacher t: teachers){
System.out.format(format,t.empId, t.name, t.address, t.salary, t.department, t.subject);
System.out.println();
}
}
}
class Employees{
public static void main(String[] args){
Scanner sc =new Scanner(System.in);
System.out.print("\nEnter the no. of Employees: ");
int eCount = sc.nextInt();
Teacher[] teachers = new Teacher[eCount];
for(int i=0; i<eCount; i++){
System.out.print("\n Enter EmpID: ");
int empId = sc.nextInt();
sc.nextLine();
System.out.print("Enter Name: ");
String name = sc.nextLine();
System.out.print("Enter Adress: ");
String address = sc.nextLine();
System.out.print("Enter Salary: ");
int salary = sc.nextInt();
sc.nextLine();
System.out.print("Enter Department: ");
String dep = sc.nextLine();
System.out.print("Enter Subject: ");
String sub = sc.nextLine();
teachers[i] = new Teacher(empId, name, address, salary, dep, sub);
}
Teacher t1 = new Teacher();
t1.displayTeachers(teachers);
}
}

OUTPUT
------
ksb@ksb-OptiPlex-3060:~/akshaytvijayan/javaLab/15.Employee$ javac Employees. java
ksbeksb-OptiPlex-3060:~/akshaytvijayan/javalab/15.Employees java Employees
Enter the no. of Employees: 3

Enter EmpID: 1000
Enter Name: Akshay
Enter Adress: Kakkodi
Enter Salary: 35650
Enter Department: MCA
Enter Subject: AI

Enter EmpID: 1001
Enter Name: Arun
Enter Adress: Makkada
Enter Salary: 50000
Enter Department: Commerce
Enter Subject: Marketing

Enter EmpID: 1002
Enter Name: Varun
Enter Adress: Kakkayam
Enter Salary: 65262
Enter Department: Malayalam
Enter Subject: Malayalam

lempID	 Name	 AddresS	salary	Department	subjects
------	------	---------	------	----------	----------
1000	Akshay  Kakkodi		35650   MCA              AI
1001    Arun 	Makkada 	50000 	Commerce 	Marketing
1002    Varun 	Kakkayam 	65262 	Malayalam 	Malayalam

ksbeksb-0ptiPlex-3060:~/akshaytvijayan/javalab/15.Employees _
