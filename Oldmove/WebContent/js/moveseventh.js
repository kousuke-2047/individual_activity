/* iteratorでまわすとき、s:ifタグでcount==1,2,3で変えること */

var largementflg=false;
var startflg=false;
var rpgflg=false;
var actflg=false;
var puzflg=false;
var rankflg=false;
var rankkey=0;

$(function(){
	$(".startminibox").click(function(){
		if(!largementflg){
			$(".main").fadeOut(500);
			$(".mainsecond").fadeIn(500);

			$(".keytop").fadeIn(500);
			$(".keybottom").fadeIn(500);
			$(".keyleft").fadeIn(500);
			$(".keyright").fadeIn(500);
			$(".Abutton").fadeIn(500);
			$(".Bbutton").fadeIn(500);

			largementflg=true;
		};
	});

	$(".Abutton").click(function(){
		if(!startflg){
			$(".startbox").fadeOut(0);
			$(".battlebox").fadeIn(0);
			$(".rpgrankbox").fadeIn(0);
			startflg=true;
		}else if(startflg){
			if(rankkey==0){
				$(".actnamebox").fadeOut(0);
				$(".puznamebox").fadeOut(0);
				$(".rpgnamebox").fadeIn(0);
				rpgflg=true;
			}else if(rankkey==1){
				$(".rpgnamebox").fadeOut(0);
				$(".puznamebox").fadeOut(0);
				$(".actnamebox").fadeIn(0);
				actflg=true;
			}else if(rankkey==2){
				$(".actnamebox").fadeOut(0);
				$(".rpgnamebox").fadeOut(0);
				$(".puznamebox").fadeIn(0);
				puzflg=true;
			};
			rankkey=0;
			rankflg=true;
			$(".secondselectbox").fadeIn(0);
			$(".Abutton").fadeOut(0);
			$(".afterAbutton").fadeIn(0);
			$(".key").css({position:"absolute",left:"250px",top:"225px"});
			$(".rankfirstbox").animate({opacity:'0.5'},200);
		}else if(rankflg){

			if(rankkey==0 && rpgflg==true){
				document.getElementById("rankform").productId[0].checked = true;
			}else if(rankkey==1 && rpgflg==true){
				document.getElementById("rankform").productId[1].checked = true;
			}else if(rankkey==2 && rpgflg==true){
				document.getElementById("rankform").productId[2].checked = true;
			}else if(rankkey==0 && actflg==true){
				document.getElementById("rankform").productId[3].checked = true;
			}else if(rankkey==1 && actflg==true){
				document.getElementById("rankform").productId[4].checked = true;
			}else if(rankkey==2 && actflg==true){
				document.getElementById("rankform").productId[5].checked = true;
			}else if(rankkey==0 && puzflg==true){
				document.getElementById("rankform").productId[6].checked = true;
			}else if(rankkey==1 && puzflg==true){
				document.getElementById("rankform").productId[7].checked = true;
			}else if(rankkey==2 && puzflg==true){
				document.getElementById("rankform").productId[8].checked = true;
			};
		}
	});

	$(".Bbutton").click(function(){
		if(rankflg){
			rankflg=false;
			rpgflg=false;
			actflg=false;
			puzflg=false;
			rankkey=0;
			$(".secondselectbox").fadeOut(0);
			$(".Abutton").fadeIn(0);
			$(".afterAbutton").fadeOut(0);
			$(".rpgrankbox").fadeIn(0);
			$(".actrankbox").fadeOut(0);
			$(".puzrankbox").fadeOut(0);
			$(".key").css({position:"absolute",left:"40px",top:"225px"});
			$(".rankfirstbox").animate({opacity:'1'},200);
			$(".ranksecondbox").animate({opacity:'1'},200);
			$(".rankthirdbox").animate({opacity:'1'},200);

		}else if(!rankflg && startflg){
			$(".startbox").fadeIn(0);
			$(".battlebox").fadeOut(0);
			$(".key").css({position:"absolute",left:"40px",top:"225px"});
			startflg=false;
			rankkey=0;
			$(".rpgrankbox").fadeOut(0);
			$(".actrankbox").fadeOut(0);
			$(".puzrankbox").fadeOut(0);
		}else if(!startflg){
			$(".main").fadeIn(500);
			$(".mainsecond").fadeOut(500);
			$(".keytop").fadeOut(500);
			$(".keybottom").fadeOut(500);
			$(".keyleft").fadeOut(500);
			$(".keyright").fadeOut(500);
			$(".Abutton").fadeOut(500);
			$(".Bbutton").fadeOut(500);
			largementflg=false;
		};
	});

	$(".keytop").click(function(){
		if(!startflg){

		}else if(rankkey>0){
			$(".key").css({"top":"-=35px"});
			rankkey--;
			if(rankflg && rankkey==0){
				$(".rankfirstbox").animate({opacity:'0.5'},200);
				$(".ranksecondbox").animate({opacity:'1'},200);
				$(".rankthirdbox").animate({opacity:'1'},200);
			}else if(rankflg && rankkey==1){
				$(".rankfirstbox").animate({opacity:'1'},200);
				$(".ranksecondbox").animate({opacity:'0.5'},200);
				$(".rankthirdbox").animate({opacity:'1'},200);
			}else if(rankkey==0){
				$(".actrankbox").fadeOut(0);
				$(".puzrankbox").fadeOut(0);
				$(".rpgrankbox").fadeIn(0);
			}else if(rankkey==1){
				$(".puzrankbox").fadeOut(0);
				$(".rpgrankbox").fadeOut(0);
				$(".actrankbox").fadeIn(0);
			};
		};
	});
	$(".keybottom").click(function(){
		if(!startflg){

		}else if(rankkey<2){
			$(".key").css({"top":"+=35px"});
		rankkey++;
			if(rankflg && rankkey==1){
				$(".rankfirstbox").animate({opacity:'1'},200);
				$(".ranksecondbox").animate({opacity:'0.5'},200);
				$(".rankthirdbox").animate({opacity:'1'},200);
			}else if(rankflg && rankkey==2){
				$(".rankfirstbox").animate({opacity:'1'},200);
				$(".ranksecondbox").animate({opacity:'1'},200);
				$(".rankthirdbox").animate({opacity:'0.5'},200);
			}else if(rankkey==1){
				$(".puzrankbox").fadeOut(0);
				$(".rpgrankbox").fadeOut(0);
				$(".actrankbox").fadeIn(0);
			}else if(rankkey==2){
				$(".rpgrankbox").fadeOut(0);
				$(".actrankbox").fadeOut(0);
				$(".puzrankbox").fadeIn(0);
			}
		};
	});
});


