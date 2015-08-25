/**载入loading动画,imageSrc:动画图片地址*/
function useLoadingImage(imageSrc,element) {
	var loadingImage;
	if (imageSrc)
		loadingImage = imageSrc;
	else
		loadingImage = "ajax-loader.gif";
	dwr.engine.setPreHook(function() {//dwr.engine.setPreHook(jsfun)回调前调用jsfun
		var disabledImageZone = $('disabledImageZone');
		if (!disabledImageZone) {
			disabledImageZone = document.createElement('div');//装载图片的层
		disabledImageZone.style.position = "absolute";// absolute
				disabledImageZone.setAttribute('id', 'disabledImageZone');
			disabledImageZone.style.zIndex = "1000";
			//disabledImageZone.style.background = "red";//"white";
			disabledImageZone.style.left ="0px" ;
			disabledImageZone.style.top ="0px";
			disabledImageZone.style.width = "100%";
			disabledImageZone.style.height = "100%";
			var imageZone = document.createElement('img');//图片层
			imageZone.setAttribute('id', 'imageZone');
			imageZone.setAttribute('src', loadingImage);
			imageZone.style.position = "absolute";
			//设置图片层在“装载图片层”的位置
			//imageZone.style.top =getViewport().height/2; //指定网页在中间位置
			//imageZone.style.left =getViewport().width/2; 
			
			imageZone.style.top =getElementTop(element)+3;  //指定到网页元素element的位置上
			imageZone.style.left =getElementLeft(element)+2;
			
			disabledImageZone.appendChild(imageZone);
			document.body.appendChild(disabledImageZone);
		} else {
			$('imageZone').src = loadingImage;
			disabledImageZone.style.visibility = 'visible';
		}
	});
	dwr.engine.setPostHook(function() {//dwr.engine.setPostHook(jsfun)回调后调用jsfun
		$('disabledImageZone').style.visibility = 'hidden';
	});
}
//document元素的clientHeight和clientWidth属性，就代表了网页的大小。
　　function getViewport(){
　　　　if (document.compatMode == "BackCompat"){
　　　　　　return {
　　　　　　　　width: document.body.clientWidth,
　　　　　　　　height: document.body.clientHeight
　　　　　　}
　　　　} else {
　　　　　　return {
　　　　　　　　width: document.documentElement.clientWidth,
　　　　　　　　height: document.documentElement.clientHeight
　　　　　　}
　　　　}
　　}

//下面两个函数可以用来获取网页元素的绝对位置的横坐标和纵坐标。
　　function getElementLeft(element){
　　　　var actualLeft = element.offsetLeft;
　　　　var current = element.offsetParent;
　　　　while (current !== null){
　　　　　　actualLeft += current.offsetLeft;
　　　　　　current = current.offsetParent;
　　　　}
　　　　return actualLeft;
　　}
　　function getElementTop(element){
　　　　var actualTop = element.offsetTop;
　　　　var current = element.offsetParent;
　　　　while (current !== null){
　　　　　　actualTop += current.offsetTop;
　　　　　　current = current.offsetParent;
　　　　}
　　　　return actualTop;
　　}