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
<title>検索画面</title>
</head>
<body>

	<s:form action ="CSearchAction">

		<select name="category">
			<option value="" selected ="selected">すべて</option>
			<option value="文具">文具</option>
			<option value="飲料">飲料</option>
			<option value="その他">その他</option>
		</select>

		<input type="hidden" name="number" value="1">
		<s:submit value="カテゴリ検索"/>
	</s:form>
	<br><br>
	<s:form action ="WSearchAction">
		<input type="text" name="word">
		<input type="hidden" name="number" value="1">
		<s:submit value="キーワード検索"/>
	</s:form>

	<s:form action ="XSearchAction">
		<select name="category">
			<option value="">すべて</option>
			<option value="文具">文具</option>
			<option value="飲料">飲料</option>
			<option value="その他">その他</option>
		</select>
		<input type ="text" name="word">
		<input type="hidden" name="number" value="1">
		<s:submit value="ダブル検索"/>
	</s:form>



</body>
</html>