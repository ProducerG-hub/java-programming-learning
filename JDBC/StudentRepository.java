package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
            statement.executeUpdate();

            System.out.println("Student saved successfully.............");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
