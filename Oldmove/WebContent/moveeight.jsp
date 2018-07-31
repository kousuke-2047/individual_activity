<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="./css/movefourth.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<title>アニメーション画像変更</title>
</head>
<body>
	<script type="text/javascript" src="./js/movefourth.js">
	</script>

	<div class="startmessagebox">
		<img src="./images/presstart.jpg" class="startmessage"/>
	</div>

	<div class="retrisbox">

		<img src="./images/retrislogoonly.png" class="logo"/>

		<div class="firstbox">
			<img src="./images/ブロック/ブロック6.jpg"/>

		</div>

		<div class="secondbox">
			<img src="./images/ブロック/ブロック1.jpg"/>
		</div>

		<div class="thirdbox">
			<img src="./images/ブロック/ブロック3.jpg"/>
		</div>

		<div class="fourthbox">
			<img src="./images/ブロック/ブロック3.jpg"/>

		</div>


		<div class="fifthbox">
			<img src="./images/retristhirdonlyone.png" class="threeline"/>
		</div>

		<div class="sixthbox">
			<img src="./images/retrissecondonlyone.png" class="threeline"/>
		</div>

		<div class="seventhbox">
			<img src="./images/retrisfirstonly.png" class="line"/>
		</div>

		<div class="scorepoint">
			1000
		</div>




	</div>

	<div class="nextbox">
			<img src="./images/retrisseventh.png" class="nextfirstbox"/>
			<img src="./images/retrissixth.png" class="nextsecondbox"/>
		<!--  ワンテンポおく-->
			<img src="./images/retristhird.png" class="nextthirdbox"/>
			<img src="./images/retrissecond.png" class="nextfourthbox"/>
			<img src="./images/retrisfirst.png" class="nextfifthbox"/>
	</div>

	<div class="scorebox">
		0
	</div>


</body>
</html>