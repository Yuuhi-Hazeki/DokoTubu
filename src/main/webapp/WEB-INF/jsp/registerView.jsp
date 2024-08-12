<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
//リクエストスコープに保存されたエラーメッセージを取得
String errorMsg = (String) request.getAttribute("errorMsg");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>どこつぶ</title>
</head>
<body>
<h1>新規登録</h1>
<form action="Register" method="post" >

ユーザー名：<input type="text" name="username"><br>
パスワード：<input type="text" name="password"><br>
<input type="submit" name="登録">
</form>
<% if(errorMsg != null) { %>
<p style="color:red"><%= errorMsg %></p>
<% } %>

<a href="index.jsp">TOPへ</a>
</body>
</html>