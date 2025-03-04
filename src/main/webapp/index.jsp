<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "s" uri = "/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login page</title>
</head>
<body>
	<form action="login" method="post">
        <input name="username"  ></input>
        <input name="password"  ></input>
        <button type="submit" value="Login"></button>
    </form>
</body>
</html>