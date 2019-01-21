function autoPlay() {
	var myAuto = document.getElementById('myaudio');
	myAuto.play();
}
function closePlay() {
	var myAuto = document.getElementById('myaudio');
	myAuto.pause();
	// myAuto.load();
}

$(document).ready(function() {
	var myAuto_login = document.getElementById('myaudio_login');
	myAuto_login.play();
	setInterval(querynewOrder,5000);
});
var orderid="";
var ordertime ="";
function querynewOrder() {
	$.ajax({
		url : getRootPath()+"/washerusermanager_controller_4W/maxOrder.action",
		success : querynewOrderSuccess
	});
}
function querynewOrderSuccess(data){
	//alert(data.id+"   "+data.order_time);
//	if(orderid != data.id  || ordertime != data.order_time){
	//alert(data.id+"===");
	if(orderid != data.id && data.id != undefined && data.id != null && data.id != ""){
		autoPlay();
		orderid = data.id;
		ordertime = data.order_time;
		$("#ordertime").text(data.order_time+"<br>"+data.id);
	}
}
