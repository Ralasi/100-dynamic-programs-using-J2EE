<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <c:if test="${param.Y == 0}">
        <jsp:forward page="divide.jsp" />
    </c:if>
     
    <h2 align="center">
        Result of ${param.X} / ${param.Y} is ${param.X / param.Y}
    </h2>
</body>
</html>