<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    String id = (String)request.getAttribute("id");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>どこつぶ</title>
</head>
<body>
<h1>どこつぶ　つぶやき編集</h1>

<form action="UpdateMutter" method="post">
<input type="text" name="text">
<input type="hidden" name="id" value="<%= id %>">
<input type="submit" value="編集">
</form>
</body>
</html>