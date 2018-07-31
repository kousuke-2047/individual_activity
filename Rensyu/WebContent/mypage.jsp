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
<title>マイページ画面</title>
</head>
<body>

	<table>
		<tr>
			<td>番号</td>
			<td>商品名</td>
			<td>金額</td>
			<td>数</td>
			<td>お支払い方法</td>
			<td>日時</td>
		</tr>

		<s:iterator value = "mypageList">
		<tr>
			<td><s:property value = "id"/></td>
			<td><s:property value = "itemName"/></td>
			<td><s:property value = "totalPrice"/></td>
			<td><s:property value = "totalCount"/></td>
			<td><s:property value = "pay"/></td>
			<td><s:property value = "insertdate"/></td>
		</tr>
		</s:iterator>
	</table>

	<s:form action = "DeleteHAction">
		<table>
			<tr>
			<td>番号</td>
			<td>商品名</td>
			<td>金額</td>
			<td>数</td>
			<td>お支払い方法</td>
			<td>日時</td>
			</tr>

			<script type="text/javascript">
				 var a=0;
			</script>



			<s:iterator value = "mypageList">
			<tr>
				<td><input type="radio" name="deleteid" value="<s:property value='id'/>"/>

				<script type="text/javascript">
				 document.write(++a);
				</script>

				</td>

				<td><s:property value = "itemName"/></td>
				<td><s:property value = "totalPrice"/></td>
				<td><s:property value = "totalCount"/></td>
				<td><s:property value = "pay"/></td>
				<td><s:property value = "insertdate"/></td>

			</tr>
			</s:iterator>
		</table>

		<s:submit value ="削除"/>
	</s:form>

	<s:form action = "DeleteSAction">
		<table>
			<tr>
			<td>番号</td>
			<td>商品名</td>
			<td>金額</td>
			<td>数</td>
			<td>お支払い方法</td>
			<td>日時</td>
			</tr>

			<script type="text/javascript">
				 var a=0;
			</script>



			<s:iterator value = "mypageList">
			<tr>
				<td><input type="checkbox" name="deleteids" value="<s:property value='id'/>"/>
				<script type="text/javascript">
				 document.write(++a);
				</script>
				</td>

				<td><s:property value = "itemName"/></td>
				<td><s:property value = "totalPrice"/></td>
				<td><s:property value = "totalCount"/></td>
				<td><s:property value = "pay"/></td>
				<td><s:property value = "insertdate"/></td>

			</tr>
			</s:iterator>
		</table>

		<s:submit value ="削除"/>
	</s:form>

	<a href ='<s:url action = "LoginCompleteAction"/>'>買い物画面へ</a>



</body>
</html>