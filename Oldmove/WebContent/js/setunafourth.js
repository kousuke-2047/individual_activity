var beforeslashFlg=true;
var slashFlg=false;
var sameslashFlg=false;
var afterslashFlg=false;
var time=0;

var slash;

var slashafter;

var showtimer;
var sameslash;



$(function(){
	slash = setTimeout(function(){
		beforeslashFlg=false;
		slashFlg=true;
		$(".suprisebox").fadeIn(0);
		showtimer = setInterval(function(){
			time++;
			$(".timer").text(time);
		},10);
	},5500);
	sameslash =setTimeout(function(){
		slashFlg=false;
		sameslashFlg=true;
	},5990);
	slashafter = setTimeout(function(){
		sameslashFlg=false;
		afterslashFlg=true;
		$(".suprisebox").fadeOut(0);
		clearInterval(showtimer);
		$(".losemessage").fadeIn(0);
		$(".enemybox").css({"left":"-=400px"});
		$("img.hero").fadeOut(0);
		$("img.herolose").fadeIn(0);
		$("img.enemy").fadeOut(0);
		$("img.enemywin").fadeIn(0);
		$(".main").fadeOut(0);
		setTimeout(function(){
			$(".main").fadeIn(0);
		},100);
	},6000);


	$(".enemybox").one('click',function(){
		if(beforeslashFlg){
			$(".closebox").fadeIn(0);
		}else if(slashFlg){
			clearTimeout(slashafter);
			clearInterval(showtimer);
			clearTimeout(sameslash);
			$(".main").fadeOut(0);
			$(".winnermessage").fadeIn(0);
			$(".herobox").css({"left":"+=400px"});
			$("img.hero").fadeOut(0);
			$("img.herowin").fadeIn(0);
			$("img.enemy").fadeOut(0);
			$("img.enemylose").fadeIn(0);
			setTimeout(function(){
				$(".main").fadeIn(0);
			},100);
			setTimeout(function(){
				document.form.action="FifthsetunaAction";
				document.form.submit();
			},5000);
		}else if(sameslashFlg){
			clearInterval(showtimer);
			clearTimeout(slashafter);
			$(".main").fadeOut(0);
			$(".drawmessage").fadeIn(0);
			$(".herobox").css({"left":"+=300px"});
			$(".enemybox").css({"left":"-=300px"});
			$("img.hero").fadeOut(0);
			$("img.herowin").fadeIn(0);
			$("img.enemy").fadeOut(0);
			$("img.enemywin").fadeIn(0);
			setTimeout(function(){
				$(".main").fadeIn(0);
			},100);
		}else if(slashafter){
		};
	});
});