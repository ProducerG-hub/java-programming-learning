package Assignments;

public class Circle_V2 {
    public double radius;
    public final double PI = 3.14;

    Circle_V2(double radius){
        this.radius = radius;
    }

    public double circumferenceCircle(){
        double circumference;
        circumference = 2*PI*radius;
        return circumference;
    }

    public void displayCircle(){
        System.out.println("Circumference of Circle: " + circumferenceCircle());
    }
}
