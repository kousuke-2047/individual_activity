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
<title>管理者ログイン</title>
</head>
<body>

	<s:form action ="CommanderLAction">

		<s:textfield name = "CommanderID"/>ID
		<s:textfield name = "CommanderP"/>password
		<s:submit value = "ログイン"/>

	</s:form>

</body>
</html>