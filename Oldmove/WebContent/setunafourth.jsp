<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="./css/setuna.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<title>刹那の見切りstage4</title>
</head>
<body>
	<script type="text/javascript" src="./js/setunafourth.js">
	</script>
	<div class="main">
		<div class="herobox">
			<img src="./images/hero.png" class="hero"/>
			<img src="./images/hero.png" class="herowin"/>
			<img src="./images/hero.png" class="herolose"/>
		</div>
		<div class="enemybox">
			<img src="./images/enemy.png" class="enemy"/>
			<img src="./images/enemy.png" class="enemywin"/>
			<img src="./images/enemy.png" class="enemylose"/>
		</div>
		<div class="suprisebox">！</div>
		<div class="closebox">×</div>
		<div class="winnermessage">勝者　かぁびぃ</div>
		<div class="drawmessage">仕切り直し</div>
		<div class="losemessage">勝者　わどるでぃ</div>
		<div class="timerbox">
			<div class="timer"></div>
		</div>

	</div>
	<s:form id="form">
	</s:form>

</body>
</html>