<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="My97/WdatePicker.js"></script>
</head>
<body>
<form id="addjoke">
标题：<input type="text" name="joketitle" id="a1"><br>
时间：<input  class="Wdate"  type="text"  name="jokedate" onClick="WdatePicker()" id="a2"><br>
内容：<textarea name="jokecontent" rows="6" cols="30" id="a3"></textarea><br>
类型：<select name="typeid" id="a4">
    <option value="">-请选择-</option>
     <option value="18">各种口味</option>
    <option value="19">少儿不宜</option>
    <option value="20">校园趣闻</option>
    <option value="21">超级内涵</option>
    <option value="22">贴近生活</option>
    <option value="23">图片笑话</option>


    </select><br>
状态：<input type="radio" name="jokeyn" value="1" >通过
      <input type="radio" name="jokeyn" value="2" >未通过<br>
   <input type="button" value="提交" onclick="aa()">
</form>
<script>
    function aa () {
    $.ajax({
        url:"addjoke",
        type:"post",
        data:$("#addjoke").serialize(),
        dataType:"text",
        success:function(){
            alert("成功")
            $("#a1").val("")
            $("#a2").val("")
            $("#a3").val("")
            $("#a4").val("")
            $("#a5").val("")
        },
        error:function(){
            alert("系统错误")
        }
    })
    }
</script>
</body>
</html>
