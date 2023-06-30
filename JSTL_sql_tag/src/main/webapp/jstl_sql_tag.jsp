<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ page import="java.io.*,java.util.*,java.sql.*"%> 
<%@ page import="javax.servlet.*" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost/connectdb" user="root"  password="Safi@2002"/> 
<sql:query dataSource="${db}" var="rs">
SELECT * from department; 
</sql:query>   
<table border="2" width="100%"> 
<tr> 
<th>Dept_name</th> 
<th>Building</th> 
<th>Budget</th>   
</tr> 
<c:forEach var="table" items="${rs.rows}"> 
<tr> 
<td><c:out value="${table.Dept_name}"/></td> 
<td><c:out value="${table.Building}"/></td> 
<td><c:out value="${table.Budget}"/></td> 
</tr> 
</c:forEach> 
</table> 

</body>
</html>