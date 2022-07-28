<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View Employee By Name</title>
</head>
<body>
    <h1>All employees by name</h1>
    <c:forEach items="${employeeListByName}" var="item">
        <c:out value="${item}"/> <br>
    </c:forEach>
</body>
</html>
