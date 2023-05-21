<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Date JSP</title>
</head>
<body>
<% out.print("Today is:"+java.util.Calendar.getInstance().getTime()); %>

parameter name is: <%=request.getParameter("name") %>
</body>
</html>