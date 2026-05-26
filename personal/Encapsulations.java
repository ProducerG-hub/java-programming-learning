package personal;

// Encapsulation means hiding the sensitive data from the users
// It is done by using private modifier which means the attribute can not be accessed outside the class
class David{
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class Encapsulations {
    public static void main(String[] args) {
        David obj1 = new David();
        obj1.setAge(24);
        System.out.println("Age: " + obj1.getAge());

    }
}

/* an attribute age inside the class David is only accessed within the class since is private
* so once is directly assigned to the obj1 inside Encapsulation class will get an error
* so in order to allow the object in another class to access it we use get and set methods
* whereby get returns the value and set assign the value*/
