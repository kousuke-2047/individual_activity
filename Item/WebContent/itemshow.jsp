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
<title>アイテム注視画面</title>
</head>
<body>

	<table>
		<tr>
			<td>No</td>
			<td><s:property value="session.id"/></td>
		</tr>
		<tr>
			<td>商品名</td>
			<td><s:property value ="session.itemName"/></td>
		</tr>
		<tr>
			<td>値段</td>
			<td><s:property value ="session.itemPrice"/></td>
		</tr>
	</table>

</body>
</html>