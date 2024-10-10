<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.hibernatejsp.BookDao"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style='background-color:grey;'>
 
<jsp:useBean id="obj" class="com.hibernatejsp.Book">  
</jsp:useBean>  
<jsp:setProperty property="*" name="obj"/>  

<a href="view.jsp">view book</a>  
<%  
int i=BookDao.register(obj);  
if(i>0)  {
out.print("<h1 style='green'>You are successfully registered</h1>");  
}
  
%>  


</body>
</html>