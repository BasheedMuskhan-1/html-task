<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<sql:setDataSource var="database" driver="com.mysql.cj.jdbc.Driver" url="jdbc:mysql://localhost:3306/hcldb" 
user="root" password="root"></sql:setDataSource>
<sql:query dataSource="${database}" var="rs">select * from college;</sql:query>
<c:forEach items="${rs.rows}" var="r">
<c:out value="${r.roll}"/> | 
<c:out value="${r.name}"/> | 
<c:out value="${r.address}"/> |<br>
</c:forEach>
</body>
</html>