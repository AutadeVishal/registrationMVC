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
import java.util.List;

@WebServlet("/StudentsListController")
public class StudentsListController  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse responce) throws ServletException, IOException {
        StudentDAO studentDAO=new StudentDAO();
        List<Student> studentList= studentDAO.getStudentList();
        HttpSession session=request.getSession(false);
        session.setAttribute("list",studentList);
        responce.sendRedirect("./studentsList.jsp");
    }



}
