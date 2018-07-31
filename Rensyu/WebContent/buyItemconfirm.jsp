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
<title>確認画面</title>
</head>
<body>

	名前<br>
	<s:property value ="session.ItemName"/>
	<br>
	合計金額<br>
	<s:property value ="session.total"/>
	<br>
	数<br>
	<s:property value ="session.count"/>
	<br>
	値段<br>
	<s:property value ="session.ItemPrice"/>
	<br>
	支払い方法<br>
	<s:property value ="session.pay"/>

	<a href ='<s:url action ="BuyItemCompleteAction"/>' >購入する</a>

</body>
</html>