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
<title>ユーザー作成確認</title>
</head>
<body>

	<s:form action = "UserCreateCAction">
		<table>
			<tr>
			<td>ユーザーID</td>
			<td>ユーザーPASSWORD</td>
			<td>ユーザーネーム</td>
			</tr>
			<tr>
			<td><s:property value ="session.createId"/></td>
			<td><s:property value ="session.createPass"/></td>
			<td><s:property value ="session.createName"/></td>
			</tr>
		</table>
		<s:submit value ="登録"/>
	</s:form>

	<a href ='<s:url action = "UserCreateAction"/>'>戻る</a>




</body>
</html>