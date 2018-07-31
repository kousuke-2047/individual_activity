var herotop =1;
var heroleft=1;
var enemytop=5;
var enemyleft=5;
var topdirection=false;
var leftdirection=false;
var rightdirection=false;
var bottomdirection=true;
var random = 0;

var enemymove = function enemymove(){
		$(function(){
			if(enemyleft>heroleft){
				$("img.enemy").animate({"left":"-=102px"});
				enemyleft--;
			}else if(enemyleft<heroleft){
				$("img.enemy").animate({"left":"+=102px"});
				enemyleft++;
			}else if(enemyleft==heroleft && enemytop>herotop){
				$("img.enemy").animate({"top":"-=102px"});
				enemytop--;
			}else if(enemyleft==heroleft && enemytop<herotop){
				$("img.enemy").animate({"top":"+=102px"});
				enemytop++;
			};
		});
	}


var gameover = function gameover(){
	$(function(){
		if(heroleft==enemyleft && herotop==enemytop){
			$("img.hero").fadeOut(10);
			setTimeout(function(){
				$("img.hero").fadeIn(10);
			},100);
			setTimeout(function(){
				$("img.hero").fadeOut(10);
			},200);
			setTimeout(function(){
				$("img.hero").fadeIn(10);
			},300);
			setTimeout(function(){
				$("img.hero").fadeOut(10);
			},400);
			setTimeout(function(){
				$("img.hero").fadeIn(10);
			},500);
			setTimeout(function(){
				$("img.hero").fadeOut(10);
			},600);
			setTimeout(function(){
				$(".gameoverbox").fadeIn(10);
			},1000);
		};
	});
};



$(function(){
	$(".Abutton").click(function(){
		if(topdirection){
			if(heroleft==enemyleft &&herotop-1==enemytop){
				$("img.hero").animate({"top":"-=30px"},{'duration':200});
				setTimeout(function(){
					$("img.hero").animate({"top":"+=30px"},{'duration':200});
					$("img.enemy").fadeOut(10);
				},210);
				setTimeout(function(){
					$("img.enemy").fadeIn(10);
				},300);
				setTimeout(function(){
					$("img.enemy").fadeOut(10);
				},400);
				setTimeout(function(){
					$("img.enemy").fadeIn(10);
				},500);
				setTimeout(function(){
					$("img.enemy").fadeOut(10);
				},600);
				setTimeout(function(){
					$(".square").css({borderColor:"white"});
					$("img.hero").animate({position:"absolute",top:"250px",left:"250px"},{'duration':500});
				},700);
				setTimeout(function(){
					$(".winnermessage").fadeIn(100);
				},1400);
			}else{
				$("img.hero").animate({"top":"-=30px"},{'duration':200});
				setTimeout(function(){
					$("img.hero").animate({"top":"+=30px"},{'duration':200});
					enemymove();
					gameover();
				},210);
			};
		}else if(bottomdirection){
			if(heroleft==enemyleft &&herotop+1==enemytop){
				$("img.hero").animate({"top":"+=30px"},{'duration':200});
				setTimeout(function(){
					$("img.hero").animate({"top":"-=30px"},{'duration':200});
					$("img.enemy").fadeOut(10);
				},210);
				setTimeout(function(){
					$("img.enemy").fadeIn(10);
				},300);
				setTimeout(function(){
					$("img.enemy").fadeOut(10);
				},400);
				setTimeout(function(){
					$("img.enemy").fadeIn(10);
				},500);
				setTimeout(function(){
					$("img.enemy").fadeOut(10);
				},600);
				setTimeout(function(){
					$(".square").css({borderColor:"white"});
					$("img.hero").animate({position:"absolute",top:"250px",left:"250px"},{'duration':500});
				},700);
				setTimeout(function(){
					$(".winnermessage").fadeIn(100);
				},1400);
			}else{
				$("img.hero").animate({"top":"+=30px"},{'duration':200});
				setTimeout(function(){
					$("img.hero").animate({"top":"-=30px"},{'duration':200});
					enemymove();
					gameover();
				},210);
			};
		}else if(leftdirection){
			if(heroleft-1==enemyleft &&herotop==enemytop){
				$("img.hero").animate({"left":"-=30px"},{'duration':200});
				setTimeout(function(){
					$("img.enemy").fadeOut(10);
					$("img.hero").animate({"top":"+=30px"},{'duration':200});
				},210);
				setTimeout(function(){
					$("img.enemy").fadeIn(10);
				},300);
				setTimeout(function(){
					$("img.enemy").fadeOut(10);
				},400);
				setTimeout(function(){
					$("img.enemy").fadeIn(10);
				},500);
				setTimeout(function(){
					$("img.enemy").fadeOut(10);
				},600);
				setTimeout(function(){
					$(".square").css({borderColor:"white"});
					$("img.hero").animate({position:"absolute",top:"250px",left:"250px"},{'duration':500});
				},700);
				setTimeout(function(){
					$(".winnermessage").fadeIn(100);
				},1400);
			}else{
				$("img.hero").animate({"left":"-=30px"},{'duration':200});
				setTimeout(function(){
					$("img.hero").animate({"left":"+=30px"},{'duration':200});
					enemymove();
					gameover();
				},500);
			};
		}else if(rightdirection){
			if(heroleft+1==enemyleft &&herotop==enemytop){
				$("img.hero").animate({"left":"+=30px"},{'duration':200});
				setTimeout(function(){
					$("img.hero").animate({"left":"-=30px"},{'duration':200});
					$("img.enemy").fadeOut(10);
				},210);
				setTimeout(function(){
					$("img.enemy").fadeIn(10);
				},300);
				setTimeout(function(){
					$("img.enemy").fadeOut(10);
				},400);
				setTimeout(function(){
					$("img.enemy").fadeIn(10);
				},500);
				setTimeout(function(){
					$("img.enemy").fadeOut(10);
				},600);
				setTimeout(function(){
					$(".square").css({borderColor:"white"});
					$("img.hero").animate({position:"absolute",top:"250px",left:"250px"},{'duration':500});
				},700);
				setTimeout(function(){
					$(".winnermessage").fadeIn(100);
				},1400);
			}else{
				$("img.hero").animate({"left":"+=30px"},{'duration':200});
				setTimeout(function(){
					$("img.hero").animate({"left":"-=30px"},{'duration':200});
					enemymove();
					gameover();
				},210);
			};
		};
	});
	$(".keytop").click(function(){
		if(herotop-1==enemytop && heroleft==enemyleft){
		}else if(herotop>1){
		$("img.hero").animate({"top":"-=102px"});
		herotop--;
		topdirection=true;
		leftdirection=false;
		rightdirection=false;
		bottomdirection=false;
		enemymove();
		gameover();
		}else if(herotop==1){
		}
	});
	$(".keybottom").click(function(){
		if(herotop+1==enemytop && heroleft==enemyleft){
		}else if(herotop<5){
		$("img.hero").animate({"top":"+=102px"});
		herotop++;
		topdirection=false;
		leftdirection=false;
		rightdirection=false;
		bottomdirection=true;
		enemymove();
		gameover();
		}else if(herotop==5){

		};
	});
	$(".keyleft").click(function(){
		if(heroleft-1==enemyleft && herotop==enemytop){
		}else if(heroleft>1){
		$("img.hero").animate({"left":"-=102px"});
		heroleft--;
		topdirection=false;
		leftdirection=true;
		rightdirection=false;
		bottomdirection=false;
		enemymove();
		gameover();
		}else if(heroleft==1){

		};
	});
	$(".keyright").click(function(){
		if(heroleft+1==enemyleft && herotop==enemytop){
		}else if(heroleft<5){
		$("img.hero").animate({"left":"+=102px"});
		heroleft++;
		topdirection=false;
		leftdirection=false;
		rightdirection=true;
		bottomdirection=false;
		enemymove();
		gameover();
		}else if(heroleft==5){
		}
	});
});