package Assignments;

// accessing the classes Cylinder_V2, Triangle_V2 and Circle_V2 in the Main class
public class Main_V2 {
    public static void main(String[] args) {
        Cylinder_V2 cylinder = new Cylinder_V2(1,2);
        Circle_V2 circle = new Circle_V2(2);
        Triangle_V2 triangle = new Triangle_V2(5,10);

        // Displaying the results from the classes
        cylinder.displayCylinder();
        circle.displayCircle();
        triangle.displayTriangle();
    }
}
