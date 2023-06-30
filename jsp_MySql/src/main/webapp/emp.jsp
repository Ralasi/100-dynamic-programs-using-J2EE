<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Emp form using MySql</title>
</head>
<body>

<%
String eno = request.getParameter("t1");
String ename = request.getParameter("t2");
String esal = request.getParameter("t3");
String edesig = request.getParameter("t4");

Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/connectdb","root","Safi@2002");
PreparedStatement ps = con.prepareStatement("insert into account_det2 values(?,?,?,?)");

ps.setString(1, eno);
ps.setString(2, ename);
ps.setString(3, esal);
ps.setString(4, edesig);

int i=ps.executeUpdate();

if(i>0)
{
response.sendRedirect("index.html");
}
%>
</body>
</html>