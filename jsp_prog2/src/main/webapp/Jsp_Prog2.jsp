<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<%= "Welcome "+request.getParameter("uname") %>
<%!   
int add(int n1,int n2){  
return n1+n2;  
}  
%>  
<%= "Cube of 2 and 3 is:"+add(2,3) %>
</body>
</html>