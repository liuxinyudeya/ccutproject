$(document).ready(function() {
	$("#sub").click(upload);
	$("#download").click(download);
	$("#submuti").click(uploadmuti);
});
var pic;
function upload() {
	$("#uploadform").ajaxSubmit(
			function(data) {

				var testJson = data.data;
				var b = decodeURI(decodeURI(testJson)).replace(
						new RegExp("%3A", 'g'), ":").replace(
						new RegExp("%2C", 'g'), ",");
				var nnn=JSON.parse(b)
				pic=nnn.data.filename;
				$("#system_file_name").text(b);
				$("#success").text("上传成功");
			});
}
function download() {
	location.href = "./FileUpLoadController/download.action?filename=201805090006751907.xls";
}

function uploadmuti() {
	$("#uploadform_muti").ajaxSubmit(
			function(data) {

				var testJson = data.data;
				var b = decodeURI(decodeURI(testJson)).replace(
						new RegExp("%3A", 'g'), ":").replace(
						new RegExp("%2C", 'g'), ",");
				$("#system_file_name_muti").text(b);
			});
}