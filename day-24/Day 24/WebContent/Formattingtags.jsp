<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="String" value="25169.63" />
<fmt:parseNumber var="Inte" type="number" value="${String}"/>
<c:out value="${Inte}"/>
<c:set var="a" value="1236.052" />
<fmt:formatNumber type="number" groupingUsed="true" value="${a}" />
<c:set var="Date" value="20-06-2020"/>
<fmt:parseDate value="${Date}" var="parseDate" pattern="dd-MM-yyyy"/>
<p><c:out value="${parseDate}" /></p>  
<c:set var="date" value="<%=new java.util.Date()%>" />  
<p><b>Date and Time in Indian Standard Time(IST) Zone:</b>
 <fmt:formatDate value="${date}"  
             type="both" timeStyle="long" dateStyle="long" /></p>
<fmt:formatDate type="time" value="${date}" />  
</body>
</html>