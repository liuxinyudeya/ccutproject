$(document).ready(function() {
	location.href=getRootPath()+"/html/admin/main/main.html";
//	$("#logbtn").click(login);
	
});
function login() {
 var loginName = $("#txtUser").val();
 var password = $("#Userpwd").val();
 var issave_temp = $('#issave').is(':checked');
 var issave;
 //1--要保存密码   0--不保存密码
 if(issave_temp){
	 issave="1";
 }else{
	 issave="0";
 }
 if(loginName !=null && loginName !="" && password !=null && password !=""){
	 var login = new Object();
	 login.account = loginName;
	 login.pwd = password;
	 login.issave=issave;
	 $.ajax({
		 url:getRootPath()+"/AdminLogin_Controller_4W/loginValidate.action",
		 data:login,
		 type:"post",
		 success:addInfo
		 
		
	 });
 }else{
	 alert("用户名或者密码不能为空");
 }


    
}

function addInfo(data){
	if(data==0){
	$(".tishi").html("<font style='color:red;font-size:10px;'>账号或者密码输入错误</font>");
	}else{
		//post();
		//$("#jumpform").submit();
		location.href=getRootPath()+"/AdminLogin_Controller_4W/jump.action";
	}

	
}



function post() {        
	 $.ajax({
	        url : getRootPath()+"/AdminLogin_Controller_4W/jump.action",
	        cache : false,
	        type : 'POST',
	        success : function() {
	           alert("success");
	             $("#userForm").attr("action",getRootPath()+"/AdminLogin_Controller_4W/jump.action");
	             $("#userForm").submit();
	         
	        }
	       
	      });     
}  

