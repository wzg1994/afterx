<%--
  Created by IntelliJ IDEA.
  User: 王志军
  Date: 2018/1/19
  Time: 21:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div style="float:left">
    <input type="button"  value="新增" onclick="addDialogtotopic()" class="btn btn-primary">
    <input type="button" value="批量删除" onclick="todeletetotopic2()" class="btn btn-primary">
</div>

    <table class="table" id="totopic_table1" border="1"></table>


<script>
    function search(){
        $("#totopic_table1").bootstrapTable("refresh",{'pageNumber':1});
    }
    $(function(){
        $("#totopic_table1").bootstrapTable({
            url:"/querywzjtotopic",
            striped: true,//隔行变色
            showColumns:true,//是否显示 内容列下拉框
            showPaginationSwitch:true,//是否显示 数据条数选择框
            minimumCountColumns:1,//最小留下一个
            showRefresh:true,//显示刷新按钮
            showToggle:true,//显示切换视图

//	          search:true,//是否显示搜索框
//	        searchOnEnterKey:true,//设置为 true时，按回车触发搜索方法，否则自动触发搜索方法
            pagination:true,//开启分页
            paginationLoop:true,//开启分页无限循环
            pageNumber:1,//当前页数
            pageSize:3,//每页条数
            pageList:[3,4,5,10],//如果设置了分页，设置可供选择的页面数据条数。设置为All 则显示所有记录。
            sidePagination:"server",//
            method:'post',//发送请求的方式
            contentType:"application/x-www-form-urlencoded",//必须的否则条件查询时会乱码
            queryParams:function(){
                //               var name= $("#empName").val();
                //               var sex = $("#sex").val();
//	                 alert(name+","+sex);
//	                 return 的数据 是传递到  action类中的参数
                return {
                    page:this.pageNumber,//当前页
                    rows:this.pageSize //每页条数
                }
            },
            columns: [
                {
                    checkbox:true,
                },{
                    field: 'topicid',
                    title: '文章话题编号',
                    idField:true,
                    width: 100
                },{
                    field: 'topictitle',
                    title: '文章话题主题',
                    width: 100
                },{
                    field: 'topiccontent',
                    title: '文章话题内容',
                    width: 100

                },{
                    field: 'topicstarttime',
                    title: '开始时间',
                    width: 100

                },{
                    field: 'topicendtime',
                    title: '结束时间',
                    width: 100

                },{
                    field: 'topicyn',
                    title: '状态',
                    width: 100,
                    formatter: function(value,row,index){
                        if(row.topicyn == 1){
                            return "已通过";
                        }else if(row.topicyn == 2){
                            return "未审核";
                        }else if(row.topicyn == 3){
                            return "未通过";
                        }
                    }

                },{
                    field: '操作',
                    title: '操作',
                    width: 100,
                    formatter: function(value,row,index){
                        return "<input type='button' value='删除' class='btn btn-primary' onclick='todeletetotopic(\""+row.topicid+"\")'>  <input type='button' value='修改' onclick='toupdatetotopic("+row.topicid+")' class='btn btn-primary'>";
                    }
                }]
        })
    })

    //删除
    function todeletetotopic(topicid) {
        $.ajax({
            url:"/todeletetotopic1",
            type:"post",
            data:{"topicid":topicid},
            dataType:"text",
            success:function(data){
                if (data>0) {
                    $("#totopic_table1").bootstrapTable("refresh");
                }
            }
        })
    }
    //新增
function addDialogtotopic(){
    BootstrapDialog.show({
        title: '添加文章话题',
        message: $('<div></div>').load('/toaddtotopic'),
        buttons: [{
            label: '保存',
            action: function(dialog) {
                $.ajax({
                    url:'/addtotopic',
                    type:'post',
                    data:$("#totopic_add").serialize(),
                    dataType:"json",
                    success:function(pager){
                        if(pager > 0){
                            $("#totopic_table1").bootstrapTable("refresh");
                            dialog.close();
                        }
                    },
                    error:function(){
                        alert("程序错误！");
                    }
                })
            }
        }, {
            label: '取消',
            action: function(dialog) {
                dialog.close();
            }
        }]
    });

}
    //批量删除
    function todeletetotopic2(){
        var a=$("#totopic_table1").bootstrapTable("getSelections")
        var str="";
        for (var i = 0; i < a.length; i++) {
            str+=","+a[i].topicid
        }
        ids=str.substr(1);
        $.ajax({
            url:"/todeletetotopic2",
            type:"post",
            data:{"ids":ids},
            dataType:"text",
            success:function(data){
                if (data>0) {
                    $("#totopic_table1").bootstrapTable("refresh");
                }
            }
        })

    }
//修改
function toupdatetotopic(topicid) {
    BootstrapDialog.show({
        title: '修改文章话题',
        message: $('<div></div>').load('/toupdatetotopic?topicid='+topicid),
        buttons: [{
            label: '保存',
            action: function(dialog) {
                $.ajax({
                    url:'/updatetotopic',
                    type:'post',
                    data:$("#totopic_update").serialize(),
                    dataType:"json",
                    success:function(pager){
                        if(pager > 0){
                            $("#totopic_table1").bootstrapTable("refresh");
                            dialog.close();
                        }
                    },
                    error:function(){
                        alert("程序错误！");
                    }
                })
            }
        }, {
            label: '取消',
            action: function(dialog) {
                dialog.close();
            }
        }]
    });
}










</script>
</body>
</html>
