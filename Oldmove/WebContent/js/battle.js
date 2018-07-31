
$(function(){
	setTimeout(function(){
		$(".textbox .criticalbox").css("color","black");
	},700);
});
$(function(){
	setTimeout(function(){
		$(".textafterbox").css("color","black");
		$(".flashbox img").fadeOut(0);
		$(".vanishbox").fadeOut(0);
	},1000);
});

$(function(){
	setTimeout(function(){
		$(".flashbox img").fadeIn(0);
		$(".vanishbox").fadeIn(0);
	},1050);
});

$(function(){
	setTimeout(function(){
		$(".flashbox img").fadeOut(0);
		$(".vanishbox").fadeOut(0);
	},1100);
});

$(function(){
	setTimeout(function(){
		$(".flashbox img").fadeIn(0);
		$(".vanishbox").fadeIn(0);
	},1150);
});

$(function(){
	setTimeout(function(){
		$(".coinwinnerbox").hide();
		$(".coinwinnerafterbox").css("color", "black");
		$(".coinwinnerafterbox").css("border-color","black");
	},1500);
});


$(function(){
	setTimeout(function(){
		$(".textdestroybox").css("color","black");
		$(".vanishbox").fadeOut(0);
	},1700);
});