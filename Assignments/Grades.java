package Assignments;

public class Grades {
    public char grade;

    public char calculateGrade(double marks){
        if (marks>100 || marks<0){
            System.out.println("Invalid marks, enter marks in range 0 - 100");
        } else if (marks >= 90) {
            grade='A';
        } else if (marks >= 80) {
            grade='B';
        } else if (marks >= 60) {
            grade='C';
        } else if (marks >= 40) {
            grade='D';
        }
        else {
            grade='F';
        }
        return grade;
    }

    public void displayGrade(){
        System.out.println("Grade: "+ calculateGrade(90));
    }

    public static void main(String[] args) {
        Grades student = new Grades();
        student.displayGrade();
    }
}
