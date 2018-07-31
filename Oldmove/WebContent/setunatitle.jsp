<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="./css/setunatitle.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<title>刹那の見切りtitle</title>
</head>
<body>

	<script type="text/javascript" src="./js/setunatitile.js">
	</script>


	<div class="windowbox">
		<div class="gotoplay">
			<a href ='<s:url action="GosetunaAction"/>'>スタート</a>
		</div>
		<div class="howtoplay">あそびかた</div>
	</div>




<div class="howtoplaybox">
	「！マーク」がでたときに敵をクリックしろ。<br>
	敵より早く動けたら勝ちだぞ。
	<div class="backbox">
		OK
	</div>
</div>


</body>
</html>