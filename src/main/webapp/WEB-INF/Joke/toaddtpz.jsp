
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<form id="tpz" method="post">
   名称：<input type="text" name="groupname"><br>
   类型：<select name="grouptype" >
    <c:forEach items="${mlist}" var="m">
        <option value="${m.id}">${m.text}</option>
    </c:forEach>
   </select><br>
   选择图片：<c:forEach items="${hlist}" var="c">
   <input type="checkbox" name="photoid" value="${c.photoid}"><img src="${c.photourl}"  width='100px' height='100px'>
  </c:forEach>
    <input type="hidden" name="picid" id="pic">
    <input type="hidden" name="imgid" value="12">
    <input type="button" value="确定选择这些图片" onclick="hh()">
</form>
<script>

    function  hh() {
        var hobArr =  document.getElementsByName("photoid");
        var pt="";
        for(var i=0;i<hobArr.length;i++){
            if(hobArr[i].checked){
                pt+=","+hobArr[i].value
            }
        }
        var op = pt.substr(1);

        $("#pic").val(op)
    }
</script>
</body>
</html>
