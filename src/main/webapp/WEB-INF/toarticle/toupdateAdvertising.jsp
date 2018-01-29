<%--
  Created by IntelliJ IDEA.
  User: 王志军
  Date: 2018/1/21
  Time: 15:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form id="Advertising_update" method="post">
        <input type="hidden" name="advertisingid" value="${advertis.advertisingid}">
    广告主题：<input type="text" name="advertisingtitle" value="${advertis.advertisingtitle}"><br>
    广告内容：<textarea name="advertisingcontent">${advertis.advertisingcontent}</textarea><br>
    广告图片：<input type="hidden" name="advertisingimg" id="aas">
        <div id="showBarDiv" ></div>
        <input type="File" id="imgFile" >
        <div id="showImgDivs1" style="width: 80px;height: 80px;border-style:solid;border-width:1px; border-color:black;">
            <img src='${advertis.advertisingimg}' height='80px' width='80px'>
           <%-- <img src="'+${advertis.advertisingimg}+'"  style="width: 80px;height: 80px;border-style:solid;border-width:1px; border-color:black;">--%>
        </div><br>
    状态：<input type="radio" name="advertisingcyn" value="1" ${advertis.advertisingcyn == 1 ? 'checked':''}/>已发布
        <input type="radio" name="advertisingcyn" value="2" ${advertis.advertisingcyn == 2 ? 'checked':''}/>未发布
    </form>

<script>
    $(function(){
        //文件域的id
        $("#imgFile").uploadify({
            //前台请求后台的url 不可忽略的参数
            'uploader' :"/uploadaddPhoto",
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
                $("#aas").val(data);
                var str1 = '<img style="width:80px;height:80px;border-style:solid;border-width:1px; border-color:black;"src="'+data+'">';
                $("#showImgDivs1").html(str1);
            }
        });

    });

</script>
</body>
</html>
