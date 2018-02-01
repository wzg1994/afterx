<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/30
  Time: 19:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form id="giFm">
    <input type="hidden" value="${gift.giftid}" name="giftid">
    <table>
        <tr>
            <td>礼物名称</td>
            <td><input type="text" value="${gift.giftname}" name="giftname"/></td>
        </tr>
        <tr>
            <td>礼物价格积分</td>
            <td><input type="text" value="${gift.giftprice}" name="giftprice"/></td>
        </tr>
        <tr>
            <td>礼物库存数量</td>
            <td><input type="text" value="${gift.giftcount}" name="giftcount"/></td>
        </tr>
        <tr>
            <td>礼物图片</td>
            <td>
                <input type="hidden" name="giftimg" id="hid">
                <input type="file" id="imgFileBTN" >
                <div id="showImgDiv22" style="width: 150px;height: 200px;border-style:solid;border-width:1px; border-color:black;">
                </div>
                <div id="showBarDiv22" ></div>
            </td>
        </tr>
    </table>
</form>
<script>
    $(function(){
        //文件域的id
        $("#imgFileBTN").uploadify({
            //前台请求后台的url 不可忽略的参数
            'uploader' :"uploadPhotoFile",
            //插件自带 不可忽略的参数
            'swf' : '<%=request.getContextPath()%>/uploadify/uploadify.swf',
            //撤销按钮的图片路径
            'cancelImg' : '<%=request.getContextPath()%>/uploadify/uploadify-cancel.png',
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
            'uploadLimit' : 2,
            'fileTypeExts' : '*.jpg;*.jpge;*.gif;*.png',
            'fileSizeLimit' : '2MB',
            //给div的进度条加背景 不可忽略
            'queueID' : 'showBarDiv22',
            // action中接收文件的全局变量名
            'fileObjName' : 'artImg',
            'onUploadSuccess' : function(file, data, response) {
//	       将图片回显    data   接收到的是图片名称
                //$("#showImg").attr("src","<%=request.getContextPath()%>"+data);
                var str = '<img style="width:180px;height:200px;border-style:solid;border-width:1px; border-color:black;"src="<%=request.getContextPath()%>'+data+'">';

                $("#hid").val('<%=request.getContextPath()%>'+data);
                $("#showImgDiv22").html(str);

            }

        });

    });
</script>
</body>
</html>
