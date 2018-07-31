<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix ="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta http-equiv="Content-Style-Type" content="text/css"/>
	<meta http-equiv="Content-Script-Type" content= "text/javascript" />
	<meta http-equiv="imagetoolbar" content= "no" />
	<meta name = "description" content="" />
	<meta name="keywords" content="" />
<title>ワード検索画面</title>
</head>
<body>

	<s:form action ="ItemshowAction">
		<table>
			<tr>
				<td>No</td>
				<td>商品名</td>
				<td>カテゴリ</td>
				<td>値段</td>
			</tr>
			<s:iterator value="itemList">
			<tr>
				<td><input type="radio" name="itemid" value="<s:property value='id'/>">
				<s:property value="id"/></td>
				<td><s:property value="itemName"/></td>
				<td><s:property value="category"/></td>
				<td><s:property value="itemPrice"/></td>
			</tr>
			</s:iterator>
		</table>
		<s:submit value="アイテム表示"/>
	</s:form>

	<s:form action ="WSearchAction">
		<s:iterator value="countList" status="pageNo">

			<s:if test="#pageNo.count==number">

			<s:property value="page"/>
			</s:if>
			<s:else>
			<input type ="radio" name="number" value="<s:property value='page'/>"/>
			<s:property value="page"/>
			</s:else>
		</s:iterator>
		<input type ="hidden" name="word" value="<s:property value='session.word'/>"/>
		<s:submit value="ページ切り替え"/>
	</s:form>



</body>
</html>