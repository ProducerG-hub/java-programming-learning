public class Triangle {
    double Area;
    double height;
    double base;
    
    public Triangle(double height, double base){
        this.height = height;
        this.base = base;

    }

    public double calculateArea(double height, double base){
        Area = (height * base)/2;
        return Area;
    }

    public static void showArea(double Area){
        System.out.println("Area of triangle is: "+Area);
    }

    public static void main(String[] args){
        Triangle triangle = new Triangle(0.0, 0.0);
        double area = triangle.calculateArea(55.0, 10.0);
        showArea(area);

    }
}