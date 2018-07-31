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
<title>Item一覧画面　Xさーち</title>
</head>
<body>
		<table>
			<tr>
				<td>No</td>
				<td>商品名</td>
				<td>カテゴリ</td>
				<td>値段</td>
			</tr>
			<s:iterator value="itemList">
			<tr>
				<td><a href ='<s:url action="ItemshowAction">
					<s:param name="itemid" value="id"/>
					</s:url>'>
					<s:property value="id"/>
					</a>
				</td>
				<td><s:property value="itemName"/></td>
				<td><s:property value="category"/></td>
				<td><s:property value="itemPrice"/></td>
			</tr>
			</s:iterator>
		</table>

		<s:iterator value="countList" status="pageNo">
			<s:if test="number==#pageNo.count">
				<s:property value="page"/>:
			</s:if>
			<s:else>
				<a href ='<s:url action="XSearchAction">
					<s:param name="number" value="%{page}"/>
					<s:param name="category" value="#session.category"/>
					<s:param name="word" value="#session.word"/>
				</s:url>'>
					<s:property value="page"/>
				</a>
				:
			</s:else>
		</s:iterator>
</body>
</html>