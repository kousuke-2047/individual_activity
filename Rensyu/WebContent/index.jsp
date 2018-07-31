<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix ="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta http-equiv="Content-Style-Type" content="text/css"/>
	<meta http-equiv="Content-Script-Type" content= "text/javascript" />
	<meta http-equiv="imagetoolbar" content= "no" />
	<meta name = "description" content="" />
	<meta name="keywords" content="" />
<title>ホーム画面</title>
<style type = "text/css">



header{
	width:100%;
	height:30px;
	background-color:gray;
	text-align:center;
	color:black;
}

.main{
	width:100%;
	height:100px;
	background-color:lightblue;
	color:black;
	}



footer{
	width:100%;
	height:30px;
	background-color:black;
	color:white;
	text-align:center;}


</style>
</head>
<body>

<a href ='<s:url action = "HomeAction"/>' style ="text-decoration:none;">
	<header>
	ホーム画面
	</header>

	<br>

	<div class = "main">
	ここはメイン（ログイン画面へ）
	</div>

	<br>

</a>
<a href ='<s:url action ="CommanderAction"/>' >
	<footer>
	ここはフッター
	</footer>
</a>

</body>
</html>