<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2018/1/24
  Time: 21:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
${kk}
<input type="hidden" name="id" value="${kk}" id="gg">
<div id="stu-com"></div>
<script type="text/javascript">

    function search(){
        $("#stu-com").bootstrapTable("refresh",{'pageNumber':1});
    }

    $(function(){
        $("[name='datet']").datetimepicker({
            format: 'yyyy-mm-dd'
        });
        var ff=$("#gg").val()
        $("#stu-com").bootstrapTable({
            url:"quecnt?picid="+ff,
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
                    title: '编号',
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
                    field: 'photourl',
                    title: '图片',
                    width: 100,
                    formatter: function(value,row,index){
                        var str = '<img src="'+row.photourl+'" width="100px" height="100px" >';
                        return str;
                    }
                },{
                    field: 'username',
                    title: '评论用户',
                    width: 100
                }]
        })
    })
</script>
</body>
</html>
