<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<CENTER>
   <FORM id="formes" method="post" enctype="multipart/form-data">
          <TABLE>
                <tr>
                    <td>话题标题</td>
                    <td><INPUT TYPE="text" name="voicetitle"></td>
                </tr>
              <tr>
                  <td>话题内容</td>
                  <td><TEXTAREA name="neirongs" rows="6" cols="30"></TEXTAREA></td>
              </tr>
              <tr>
                  <td>主播</td>
                  <td>
                      <SELECT name="zhuboid">
                          <c:forEach items="${Zhubo}" var="s">
                              <option value="${s.zhuboid}">${s.zhuboname }</option>
                          </c:forEach>
                      </SELECT>
                  </td>
              </tr>
              <tr>
                  <td>Music</td>
                  <td>
                      <SELECT name="voicefrom">
                          <c:forEach items="${Voice}" var="w">
                              <option value="${w.vid}">${w.vurl }</option>
                          </c:forEach>
                      </SELECT>
                  </td>
              </tr>
              <tr>
                  <td>主播</td>
                  <td>
                      <INPUT TYPE="hidden" name="voicimg" id="ssss">
                      <div id="showBarDiv" ></div>
                      <input type="File" id="imgFileBTN" >
                      <div id="showImgDiv" style="width: 80px;height: 80px;border-style:solid;border-width:1px; border-color:black;"></div>
                  </td>
              </tr>
          </TABLE>
   </FORM>
    <input type="button" value="提交" onclick="adds()">
</CENTER>
   <SCRIPT>
       $(function(){
//文件域的id
           $("#imgFileBTN").uploadify({
               //前台请求后台的url 不可忽略的参数
               'uploader' :"uploadPhotoFilees",
               //插件自带 不可忽略的参数
               'swf' : 'uploadify/uploadify.swf',
               //撤销按钮的图片路径
               'cancelImg' : 'uploadify/uploadify-cancel.png',
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
               'queueID' : 'showBarDiv',
               // action中接收文件的全局变量名
               'fileObjName' : 'artImg',
               'onUploadSuccess' : function(file, data, response) {
//       将图片回显    data   接收到的是图片名称
                   $("#ssss").val(data);
                   var str = '<img style="width:80px;height:80px;border-style:solid;border-width:1px; border-color:black;"src="'+data+'">';
                   $("#showImgDiv").html(str);
               }
           });

       });

       function adds(){
           $.ajax({
               url:'addHuatis',
               type:'post',
               data:$("#formes").serialize(),
               dataType:'text',
               success:function(a){
                   if (a>0) {
                       location.reload();
                   }
               },

           });
       };

   </SCRIPT>
</body>
</html>
