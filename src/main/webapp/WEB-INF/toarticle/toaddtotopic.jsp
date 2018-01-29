<%--
  Created by IntelliJ IDEA.
  User: 王志军
  Date: 2018/1/19
  Time: 22:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form id="totopic_add" method="post">
    <table>
        <tr>
            <td>文章话题主题</td>
            <td><input type="text" name="topictitle"></td>
        </tr>
        <tr>
            <td>文章话题内容</td>
            <td>
                <textarea name="topiccontent"></textarea>
            </td>
        </tr>
        <tr>
        <td>开始时间</td>
        <td><input class="Wdate" name="starttime1" onFocus="WdatePicker()"/></td>
    </tr>
        <tr>
        <td>结束时间</td>
        <td><input class="Wdate" name="endtime1" onFocus="WdatePicker()"/></td>
    </tr>

    </table>

    </form>


</body>
</html>
