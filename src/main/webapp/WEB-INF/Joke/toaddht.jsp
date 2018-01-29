<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2018/1/24
  Time: 15:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Title</title>
</head>
<body>

<form id="addht" method="post">
 <input type="hidden" name="likecount" value="0">
文章内容：<textarea name="content" rows="6" cols="30" id="a3"></textarea><br>
状态：<input type="radio" name="picyn" value="1">√
    <input type="radio" name="picyn" value="2">×<br>
文章类型：<select name="typeid" id="a1">
    <c:forEach items="${mlist}" var="m">
             <option value="${m.id}">${m.text}</option>
    </c:forEach>
          </select><br>
图片组：<select name="groupid" id="a2">
    <c:forEach items="${plist}" var="p">
    <option value="${p.picgroupid}">${p.groupname}</option>
    </c:forEach>
        </select>
 <input type="button" value="提交" onclick="bb()">
</form>
<script>
    function bb () {
        $.ajax({
            url:"addht",
            type:"post",
            data:$("#addht").serialize(),
            dataType:"text",
            success:function(){
                alert("成功")
                $("#a1").val("")
                $("#a2").val("")
                $("#a3").val("")

            },
            error:function(){
                alert("系统错误")
            }
        })
    }
</script>
</body>
</html>
