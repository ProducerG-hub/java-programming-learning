package JDBC;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        StudentRepository repository = new StudentRepository();
        String name;
        int marks;
        Scanner input = new Scanner(System.in);

        System.out.println("1.Register student");
        System.out.println("2.View registered students");
        System.out.println("3.Update student");
        System.out.println("4.Delete Student");
        System.out.println("5.Search student by ID");
        System.out.println("0.Exit");
        System.out.println("=====================");
        System.out.print("Choose Operation: ");
        int choice = input.nextInt();
        input.nextLine();

        if(choice == 1){
            System.out.print("Enter student name: ");
            name = input.nextLine();
            System.out.print("Enter student marks: ");
            marks = input.nextInt();

            Student student = new Student(name, marks);
            repository.saveStudent(student);
        } else if (choice == 2) {
            repository.getAllStudents();
        } else if (choice == 3) {
            System.out.println("Update student data");
            System.out.print("Enter student id: ");
            int id = input.nextInt();
            input.nextLine();
            System.out.print("Enter student name: ");
            name = input.nextLine();
            System.out.print("Enter marks: ");
            marks = input.nextInt();

            Student student1 = new Student(name,marks);
            repository.updateStudent(id,student1);

        } else if (choice == 4) {
            System.out.print("Enter student ID: ");
            int id = input.nextInt();
            input.nextLine();

            repository.deleteStudent(id);
        } else if (choice == 5) {
            System.out.print("Enter student ID: ");
            int ID = input.nextInt();
            input.nextLine();
            repository.searchStudentById(ID);
        } else if (choice == 0) {
            System.out.println("Thank you, welcome back");
        }
        else {
            System.out.println("Invalid choice");
        }

    }
}
