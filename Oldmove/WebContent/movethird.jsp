<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="./css/movethird.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<title>十字キーっぽい何か</title>
</head>
<body>

	<script type="text/javascript" src="./js/movethird.js">
	</script>
	<header>
		<div class="headerbox">C</div>
		<div class="headerbox">B</div>
		<div class="headerbox">A</div>
	</header>
	<div class="lefter">
		<div class="lefterbox">D</div>
		<div class="key">←</div>
		<div class="lefterbox">E</div>
		<div class="lefterbox">F</div>
	</div>
	<div class="mainbox">

	aaaaaaaaaaaaaa<br>
	iiiiiiii<br>
	eeee<br>
	</div>

	<div class="keytop">↑</div>
	<div class="keybuttom">↓</div>
	<div class="keyleft">←</div>
	<div class="keyright">→</div>

	<s:form id="form" name="form">
	<s:submit class="Abutton" value="A" onclick="goAction();"/>
	</s:form>

</body>
</html>