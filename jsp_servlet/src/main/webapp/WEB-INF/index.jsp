<%@ page language="java" contentType="text/html;charset=Windows-31J" %>

<html>
<head>
	<title></title>
</head>
<body>

<%
	String mongon = "ＩＤとパスワードを入力してください。";
%>



<%= mongon %><br>
<br>

<form action="/jsp_servlet/Login" method="POST">
	ＩＤ: <input type="text" name="id">		パスワード: <input type="text" name="pass">
	<br><br>

	<input type="submit" value="submit">
</form>

</body>
</html>