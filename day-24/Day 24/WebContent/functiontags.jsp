<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="String" value="hello world"/>  
  
<c:if test="${fn:contains(String, 'hello')}">  
   <p>Found hello <p>  
</c:if>
<c:set var="String" value="How are you"/>  

<c:if test="${fn:containsIgnoreCase(String, 'how')}">  
   <p>Found how <p>  
</c:if>
<c:set var="String" value="master"/>  

<c:if test="${fn:endsWith(String, 'r')}">  
   <p>Found r @ ending <p>  
</c:if>
<c:if test="${fn:startsWith(String, 'm')}">  
   <p>Found m @ beginning <p>  
</c:if>
<c:set var="String1" value="<employee>name is abc </employee>"/>
<p>String1 : ${fn:escapeXml(String1)}</p>
<p>String1 : ${String1}</p>
<p>index: ${fn:indexOf(String1,"is") }</p>
<p>index: ${fn:trim(String1) }</p>
<p>capital: ${fn:toUpperCase(String1)}</p>
<p>lower: ${fn:toLowerCase(String1)}</p>
${fn:substring(String,1,4)}
${fn:substringAfter(String1,"is")}
${fn:substringBefore(String1,"is")}
${fn: length(String1)}

<c:set var="str1" value="Welcome-to-the-world."/>  
<c:set var="str2" value="${fn:split(str1, '-')}" />  
<c:set var="str3" value="${fn:join(str2, ' ')}" />
<p>String-3 : ${str3}</p>  

</body>
</html>