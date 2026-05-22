package Assignments;

class Cylinder{
    public double radius;
    public double height;
    public final double PI = 3.14;

    Cylinder(double radius, double height){
        this.radius = radius;
        this.height = height;
    }

    public double areaCylinder(){
        double area;
        area = 2*PI*radius*(radius + height);
        return area;

    }

    public void displayCylinder(){
        System.out.println("Area of Cylinder:" + areaCylinder());
    }
}

class Circle{
    public double radius;
    public final double PI = 3.14;

    Circle(double radius){
        this.radius = radius;
    }

    public double circumferenceCircle(){
        double circumference;
        circumference = 2*PI*radius;
        return circumference;
    }

    public void displayCircle(){
        System.out.println("Circumference of Circle: "+circumferenceCircle());
    }
}

class Triangle{
    public double height;
    public double base;

    Triangle(double height, double base){
        this.base = base;
        this.height = height;
    }

    public double areaTriangle(){
        double area;
        area = 0.5*height*base;
        return area;
    }

    public void displayTriangle(){
        System.out.println("Area of Triangle: " + areaTriangle());
    }
}

public class Main {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(2,3);
        Circle circle = new Circle(2);
        Triangle triangle = new Triangle(5,10);

        cylinder.displayCylinder();
        circle.displayCircle();
        triangle.displayTriangle();
    }
}
