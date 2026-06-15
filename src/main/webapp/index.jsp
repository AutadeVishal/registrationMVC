<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Student Registration</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<form action="register" method="POST">
    <Label>Full Name</Label>
    <input type="text" name="name" />
    <br/>
    <Label>Email</Label>
    <input type="email" name="email" />
    <br/>
    <Label>City</Label>
    <input type="text" name="city" />
    <button>Submit</button>
</form>
</body>
</html>