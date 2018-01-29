<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/uploadify/uploadify.css">
    <script src="<%=request.getContextPath()%>/uploadify/jquery.uploadify.min.js"></script>

</head>
<body>

<form id="addimg" method="post">
    <input type="hidden" name="userid" value="1">
    上传照片:<div id="showBarDiv" ></div>
    <input type="hidden" name="photourl" id="dds">
    <input type="File" id="imgFile" >
    <div id="showImgDivs1" style="width: 80px;height: 80px;border-style:solid;border-width:1px; bor-color:black;"></div>
</form>

<script type="text/javascript">
    var datas = "";
    $(function(){
        //文件域的id
        $("#imgFile").uploadify({
            //前台请求后台的url 不可忽略的参数
            'uploader' :"uploadaddPhoto2",
            //插件自带 不可忽略的参数
            'swf' : '<%=request.getContextPath()%>/uploadify/uploadify.swf',
            //撤销按钮的图片路径
            'cancelImg' : '<%=request.getContextPath() %>/uploadify/uploadify-cancel.png',
            //如果为true 为自动上传 在文件后 为false 那么它就要我们自己手动点上传按钮
            'auto' : true,
            //可以同时选择多个文件 默认为true 不可忽略
            'multi' : false,
            //给上传按钮设置文字
            'buttonText' : '上传照片',
            //上传后队列是否消失
            'removeCompleted' : true,
            'removeTimeout' : 1,
            //上传文件的个数
            'uploadLimit' : 10,
            'fileTypeExts' : '*.jpg;*.jpge;*.gif;*.png',
            'fileSizeLimit' : '2MB',
            //给div的进度条加背景 不可忽略
            'queueID' : 'showBarDiv',
            // action中接收文件的全局变量名
            'fileObjName' : 'artImg',
            'onUploadSuccess' : function(file, data, response) {
//		       将图片回显    data   接收到的是图片名称
                datas += ","+ data;
                var split = datas.substring(1);
                $("#dds").val(split);
                var str1 = '<img style="width:80px;height:80px;border-style:solid;border-width:1px; border-color:black;"src="<%=request.getContextPath()%>'+data+'">';
                $("#showImgDivs1").append(str1);
            }
        });
    });




</script>

</body>
</html>

