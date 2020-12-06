<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/sql"  prefix="sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<sql:setDataSource var="database" driver="com.mysql.cj.jdbc.Driver" url="jdbc:mysql://localhost/hcldb" user="root" password="root"/>
<sql:update dataSource="${database }" var="output" >
Insert into college values(?,?,?);
<sql:param value="${param.roll}"/>
<sql:param value="${param.student}"/>
<sql:param value="${param.address}"/>
</sql:update>
<c:if test="${output>=1 }">
added successfully
<c:redirect url="insert.html">
<c:param name="message" value="Added successfully"/>
</c:redirect>
</c:if>
</body>
</html>