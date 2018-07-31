<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="./css/battlestyle.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<title>攻撃画面</title>
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
			<s:if test="#session.defenseid % 3 == 1 && #session.destroyFlg==true">
				<div class="vanishbox">
					<img src ='<s:property value="#session.filepath"/>/<s:property value="#session.firstfilename"/>'/>
				</div>
			</s:if>
			<s:elseif test="#session.firstdestroy==true">
			</s:elseif>
			<s:elseif test="#session.damage==0">
				<img src ='<s:property value="#session.filepath"/>/<s:property value="#session.firstfilename"/>'/>
			</s:elseif>
			<s:elseif test="#session.defenseid % 3 == 1">
				<div class="flashbox">
					<img src ='<s:property value="#session.filepath"/>/<s:property value="#session.firstfilename"/>'/>
				</div>
			</s:elseif>
			<s:else>
				<div class="enemyminibox">
					<img src ='<s:property value="#session.filepath"/>/<s:property value="#session.firstfilename"/>'/>
				</div>
			</s:else>
		</div>

		<div class="enemykaribox">
			<s:if test="#session.defenseid % 3 == 2 && #session.destroyFlg==true">
				<div class="vanishbox">
					<img src ='<s:property value="#session.filepath"/>/<s:property value="#session.secondfilename"/>'/>
				</div>
			</s:if>
			<s:elseif test="#session.seconddestroy==true">
			</s:elseif>
			<s:elseif test="#session.damage==0">
				<img src ='<s:property value="#session.filepath"/>/<s:property value="#session.secondfilename"/>'/>
			</s:elseif>
			<s:elseif test="#session.defenseid % 3 == 2">
				<div class="flashbox">
					<img src ='<s:property value="#session.filepath"/>/<s:property value="#session.secondfilename"/>'/>
				</div>
			</s:elseif>
			<s:else>
				<div class="enemyminibox">
					<img src ='<s:property value="#session.filepath"/>/<s:property value="#session.secondfilename"/>'/>
				</div>
			</s:else>
		</div>

		<div class="enemykaribox">

			<s:if test="#session.defenseid % 3 == 0 && #session.destroyFlg==true">
				<div class="vanishbox">
					<img src ='<s:property value="#session.filepath"/>/<s:property value="#session.thirdfilename"/>'/>
				</div>
			</s:if>
			<s:elseif test="#session.thirddestroy==true">
			</s:elseif>
			<s:elseif test="#session.damage==0">
				<img src ='<s:property value="#session.filepath"/>/<s:property value="#session.thirdfilename"/>'/>
			</s:elseif>
			<s:elseif test="#session.defenseid % 3 == 0">
				<div class="flashbox">
					<img src ='<s:property value="#session.filepath"/>/<s:property value="#session.thirdfilename"/>'/>
				</div>
			</s:elseif>
			<s:else>
				<div class="enemyminibox">
					<img src ='<s:property value="#session.filepath"/>/<s:property value="#session.thirdfilename"/>'/>
				</div>
			</s:else>
		</div>
	</div>

	<div class="textbox">
		<s:if test="!#session.healmessage.isEmpty()">
			<s:property value="session.attackname"/>
			<s:property value="session.actionmessage"/><br>
			<a href ='<s:url action="BattleAction">
			<s:param name="attacknumber" value="attacknumber"/>
			</s:url>'>
				<div class="textafterbox">
					<s:property value="session.attackname"/>
					<s:property value="session.healmessage"/>
				</div>
			</a>
		</s:if>
		<s:else>
			<s:property value="session.attackname"/>
			<s:property value="session.actionmessage"/><br>
				<s:if test ="!#session.criticalmessage.isEmpty()">
					<div class="criticalbox">
						<s:property value="session.criticalmessage"/>
					</div>
				</s:if>
			<a href ='<s:url action="BattleAction">
			<s:param name="attacknumber" value="attacknumber"/>
			</s:url>'>
				<div class="textafterbox">
					<s:property value="session.defensename"/>に<s:property value ="session.damage"/>のダメージ
				</div>
				<s:if test="!#session.destroyname.isEmpty()">
					<div class="textdestroybox">
						<s:property value="session.destroyname"/>をたおした!
					</div>
				</s:if>
			</a>
		</s:else>
	</div>

</body>
</html>