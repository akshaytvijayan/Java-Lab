import java.util.*;
interface Student{
int Score=10;
void displayScore();
}
interface Sports{
int Score=25;
void displaySportsScore();
}
class Result implements Student,Sports{
public void displayScore()
{
System.out.println("Acadamic Score :"+Student.Score);
}

public void displaySportsScore()
{
System.out.println("Sports Score :"+Sports.Score);
}
}

class SportsStudent{
public static void main(String[]args){
Result r=new Result();
r.displayScore();
r.displaySportsScore();
}
}

OUTPUT
--------

ksb@ksb-OptiPlex-3060:~/javaLab$ javac SportsStudent.java
ksb@ksb-OptiPlex-3060:~/javaLab$ java SportsStudent
Acadamic Score :10
Sports Score :25
