<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="./css/moveseventh.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<title>テスト用レイアウト</title>
</head>
<body>

<!-- まだ決まってないこと
		内部の画像、ランキングの文字
		最後の画面の黄色ボックスの内部
		最後の画面の情報量 -->

	<script type="text/javascript" src="./js/moveseventh.js">
	</script>

	<header></header>

	<div class="whiteheader"></div>

	<div class="main">
		<div class="startminibox">
			<div class="startminiinner">スタート</div>
		</div>
	</div>


	<div class="mainsecond">
		<div class="startbox">
			<div class="startinner">スタート</div>
		</div>
		<s:form id="rankform" name="form" action="ProductDetailsAction">
			<div class="battlebox">
				<div class="rpgrankbox">
					<s:iterator value="RPGrankList" status ="No">
						<s:if test="#No.count==1">
							<div class="rankfirstbox">
								<a href ='<s:url action="ProductDetailsAction">
									<s:param name="productId" value="%{productId}"/></s:url>'>
									<img src='<s:property value="imageFilePath"/>/<s:property value="imageFileName"/>' class="firstranking"/>
								</a>
							</div>
						</s:if>
						<s:elseif test="#No.count==2">
							<div class="ranksecondbox">
								<a href ='<s:url action="ProductDetailsAction">
									<s:param name="productId" value="%{productId}"/></s:url>'>
									<img src='<s:property value="imageFilePath"/>/<s:property value="imageFileName"/>' class="secondranking"/>
								</a>
							</div>
						</s:elseif>
						<s:elseif test="#No.count==3">
							<div class="rankthirdbox">
								<a href ='<s:url action="ProductDetailsAction">
									<s:param name="productId" value="%{productId}"/></s:url>'>
									<img src='<s:property value="imageFilePath"/>/<s:property value="imageFileName"/>' class="thirdranking"/>
								</a>
							</div>
						</s:elseif>
						<input type="radio" name="productId" value='<s:property value="%{productId}"/>' class="radionone">
					</s:iterator>

				<div class="rankfirstbox">RPG１</div>
				<div class="ranksecondbox">RPG２</div>
				<div class="rankthirdbox">RPG３</div>

			</div>

			<div class="actrankbox">
				<s:iterator value="actrankList" status ="No">

					<s:if test="#No.count==1">
						<div class="rankfirstbox">
							<a href ='<s:url action="ProductDetailsAction">
								<s:param name="productId" value="%{productId}"/></s:url>'>
								<img src='<s:property value="imageFilePath"/>/<s:property value="imageFileName"/>' class="firstranking"/>
							</a>
						</div>
					</s:if>
					<s:elseif test="#No.count==2">
						<div class="ranksecondbox">
							<a href ='<s:url action="ProductDetailsAction">
								<s:param name="productId" value="%{productId}"/></s:url>'>
								<img src='<s:property value="imageFilePath"/>/<s:property value="imageFileName"/>' class="secondranking"/>
							</a>
						</div>
					</s:elseif>
					<s:elseif test="#No.count==3">
						<div class="rankthirdbox">
							<a href ='<s:url action="ProductDetailsAction">
								<s:param name="productId" value="%{productId}"/></s:url>'>
								<img src='<s:property value="imageFilePath"/>/<s:property value="imageFileName"/>' class="thirdranking"/>
							</a>
						</div>
					</s:elseif>
					<input type="radio" name="productId" value='<s:property value="%{productId}"/>' class="radionone">

				</s:iterator>
				<div class="rankfirstbox">ACT１</div>
				<div class="ranksecondbox">ACT２</div>
				<div class="rankthirdbox">ACT３</div>
			</div>

			<div class="puzrankbox">
				<s:iterator value="RPGrankList" status ="No">

					<s:if test="#No.count==1">
						<div class="rankfirstbox">
							<a href ='<s:url action="ProductDetailsAction">
								<s:param name="productId" value="%{productId}"/></s:url>'>
								<img src='<s:property value="imageFilePath"/>/<s:property value="imageFileName"/>' class="firstranking"/>
							</a>
						</div>
					</s:if>
					<s:elseif test="#No.count==2">
						<div class="ranksecond">
							<a href ='<s:url action="ProductDetailsAction">
								<s:param name="productId" value="%{productId}"/></s:url>'>
								<img src='<s:property value="imageFilePath"/>/<s:property value="imageFileName"/>' class="secondranking"/>
							</a>
						</div>
					</s:elseif>
					<s:elseif test="#No.count==3">
						<div class="rankthird">
							<a href ='<s:url action="ProductDetailsAction">
								<s:param name="productId" value="%{productId}"/></s:url>'>
								<img src='<s:property value="imageFilePath"/>/<s:property value="imageFileName"/>' class="thirdranking"/>
							</a>
						</div>
					</s:elseif>
					<input type="radio" name="productId" value='<s:property value="%{productId}"/>' class="radionone">
				</s:iterator>

				<div class="rankfirstbox">PUZ1</div>
				<div class="ranksecondbox">PUZ2</div>
				<div class="rankthirdbox">PUZ3</div>
			</div>

			<div class="firstselectbox">
				<div class="keyline">
					<div class="key">▼</div>
				</div>
				<div class="genrebox">ＲＰＧ</div>
				<div class="genrebox">アクション</div>
				<div class="genrebox">パズル</div>

			</div>



			<div class="secondselectbox">
				<div class="keyline"></div>
				<div class="rpgnamebox">
					<s:iterator value="RPGrankList" status="No">
						<div class="namebox">
							<s:property value="#No.count"/>位　
							<s:property value="productName"/>
						</div>
					</s:iterator>
					<div class="namebox">RPG１</div>
					<div class="namebox">RPG２</div>
					<div class="namebox">RPG3</div>
				</div>
			<div class="actnamebox">
				<s:iterator value="RPGrankList">
					<div class="namebox">
						<s:property value="#No.count"/>位　
						<s:property value="productName"/>
					</div>
				</s:iterator>
			<div class="namebox">ACT１</div>
			<div class="namebox">ACT2</div>
			<div class="namebox">ACT3</div>
			</div>
			<div class="puznamebox">
				<s:iterator value="RPGrankList">
					<div class="namebox">
						<s:property value="#No.count"/>位　
						<s:property value="productName"/>
					</div>
				</s:iterator>
				<div class="namebox">Puz１</div>
				<div class="namebox">PUZ２</div>
				<div class="namebox">PUZ3</div>
			</div>
		</div>
	</div>

	<div class="keytop">↑</div>
	<div class="keyleft">←</div>
	<div class="keyright">→</div>
	<div class="keybottom">↓</div>
	<div class="Abutton">A</div>
	<s:submit class="afterAbutton" value="A"/>
	<div class="Bbutton">B</div>

	</s:form>
	</div>



	<footer></footer>
</body>
</html>