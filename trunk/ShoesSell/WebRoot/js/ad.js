/*棣栭〉骞垮憡鏁堟灉*/
$(function(){
     var len  = $(".num > li").length;
	 var index = 0;
	 var adTimer;
	 $(".num li").mouseover(function(){
		index  =   $(".num li").index(this);
		showImg(index);
	 }).eq(0).mouseover();	
	 //婊戝叆 鍋滄鍔ㄧ敾锛屾粦鍑哄紑濮嬪姩鐢�
	 $('.ad').hover(function(){
			 clearInterval(adTimer);
		 },function(){
			 adTimer = setInterval(function(){
			    showImg(index)
				index++;
				if(index==len){index=0;}
			  } , 2000);
	 }).trigger("mouseleave");
})
// 閫氳繃鎺у埗top 锛屾潵鏄剧ず涓嶅悓鐨勫够鐏墖
function showImg(index){
        var adHeight = $(".content_right .ad").height();
		$(".slider").stop(true,false).animate({top : -adHeight*index},600);
		$(".num li").removeClass("on")
			.eq(index).addClass("on");
}