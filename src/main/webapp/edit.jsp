<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">EDIT DATA</h1>
</head>
<body>
<form action="update">
<table >
<tr>
<td>ID:-</td>
<td><input type="text" name="id" value="${data.id}"></td>
</tr>
<tr>
<td>Name:-</td>
<td><input type="text" name="name" value="${data.name}"></td>
</tr>
<tr>
<td>User Name:-</td>
<td><input type="text" name="uname" value="${data.uname}"></td>
</tr>
<tr>
<td>Password:-</td>
<td><input type="text" name="password" value="${data.password}"></td>
</tr>
<tr>
<td>Address:-</td>
<td><input type="text" name="addr" value="${data.addr}"></td>
</tr>
<tr>
<td>Mobile Number:-</td>
<td><input type="text" name="mobno" value="${data.mobno}"></td>
</tr>
<tr>
<td><input type="submit" value="UPDATE"></td>
</tr>
</table>
</form>
</body>
</html>