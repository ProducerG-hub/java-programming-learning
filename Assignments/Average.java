package Assignments;

public class Average {
    public double[] marks = {95,76,50,59,63,44,70,80,68,99};

    public double calculateAverage(){
        double sum = 0;
        double average;
        for(double mark:marks){
            sum+=mark;
        }

        average = sum/marks.length;
        return average;
    }

    public void displayAverage(){
        System.out.println("Average Marks: "+calculateAverage());
    }

    public static void main(String[] args) {
        Average obj1 = new Average();
        obj1.displayAverage();
    }
}
