// A void method does not return a value and is declared with the void keyword:
public class method_void {
    //static means that the method belongs to the method_void class and can be called without creating an object of the class.
    static void myMethod() {
        System.out.println("Hi, this is my first void method");
    }
    public static void main(String[] args) {
        myMethod();
    }
}
