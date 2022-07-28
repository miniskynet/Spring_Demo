<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete Employee</title>
</head>
<body>
<h1>Enter the ID of the employee you want to delete</h1>
<form action="deleted" method="post">
    <label for="employeeid">Employee ID:</label>
    <input type="number" id="employeeid" name="employeeid"><br><br>
    <input type="submit" value="Delete">
</form>
</body>
</html>
