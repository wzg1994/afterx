<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/19
  Time: 19:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<button type="button" class="btn btn-success" onclick="piUpart()">批量通过</button>
<table class="table" id="top-table" border="1"></table>
       <INPUT TYPE="hidden" id="jueseid" value="${User.jueseid}">
<script>

    var cc=$("#jueseid").val();
    function search(){
        $("#top-table").bootstrapTable("refresh",{'pageNumber':1});
    }

    $(function(){


        $("#top-table").bootstrapTable({
            url:"queryTop?jueseid="+cc,
            striped: true,//隔行变色
            showColumns:true,//是否显示 内容列下拉框
            showPaginationSwitch:true,//是否显示 分页工具栏
            minimumCountColumns:1,//最小留下一个
            showRefresh:true,//显示刷新按钮
            showToggle:true,//显示切换视图
            search:true,//是否显示搜索框
            searchOnEnterKey:true,//设置为 true时，按回车触发搜索方法，否则自动触发搜索方法
            pagination:true,//开启分页
            paginationLoop:true,//开启分页无限循环
            pageNumber:1,//当前页数
            pageSize:2,//每页条数
            pageList:[1,2,3,4],//如果设置了分页，设置可供选择的页面数据条数。设置为All 则显示所有记录。
            sidePagination:"server",//
            method:'post',//发送请求的方式
            contentType:"application/x-www-form-urlencoded",//必须的否则条件查询时会乱码
            queryParams:function(params){
                var str = params.search;
                return {
                    page:this.pageNumber, //当前页
                    rows:this.pageSize //每页条数
                }
            },
            columns: [
                {
                    checkbox:true,
                },{
                    field: 'topictitle',
                    title: '文章话题标题',
                    width: 100
                },{
                    field: 'topiccontent',
                    title: '文章话题内容',
                    width: 100
                },
                {
                    field: 'topicid',
                    title: '操作',
                    idField:true,
                    width: 100,
                    formatter: function(value,row,index){
                          if (cc==1){
                              var imgbt = '<img src="/img/dui.jpg" height="20px" width="20px" onclick="upartyn('+row.topicid+')"/>&nbsp;&nbsp;<img src="/img/cha.png" height="20px" width="20px" onclick="upartyn2('+row.topicid+')"/>';
                          }else if (cc==2){
                              var imgbt = '<img src="/img/dui.jpg" height="20px" width="20px" onclick="upartyn('+row.topicid+')"/>&nbsp;&nbsp;<img src="/img/cha.png" height="20px" width="20px" onclick="upartyn2('+row.topicid+')"/>';
                          }
                        return imgbt;

                    },

                }
            ]
        })
    })

    function upartyn(id) {

            $.ajax({
                url:'<%=request.getContextPath()%>/upartYn?jueseid='+cc,
                type:'post',
                data:{"topicid":id},
                dataType:'text',
                success:function(flag){
                    if(flag == '1'){
                        alert("审核成功！")
                        $("#top-table").bootstrapTable("refresh");}
                }
            })
    }

    function upartyn2(id) {
        if(confirm("确定将此条设为不通过吗？")){
            $.ajax({
                url:'<%=request.getContextPath()%>/upartYn2',
                type:'post',
                data:{"topicid":id},
                dataType:'text',
                success:function(flag){
                    if(flag == '1'){
                        alert("审核成功！")
                        $("#top-table").bootstrapTable("refresh");}
                }
            })
        }

    }

    function piUpart(){

        var rows =  $("#top-table").bootstrapTable("getSelections");
        var temp ="";
        for (var i = 0; i < rows.length; i++) {
            temp += ","+rows[i].topicid+""
        }
        var ids = temp.substr(1);
        console.info(ids)
        $.ajax({
            url:"<%=request.getContextPath()%>/updatePitop",
            type:"post",
            data:{"topicid":ids},
            dataType:"text",
            success:function(a){
                if(a==1){
                    $("#top-table").bootstrapTable("refresh",{'pageNumber':1});
                }


            },

        })


    }
</script>
</body>
</html>
