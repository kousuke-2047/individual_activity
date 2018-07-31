


$(function(){
	$("body").click(function(){
		$(".firstbox").fadeIn(10);
		$("img.nextfirstbox").fadeIn(10);
		$(".firstbox").animate({"marginTop":"60px"},{'duration':250});
		$(".firstbox").animate({"marginTop":"120px"},{'duration':250});
		$(".firstbox").animate({"marginTop":"180px"},{'duration':250});
		$(".firstbox").animate({"marginTop":"240px","marginLeft":"-90px"},{'duration':250});
		$(".firstbox").animate({"marginTop":"300px"},{'duration':250});
		$(".firstbox").animate({"marginTop":"360px"},{'duration':250});
		$(".firstbox").animate({"marginTop":"421px"},{'duration':250});

		setTimeout(function(){
			$({deg:0}).animate({deg:90}, {
				duration:250,
//			 途中経過
			 progress:function() {
				$('.firstbox').css({
					transform:'rotate(' + this.deg + 'deg)'
				});
			},
			});
		},750);
		setTimeout(function(){
			$("img.nextfirstbox").fadeOut(0);
			$(".secondbox").fadeIn(10);
			$("img.nextsecondbox").fadeIn(10);
			$(".secondbox").animate({"marginTop":"60px"},{'duration':250});
			$(".secondbox").animate({"marginTop":"120px"},{'duration':250});
			$(".secondbox").animate({"marginTop":"180px","marginLeft":"-90px"},{'duration':250});
			$(".secondbox").animate({"marginTop":"240px","marginLeft":"-150px"},{'duration':250});
			$(".secondbox").animate({"marginTop":"300px"},{'duration':250});
			$(".secondbox").animate({"marginTop":"360px"},{'duration':250});
			$(".secondbox").animate({"marginTop":"421px"},{'duration':250});
		},2000);

		setTimeout(function(){
			$({deg:0}).animate({deg:90}, {
				duration:250,
//			 途中経過
			 progress:function() {
				$('.secondbox').css({
					transform:'rotate(' + this.deg + 'deg)'
				});
			},
			});
		},2200);

		setTimeout(function(){
			$(".thirdbox").fadeIn(10);
			$(".thirdbox").animate({"marginTop":"60px"},{'duration':250});
			$(".thirdbox").animate({"marginTop":"120px"},{'duration':250});
			$(".thirdbox").animate({"marginTop":"180px","marginLeft":"60px"},{'duration':250});
			$(".thirdbox").animate({"marginTop":"240px","marginLeft":"120px"},{'duration':250});
			$(".thirdbox").animate({"marginTop":"300px"},{'duration':250});
			$(".thirdbox").animate({"marginTop":"360px"},{'duration':250});
			$(".thirdbox").animate({"marginTop":"451px"},{'duration':375});
		},4000);
		setTimeout(function(){
			$({deg:0}).animate({deg:180}, {
				duration:500,
//			 途中経過
			 progress:function() {
				$('.thirdbox').css({
					transform:'rotate(' + this.deg + 'deg)'
				});
			},
			});
		},4500);

		setTimeout(function(){
			$("img.nextsecondbox").fadeOut(10);
			$(".fourthbox").fadeIn(10);
			$("img.nextthirdbox").fadeIn(10);
			$(".fourthbox").animate({"marginTop":"60px"},{'duration':250});
			$(".fourthbox").animate({"marginTop":"120px"},{'duration':250});
			$(".fourthbox").animate({"marginTop":"180px","marginLeft":"90px"},{'duration':375});
			$(".fourthbox").animate({"marginTop":"240px","marginLeft":"150px"},{'duration':250});
			$(".fourthbox").animate({"marginTop":"300px"},{'duration':250});
			$(".fourthbox").animate({"marginTop":"361px"},{'duration':250});
		},6000);
		setTimeout(function(){
			$({deg:0}).animate({deg:90}, {
				duration:250,
//			 途中経過
			 progress:function() {
				$('.fourthbox').css({
					transform:'rotate(' + this.deg + 'deg)'
				});
			},
			});
		},6500);

		setTimeout(function(){
			$("img.nextthirdbox").fadeOut(10);
			$(".fifthbox").fadeIn(10);
			$("img.nextfourthbox").fadeIn(10);
			$(".fifthbox").animate({"marginTop":"60px"},{'duration':250});
			$(".fifthbox").animate({"marginTop":"120px"},{'duration':250});
			$(".fifthbox").animate({"marginTop":"180px","marginLeft":"-60px"},{'duration':250});
			$(".fifthbox").animate({"marginTop":"240px","marginLeft":"-120px"},{'duration':250});
			$(".fifthbox").animate({"marginTop":"331px"},{'duration':375});
		},8250);

		setTimeout(function(){
			$("img.nextfourthbox").fadeOut(10);
			$(".sixthbox").fadeIn(10);
			$("img.nextfifthbox").fadeIn(10);
			$(".sixthbox").animate({"marginTop":"60px"},{'duration':250});
			$(".sixthbox").animate({"marginTop":"120px"},{'duration':250});
			$(".sixthbox").animate({"marginTop":"180px","marginLeft":"90px"},{'duration':375});
			$(".sixthbox").animate({"marginTop":"240px"},{'duration':250});
			$(".sixthbox").animate({"marginTop":"300px"},{'duration':250});
			$(".sixthbox").animate({"marginTop":"361px"},{'duration':250});
		},10000);
		setTimeout(function(){
			$({deg:0}).animate({deg:-90}, {
				duration:250,
//			 途中経過
			 progress:function() {
				$('.sixthbox').css({
					transform:'rotate(' + this.deg + 'deg)'
				});
			},
			});
		},10500);

		setTimeout(function(){
			$("img.nextfifthbox").fadeOut(10);
			$(".seventhbox").fadeIn(10);
			$(".seventhbox").animate({"marginTop":"60px"},{'duration':250});
			$(".seventhbox").animate({"marginTop":"120px"},{'duration':250});
			$(".seventhbox").animate({"marginTop":"180px"},{'duration':250});
			$(".seventhbox").animate({"marginTop":"240px"},{'duration':250});
			$(".seventhbox").animate({"marginTop":"300px"},{'duration':250});
			$(".seventhbox").animate({"marginTop":"360px"},{'duration':250});
			$(".seventhbox").animate({"marginTop":"420px"},{'duration':250});
		},12000);
		setTimeout(function(){
			$({deg:0}).animate({deg:90}, {
				duration:250,
//			 途中経過
			 progress:function() {
				$('.seventhbox').css({
					transform:'rotate(' + this.deg + 'deg)'
				});
			},
			});
		},12500);

		setTimeout(function(){
			$(".nextbox").fadeOut(200);
			$(".retrisbox").css({borderLeftColor:"#FFFFFF",borderTopColor:"#FFFFFF",borderBottomColor:"#FFFFFF",borderRightColor:"#FFFFFF"});
		},14000);

		setTimeout(function(){
			$(".retrisbox").animate({"width":"842px"},{'duration':500});
			$(".firstbox").animate({"width":"360px","height":"240px"},{'duration':500});
			$(".secondbox").animate({"width":"360px","height":"240px"},{'duration':500});
			$(".thirdbox").animate({"width":"360px","height":"240px"},{'duration':500});
			$(".fourthbox").animate({"width":"360px","height":"240px"},{'duration':500});
			$(".fifthbox").animate({"width":"360px","height":"240px"},{'duration':500});
			$(".sixthbox").animate({"width":"360px","height":"240px"},{'duration':500});
			$(".seventhbox").animate({"width":"480px","height":"120px"},{'duration':500});
			$("img.twoline").animate({"width":"240px","height":"120px"},{'duration':500});
			$("img.threeline").animate({"width":"360px","height":"120px"},{'duration':500});

			$("img.secondboxtwo").animate({"width":"240px","height":"120px"},{position:"absolute",top:"120px",left:"240px"},{'duration':500});
			$("img.secondboxtwo").animate({position:"absolute",top:"120px",left:"120px"},{'duration':500});
			$("img.firstboxtwo").animate({"width":"120px","height":"120px"},{position:"absolute",top:"120px",left:"120px"},{'duration':500});
			$("img.firstboxtwo").animate({position:"absolute",top:"120px",left:"240px"},{'duration':500});
			$("img.thirdboxtwo").animate({"width":"120px","height":"120px"},{position:"absolute",top:"120px",left:"120px"},{'duration':500});
			$("img.thirdboxtwo").animate({position:"absolute",top:"120px",left:"120px"},{'duration':500});
			$("img.fourthboxtwo").animate({"width":"120px","height":"120px"},{position:"absolute",top:"120px",left:"120px"},{'duration':500});
			$("img.fourthboxtwo").animate({position:"absolute",top:"120px",left:"120px"},{'duration':500});
			$("img.fifthboxtwo").animate({"width":"120px","height":"120px"},{position:"absolute",top:"120px"},{'duration':500});
			$("img.fifthboxtwo").animate({position:"absolute",top:"120px"},{'duration':500});
			$("img.sixthboxtwo").animate({"width":"120px","height":"120px"},{position:"absolute",top:"120px",left:"240px"},{'duration':500});
			$("img.sixthboxtwo").animate({position:"absolute",top:"120px",left:"240px"},{'duration':500});
			$("img.line").animate({"width":"480px","height":"120px"},{'duration':500});

			$(".firstbox").animate({position:"absolute",bottom:"0px",left:"60px"},{'duration':500});
			$(".secondbox").animate({position:"absolute",bottom:"0px",left:"0px"},{'duration':500});
			$(".thirdbox").animate({position:"absolute",bottom:"0px",left:"270px"},{'duration':500});
			$(".thirdbox").animate({"marginTop":"481px"},{'duration':375});
			$(".fourthbox").animate({position:"absolute",bottom:"0px",left:"300px"},{'duration':500});
			$(".fourthbox").animate({"marginTop":"301px"},{'duration':250});
			$(".fifthbox").animate({position:"absolute",left:"30px"},{'duration':500});
			$(".fifthbox").animate({"marginTop":"241px"},{'duration':505});
			$(".sixthbox").animate({position:"absolute",bottom:"0px",left:"240px"},{'duration':500});
			$(".sixthbox").animate({"marginTop":"301px"},{'duration':250});
			$(".seventhbox").animate({position:"absolute",bottom:"0px",left:"90px"},{'duration':500});



		},14500);
	});
});