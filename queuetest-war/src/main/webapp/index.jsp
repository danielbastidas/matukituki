<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Enqueue</title>
</head>
<body>
	<p>Enqueue a value, to be processed by a worker. Each worker multiplies the value on the input by 10 </p>
    <form action="/enqueue" method="post">
    	 <ul>
  <%
      for (int i = 0; i < 10; ++i) {
  %>
        <li><input type="text" name="key<%= i+1 %>"></li>
  <%
      }
  %>
    </ul>
    <input type="submit">
    </form>
</body>
</html>