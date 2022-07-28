<%--<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Employee</title>
</head>
<body>
<h1>Enter the details of the new employee</h1>
<form action="submission" method="post">
    <label for="fname">First name:</label>
    <input type="text" id="fname" name="fname"><br><br>
    <label for="lname">Last name:</label>
    <input type="text" id="lname" name="lname"><br><br>
    <label for="empdate">Employment Date:</label>
    <input type="text" id="empdate" name="empdate"><br><br>
    <label for="departmentid">Department ID:</label>
    <input type="text" id="departmentid" name="departmentid"><br><br>
    <label for="nicnumber">NIC number:</label>
    <input type="text" id="nicnumber" name="nicnumber"><br><br>
    <input type="submit" value="Submit">
</form>
</body>
</html>
