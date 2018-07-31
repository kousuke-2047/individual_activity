<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="./css/movefifth.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<title>十字キーとランキングとＢボタン</title>
</head>
<body>


	<script type="text/javascript" src="./js/movefifth.js">
	</script>
	<header>
		<div class="headerbox">C</div>
		<div class="headerbox">B</div>
		<div class="headerbox">A</div>
	</header>
	<div class="lefter">
		<div class="lefterbox">ＲＰＧ</div>
		<div class="key">←</div>
		<div class="lefterbox">アクション</div>
		<div class="lefterbox">パズル</div>
	</div>

	<s:form id="form" name="form" action="MoveAAction">
	<div class="mainbox">

		<div class="rpgrankbox">
		<input type="radio" name="productId" value="1">
		RPG1位
		</div>
		<div class="rpgrankbox">
		<input type="radio" name="productId" value="2">
		2位
		</div>
		<div class="rpgrankbox">
		<input type="radio" name="productId" value="3">
		3位
		</div>

		<div class="actrankbox">
		<input type="radio" name="productId" value="4">
		アクション1位
		</div>
		<div class="actrankbox">
		<input type="radio" name="productId" value="5">
		2位
		</div>
		<div class="actrankbox">
		<input type="radio" name="productId" value="6">
		3位
		</div>

		<div class="puzrankbox">
		<input type="radio" name="productId" value="7">
		パズル1位
		</div>
		<div class="puzrankbox">
		<input type="radio" name="productId" value="8">
		2
		</div>
		<div class="puzrankbox">
		<input type="radio" name="productId" value="9">
		3位
		</div>


	</div>

	<div class="keytop">↑</div>
	<div class="keybuttom">↓</div>
	<div class="keyleft">←</div>
	<div class="keyright">→</div>

	<div class="Abutton">
	A
	</div>
	<div class="Bbutton">
	B
	</div>


		<s:submit class="afterAbutton" value="A"/>
	</s:form>



</body>
</html>