package fileHandling;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Students_Report {
    public String name;
    public int marks;
    public char grade;

    public void createFile(){
        try{
            File file = new File("fileHandling\\students.txt");
            if (file.createNewFile()){
                System.out.println("File created successfully");
            } else if (file.isFile()) {
                System.out.println("File exists");
            } else {
                throw new IOException("Failed to create a file, try again");
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public void writeFile(){
        try{
            FileWriter writer = new FileWriter("fileHandling\\students.txt",true);
            Scanner input = new Scanner(System.in);

            System.out.print("Enter student name: ");
            name = input.nextLine();
            System.out.print("Enter student marks: ");
            marks = input.nextInt();

            if (marks>100){
                throw new IllegalArgumentException("Marks can not be greater than 100, please try again");
            }

            if (marks<0){
                throw new IllegalArgumentException("Marks can not be negative, please try again");
            }

            if (marks>=80){
                grade = 'A';
            } else if (marks>=60) {
                grade = 'B';
            } else if (marks>=40) {
                grade = 'C';
            }else {
                grade = 'F';
            }

            writer.write("Student Name: " +name + "\n");
            writer.write("Marks: " +marks +"\n");
            writer.write("Grade: " +grade + "\n");
            writer.write("=================================" + "\n");

            writer.close();

            System.out.println("Data Written successfully");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        catch (InputMismatchException e){
            System.out.println("Invalid input");
        }

        catch (IllegalArgumentException err){
            System.out.println(err.getMessage());
        }

    }

    public void readFile(){
        try{
            File file = new File("fileHandling\\students.txt");
            Scanner reader = new Scanner(file);

            while (reader.hasNextLine()){
                String data = reader.nextLine();
                System.out.println(data);
            }

            reader.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Students_Report data = new Students_Report();
        data.createFile();
        data.writeFile();
        data.readFile();
    }
}
