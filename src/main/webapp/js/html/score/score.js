$(document).ready(function() {
	   var str=window.location.href; //取得整个地址栏
	   var arr=str.split("&"); //各个参数放到数组里
	   var time="";
	   var name="";
	   var score="";
	   for (var i = 0; i <arr.length; i++) {
		  var arr2= arr[i+1].split("=")
		  document.getElementById(arr2[0]).innerHTML=decodeURI(arr2[1])
		  console.log(arr2)
	}

});
