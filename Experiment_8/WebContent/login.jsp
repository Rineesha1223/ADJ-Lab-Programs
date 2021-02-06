<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "java.util.*" %>
<%@ page import = "java.sql.*" %>
<%@ page import = "java.lang.*" %>
<%@ page import = "java.io.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<%!String name;
String password;
String query;
Connection con = null;
Statement stmt = null;
ResultSet rs;
%>
<body>
<%
Class.forName("com.mysql.jdbc.Driver");
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdetails","root","");
stmt = con.createStatement();
name = request.getParameter("username");
password = request.getParameter("pass");
query = "select * from demo where username = '"+name+"'and password = '" +password+"'";
rs = stmt.executeQuery(query);
if(rs.next()){
	%>
	<h3>You have logged in successfully..!!</h3>
	<%
}
else{
	%>
	<h3>You are not an Authenticated user.</h3>
	<% 
}
%>

</body>
</html>