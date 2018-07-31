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
<title>ユーザー作成画面</title>

</head>
<body>

	<s:form action ="UserCreateFAction">

		<table>

			<tr>
				<td>ユーザーID</td>
				<td><s:textfield name ="createId"/></td>
			</tr>
			<tr>
				<td>パスワード</td>
				<td><s:textfield name ="createPass"/></td>
			</tr>
			<tr>
				<td>ユーザー名</td>
				<td><s:textfield name ="createName"/></td>
			</tr>
		</table>
		<s:submit value ="作成"/>

	</s:form>



</body>
</html>