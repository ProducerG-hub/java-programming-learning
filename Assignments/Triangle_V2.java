package Assignments;

public class Triangle_V2 {
    public double base, height;

    Triangle_V2(double base,  double height){
        this.base = base;
        this.height = height;
    }

    public double areaTriangle(){
        double area;
        area = 0.5*base*height;
        return area;
    }

    public void displayTriangle(){
        System.out.println("Area of Triangle: " + areaTriangle());
    }
}
