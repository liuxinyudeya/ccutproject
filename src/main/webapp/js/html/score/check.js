$(document).ready(function() {
	query();
	//加载分页
	var pageurl = getRootPath()+"/html/admin/page/page.html";
	$("#page").load(pageurl);
});

function query() {
	var parm = {
		url : getRootPath()+"/Addscore_Controller_4M/queryScore.action",
		firstcheck : false,
		table_obj : $("#datatable"),
		title : [ "序号","姓名","电话","答题时间","分数"],
		contextType : ["text","text","text","text","text"],
		data_column : [ "num","name","phone","createtime_str","scores"],
//		data_hidden : [ "audit_result_name" ],
		title_column_width : [ "10%","10%","10%","10%","10%"],
		optr : [ "操作" ],
		optr_project : [ "通过   "],
		optr_color : ["#f05825"],
		optr_callback : [ ""],
		optr_column_width : [ "15%" ]
	};
	showTable(parm);
}

function edit(id,d){
	alert("审核成功");
	var obj = new Object();
	obj.id = id;
	obj.audit_result_code="02";
	obj.audit_result_name="审核成功";
	obj.audit_reason="通过";
	$
			.ajax({
				url : getRootPath()
						+ "/JoinApp_Controller_4M/checkApp_proxy.action",
				data : obj,
				success : update_system_user_success,
				error : function(err) {
					query();
				}
			});

}
var imgid;
function queryImg(id,d){
	imgid = id;
	var parm = {
		title : "查看图片",
		html : "../js/html/check/checkimage.jsp",
		width : "60%",
		height : "50%",
		div_obj : $("#new_div"),
		buttons : [ "退出" ],
		buttons_callback : [ exit ]
	};
	show_new_div(parm);
}
function disagreeCheck(id, d) {
	
		var obj = new Object();
		var str = prompt("驳回理由：", "");
		if (str == null) {
			query();
		} else if (str == "") {
			alert("驳回成功");
			obj.id = id;
			obj.audit_result_code="03";
			obj.audit_result_name="审核失败";
			obj.audit_reason = str;
			$
					.ajax({
						url : getRootPath()
								+ "/JoinApp_Controller_4M/checkApp_proxy.action",
						data : obj,
						success : update_system_user_success,
						error : function(err) {
							query();
						}
					});
		} else {
			alert("驳回成功");
			obj.id = id;
			obj.audit_result_code="03";
			obj.audit_result_name="审核失败";
			obj.audit_reason = str;
			$
					.ajax({
						url : getRootPath()
								+ "/JoinApp_Controller_4M/checkApp_proxy.action",
						data : obj,
						success : update_system_user_success,
						error : function(err) {
							query();
						}
					});
		}
	} 
function update_system_user_success() {
	query();
	exit();
}

function exit() {
	$("#new_div").hide();
	$("#backdiv").hide();
}
