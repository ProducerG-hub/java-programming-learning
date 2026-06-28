package JDBC;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        StudentRepository repository = new StudentRepository();
        String name;
        int marks;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter student name: ");
        name = input.nextLine();
        System.out.print("Enter student marks: ");
        marks = input.nextInt();

        Student student = new Student(name, marks);
        repository.saveStudent(student);


    }
}
