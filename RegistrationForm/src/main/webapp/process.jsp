<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="bean.RegisterDao"%>
    <jsp:useBean id="obj" class="bean.User"/>
<jsp:setProperty property="*" name="obj"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%

int status=RegisterDao.register(obj);
if(status>0)
out.print("You are successfully registered");

%>

</body>
</html>