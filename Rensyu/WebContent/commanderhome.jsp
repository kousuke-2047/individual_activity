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
<title>管理者ホーム画面</title>
</head>
<body>

	管理者画面です
	<br><br>
	<a href ='<s:url action = "UserdeleteAction"/>'>ユーザー削除</a>
	<br>
	<a href ='<s:url action ="LogoutAction"/>'>ログアウト</a>

</body>
</html>