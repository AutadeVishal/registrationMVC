<%@ page import="org.vishalsoft.registrationmvc.model.Student" %>
<%@ page import="org.vishalsoft.registrationmvc.dao.StudentDAO" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: autad
  Date: 15-06-2026
  Time: 19:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Students List</title>
</head>
<body>
<h1>Hello <%= session.getAttribute("name")%> </h1>
<table>
<%
    List<Student> studentList = (List<Student>) session.getAttribute("list");
    if (studentList != null) {
        for (Student student : studentList) {
%>
<tr>
    <td><%=student.getName()%></td>
    <td><%=student.getEmail()%></td>
    <td><%=student.getCity()%></td>
</tr>
<%
        }
    }
%>
</table>
</body>
</html>
