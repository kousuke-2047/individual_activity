
var leftkey=1;
var topkey =1;
var topflg=false;

$(function(){

	$(".keytop").click(function(){
		if(topflg){

			$(".key").css({position:"absolute",top:"160px",left:"116px"});
			$({deg:90}).animate({deg:0}, {
				duration:250,
//			 途中経過
			 progress:function() {
				$('.key').css({
					transform:'rotate(' + this.deg + 'deg)'
				});
			},
			});

			leftkey=1;
			topflg=false;
		}else if(leftkey>0){
			$(".key").animate({"top":"-=50px"});
			leftkey--;
			topflg=false;
		};
	});

	$(".keybuttom").click(function(){
		if(topflg){
			$(".key").css({position:"absolute",top:"160px",left:"116px"});

			$({deg:90}).animate({deg:0}, {
				duration:250,
//			 途中経過
			 progress:function() {
				$('.key').css({
					transform:'rotate(' + this.deg + 'deg)'
				});
			},
			});

			leftkey=1;
			topflg=false;
		}else if(leftkey<2){
			$(".key").animate({"top":"+=50px"});
		leftkey++;
		topflg=false;
		};
	});

	$(".keyleft").click(function(){
		if(!topflg){

			$(".key").css({position:"absolute",top:"60px",left:"250px"});

			$({deg:0}).animate({deg:90}, {
				duration:250,
//			 途中経過
			 progress:function() {
				$('.key').css({
					transform:'rotate(' + this.deg + 'deg)'
				});
			},
			});

			topkey=1;
			topflg=true;
		}else if(topkey>0){
			$(".key").animate({"left":"-=100px"});
			topkey--;
			topflg=true;
		};
	});

	$(".keyright").click(function(){
		if(!topflg){

			$(".key").css({position:"absolute",top:"60px",left:"250px"});

			$({deg:0}).animate({deg:90}, {
				duration:250,
//			 途中経過
			 progress:function() {
				$('.key').css({
					transform:'rotate(' + this.deg + 'deg)'
				});
			},
			});

			topkey=1;
			topflg=true;
		}else if(topkey<2){
			$(".key").animate({"left":"+=100px"});
			topkey++;
			topflg=true;
		};
	});


	$(".Abutton").click(function goAction(){
		if(topflg && topkey==0){
			document.getElementById("form").action="MoveAAction";
		}else if(topflg && topkey==1){
			document.getElementById("form").action="MoveBAction";
		}else if(topflg && topkey==2){
			document.getElementById("form").action="MoveCAction";
		}else if(!(topflg) && leftkey==0){
			document.getElementById("form").action="MoveDAction";
		}else if(!(topflg) && leftkey==1){
			document.getElementById("form").action="MoveEAction";
		}else if(!(topflg) && leftkey==2){
			document.getElementById("form").action="MoveFAction";
		};
	});
});