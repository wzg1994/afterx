<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2018/1/24
  Time: 14:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<input type="button" value="删除" onclick="deDialog()">
<div id="stu-ht"></div>
<script type="text/javascript">

    function search(){
        $("#stu-ht").bootstrapTable("refresh",{'pageNumber':1});
    }

    $(function(){
        $("[name='datet']").datetimepicker({
            format: 'yyyy-mm-dd'
        });
        $("#stu-ht").bootstrapTable({
            url:"queht",
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
                    field: 'pictopicid',
                    title: '文章编号',
                    idField:true,
                    width: 100
                },{
                    field: 'content',
                    title: '内容',
                    width: 100
                },{
                    field: 'text',
                    title: '类型',
                    width: 100
                },{
                    field: 'likecount',
                    title: '点赞数量',
                    width: 100
                },{
                    field: 'picyn',
                    title: '状态',
                    width: 100,
                    formatter: function(value,row,index){
                        if(row.picyn==1){
                            return "<font color='#006400'>√</font>";
                        }else if(row.picyn==2){
                            return "<font color='#b22222'>×</font>";
                        }
                    }
                },{
                    field: 'picid',
                    title: '图片组',
                    width: 100,  //imgid
                    formatter: function(value,row,index){
                        return "<a href='javascript:zc(\""+row.picid+"\")'>查看图片<a>";
                    }
                },{
                    field: 'pictopicid',
                    title: '查看评论',
                    width: 100,  //imgid
                    formatter: function(value,row,index){
                        return "<a href='javascript:pl(\""+row.pictopicid+"\")'>查看评论<a>";
                    }
                }]
        })
    })


    function zc(id){
        BootstrapDialog.show({
            title: '查看',
            message: $('<div></div>').load('selectimgs?ss='+id),
            buttons: [{
                label: '取消',
                action: function(dialog) {
                    dialog.close();
                }
            }]
        });
    }

    function pl(pids){
        BootstrapDialog.show({
            title: '查看',
            message: $('<div></div>').load('quecoment?kk='+pids),
            buttons: [{
                label: '取消',
                action: function(dialog) {
                    dialog.close();
                }
            }]
        });
    }

    function deDialog(){
        var  b=$("#stu-ht").bootstrapTable('getSelections')
        var str=[];
        for (var i = 0; i < b.length; i++) {
            str.push(b[i].pictopicid);
        }
        if (str!='' && str!=null) {
            var bbb = confirm("确定要删除吗？");
            if (bbb) {
                $.post('delht',{'pictopicid':str},function(data){
                    $("#stu-ht").bootstrapTable("refresh");
                });
            }
        }else {
            $.messager.alert('警告','请先选择要删除的内容');
        };
    }
</script>
</body>
</html>
