<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%
String user=request.getParameter("user");
Cookie c=new Cookie("user", user);
c.setMaxAge(1500);
response.addCookie(c);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="target.jsp">Click Here To Get The User Name</a>
</body>
</html>