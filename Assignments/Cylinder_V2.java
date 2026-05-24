package Assignments;

// A class that will be used to calculate the area of the cylinder
public class Cylinder_V2 {
    public double radius,height;
    public final double PI = 3.14;

    Cylinder_V2(double radius, double height){
        this.height = height;
        this.radius = radius;
    }

    public double areaCylinder(){
        double area;
        area = 2*PI*radius*(radius + height);
        return area;
    }

    public void displayCylinder(){
        System.out.println("Area of Cylinder: " + areaCylinder() );
    }
}
