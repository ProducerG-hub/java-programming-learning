package personal;

class Employee{
    public String name;
    public double salary;

    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public double calculateBonus(){
        return salary;
    }

    public void displayInfo(){
        System.out.println("Name: ");
        System.out.println("Salary: ");
    }
}

class Manager extends Employee{

    public Manager(){
        super("David Francis",3000000);
    }

    @Override
    public double calculateBonus() {
        return salary * 0.3;
    }

    @Override
    public void displayInfo(){
        System.out.println("=========== EMPLOYEE SALARY SYSTEM ============");
        double bonus = calculateBonus();
        String role = "Manager";
        System.out.println("Name: "+ name);
        System.out.println("Title: "+role);
        System.out.println("Salary: "+salary);
        System.out.println("Bonus: "+bonus);
        double total = salary + bonus;
        System.out.println("Total: "+total);
        System.out.println("==================================================");
    }
}

class Developer extends Employee{
    public Developer(){
        super("Stephen Haile",2000000);
    }

    @Override
    public double calculateBonus() {
        return salary * 0.2;
    }

    @Override
    public void displayInfo() {
        double bonus = calculateBonus();
        String role = "Developer";
        System.out.println("Name: "+ name);
        System.out.println("Title: "+role);
        System.out.println("Salary: "+salary);
        System.out.println("Bonus: "+bonus);
        double total = salary + bonus;
        System.out.println("Total: "+total);
        System.out.println("==================================================");
    }
}

class Designer extends Employee{
    public Designer(){
        super("Producer G",1000000);
    }

    @Override
    public double calculateBonus() {
        return salary * 0.1;
    }

    @Override
    public void displayInfo() {
        double bonus = calculateBonus();
        String role = "Designer";
        System.out.println("Name: "+ name);
        System.out.println("Title: "+role);
        System.out.println("Salary: "+salary);
        System.out.println("Bonus: "+bonus);
        double total = salary + bonus;
        System.out.println("Total: "+total);
        System.out.println("==================================================");
    }
}
public class Employees {
    public static void main(String[] args) {
        Employee e1 = new Manager();
        Employee e2 = new Developer();
        Employee e3 = new Designer();
        e1.displayInfo();
        e2.displayInfo();
        e3.displayInfo();
    }
}
