<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Book Entry form</title>
</head>
<body>
	<h3>Enter book details</h3>

	<pre>
	 <form action="saveBook" method="get">
	 Book ID      <input type="text" name="id"><br>
	 Book Name    <input type="text" name="name"><br>
	 Book Subject <input type="text" name="subject"><br>
	 Book Price   <input type="text" name="price"><br>
	              <input type="submit" name="Submit">
	</form>
	
	
	
	<a href="show.jsp">Show books</a>
	</pre>
</body>
</html>