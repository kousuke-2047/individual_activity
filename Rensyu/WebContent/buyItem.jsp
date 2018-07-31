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
	<title>商品購入画面</title>
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
	height:1000px;
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


	<header>
	ヘッダー
	</header>

	<div class = "main">

	<s:form action = "BuyItemAction">
		NO.<br>
		<s:property value = "session.Id"/>
		<br>
		名前<br>
		<s:property value = "session.ItemName"/>
		<br>
		値段<br>
		<s:property value = "session.ItemPrice"/>
		<br>
		個数<br>

		<select name ="count">
			<option value ="1" selected="selected">1</option>
			<option value ="2">2</option>
			<option value ="3">3</option>
			<option value ="4">4</option>
			<option value ="5">5</option>
		</select>

		<br>
		支払い方法
		<input type="radio" name="pay" value="1" checked = "checked">現金
		<input type="radio" name="pay" value="2">クレカ

		<s:submit value="購入"/>

	</s:form>

	</div>


	<footer>
	フッター
	</footer>
</body>
</html>