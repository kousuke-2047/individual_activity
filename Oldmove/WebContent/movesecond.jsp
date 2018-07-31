<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="./css/movesecond.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<title>テトリスっぽいなにか</title>
</head>
<body>

	<script type="text/javascript" src="./js/movesecond.js">
	</script>

	<div class="retrisbox">

		<div class="firstbox">
			<img src="./images/retrissecondonlyone.png" class="threeline"/>
			<img src="./images/retrissecondonlytwo.png" class="firstboxtwo"/>
		</div>

		<div class="secondbox">
			<img src="./images/retrisseventhonly.png" class="twoline"/>
			<img src="./images/retrisseventhonly.png" class="secondboxtwo"/>
		</div>

		<div class="thirdbox">
			<img src="./images/retrissixthonlyone.png" class="threeline"/>
			<img src="./images/retrissixthonlytwo.png" class="thirdboxtwo"/>
		</div>

		<div class="fourthbox">
			<img src="./images/retrissixthonlyone.png" class="threeline"/>
			<img src="./images/retrissixthonlytwo.png" class="fourthboxtwo"/>
		</div>


		<div class="fifthbox">
			<img src="./images/retristhirdonlyone.png" class="threeline"/>
			<img src="./images/retristhirdonlytwo.png" class="fifthboxtwo"/>
		</div>

		<div class="sixthbox">
			<img src="./images/retrissecondonlyone.png" class="threeline"/>
			<img src="./images/retrissecondonlytwo.png" class="sixthboxtwo"/>
		</div>

		<div class="seventhbox">
			<img src="./images/retrisfirstonly.png" class="line"/>
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



</body>
</html>