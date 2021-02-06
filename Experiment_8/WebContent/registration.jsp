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
%>
<body>
<%Class.forName("com.mysql.jdbc.Driver");
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdetails","root","");
stmt = con.createStatement();
name = request.getParameter("username");
password = request.getParameter("pass");
query = "insert into demo values('"+name+"','"+password+"')";
stmt.executeUpdate(query);
out.println("Data is inserted.");
%>
</body>
</html>