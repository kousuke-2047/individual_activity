
showms = setInterval(show,1100);

function show(){
	$("img.startmessage").fadeOut(0);
	$("img.startmessage").animate({"top":"+=0px"},{'duration':100});
	$("img.startmessage").fadeIn(0);
	$("img.startmessage").animate({"top":"+=0px"},{'duration':1000});
}


$(function(){

	$("body").click(function(){
		clearInterval(showms);
		$(".startmessagebox").fadeOut(0);
		$(".firstbox").fadeIn(10);
		$("img.nextfirstbox").fadeIn(10);
		$(".firstbox").animate({"top":"+=60px"},{'duration':250});
		$(".firstbox").animate({"top":"+=60px"},{'duration':250});
		$(".firstbox").animate({"top":"+=60px"},{'duration':250});
		$(".firstbox").animate({"top":"+=60px","left":"-=90px"},{'duration':250});
		$(".firstbox").animate({"top":"+=60px"},{'duration':250});
		$(".firstbox").animate({"top":"+=60px"},{'duration':250});
		$(".firstbox").animate({"top":"+=60px"},{'duration':250});

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
			$(".secondbox").animate({"top":"+=60px"},{'duration':250});
			$(".secondbox").animate({"top":"+=60px"},{'duration':250});
			$(".secondbox").animate({"top":"+=60px","left":"-=90px"},{'duration':250});
			$(".secondbox").animate({"top":"+=60px","left":"-=60px"},{'duration':250});
			$(".secondbox").animate({"top":"+=60px"},{'duration':250});
			$(".secondbox").animate({"top":"+=60px"},{'duration':250});
			$(".secondbox").animate({"top":"+=60px"},{'duration':250});
		},800);

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
		},1000);

		setTimeout(function(){
			$(".thirdbox").fadeIn(10);
			$(".thirdbox").animate({"top":"+=60px"},{'duration':250});
			$(".thirdbox").animate({"top":"+=60px"},{'duration':250});
			$(".thirdbox").animate({"top":"+=60px","left":"+=60px"},{'duration':250});
			$(".thirdbox").animate({"top":"+=60px","left":"+=60px"},{'duration':250});
			$(".thirdbox").animate({"top":"+=60px"},{'duration':250});
			$(".thirdbox").animate({"top":"+=60px"},{'duration':250});
			$(".thirdbox").animate({"top":"+=90px"},{'duration':375});
		},1400);
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
		},1650);

		setTimeout(function(){
			$("img.nextsecondbox").fadeOut(10);
			$(".fourthbox").fadeIn(10);
			$("img.nextthirdbox").fadeIn(10);
			$(".fourthbox").animate({"top":"+=60px"},{'duration':250});
			$(".fourthbox").animate({"top":"+=60px"},{'duration':250});
			$(".fourthbox").animate({"top":"+=60px","left":"+=90px"},{'duration':375});
			$(".fourthbox").animate({"top":"+=60px","left":"+=60px"},{'duration':250});
			$(".fourthbox").animate({"top":"+=60px"},{'duration':250});
			$(".fourthbox").animate({"top":"+=60px"},{'duration':250});
		},2000);
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
		},2250);

		setTimeout(function(){
			$("img.nextthirdbox").fadeOut(10);
			$(".fifthbox").fadeIn(10);
			$("img.nextfourthbox").fadeIn(10);
			$(".fifthbox").animate({"top":"+=60px"},{'duration':250});
			$(".fifthbox").animate({"top":"+=60px"},{'duration':250});
			$(".fifthbox").animate({"top":"+=60px","left":"-=60px"},{'duration':250});
			$(".fifthbox").animate({"top":"+=60px","left":"-=60px"},{'duration':250});
			$(".fifthbox").animate({"top":"+=90px"},{'duration':375});
		},2600);

		setTimeout(function(){
			$("img.nextfourthbox").fadeOut(10);
			$(".sixthbox").fadeIn(10);
			$("img.nextfifthbox").fadeIn(10);
			$(".sixthbox").animate({"top":"+=60px"},{'duration':250});
			$(".sixthbox").animate({"top":"+=60px"},{'duration':250});
			$(".sixthbox").animate({"top":"+=60px","left":"+=90px"},{'duration':375});
			$(".sixthbox").animate({"top":"+=60px"},{'duration':250});
			$(".sixthbox").animate({"top":"+=60px"},{'duration':250});
			$(".sixthbox").animate({"top":"+=60px"},{'duration':250});
		},3200);
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
		},3350);

		setTimeout(function(){
			$("img.nextfifthbox").fadeOut(10);
			$(".seventhbox").fadeIn(10);
			$(".seventhbox").animate({"top":"+=60px"},{'duration':250});
			$(".seventhbox").animate({"top":"+=60px"},{'duration':250});
			$(".seventhbox").animate({"top":"+=60px"},{'duration':250});
			$(".seventhbox").animate({"top":"+=60px"},{'duration':250});
			$(".seventhbox").animate({"top":"+=60px"},{'duration':250});
			$(".seventhbox").animate({"top":"+=60px"},{'duration':250});
			$(".seventhbox").animate({"top":"+=60px"},{'duration':250});
		},3800);
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
		},4050);

		setTimeout(function(){
			$("img.logo").fadeIn(10);
			$(".scorepoint").fadeIn(10);
			$(".scorepoint").animate({position:"absolute",bottom:"280px"},{'duration':1000});
			$(".scorebox").text("1000");
			$(".firstbox").fadeOut(10);
			$(".secondbox").fadeOut(10);
			$(".thirdbox").fadeOut(10);
			$(".fourthbox").fadeOut(10);
			$(".fifthbox").fadeOut(10);
			$(".sixthbox").fadeOut(10);
			$(".seventhbox").fadeOut(10);
		},5700);

		setTimeout(function(){
			$(".firstbox").fadeIn(10);
			$(".secondbox").fadeIn(10);
			$(".thirdbox").fadeIn(10);
			$(".fourthbox").fadeIn(10);
			$(".fifthbox").fadeIn(10);
			$(".sixthbox").fadeIn(10);
			$(".seventhbox").fadeIn(10);
		},5800);

		setTimeout(function(){
			$(".firstbox").fadeOut(10);
			$(".secondbox").fadeOut(10);
			$(".thirdbox").fadeOut(10);
			$(".fourthbox").fadeOut(10);
			$(".fifthbox").fadeOut(10);
			$(".sixthbox").fadeOut(10);
			$(".seventhbox").fadeOut(10);
		},5900);

		setTimeout(function(){
			$(".firstbox").fadeIn(10);
			$(".secondbox").fadeIn(10);
			$(".thirdbox").fadeIn(10);
			$(".fourthbox").fadeIn(10);
			$(".fifthbox").fadeIn(10);
			$(".sixthbox").fadeIn(10);
			$(".seventhbox").fadeIn(10);
		},6000);

		setTimeout(function(){
			$("img.logo").fadeIn(10);
			$(".firstbox").fadeOut(10);
			$(".secondbox").fadeOut(10);
			$(".thirdbox").fadeOut(10);
			$(".fourthbox").fadeOut(10);
			$(".fifthbox").fadeOut(10);
			$(".sixthbox").fadeOut(10);
			$(".seventhbox").fadeOut(10);
		},6100);

		setTimeout(function(){
			$(".scorepoint").fadeOut(10);
		},6700);

		setTimeout(function(){
			$(".nextbox").fadeOut(200);
			$(".scorebox").fadeOut(200);
			$(".retrisbox").css({borderLeftColor:"black",borderTopColor:"black",borderBottomColor:"black",borderRightColor:"black"});

		},6750);

		setTimeout(function(){
			$(".retrisbox").animate({"width":"842px",position:"absolute",left:"120px"},{'duration':500});
			$("img.logo").animate({"width":"630px","height":"440px"},{'duration':500});
		},6800);

		setTimeout(function(){

		},16000);
	});
});