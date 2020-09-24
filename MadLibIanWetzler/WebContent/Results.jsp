<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Your MadLib</title>
</head>
<body>
<h1> Your MadLib: </h1>
<h1></h1>
<p>${userMadLib.farmMadLib()}<br />
<a href="index.jsp">Select another MadLib </a>
</body>
</html>