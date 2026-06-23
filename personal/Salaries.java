package personal;

import java.util.ArrayList;

public class Salaries {
    ArrayList <Double> salary = new ArrayList<>();

    public void viewSalary(){
        salary.add(100000.0);
        salary.add(700000.0);
        salary.add(300000.0);

        double sal1 = salary.get(0);
        double sal2 = salary.get(1);
        double sal3 = salary.get(2);

        if(sal1>sal2 && sal1>sal3){
            System.out.println(sal1 + " is the highest salary");
        } else if (sal2>sal1 && sal2>sal3) {
            System.out.println(sal2 + " is the highest salary");
        }
        else {
            System.out.println(sal3 + " is the highest salary");
        }
    }

    public static void main(String[] args) {
        Salaries details = new Salaries();
        details.viewSalary();
    }
}
