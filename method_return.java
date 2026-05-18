// A method can also return a value. 
// The return type of the method must be specified, and the method must include a return statement that returns a value of the specified type:
public class method_return {
    static int myMethod(int x) {
        return 5 + x;
    }

// The main method calls myMethod and prints the result:
    public static void main(String[] args){
        System.out.println(myMethod(10));
    }
}
