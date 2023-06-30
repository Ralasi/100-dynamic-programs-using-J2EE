<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:set var="web" value="Tutorial and Example"/>
Length of String :: ${fn:length(web)} <br>
Substring of String :: ${fn:substring(web,0,8)} <br>
Is it contains word "Tutorial" :: ${fn:contains(web,'Tut')}<br>
In UpperCase :: ${fn:toUpperCase(web)}

</body>
</html>