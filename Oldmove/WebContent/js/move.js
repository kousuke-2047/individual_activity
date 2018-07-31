//$(function(){
//	$("body").click(function(){
//		$(".box").animate({"marginTop":"400px"},{'duration':1500});
//		$(".box").animate({"marginLeft":"168px"},{'duration':500});
//		$({deg:0}).animate({deg:90}, {
//			duration:500,
//		// 途中経過
//		progress:function() {
//			$('.box').css({
//				transform:'rotate(' + this.deg + 'deg)'
//			});
//		},
//		});
//	});
//});

$(function(){
	$("body").click(function(){
		$(".box").animate({"marginTop":"40px"},{'duration':250});
		$(".box").animate({"marginTop":"100px"},{'duration':500});
		$(".box").animate({"marginTop":"160px","marginLeft":"108px"},{'duration':500});
		$(".box").animate({"marginTop":"220px","marginLeft":"168px"},{'duration':500});
		$(".box").animate({"marginTop":"280px"},{'duration':500});
		$(".box").animate({"marginTop":"340px"},{'duration':500});
		$(".box").animate({"marginTop":"400px"},{'duration':500});

		setTimeout(function(){
			$({deg:0}).animate({deg:-90}, {
				duration:500,
//			 途中経過
			 progress:function() {
				$('.box').css({
					transform:'rotate(' + this.deg + 'deg)'
				});
			},
			});
		},850);
	});
});



