<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="./css/movesixth.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<title>ローぐらい区っぽい</title>
</head>
<body>

	<script type="text/javascript" src="./js/movesixth.js">
	</script>

	<div class="mothersquare">

		<div class="square">
			<img src="./images/hero.png" class="hero"/>
		</div>
		<div class="square"></div>
		<div class="square"></div>
		<div class="square"></div>
		<div class="square"></div>
		<div class="square"></div>
		<div class="square"></div>
		<div class="square"></div>
		<div class="square"></div>
		<div class="square"></div>
		<div class="square"></div>
		<div class="square"></div>
		<div class="square"></div>
		<div class="square"></div>
		<div class="square"></div>
		<div class="square"></div>
		<div class="square"></div>
		<div class="square"></div>
		<div class="square"></div>
		<div class="square"></div>
		<div class="square"></div>
		<div class="square"></div>
		<div class="square"></div>
		<div class="square"></div>
		<div class="square">
			<img src="./images/enemy.png" class="enemy"/>
		</div>
		<img src="./images/youwin.bmp" class="winnermessage"/>
		<div class="nextstagebox">
			<a href ='<s:url action="SecondStageAction"/>'>次のステージへ</a>
		</div>


		<div class="keytop"></div>
		<div class="keybottom"></div>
		<div class="keyleft"></div>
		<div class="keyright"></div>
		<div class="Abutton"></div>
		<img src="./images/GAMEOVER.png" class="gameoverbox"/>


	</div>
</body>
</html>