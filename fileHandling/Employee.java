package fileHandling;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class Employee {
    public String name, position;
    public double salary;

    public void createFile(){
        try{
            File file = new File("fileHandling\\employees.txt");
            if(file.createNewFile()){
                System.out.println("File created successfully");
            } else if (file.isFile()) {
                System.out.println("File exists");
            }
            else {
                throw new IOException("Failed to create a file, please try again later");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void writeFile(){
        try{
            Scanner input = new Scanner(System.in);
            BufferedWriter writer = new BufferedWriter(new FileWriter("fileHandling\\employees.txt", true));
            System.out.print("Enter employee name: ");
            name = input.nextLine();
            System.out.print("Enter employee position: ");
            position = input.nextLine();
            System.out.print("Enter employee salary: ");
            salary = input.nextDouble();

            if(salary <= 0){
                throw new IllegalArgumentException("Invalid value for a salary");
            }

            writer.write("Name: " + name);
            writer.newLine();

            writer.write("Position: " + position);
            writer.newLine();

            writer.write("Salary: " + salary);
            writer.newLine();

            writer.write("==========================================");
            writer.newLine();

            writer.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void readFile(){
        try{
            BufferedReader reader = new BufferedReader(new FileReader("fileHandling\\employees.txt"));

            String data;

            while ((data = reader.readLine()) !=null){
                System.out.println(data);
            }

            reader.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.createFile();
        emp.writeFile();
        emp.readFile();
    }
}
