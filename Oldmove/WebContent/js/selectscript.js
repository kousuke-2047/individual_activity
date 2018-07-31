$(document).ready(function(){
	$(".firstmessagebox").hide();
	$(".secondmessagebox").hide();
	$(".thirdmessagebox").hide();
});

$(function(){
	$(".selectbutton").hover(
			function(){
				$(this).css("background-color","lightgray");
				$(this).css("color","red");
				$(this).css("color","red");
			},
			function(){
				$(this).css("background-color","white");
				$(this).css("color","black");
				$(".selectbutton a").css("color","black");
			});
});

$(function(){
	$(".selectbutton").click(function(){
		$(".firstmessagebox").hide();
		$(".secondmessagebox").hide();
		$(".thirdmessagebox").hide();
		$("img.enemyfirstbox").fadeIn(0);
		$("img.enemysecondbox").fadeIn(0);
		$("img.enemythirdbox").fadeIn(0);
	});
});

$(function(){
	$("tr.selectfirstbox").hover(
			function(){
				$(this).css("background-color","lightgray");
				$(this).css("color","red");
				$("img.enemyfirstbox").animate({opacity:'0.5',},{duration:500, easing:'swing',});
			},
			function(){
				$(this).css("background-color","white");
				$(this).css("color","black");
				$("img.enemyfirstbox").animate({opacity:'1',},{duration:500,easing:'swing',});
			});
});
$(function(){
	$("tr.selectfirstbox").click(function(){
		$("img.enemysecondbox").hide();
		$("img.enemythirdbox").hide();
		$(".secondmessagebox").hide();
		$(".thirdmessagebox").hide();
		$(".firstmessagebox").css("color","black");
		$(".firstmessagebox a").css("color","black");
		$(".firstmessagebox").css("border-color","black");
		$(".firstmessagebox").fadeIn(0);
		$("img.enemyfirstbox").fadeIn(0);
	});
});

$(function(){
	$("tr.selectsecondbox").hover(
			function(){
				$(this).css("background-color","lightgray");
				$(this).css("color","red");
				$("img.enemysecondbox").animate({opacity:'0.5',},{duration:500,easing:'swing',});

			},
			function(){
				$(this).css("background-color","white");
				$(this).css("color","black");
				$("img.enemysecondbox").animate({opacity:'1',},{duration:500,easing:'swing',});
			});
});

$(function(){
	$("tr.selectsecondbox").click(function(){
		$("img.enemyfirstbox").hide();
		$("img.enemythirdbox").hide();
		$(".firstmessagebox").hide();
		$(".thirdmessagebox").hide();
		$(".secondmessagebox").css("color","black");
		$(".secondmessagebox a").css("color","black");
		$(".secondmessagebox").css("border-color","black");
		$(".secondmessagebox").fadeIn(0);
		$("img.enemysecondbox").fadeIn(0);
	});
});

$(function(){
	$("tr.selectthirdbox").hover(
			function(){
				$(this).css("background-color","lightgray");
				$(this).css("color","red");
				$("img.enemythirdbox").animate({opacity:'0.5',},{duration:500,easing:'swing',});
			},
			function(){
				$(this).css("background-color","white");
				$(this).css("color","black");
				$("img.enemythirdbox").animate({opacity:'1',},{duration:500,easing:'swing',});
			});
});

$(function(){
	$("tr.selectthirdbox").click(function(){
		$("img.enemyfirstbox").hide();
		$("img.enemysecondbox").hide();
		$(".secondmessagebox").hide();
		$(".firstmessagebox").hide();
		$(".thirdmessagebox").css("color","black");
		$(".thirdmessagebox a").css("color","black");
		$(".thirdmessagebox").css("border-color","black");
		$(".thirdmessagebox").fadeIn(0);
		$("img.enemythirdbox").fadeIn(0);
	});
});