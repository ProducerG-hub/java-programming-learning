package personal;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_Catch {
    public char Grade;
    public int marks;
    public void Grading(){
        Scanner input = new Scanner(System.in);
        try{
            System.out.println("Enter Student Marks: ");
            marks = input.nextInt();
            if(marks>100){
                throw new IllegalArgumentException("Marks can not be greater than 100");
            }
            if (marks<0) {
                throw new IllegalArgumentException("Marks can not be negative");
            }
                if (marks>=80){
                    Grade = 'A';
                }
                else if (marks>=65) {
                    Grade = 'B';
                }
                else if (marks>=40) {
                    Grade = 'C';
                }
                else {
                    Grade = 'F';
                }

                System.out.println("Grade "+ Grade);

        } catch (ArithmeticException e) {
            System.out.println("Math error");
        }
        catch (InputMismatchException e){
            System.out.println("Enter a valid number");
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Program ends");
        }
    }


    public static void main(String[] args) {
        Try_Catch obj1 = new Try_Catch();
        obj1.Grading();
    }
}
