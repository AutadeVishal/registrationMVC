package org.vishalsoft.registrationmvc.dao;
import jakarta.servlet.http.HttpSession;
import org.vishalsoft.registrationmvc.model.Student;
import org.vishalsoft.registrationmvc.utils.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentDAO  {
    public int registerStudent(Student student){
        String name=student.getName();
        String email=student.getEmail();
        String city=student.getCity();
        if (name == null || name.trim().isEmpty()
                || email == null || email.trim().isEmpty()
                || city == null || city.trim().isEmpty()) {
            return 0;
        }
        Connection con;

        try{
            con = DatabaseConnection.getConnection();
            String query="INSERT INTO students (name,email,city) values(?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, student.getName());
            ps.setString(2, student.getEmail());
            ps.setString(3, student.getCity());
             return ps.executeUpdate();
        }
        catch (SQLException exception){
            exception.printStackTrace();
            return 0;
        }
    }
}
