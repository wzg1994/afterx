<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/23
  Time: 19:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table class="table" id="money-table" border="1"></table>
<script>
    function search(){
        $("#money-table").bootstrapTable("refresh",{'pageNumber':1});
    }

    $(function(){


        $("#money-table").bootstrapTable({
            url:"queryMoney",
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
                    field: 'uname',
                    title: '用户名称',
                    width: 100
                },{
                    field: 'monycount',
                    title: '用户余额',
                    width: 100
                },{
                    field: 'reply',
                    title: '回复',
                    width: 100
                },
                {
                    field: 'time',
                    title: '时间',
                    width: 100
                },
                {
                    field: 'status',
                    title: '状态',
                    width: 100,
                    formatter: function(value,row,index){

                        if(row.status == 1){
                            return "正常";
                        }else if(row.status == 2){
                            return "冻结";
                        }
                    }
                },
                {
                    field: 'userid',
                    title: '操作',
                    width: 100,
                    formatter: function(value,row,index){
                        var yebt = '<button type="button" class="btn btn-default" onclick="upmoneyyn('+row.userid+')">冻结</button>';
                        var yebt2 = '<button type="button" class="btn btn-default" onclick="upmoneyyn2('+row.userid+')">解冻</button>';

                        if(row.status == 1){
                            return yebt
                        }else if(row.status == 2){
                            return yebt2;
                        }
                    }
                }

            ]
        })
    })

    function upmoneyyn(id) {
        $.ajax({
            url:'updateMonyn',
            type:'post',
            data:{"userid":id},
            dataType:'text',
            success:function(flag){
                if(flag == "1"){
                    $("#money-table").bootstrapTable("refresh");
                }
        }
        })
    }

    function upmoneyyn2(id2) {
        $.ajax({
            url:'updateMonyn2',
            type:'post',
            data:{"userid":id2},
            dataType:'text',
            success:function(flag){
                if(flag == "1"){
                    $("#money-table").bootstrapTable("refresh");
                }
            }
        })
    }

</script>
</body>
</html>
