<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
  <%@ page import="java.io.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		File folder=new File("C:/Users/shiv/Desktop/Myfiles");
		File files[]=folder.listFiles();
		
		
		for(int i=0;i<files.length;i++)
		{
			%>
			<br/>
			<a href="Display?name=<%=files[i].getName() %>"><%=files[i].getName() %></a>
			<% 
		}
	
		
	%>
</body>
</html>