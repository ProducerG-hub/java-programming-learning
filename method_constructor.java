// A constructor is used to initialize the class objects.
//  The constructor is called when an object of a class is created.
//  It can be used to set initial values for object attributes:
public class method_constructor {
    int x;

    public method_constructor(){
        x=150;
    }

    public static void main(String[] args){
        method_constructor myObj = new method_constructor();
        System.out.println(myObj.x);
    }
}
