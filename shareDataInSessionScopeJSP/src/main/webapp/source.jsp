<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="yellow">
<%
String user=request.getParameter("user");
session.setAttribute("user", user);
%>
<a href="target.jsp">Click here to get the username</a>

</body>
</html>