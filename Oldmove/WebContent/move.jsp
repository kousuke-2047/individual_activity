<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="./css/movestyle.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<title>練習</title>
</head>
<body>
	<script type="text/javascript" src="./js/move.js">
	</script>
	<div class="retrisbox">

		<div class="box">
			<img src="./images/retrisfirstonly.png"/>
		</div>

		<div class="blackbox">
		</div>

	</div>
	<a href ='<s:url action="MoveSecondAction"/>'>aaaaaaaaaa</a>

</body>
</html>