$(document).ready(function(){
	$(".messagebox").hide();
});





$(function(){
	setTimeout(function(){
		$(".ffirst").css("background-color","black");
		$(".ifirst").css("background-color","black");
		$(".gfirst").css("background-color","black");
		$(".hfirst").css("background-color","black");
		$(".tfirst").css("background-color","black");
		$(".fsecond").css("background-color","black");
		$(".isecond").css("background-color","black");
		$(".gsecond").css("background-color","black");
		$(".hsecond").css("background-color","black");
		$(".tsecond").css("background-color","black");
		$(".fthird").css("background-color","black");
		$(".ithird").css("background-color","black");
		$(".gthird").css("background-color","black");
		$(".hthird").css("background-color","black");
		$(".tthird").css("background-color","black");
		$(".ffourth").css("background-color","black");
		$(".ifourth").css("background-color","black");
		$(".gfourth").css("background-color","black");
		$(".hfourth").css("background-color","black");
		$(".tfourth").css("background-color","black");
		$(".ffifth").css("background-color","black");
		$(".ififth").css("background-color","black");
		$(".gfifth").css("background-color","black");
		$(".hfifth").css("background-color","black");
		$(".tfifth").css("background-color","black");
	},1500);
});


$(function(){
	setTimeout(function(){
		$(".firstline").animate({'marginLeft':'100px'
			});
	},1700);
});

$(function(){
	setTimeout(function(){
		$(".secondline").animate({'marginLeft':'100px'
			});
	},1900);
});

$(function(){
	setTimeout(function(){
		$(".thirdline").animate({'marginLeft':'100px'
			});
	},2100);
});

$(function(){
	setTimeout(function(){
		$(".fourthline").animate({'marginLeft':'100px'
			});
	},2300);
});

$(function(){
	setTimeout(function(){
		$(".fifthline").animate({'marginLeft':'100px'
			});
	},2500);
});

$(function(){
	$(".button").hover(
			function(){
				$(this).css("background-color","lightgray");
				$(this).css("color","red");
			},
			function(){
				$(this).css("background-color","white");
				$(this).css("color","black");
			});
});
$(function(){
	$(".button").click(function(){
		$(".messagebox").css("border-color","black");
		$(".messagebox").css("color","black");
		$(".selectbutton").css("border-color","black");
		$(".messagebox").fadeIn(0);
	});
});

$(function(){
	$(".setunabutton").click(function(){
		$(".messagebox").fadeOut(0);

		$(".setuna_messagebox").fadeIn(0);
	});
});

$(function(){
	$(".selectbutton").hover(
			function(){
				$(this).css("background-color","lightgray");
				$(this).css("color","red");
			},
			function(){
				$(this).css("background-color","white");
				$(this).css("color","black");
			});
});

$(function(){
	$(".selectbutton").click(function(){
		$(".messagebox").hide();
	});
});

