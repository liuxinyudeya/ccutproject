$(document).ready(function() {
	queryQuestions();
//	 $("#submits").click(subvailed);
})

function queryQuestions() {
	$.ajax({
		url : "../AnwserView_Controller/queryQuestions.action",
		success : queryQuestions_success
	});
}
function queryQuestions_success(list) {

	var form = $("#_form");

	for (var i = 0; i < list.length; i++) {
		var id = list[i].id;
		var div = $("<div class='wenti'>");
		var num=i+1;
		var p = $("<p>" + num + ". " + list[i].topic_name + "</p>" +
				"<input type='hidden' value='"
				+ id + "' name='t["+ i +"].name'/>");
		div.append(p);
		for (var j = 0; j < list[i].anwser.length; j++) {
			var ul = $("<ul>");
			var lable = $("<lable>");
			var li = $("<li>");
			var message = list[i].anwser[j].topic_describe;
			var anwser = $(" <input type='radio' value='"
					+ list[i].anwser[j].topic_answer + "' name='t["+ i +"].value'/> ");
			li.append(anwser);
			li.append(message);
			lable.append(li);
			ul.append(lable);
			div.append(ul);
		}

		form.append(div);

	}
	var button = $("<input type='button' id='submits' class='btn-red' onclick='subvailed()' value='确认'>");
	form.append(button)
}
function subvailed() {
	var t = $('form').serializeArray();
		 var answer = '';
		 var i = 1;
		 var ok;
		 $(".wenti").each(function() {
		 var that = this;
		 ok = false;
		 $(that).find("input").each(function() {
		 if (this.checked) {
		 answer += $(this).val() + ",";
		 ok = true;
		 }
		 })
		 if (!ok) {
		 alert("请完成第" + i + "题");
		 return false;
		 }
		 i++;
		 });
//		 if (ok) {
//		 $("#_form").submit();
//		 }
	console.log(t);
	$.ajax({
		url : getRootPath()+"/Addscore_Controller_4M/addScore.action",
		data : t,
		success : getInfo
	});
}
var score="";
var time="";
var name="";
function getInfo (s){
	console.log(s)
	name=s.name;
	time=s.time;
	score=s.score;
	window.location=getRootPath()+"/BaseMultiController/toPage.action?page=score/score&name="+name+"&time="+time+"&score="+score
}