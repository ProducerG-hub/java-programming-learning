package student;
import java.util.Scanner;

public class Student_v1 {
    String name;
    int marks;
    String grade;

    public Student_v1(String name, int marks){
        this.name = name;
        this.marks = marks;
    }

    public String calculateGrade(){
        if(marks < 0 || marks > 100){
            return "Invalid marks";
        }
        if(marks >= 80){
            return "A";
        } else if(marks >= 60){
            return "B";
        } else if(marks >= 40){
            return "C";
        } 
        else {
            return "F";
        }
    }

    public void status(){
        if("F".equals(calculateGrade())){
            System.out.println("Status: FAIL");
        } else {
            System.out.println("Status: PASS");
        }
    }

    public void displayInfo(){
        System.out.println("Student Name: "+name);
        System.out.println("Marks: "+marks);
        System.out.println("Grade: "+calculateGrade());
        status();
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student marks: ");
        int marks = scanner.nextInt();
        scanner.close();
        System.out.println("-----------------------------");
        Student_v1 student1 = new Student_v1(name, marks);
        student1.displayInfo();
    }
}
