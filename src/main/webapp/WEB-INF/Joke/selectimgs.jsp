<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2018/1/23
  Time: 21:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<input type="hidden" value="${aa}" id="ss">
<c:forEach items="${phlist}" var="c">
   <a href="javascript:aa(${c.photoid})"><img src="${c.photourl}"  width='150px' height='150px'></a>
</c:forEach>
<script>
    function aa(id){
        $.ajax({
            url:"upimg?imgid="+id+"&picgroupid="+$("#ss").val(),
            type:"post",
            dataType:"text",
            success:function(){
                alert("成功")
                $("#stu-imgs").bootstrapTable("refresh");

            },
            error:function(){
                alert("系统错误")
            }
        })
    }
</script>
</body>
</html>
