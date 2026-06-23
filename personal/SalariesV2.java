package personal;

import java.util.ArrayList;

public class SalariesV2 {
    ArrayList <Double> salary = new ArrayList<>();
    public double total = 0;
    public double highest;
    public double lowest;

    public void salaryInfo(){
        salary.add(100000.0);
        salary.add(400000.0);
        salary.add(150000.0);
        salary.add(500000.0);
        salary.add(1000000.0);

        highest = salary.getFirst();
        lowest = salary.getFirst();

        for(double sal : salary){
            total += sal;

            if (sal>highest){
                highest = sal;
            }

            if (sal<lowest){
                lowest = sal;
            }
        }
        double average = total/salary.size();

        System.out.println("Average salary: " + average);
        System.out.println("Lowest salary: " + lowest);
        System.out.println("Highest salary: " + highest);
    }

    public static void main(String[] args) {
        SalariesV2 sal1 = new SalariesV2();
        sal1.salaryInfo();
    }
}
