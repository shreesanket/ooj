import java.util.Scanner;

class InputScanner{
Scanner s;
InputScanner(){
    s=new Scanner(System.in);
}
}

abstract class Shape extends InputScanner{
    double a;
    double b;
    abstract void getDetails();
    abstract void printArea();
}

class Rectangle extends Shape{
    void getDetails(){
        System.out.println("Enter length and breadth");
        a=s.nextDouble();
        b=s.nextDouble();
    }
    void printArea(){
        System.out.println("Area of Rectangle = "+(a*b));
    }

}

class Triangle extends Shape{
    void getDetails(){
         System.out.println("Enter a and b");
        a=s.nextDouble();
        b=s.nextDouble();
    }
    void printArea(){
        System.out.println("Area of Rectangle = "+(a*b/2));
    }

}

class Circle extends Shape{
 void getDetails(){
    System.out.println("Enter radius");
    a=s.nextDouble();
    }
    void printArea(){
        System.out.println("Area of Rectangle = "+(3.14*a*a));
    }
}

class AbstractMain{
    public static void main(String[] args) {
        System.out.println("NAME:SHREE SANKET   USN:1BM22CS261");
        Rectangle r = new Rectangle();
        Triangle t = new Triangle();
        Circle c = new Circle();
        r.getDetails();
        r.printArea();
        t.getDetails();
        t.printArea();
        c.getDetails();
        c.printArea();
    }
}
