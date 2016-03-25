<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加图书</title>
</head>
<body>
	<form action="addBook" method="post">
		<!-- 生成一个文本输入框 -->
		书名：<input type="text" name="book" size="30"/><br/>
		<!-- 生成一个提交按钮 -->
		<input type="submit" value="添加"/>
	</form>
</body>
</html>