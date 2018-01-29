<%@ page import="com.jk.pojo.Topic" %><%--
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
    <form id="totopic_update" method="post">
        <input type="hidden" name="topicid" value="${topi.topicid}">
    <table>
        <tr>
            <td>文章话题主题</td>
            <td><input type="text" name="topictitle" value="${topi.topictitle}"></td>
        </tr>
        <tr>
            <td>文章话题内容</td>
            <td>
                <textarea name="topiccontent">${topi.topiccontent}</textarea>
            </td>
        </tr>
        <tr>
        <td>开始时间</td>
        <td><input class="Wdate" name="starttime1" onFocus="WdatePicker()" value="${topi.topicstarttime}"/></td>
    </tr>
        <tr>
        <td>结束时间</td>
        <td><input class="Wdate" name="endtime1" onFocus="WdatePicker()" value="${topi.topicendtime}"/></td>
    </tr>
        </tr>
        <tr>
            <td>状态</td>
            <td>
                <input type="radio" name="topicyn" value="1" ${topi.topicyn==1 ? 'checked':''}/>已通过
                <input type="radio" name="topicyn" value="2" ${topi.topicyn==2 ? 'checked':''}/>未审核
                <input type="radio" name="topicyn" value="3" ${topi.topicyn==3 ? 'checked':''}/>未通过
            </td>
        </tr>
    </table>

    </form>


</body>
</html>
