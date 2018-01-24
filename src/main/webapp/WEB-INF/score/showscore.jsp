<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/23
  Time: 14:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table class="table" id="score-table" border="1"></table>
<script>
    function search(){
        $("#score-table").bootstrapTable("refresh",{'pageNumber':1});
    }

    $(function(){


        $("#score-table").bootstrapTable({
            url:"queryScore",
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
                    field: 'username',
                    title: '用户名称',
                    width: 100
                },{
                    field: 'userscore',
                    title: '用户积分',
                    width: 100
                },{
                    field: 'userid',
                    title: '操作',
                    width: 100,
                    formatter: function(value,row,index){


                        var czbt = '<button type="button" class="btn btn-default" onclick="addscore('+row.userid+')">添加积分</button>';



                        return czbt;

                    }
                }

            ]
        })
    })
//$("#scorenum").val()
    function addscore(id){
        BootstrapDialog.show({
            title: '添加积分',
            message: $('<div></div>').load('toadduserscore'),
            buttons: [{
                label: '保存',
                action: function(dialog) {
                    var reg = /^[0-9]{1,4}$/;
                    if(reg.test($("#scorenum").val())){
                        $.ajax({
                            url:"addScore",
                            type:"post",
                            data:{"userid":id,"uscount":$("#scorenum").val()},
                            dataType:"text",
                            success:function(aaa){
                                if(aaa==1){
                                    dialog.close();
                                    $("#score-table").bootstrapTable("refresh");
                                }
                            }
                        })
                    }else{
                        $("#msg").html("<font color='red'>必须为数字</font>")
                    }
                }
            }, {
                label: '取消',
                action: function(dialog) {
                    dialog.close();
                    //更改弹框标题
//	                 dialog.setTitle('Title 2');
                }
            }]
        });
    }
</script>
</body>
</html>
