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
<title>検索結果画面</title>
</head>
<body>

	<s:form action="ItemshowAction">
	<table>
		<tr>
			<td>No</td>
			<td>商品名</td>
			<td>カテゴリ</td>
			<td>値段</td>
		</tr>
		<s:iterator value="itemList">
		<tr>
			<td><input type="radio" name="itemid" value="<s:property value='id'/>"/>
			<s:property value="id"/></td>
			<td><s:property value="itemName"/></td>
			<td><s:property value="category"/></td>
			<td><s:property value="itemPrice"/></td>
		</tr>
		</s:iterator>
		<s:submit value="商品表示"/>
	</table>
	</s:form>


	<s:iterator value="countList" status="pageNo">
		<s:if test="number==#pageNo.count">
			<s:property value="page"/>:
		</s:if>
		<s:else>
			<a href = '<s:url action="CSearchAction">
				<s:param name="number" value="%{page}"/>
				<s:param name="category" value="#session.category"/>
			</s:url>'>
				<s:property value="page"/>
			</a>
			:
		</s:else>
	</s:iterator>

</body>
</html>