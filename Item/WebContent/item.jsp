<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix ="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta http-equiv="Content-Style-Type" content="text/css"/>
	<meta http-equiv="Content-Script-Type" content= "text/javascript" />
	<meta http-equiv="imagetoolbar" content= "no" />
	<meta name = "description" content="" />
	<meta name="keywords" content="" />
<title>Item一覧画面</title>
<style type = "text/css">

header{
	background-color:lightgray;
	height:50px;
	width:100%;
	}


</style>
</head>
<body>

	<header>
		<a href ='<s:url action ="GosearchAction"/>'>検索機能</a>
	</header>

	<s:form action="ItemshowAction">
	<table>
		<tr>
			<td>NO</td>
			<td>商品名</td>
			<td>カテゴリ</td>
			<td>値段</td>
		</tr>

		<s:iterator value = "itemList">
		<tr>
			<td><input type ="radio" name="itemid" value="<s:property value='id'/>"/>
			<s:property value = "id"/></td>
			<td><s:property value ="itemName"/></td>
			<td><s:property value ="category"/></td>
			<td><s:property value ="itemPrice"/></td>
		</tr>
		</s:iterator>
		<s:submit value ="商品表示"/>
	</table>
	</s:form>



	<s:if test="number==1">
		最初へ:
	</s:if>
	<s:else>
		<a href ='<s:url action ="ItemAction">
		<s:param name="number" value="1"/>
		</s:url>'>
		最初へ</a>
		:
	</s:else>


	<s:if test="number!=1">
			<a href ='<s:url action= "ItemAction">
			<s:param name="number" value="number"/>
			<s:param name="forward" value="1"/>
			</s:url>'>
			前へ
			</a>
			:
	</s:if>
	<s:else>
		前へ:
	</s:else>

	<s:iterator value="countList" status="pageNo">
		<s:if test="number==#pageNo.count">
			<s:property value="page"/>:
		</s:if>
		<s:else>
			<a href ='<s:url action ="ItemAction">
				<s:param name="number" value="%{page}"/>
			</s:url>'>
				<s:property value ="page"/>
			</a>
			:
		</s:else>
	</s:iterator>

	<s:if test="#session.next==true">
		<a href ='<s:url action ="ItemAction">
		<s:param name="number" value="number"/>
		<s:param name="nextflg" value="1"/>
		</s:url>'>
		次へ
		</a>
		:
	</s:if>
	<s:else>
	次へ:
	</s:else>

	<s:if test="#session.next==true">
		<a href ='<s:url action="ItemAction" >
		<s:param name="nextflg" value="2"/>
		</s:url>'>
		最後へ
		</a>
	</s:if>
	<s:else>
		最後へ
	</s:else>

</body>
</html>