$(function() {
    queryQuestions()
    $(".topicform").validate(valiRules);
    $("#choose").change((e)=>{checkAll_or_not(e)});
    $("#addTopic").click(addTopicFun);
    $("#deleteTopic").click((e)=>{deleteTopicFun(e)});
})

function chooseTopicFun(e){
	console.log(e.target)
	console.log($(e.target).attr('checked'))
}
function deleteTopicFun(e){
	delete_obj({
		url: "../../../AddAndUpdateTopic_Controller/delete.action",
		success: function(res){
			alert(res.message)
			window.location.reload()
		},
		error: '',
	})
}

function addTopicFun(){
	$(".topicform").data("type","/AddAndUpdateTopic_Controller/add.action");
	var str = `<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"
							aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>
						<h4 class="modal-title" id="myModalLabel">添加题目</h4>
					</div>
					<div class="modal-body">
						<div class="form-group mydisplay">
			                <label for="exampleInputEmail1" class="width100px textalignright">题目名称</label>
			                <input type="text" class="form-control marginLeft10px" name="t_u_topic.topic_name" id="topic_name" />
			            </div>
			            <div class="form-group mydisplay">
			                <label for="exampleInputEmail1" class="width100px textalignright">分数</label>
			                <input type="number" class="form-control marginLeft10px width10" name="t_u_topic.mark" min="1" id="mark" />
			            </div>
			            <div class="form-group mydisplay">
			                <label for="exampleInputPassword1" class="width100px textalignright">A选项</label>
			                <input type="hidden"  name="answers[0].topic_answer" value="A" />
			                <input type="text" class="form-control marginLeft10px" id="selectA" name="answers[0].topic_describe" />
			            </div>
			            <div class="form-group mydisplay">
			                <label for="exampleInputPassword1" class="width100px textalignright">B选项</label>
			                 <input type="hidden"  name="answers[1].topic_answer" value="B" />
			                <input type="text" class="form-control marginLeft10px" id="selectB" name="answers[1].topic_describe" />
			            </div>
			            <div class="form-group mydisplay">
			                <label for="exampleInputPassword1" class="width100px textalignright">C选项</label>
			                 <input type="hidden"  name="answers[2].topic_answer" value="C" />
			                <input type="text" class="form-control marginLeft10px" id="selectC" name="answers[2].topic_describe" />
			            </div>
			            <div class="form-group mydisplay">
			                <label for="exampleInputPassword1" class="width100px textalignright">D选项</label>
			                <input type="hidden"  name="answers[3].topic_answer" value="D" />
			                <input type="text" class="form-control marginLeft10px" id="selectD" name="answers[3].topic_describe" />
			            </div>
			            <div class="form-group mydisplay">
			                <label for="exampleInputPassword1" class="width100px textalignright">正确答案</label>
			                <!-- <input type="text" class="form-control marginLeft10px" id="answer" name="answer" /> -->
			                <select class="form-control marginLeft10px width10" id="answer" name="t_u_topic.answer">
			                    <option value="A">A</option>
			                    <option value="B">B</option>
			                    <option value="C">C</option>
			                    <option value="D">D</option>
			                </select>
			            </div>
					</div>
					<div class="modal-footer">
						<button type="reset" class="btn btn-default" data-dismiss="modal">取消</button>
						<button type="submit" class="btn btn-primary">保存</button>
					</div>`
	$(".modal-content").html(str);
	$("#myModal").modal('show');
}

function updatequestion(id){
	$.ajax({
		data : { id },
		url : "../../../AddAndUpdateTopic_Controller/query.action",
		success : function(res){
			if(res.status != 1){
				alert(res.message);
				return;
			}
			$(".topicform").data("type","/AddAndUpdateTopic_Controller/update.action");
			var data = res.data[0];
			var answers = res.answers.sort(compare('topic_answer'));
			var str ="";
			var answerStr ="";
			answers.forEach((item,index)=>{
				answerStr += `<div class="form-group mydisplay">
					<label for="exampleInputPassword1"
						class="width100px textalignright">${item.topic_answer}选项</label>
						 <input
						type="hidden" name="answers[${index}].id" value="${item.id}" />
						 <input
						type="hidden" name="answers[${index}].topic_answer" value="${item.topic_answer}" /> <input
						type="text" class="form-control marginLeft10px" id="select${item.topic_answer}"
						name="answers[${index}].topic_describe" value="${item.topic_describe}" />
				</div>`;
			})
			
			str =`<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"
							aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>
						<h4 class="modal-title" id="myModalLabel">修改题目</h4>
					</div>
					<div class="modal-body">
						<div class="form-group mydisplay">
							<label for="exampleInputEmail1"
								class="width100px textalignright">题目名称</label><input
								type="hidden" class="form-control marginLeft10px"
								name="t_u_topic.id"  value="${data.id}" /> <input
								type="text" class="form-control marginLeft10px"
								name="t_u_topic.topic_name" id="topic_name" value="${data.topic_name}" />
						</div>
						<div class="form-group mydisplay">
							<label for="exampleInputEmail1"
								class="width100px textalignright">分数</label> <input
								type="number" class="form-control marginLeft10px width10"
								name="t_u_topic.mark" min="1" id="mark" value="${data.mark}" />
						</div>
						${answerStr}
						<div class="form-group mydisplay">
							<label for="exampleInputPassword1"
								class="width100px textalignright">正确答案</label>  
								<select
								class="form-control marginLeft10px width10" id="answer"
								name="t_u_topic.answer">
								<option value="A" ${data.answer=='A'? 'selected':''}>A</option>
								<option value="B" ${data.answer=='B'? 'selected':''}>B</option>
								<option value="C" ${data.answer=='C'? 'selected':''}>C</option>
								<option value="D" ${data.answer=='D'? 'selected':''}>D</option>
							</select>
						</div>
					</div>
				<div class="modal-footer">
					<button type="reset" class="btn btn-default" data-dismiss="modal">取消</button>
					<button type="submit" class="btn btn-primary">保存</button>
				</div>`
			$(".modal-content").html(str);
			$("#myModal").modal('show');
		}
	});
}

//查询所有题目
function queryQuestions() {
	$.ajax({
		url : "../../../AddAndUpdateTopic_Controller/query.action",
		success : queryQuestions_success
	});
}
function queryQuestions_success(res){
	if(res.status != 1){
		alert(res.message);
		return;
	}
	var data = res.data;
	var str = "";
	data.forEach((item,index)=>{
		str+=`  <tr>
		          <th><input type="checkbox" name='data_checkbox' value="${item.id}"/></th>
		          <th scope="row">${index+1}</th>
		          <td>${item.topic_name}</td>
		          <td>${item.answer}. ${item.remarks}</td>
		          <td><input type="button" class="btn btn-info" onclick="updatequestion('${item.id}')" value="修改"  /></td>
		        </tr>`
	})
	$("#questionsTable").html(str);
}

var valiRules = {
    rules: {
        "t_u_topic.topic_name": {
             "required":true,
        },
        "t_u_topic.mark": {
             "required":true,
        },
        "answers\[0\].topic_describe": {
             "required":true,
        },
        "answers\[1\].topic_describe": {
             "required":true,
        },
        "answers\[2\].topic_describe": {
             "required":true,
        },
        "answers\[3\].topic_describe": {
             "required":true,
        }

    },
    messages: {
        "t_u_topic.topic_name": {
            "required":"不能为空",
        },
        "t_u_topic.mark": {
            "required":"不能为空",
        },
        "answers[0].topic_describe": {
            "required":"不能为空",
        },
        "answers[1].topic_describe": {
            "required":"不能为空",
        },
        "answers[2].topic_describe": {
            "required":"不能为空",
        },
        "answers[3].topic_describe": {
            "required":"不能为空",
        },
    },
    submitHandler : function(form) { // 通过之后回调
    	var uri = "../../.."+$(form).data("type");//url : "../../../AddAndUpdateTopic_Controller/add.action",
		$(form).ajaxSubmit(
						{
							type : "GET",
							url : uri,
							success : function(res) {
								  alert(res.message)
								  window.location.reload()
								}
							})
	}
}
//排序
function compare(property){
    return function(a,b){
        var value1 = a[property];
        var value2 = b[property];
        return value1.localeCompare(value2);
    }
}