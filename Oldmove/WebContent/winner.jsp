<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="./css/battlestyle.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<title>戦闘終了画面</title>
</head>
<body>

	<script type="text/javascript" src="./js/battle.js">
	</script>

	<table>
		<tr  class="namebox">
			<td class="smalltd"></td>
				<s:iterator value="displayList">
					<td><s:property value="name"/></td>
				</s:iterator>
		</tr>

		<tr class="hpbox">
			<td class="smalltd">ＨＰ</td>
			<s:iterator value="displayList">
				<td><s:property value="hp"/></td>
			</s:iterator>
		</tr>
		<tr class="mpbox">
			<td class="smalltd">ＭＰ</td>
			<s:iterator value="displayList">
				<td><s:property value="mp"/></td>
			</s:iterator>
		</tr>
	</table>

	<div class="enemybox">
		<div class="enemykaribox">
			<s:if test="#session.winnerid%3==1">
				<img src ='<s:property value="#session.filepath"/>/<s:property value="#session.firstfilename"/>'/>
			</s:if>
			<s:else>
			</s:else>
		</div>

		<div class="enemykaribox">
			<s:if test="#session.winnerid%3==2">
				<img src ='<s:property value="#session.filepath"/>/<s:property value="#session.secondfilename"/>'/>
			</s:if>
			<s:else>
			</s:else>
		</div>

		<div class="enemykaribox">
			<s:if test="#session.winnerid%3==0">
				<img src ='<s:property value="#session.filepath"/>/<s:property value="#session.thirdfilename"/>'/>
			</s:if>
			<s:else>
			</s:else>
		</div>
	</div>

	<a href ='<s:url action="BattlefinishAction"/>'>
		<div class="textbox">
			<s:property value="session.winnername"/>がたたかいにしょうりした!

			<s:if test="#session.winFlg==true">
				<div class="textafterbox">
					<s:property value="betswinmoney"/>をかちとった!
				</div>
				<div class="coinwinnerbox">
					コイン：<s:property value="oldmoney"/>
				</div>
				<div class="coinwinnerafterbox">
					コイン：<s:property value="newmoney"/>
				</div>
			</s:if>
			<s:else>
				<div class ="textafterbox">
					<s:property value="session.monstername"/>はまけてしまった!
				</div>
				<div class="coinbox">
					コイン：<s:property value="newmoney"/>
				</div>
			</s:else>


		</div>
	</a>


</body>
</html>