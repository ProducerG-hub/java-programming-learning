package triangle;
public class Triangle {
    double height;
    double base;
    
    public Triangle(double height, double base){
        this.height = height;
        this.base = base;

    }

    public double calculateArea(double height, double base){
        double Area;
                Area = (height * base)/2;
        return Area;
    }

    public static void showArea(double Area){
        System.out.println("Area of triangle is: "+Area);
    }

    public static void main(String[] args){
        Triangle triangle = new Triangle(0.0, 0.0);
        double area = triangle.calculateArea(5.0, 10.0);
        showArea(area);

    }
}