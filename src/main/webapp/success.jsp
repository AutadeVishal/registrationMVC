<%--
  Created by IntelliJ IDEA.
  User: autad
  Date: 15-06-2026
  Time: 18:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Success</title>
</head>
<body>

<%String name= (String)session.getAttribute("name");%>
<h1>  <%= name %> Successfully Registered as a studnet </h1>
</body>
</html>
