import java.util.Scanner;
class Person{
String name, gender, address;
int age;
Person(String name, String address, String gender, int age){
this.name = name;
this.address = address;
this.gender = gender;
this.age = age;
}
void display(){

System.out.println("\nName\t: "+ name);
System.out.println("Address\t: "+ address);
System.out.println("Gender\t: "+ gender);
System.out.println("Age\t: "+ age);
}
}
class Employee extends Person{
int empId, salary;
String company_name, qualification;
Employee(String name, String address, String gender, int age, int empId, String company_name,String qualification,int salary){
super(name, address, gender, age);
this.empId = empId;
this.company_name = company_name;
this.qualification = qualification;
this.salary = salary;
}
void display(){
super.display();
System.out.println("\nEmpID\t: "+ empId);
System.out.println("Company Name\t: "+ company_name);
System.out.println("Qualification\t: "+ qualification);
System.out.println("salary\t: "+ salary);
}
}
class Teacher extends Employee{
String subject, department;
int teacherId;
Teacher(String name, String address, String gender, int age, int empId, String company_name,String qualification,int salary,String subject, String department, int teacherId){
super(name, address, gender, age, empId, company_name, qualification, salary);
this.subject = subject;
this.department = department;
this.teacherId = teacherId;
}
void display(){
super.display();
System.out.println("Subject\t: "+ subject);
System.out.println("Department\t: "+ department);
System.out.println("TeacherID\t: "+ teacherId);
}
}
class Teachers{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n, age,empId, salary, teacherId;
String name, address, gender, comp_name, qual, subject, dept;
System.out.print("\n\n\tEnter the no. of teachers: ");
n = sc.nextInt();
sc.nextLine();
Teacher[] ts = new Teacher[n];
for(int i=0; i<n; i++){
System.out.println("\n********************Enter Details Of Employee "+(i+1)+": ***********************************");
System.out.print("Name: ");
name = sc.nextLine();


System.out.print("Address: ");
address = sc.nextLine();
System.out.print("Gender: ");
gender = sc.nextLine();
System.out.print("Age: ");
age = sc.nextInt();
System.out.print("EmpID: ");
empId = sc.nextInt();
sc.nextLine();
System.out.print("Company Name: ");
comp_name = sc.nextLine();
System.out.print("Qualification: ");
qual = sc.nextLine();
System.out.print("Salary: ");
salary = sc.nextInt();
sc.nextLine();
System.out.print("Subject: ");
subject = sc.nextLine();
System.out.print("Department: ");
dept = sc.nextLine();
System.out.print("TeacherID: ");
teacherId = sc.nextInt();
sc.nextLine();
ts[i] = new Teacher(name, address, gender, age, empId, comp_name, qual, salary, subject, dept, teacherId);
}
for(int i=0; i<n; i++){
ts[i].display();
}
}
}

OUTPUT
------

ksb@ksb-OptiPlex-3060:~/akshaytvijayan/javaLab/16.Teachers$ javac Teachers.java
ksb@ksb-OptiPlex-3060:~/akshaytvijayan/javaLab/16.Teachers$ java Teachers


	Enter the no. of teachers: 3

********************Enter Details Of Employee 1: ***********************************
Name: AKSHAY
Address: MAKKAKDA
Gender: MALE
Age: 24
EmpID: 456
Company Name: SRK Company
Qualification: B TEC
Salary: 60000
Subject: Maths
Department: MCA
TeacherID: 963

********************Enter Details Of Employee 2: ***********************************
Name: RADHA
Address: KAKKODI
Gender: FEMALE
Age: 23
EmpID: 123
Company Name: SRK Company
Qualification: Bsc Mathematics
Salary: 50000
Subject: 
Department: mca
TeacherID: 852

********************Enter Details Of Employee 3: ***********************************
Name: VARUN
Address: NV ROAD
Gender: MALE
Age: 56
EmpID: 741
Company Name: SRK Company
Qualification: BCOM
Salary: 68000
Subject: ACCOUNTANCY
Department: +2
TeacherID: 012

Name	: AKSHAY
Address	: MAKKAKDA
Gender	: MALE
Age	: 24

EmpID	: 456
Company Name	: SRK Company
Qualification	: B TEC
salary	: 60000
Subject	: Maths
Department	: MCA
TeacherID	: 963

Name	: RADHA
Address	: KAKKODI
Gender	: FEMALE
Age	: 23

EmpID	: 123
Company Name	: SRK Company
Qualification	: Bsc Mathematics
salary	: 50000
Subject	: 
Department	: mca
TeacherID	: 852

Name	: VARUN
Address	: NV ROAD
Gender	: MALE
Age	: 56

EmpID	: 741
Company Name	: SRK Company
Qualification	: BCOM
salary	: 68000
Subject	: ACCOUNTANCY
Department	: +2
TeacherID	: 12
