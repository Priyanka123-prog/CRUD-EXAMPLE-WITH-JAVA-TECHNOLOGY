<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.hibernatejsp.BookDao,com.hibernatejsp.Book,java.util.*" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<% List<Book> book=BookDao.getBooks(); %>
<table>
<tr>
<th>id</th>
<th>book name</th>
<th>book price</th>
</tr>
<tr>
<%for(Book b:book){ %>
<td><%=b.getBid() %></td>
<td><%=b.getBook_name() %></td>
<td><%=b.getBookprice() %></td>
<%} %>
</tr>
</table>
</body>
</html>