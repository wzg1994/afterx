<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>toselmenu</title>
</head>
<body>
<table class="table" id="menu-table" border="1"></table>
<script !src="">
    function search(){
        $("#menu-table").bootstrapTable("refresh",{'pageNumber':1});
    }
    $(function(){
        $("#menu-table").bootstrapTable({
            url:"selmenu",
            striped: true,//隔行变色
            showColumns:true,//是否显示 内容列下拉框
            showPaginationSwitch:true,//是否显示 数据条数选择框
            minimumCountColumns:1,//最小留下一个
            showRefresh:true,//显示刷新按钮
            showToggle:true,//显示切换视图

//          search:true,//是否显示搜索框
//        searchOnEnterKey:true,//设置为 true时，按回车触发搜索方法，否则自动触发搜索方法
            pagination:true,//开启分页
            paginationLoop:true,//开启分页无限循环
            pageNumber:1,//当前页数
            pageSize:20,//每页条数
            pageList:[1,2,3,4],//如果设置了分页，设置可供选择的页面数据条数。设置为All 则显示所有记录。
            sidePagination:"server",//
            method:'post',//发送请求的方式
            contentType:"application/x-www-form-urlencoded",//必须的否则条件查询时会乱码
            queryParams:function(){
                var name= $("#empName").val();
                var sex = $("#sex").val();
//                 alert(name+","+sex);
//                 return 的数据 是传递到  action类中的参数
                return {
                    "emp.empname":name,
                    "emp.sex":sex,
                    page:this.pageNumber,//当前页
                    rows:this.pageSize //每页条数
                }
            },
            columns: [
                {
                    checkbox:true,
                },{
                    field: 'id',
                    title: '菜单编号',
                    idField:true,
                    width: 100
                },{
                    field: 'text',
                    title: '菜单名称',
                    width: 100
                }]
        })
    })
</script>
</body>
</html>
