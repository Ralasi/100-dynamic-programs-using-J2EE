<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Format Tag example</h2>  
<c:set var="number" value="99.40" /> 
    <fmt:parseNumber var="n" integerOnly="true" type="number" value="${number}" /> 
    Parse Number is :: <c:out value="${n}" /> <br>    
<c:set var="date" value="08-06-2023" />  
<fmt:parseDate value="${date}" var="pd"  pattern="dd-MM-yyyy" /> 
Parse Date is :: <c:out value="${pd}" />
  <br>
  <c:set var="Date" value="<%=new java.util.Date()%>" /> 
Format Date is :: <fmt:formatDate type="time" value="${Date}"/>
</body>
</html>