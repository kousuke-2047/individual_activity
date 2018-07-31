<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="./css/style.css">

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<title>cssの遊び件練習</title>
</head>
<body>

	<script type="text/javascript" src="./js/script.js">
	</script>

	<div class ="nameleft">
	</div>

	<div class="namecenter">
	</div>

	<div class="nameright">
	</div>

	<div class="dateleft">
	</div>

	<div class="datecenter">
	</div>

	<div class="dateright">
	</div>


	<div class="enemybox">

		<div class="messagebox">
			移動しますか？
			<br><br>

			<a href ='<s:url action="SelectmonsterAction"/>'>
				<div class="selectbutton">
				はい
				</div>
			</a>
				<div class="selectbutton">
				いいえ
				</div>
		</div>

		<div class="setuna_messagebox">
			<br><br>
			<a href ='<s:url action="SetunaAction"/>'>
				<div class="selectbutton">
					はい
				</div>
			</a>
			<div class="selectbutton">
				いいえ
			</div>
		</div>

	</div>
	<div class="textbox">

		<a href = '<s:url action="FightAction"/>'>
		FIGHT
		</a>

		<div class="button">
		練習
		</div>
		<div class="setunabutton">
			刹那の見切り
		</div>


	</div>


</body>
</html>