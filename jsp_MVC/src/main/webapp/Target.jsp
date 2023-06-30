<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
<%@ page import="bean.Account" %>
<jsp:useBean id="ac" class="bean.Account" scope="request"/>
<center><h1>Account Details</h1></center>
<table border="2>
<tr>
<td>Account No.:</td>
<td>Account Name:</td>
<td>Account Balance:</td>
</tr>
<tr>
<td><jsp:getProperty property="t1" name="ac"></td>
<td><jsp:getProperty property="t2" name="ac"></td>
<td><jsp:getProperty property="t3" name="ac"></td>
</tr>
</table>
</body>
</html>