package org.vishalsoft.registrationmvc.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.vishalsoft.registrationmvc.dao.StudentDAO;
import org.vishalsoft.registrationmvc.model.Student;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name="register" ,value = "/register")
public class Register extends HttpServlet {
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        try{
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String city = request.getParameter("city");
            Student student = new Student(name, email, city);
            StudentDAO studentDAO = new StudentDAO();
            int rowsAffected=studentDAO.registerStudent(student);
            if(rowsAffected==0){
                response.sendRedirect("./failure.jsp");
            }
            else{
                HttpSession session=request.getSession();
                session.setAttribute("name",name);
                response.sendRedirect("./success.jsp");
            }
        }
        catch(Exception exp){
            System.out.println("Error in Register");
        }
    }

}
