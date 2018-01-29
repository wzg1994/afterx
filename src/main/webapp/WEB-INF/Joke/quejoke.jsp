<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${ss}" var="c">
    <h1>当前点赞数量：<font color="#dc143c">${c.counts}</font></h1>
<input type="hidden" value="${c.jokeid}" id="gg">
</c:forEach>
<div id="stu-ck"></div>
<script type="text/javascript">

    function search(){
        $("#stu-table").bootstrapTable("refresh",{'pageNumber':1});
    }

    $(function(){
        $("[name='datet']").datetimepicker({
            format: 'yyyy-mm-dd'
        });
        var ff=$("#gg").val()
        $("#stu-ck").bootstrapTable({
            url:"queryck",
            striped: true,//隔行变色
            showColumns:true,//是否显示 内容列下拉框
            showPaginationSwitch:true,//是否显示 分页工具栏
            minimumCountColumns:1,//最小留下一个
            showRefresh:true,//显示刷新按钮
            showToggle:true,//显示切换视图
            search:false,//是否显示搜索框
            searchOnEnterKey:true,//设置为 true时，按回车触发搜索方法，否则自动触发搜索方法
            pagination:true,//开启分页
            paginationLoop:true,//开启分页无限循环
            pageNumber:1,//当前页数
            pageSize:3,//每页条数
            pageList:[5,8,10],//如果设置了分页，设置可供选择的页面数据条数。设置为All 则显示所有记录。
            sidePagination:"server",//
            method:'post',//发送请求的方式
            contentType:"application/x-www-form-urlencoded",//必须的否则条件查询时会乱码
            queryParams:function(params){
                console.info(params.search);
                var str = params.search;
                return {
                    stuname:str,//搜索框
                    joke:$("#gg").val(),
                    ttype:$("[name='claids'] option:selected").val(),
                    page:this.pageNumber,//当前页
                    rows:this.pageSize //每页条数
                }
            },
            columns: [
                {
                    checkbox:true,
                },{
                    field: 'id',
                    title: '评论编号',
                    idField:true,
                    width: 100
                },{
                    field: 'content',
                    title: '内容',
                    width: 100
                },{
                    field: 'time',
                    title: '时间',
                    width: 100
                },{
                    field: 'status',
                    title: '状态',
                    width: 100,
         formatter: function(value,row,index){
             if(row.status==1){
                 return "<font color='#006400'>√</font>";
             }else if(row.status==2){
                 return "<font color='#b22222'>×</font>";
             }
         }
                },{
                    field: 'username',
                    title: '用户',
                    width: 100
                }]
        })
    })
</script>
</body>
</html>