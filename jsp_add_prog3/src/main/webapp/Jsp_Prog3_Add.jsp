<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="skyblue">

<%= "<h1> The sum is "+(Integer.parseInt(request.getParameter("n1"))+Integer.parseInt(request.getParameter("n2") ))+"</h1>"%>
</body>
</body>
</html>