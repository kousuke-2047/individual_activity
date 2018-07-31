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
<title>ユーザー削除完了かつ画面</title>
</head>
<body>

	<s:if test ="session.userdelete == true">
	ユーザーを削除しました
	</s:if>
	<s:else>
	ユーザーを削除できませんでした
	</s:else>

	<s:form action ="UserdeleteCAction">

	<table>
		<tr>
			<td>番号</td>
			<td>ユーザーID</td>
			<td>ユーザーPASS</td>
			<td>ユーザー名</td>
		</tr>

		<script type="text/javascript">
			var b=0;
		</script>

		<s:iterator value = "userList">
		<tr>
			<td><input type ="checkbox" name = "deleteusers" value ="<s:property value ='id'/>"/>

			<script type="text/javascript">
			document.write(++b);
			</script>

			</td>
			<td><s:property value = "userId"/></td>
			<td><s:property value = "userName"/></td>
			<td><s:property value = "userPassword"/></td>
		</tr>
		</s:iterator>
	</table>

	<s:submit value = "削除"/>

	</s:form>

	<a href ='<s:url action ="CommanderLAction"/>'>戻る</a>

</body>
</html>