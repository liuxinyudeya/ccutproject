$(document).ready(function() {
	$("#login").click(userlogin);
})

function userlogin() {
	var name = $("#name").val();
	var photo = $("#phone").val();
	if (name == "") {
		var msg = "<font color='red' size='2px'>姓名不能为空！</font>";
		var span = document.getElementById("validate_username");
		span.innerHTML = msg
	}
	if (photo == "") {
		var msg = "<font color='red' size='2px'>手机号不能为空！</font>";
		var span = document.getElementById("validate_phone");
		span.innerHTML = msg
	}
	if (name != "" && photo != "") {
		$.ajax({
			url : "../UserLogin/add.action?name=" + name + "&photo=" + photo,
			success : success
		});
	}

}
function success(message) {
	if (message == "") {
		alert("登录失败");
	} else {
		alert(message);

		location.href = getRootPath() + "/UserLogin/jump.action";
	}

}
