class Shapes{
// Area of sqaure
int area(int l){
return l*l;
}
// Area of Rectangle
int area(int l, int b){
return l*b;
}
// Area of Cuboid
int area(int l, int b, int h){
return ((2*l*b) + (2*l*h) + (2*h*b));
}
public static void main(String[] args){
Shapes s = new Shapes();
System.out.println("Area of square: " + s.area(6));
System.out.println("Area of Rectangle: " + s.area(6,3));
System.out.println("Area of Cuboid: " + s.area(1,3,5));
}
}

OUTPUT
------
ksb@ksb-OptiPlex-3060:~/akshaytvijayan/javaLab/19.Shapes$ javac Shapes.java
ksb@ksb-OptiPlex-3060:~/akshaytvijayan/javaLab/19.Shapes$ java Shapes
Area of square: 36
Area of Rectangle: 18
Area of Cuboid: 46
ksb@ksb-OptiPlex-3060:~/akshaytvijayan/javaLab/19.Shapes$ 
