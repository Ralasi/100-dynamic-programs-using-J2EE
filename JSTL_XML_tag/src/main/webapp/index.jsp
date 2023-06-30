<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>JSTL XML Tag Demo </h2> 
<c:set var="website"> 
<website> 
      <name>XML TAG and Example</name> 
      <tutorial>Java Server Pages</tutorial>
    </website> 
</c:set> 
<x:parse xml="${website}" var="output"/> 
<b>Website :: </b>
<x:out select="$output/website[1]/name" /><br> 
<b>Tutorial ::</b>
<x:out select="$output/website[1]/tutorial" />

</body>
</html>