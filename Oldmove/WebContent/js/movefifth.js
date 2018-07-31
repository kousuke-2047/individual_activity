
var leftkey=0;
var rpgflg=false;
var actflg=false;
var puzflg=false;
var rankflg=false;





$(function(){

	$(".keytop").click(function(){
		if(leftkey>0){
			$(".key").animate({"top":"-=50px"});
			leftkey--;
		};
	});

	$(".keybuttom").click(function(){
		if(leftkey<2){
			$(".key").animate({"top":"+=50px"});
		leftkey++;
		};
	});

	$(".Abutton").click(function(){
		if(leftkey==0){
			$(".actrankbox").fadeOut(0);
			$(".puzrankbox").fadeOut(0);
			$(".rpgrankbox").fadeIn(30);
			rpgflg=true;
		}else if(leftkey==1){
			$(".rpgrankbox").fadeOut(0);
			$(".puzrankbox").fadeOut(0);
			$(".actrankbox").fadeIn(30);
			actflg=true;
		}else if(leftkey==2){
			$(".rpgrankbox").fadeOut(0);
			$(".actrankbox").fadeOut(0);
			$(".puzrankbox").fadeIn(30);
			puzflg=true;
		};
		rankflg=true;
		leftkey=0;
		$(".Abutton").fadeOut(0);
		$(".afterAbutton").fadeIn(0);
		$(".key").css({position:"absolute",left:"166px",top:"119px"});
		$({deg:0}).animate({deg:180}, {
			duration:250,
//		 途中経過
		 progress:function() {
			$('.key').css({
				transform:'rotate(' + this.deg + 'deg)'
			});
		},
		});
	});

	$(".Bbutton").click(function(){
		if(rankflg){
			rankflg=false;
			rpgflg=false;
			actflg=false;
			puzflg=false;
			leftkey=0;
			$(".Abutton").fadeIn(0);
			$(".afterAbutton").fadeOut(0);
			$(".key").css({position:"absolute",left:"116px",top:"110px"});
			$({deg:180}).animate({deg:0}, {
				duration:250,
//			 途中経過
				progress:function() {
					$('.key').css({
						transform:'rotate(' + this.deg + 'deg)'
					});
				},
		});
		}else if(!rankflg){
			leftkey=0;
			$(".key").animate({position:"absolute",left:"116px",top:"110px"});
		};
	});

	$(".afterAbutton").click(function(){



		if(leftkey==0 && rpgflg==true){
			document.getElementById("form").productId[0].checked = true;
		}else if(leftkey==1 && rpgflg==true){
			document.getElementById("form").productId[1].checked = true;
		}else if(leftkey==2 && rpgflg==true){
			document.getElementById("form").productId[2].checked = true;
		}else if(leftkey==0 && actflg==true){
			document.getElementById("form").productId[3].checked = true;
		}else if(leftkey==1 && actflg==true){
			document.getElementById("form").productId[4].checked = true;
		}else if(leftkey==2 && actflg==true){
			document.getElementById("form").productId[5].checked = true;
		}else if(leftkey==0 && puzflg==true){
			document.getElementById("form").productId[6].checked = true;
		}else if(leftkey==1 && puzflg==true){
			document.getElementById("form").productId[7].checked = true;
		}else if(leftkey==2 && puzflg==true){
			document.getElementById("form").productId[8].checked = true;
		};
	});
});