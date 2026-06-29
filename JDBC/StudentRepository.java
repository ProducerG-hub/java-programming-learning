package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentRepository {
    public void saveStudent(Student student){
        String sqlQuery = "INSERT INTO students(name,marks) VALUES(?,?)";
        try(
                Connection conn = ConnectionDB.connect();
                PreparedStatement statement = conn.prepareStatement(sqlQuery)

        ){
            statement.setString(1, student.getName());
            statement.setInt(2,student.getMarks());
            int rows = statement.executeUpdate();

            if (rows>0){
                System.out.println("Student saved successfully............."+ "\n");
            }
            else {
                System.out.println("Failed to save student, Please try again");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void getAllStudents(){

        String sql = "SELECT * FROM students";
        try(
                Connection conn = ConnectionDB.connect();
                PreparedStatement statement = conn.prepareStatement(sql);
                ResultSet rs = statement.executeQuery()
                ){
            System.out.println("================== REGISTERED STUDENTS ====================");
            while (rs.next()){
              int ID =  rs.getInt("id");
              String name = rs.getString("name");
              int marks = rs.getInt("marks");
                System.out.println("Student_ID: " + ID);
                System.out.println("Student_Name: " + name);
                System.out.println("Student_Marks: " + marks);
                System.out.println("============================================================");
            }

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public void updateStudent(int id, Student student1){
        String sql = "UPDATE students SET name=?,marks=? WHERE id=?";
        try( Connection conn = ConnectionDB.connect();
        PreparedStatement statement = conn.prepareStatement(sql)){
            statement.setString(1, student1.getName());
            statement.setInt(2,student1.getMarks());
            statement.setInt(3, id);

            int rows = statement.executeUpdate();
            if(rows>0){
                System.out.println("student updated successfully........");
            }else {
                System.out.println("student not found");
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public void deleteStudent(int id){
        String sql = "DELETE FROM students WHERE id =?";
        try( Connection conn = ConnectionDB.connect();
        PreparedStatement statement = conn.prepareStatement(sql)){
            statement.setInt(1,id);

            int rows = statement.executeUpdate();

            if(rows>0){
                System.out.println("Student deleted successfully.......");
            }else {
                System.out.println("student not found");
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public void searchStudentById(int id){
        String sql = "SELECT * FROM students WHERE id=?";

        try(Connection conn = ConnectionDB.connect();
        PreparedStatement statement = conn.prepareStatement(sql))

        {
            statement.setInt(1,id);
            ResultSet rs = statement.executeQuery();
            if (rs.next()){
                int ID = rs.getInt("id");
                String name = rs.getString("name");
                int marks = rs.getInt("marks");

                System.out.println("Student ID: " + ID);
                System.out.println("Student Name: " + name);
                System.out.println("Student Marks: " + marks);
            }else {
                System.out.println("student not found");
            }

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

}
