function cImage(sint) {
	var i;
	var img = document.getElementById("img1");
	var span = document.getElementById("s" + sint);
	switch (sint) {
	case 1:
		img.src = "images/01.jpg";
		for (i = 1; i <= 5; i++) {
			var span1 = document.getElementById("s" + i);
			span1.style.backgroundImage = "url('images/channelAdvButton01.png')";
		}
		span.style.backgroundImage = "url('images/channelAdvButton02.png')";
		break;
	case 2:
		img.src = "images/02.jpg";
		for (i = 1; i <= 5; i++) {
			var span1 = document.getElementById("s" + i);
			span1.style.backgroundImage = "url('images/channelAdvButton01.png')";
		}
		span.style.backgroundImage = "url('images/channelAdvButton02.png')";
		break;
	case 3:
		img.src = "images/03.jpg";
		for (i = 1; i <= 5; i++) {
			var span1 = document.getElementById("s" + i);
			span1.style.backgroundImage = "url('images/channelAdvButton01.png')";
		}
		span.style.backgroundImage = "url('images/channelAdvButton02.png')";
		break;
	case 4:
		img.src = "images/04.jpg";
		for (i = 1; i <= 5; i++) {
			var span1 = document.getElementById("s" + i);
			span1.style.backgroundImage = "url('images/channelAdvButton01.png')";
		}
		span.style.backgroundImage = "url('images/channelAdvButton02.png')";
		break;
	case 5:
		img.src = "images/05.jpg";
		for (i = 1; i <= 5; i++) {
			var span1 = document.getElementById("s" + i);
			span1.style.backgroundImage = "url('images/channelAdvButton01.png')";
		}
		span.style.backgroundImage = "url('images/channelAdvButton02.png')";
		break;
	}
}




function setTab(m,n){
var piq=document.getElementById("ps").getElementsByTagName("li");
var ppo=document.getElementById("pd").getElementsByTagName("ul");
for( i=0;i<piq.length;i++){
piq[i].className=i==n?"hover":"";
ppo[i].style.display=i==n?"block":"none";


}
}