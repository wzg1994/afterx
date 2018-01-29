<%--
  Created by IntelliJ IDEA.
  User: 王志军
  Date: 2018/1/20
  Time: 20:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div style="float:left">
    <input type="button"  value="新增广告" onclick="addAdvertising()" class="btn btn-primary">
    <input type="button" value="批量删除" onclick="todeleteAdvertising2()" class="btn btn-primary">
</div>
<table class="table" id="Advertising_table" border="1"></table>


<script>
    function search(){
        $("#Advertising_table").bootstrapTable("refresh",{'pageNumber':1});
    }

    $(function(){
        $("[name='time']").datetimepicker({
            format: 'yyyy-mm-dd'
        });

        $("#Advertising_table").bootstrapTable({
            url:"/queryAdvertising",
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
                {checkbox:true,},
                {field: 'advertisingid', title: '广告编号', idField:true, width: 100},
                {field: 'advertisingtitle', title: '主题', width: 100},
                {field: 'advertisingcontent', title: '内容', width: 100},
                {field: 'advertisingimg', title: '图片', width: 100,
                     formatter: function(value,row,index){
                         var aas="<img src='"+row.advertisingimg+"' height='80px' width='80px'>";
                         return aas;
                     }
                 },
                {field: 'advertisingcyn', title: '状态', width: 100,
                    formatter: function(value,row,index){
                        if(row.advertisingcyn == 1){
                            return "已发布";
                        }else if(row.advertisingcyn == 2){
                            return "未发布";
                        }else if(row.advertisingcyn == 3){
                            return "已下架";
                        }
                    }
                },
                {field: '操作', title: '操作', width: 100,
                    formatter: function(value,row,index) {
                        if (row.advertisingcyn == 1) {
                            return "<input type='button' value='删除' class='btn btn-primary' onclick='todeleteAdvertising(" + row.advertisingid + ")'>  <input type='button' value='修改' class='btn btn-primary' onclick='toupdateAdvertising(\"" + row.advertisingid + "\")'>  <input type='button' value='下架' class='btn btn-primary' onclick='toxiajia("+row.advertisingid+")'>";
                        } else {
                            return "<input type='button' value='删除' class='btn btn-primary' onclick='todeleteAdvertising(" + row.advertisingid + ")'>  <input type='button' value='修改' class='btn btn-primary' onclick='toupdateAdvertising(\"" + row.advertisingid + "\")'>  <input type='button' value='发布' class='btn btn-primary' onclick='tofabu("+row.advertisingid+")'>";
                        }
                    }
                }]
        })
    })

    //删除
    function todeleteAdvertising(advertisingid) {
        $.ajax({
            url:"/todeleteAdvertising1",
            type:"post",
            data:{"advertisingid":advertisingid},
            dataType:"text",
            success:function(data){
                if (data>0) {
                    $("#Advertising_table").bootstrapTable("refresh");
                }
            }
        })
    }

    function toxiajia(advertisingid) {
        $.ajax({
            url:"/updatetoxiajia",
            type:"post",
            data:{"advertisingid":advertisingid},
            dataType:"text",
            success:function(data){
                if (data>0) {
                    $("#Advertising_table").bootstrapTable("refresh");
                }
            }
        })
    }

    function tofabu(advertisingid) {
        $.ajax({
            url:"/updatetofabu",
            type:"post",
            data:{"advertisingid":advertisingid},
            dataType:"text",
            success:function(data){
                if (data>0) {
                    $("#Advertising_table").bootstrapTable("refresh");
                }
            }
        })
    }

    //批量删除
    function todeleteAdvertising2() {
        var a=$("#Advertising_table").bootstrapTable("getSelections")
        var str="";
        for (var i = 0; i < a.length; i++) {
            str+=","+a[i].advertisingid
        }
        ids=str.substr(1);
        $.ajax({
            url:"/todeleteAdvertising2",
            type:"post",
            data:{"ids":ids},
            dataType:"text",
            success:function(data){
                if (data>0) {
                    $("#Advertising_table").bootstrapTable("refresh");
                }
            }
        })

    }
    //新增
function addAdvertising() {
    BootstrapDialog.show({
        title: '添加广告',
        message: $('<div></div>').load('/toaddAdvertising'),
        buttons: [{
            label: '保存',
            action: function(dialog) {
                $.ajax({
                    url:'/addAdvertising',
                    type:'post',
                    data:$("#Advertising_add").serialize(),
                    dataType:"json",
                    success:function(pager){
                        if(pager > 0){
                            $("#Advertising_table").bootstrapTable("refresh");
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
    //修改
function toupdateAdvertising(advertisingid) {
    BootstrapDialog.show({
        title: '修改广告',
        message: $('<div></div>').load('/toupdateAdvertising?advertisingid='+advertisingid),
        buttons: [{
            label: '保存',
            action: function(dialog) {
                $.ajax({
                    url:'/updateAdvertising',
                    type:'post',
                    data:$("#Advertising_update").serialize(),
                    dataType:"json",
                    success:function(pager){
                        if(pager > 0){
                            $("#Advertising_table").bootstrapTable("refresh");
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
