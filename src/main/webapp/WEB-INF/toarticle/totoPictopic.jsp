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
    <%--<input type="button"  value="新增" onclick="addtotoPictopic()" class="btn btn-primary">--%>
    <input type="button" value="批量删除" onclick="todeletetotoPictopic2()" class="btn btn-primary">
</div>
<table class="table" id="totoPictopic_table" border="1"></table>


<script>
    function search(){
        $("#totoPictopic_table").bootstrapTable("refresh",{'pageNumber':1});
    }

    $(function(){
        $("[name='time']").datetimepicker({
            format: 'yyyy-mm-dd'
        });

        $("#totoPictopic_table").bootstrapTable({
            url:"/querytotoPictopic",
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
                {field: 'pictopicid', title: '图片话题编号', idField:true, width: 100},
                {field: 'groupname', title: '图片分组名称', width: 100},
                {field: 'text', title: '类型菜单', width: 100},
                {field: 'content', title: '内容', width: 100},
                {field: 'likecount', title: '喜欢人数', width: 100},
                {field: 'picyn', title: '状态', width: 100,
                    formatter: function(value,row,index){
                        if(row.picyn == 1){
                            return "已通过";
                        }else if(row.picyn == 2){
                            return "未审核";
                        }else if(row.picyn == 3){
                            return "未通过";
                        }
                    }
                },
                {field: '操作', title: '操作', width: 100,
                    formatter: function(value,row,index){
                        return "<input type='button' value='删除' class='btn btn-primary' onclick='todeletetotoPictopic("+row.pictopicid+")'>  ";
                    }
                }]
        })
    })

    //删除
    function todeletetotoPictopic(pictopicid) {
        $.ajax({
            url:"/todeletetotoPictopic1",
            type:"post",
            data:{"pictopicid":pictopicid},
            dataType:"text",
            success:function(data){
                if (data>0) {
                    $("#totoPictopic_table").bootstrapTable("refresh");
                }
            }
        })
    }
//批量删除
function todeletetotoPictopic2() {
    var a=$("#totoPictopic_table").bootstrapTable("getSelections")
    var str="";
    for (var i = 0; i < a.length; i++) {
        str+=","+a[i].pictopicid
    }
    ids=str.substr(1);
    $.ajax({
        url:"/todeletetotoPictopic2",
        type:"post",
        data:{"ids":ids},
        dataType:"text",
        success:function(data){
            if (data>0) {
                $("#totoPictopic_table").bootstrapTable("refresh");
            }
        }
    })

}
//新增

//修改




</script>



</body>
</html>
