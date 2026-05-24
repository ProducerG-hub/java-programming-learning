package personal;
import java.util.Scanner;

public class Recursion {
    //Creating the program that will be adding the series of numbers recursively

    public static int sumSeries(int num){
        if (num>0){
            return num + sumSeries(num - 1);
        }
        else {
            return 0;
        }
    }

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter a number of series: ");
       int num = input.nextInt();
       int result = sumSeries(num);
       System.out.println("Sum: "+result);
    }
}
