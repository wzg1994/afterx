<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>
<input type="button"  value="删除" onclick="deDialog()">
<div id="stu-table"></div>
<div id="ck"></div>
<script type="text/javascript">

    function search(){
        $("#stu-table").bootstrapTable("refresh",{'pageNumber':1});
    }

    $(function(){
        $("[name='datet']").datetimepicker({
            format: 'yyyy-mm-dd'
        });

        $("#stu-table").bootstrapTable({
            url:"queryjoke",
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
            pageSize:3,//每页条数
            pageList:[5,8,10],//如果设置了分页，设置可供选择的页面数据条数。设置为All 则显示所有记录。
            sidePagination:"server",//
            method:'post',//发送请求的方式
            contentType:"application/x-www-form-urlencoded",//必须的否则条件查询时会乱码
            queryParams:function(params){
                console.info(params.search);
//	            var name= $("#empName").val();
//	             var sex = $("#sex").val();
//	             alert(name+","+sex);
//	             return 的数据 是传递到  action类中的参数


                var str = params.search;
                return {
                    stuname:str,//搜索框
                    tname:$("#clan").val(),
                    ttype:$("[name='claids'] option:selected").val(),
                    page:this.pageNumber,//当前页
                    rows:this.pageSize //每页条数
                }
            },
            columns: [
                {
                    checkbox:true,
                },{
                    field: 'jokeid',
                    title: '编号',
                    idField:true,
                    width: 100
                },{
                    field: 'joketitle',
                    title: '标题',
                    width: 100
                },{
                    field: 'joketime',
                    title: '时间',
                    width: 100
                },{
                    field: 'jokecontent',
                    title: '内容',
                    width: 100
                },{
                    field: 'text',
                    title: '类型',
                    width: 100
                },{
                    field: 'jokeyn',
                    title: '状态',
                    width: 100,
                    formatter: function(value,row,index){
                        if(row.jokeyn==1){
                            return "<font color='#006400'>通过</font>";
                        }else if(row.jokeyn==2){
                            return "<font color='#b22222'>未通过</font>";
                        }

                    }
                },{
                    field: 'jokeid',
                    title: '详细',
                    width: 100,
                    formatter: function(value,row,index){
                        var input = "<input type='button' value='查看' onclick='quejoke(\""+row.jokeid+"\")'>";
                        return input;
                    }
                }]
        })
    })

    function deDialog(){
        var  b=$("#stu-table").bootstrapTable('getSelections')
        var str=[];
        for (var i = 0; i < b.length; i++) {
            str.push(b[i].jokeid);
        }
        if (str!='' && str!=null) {
            var bbb = confirm("确定要删除吗？");
            if (bbb) {
                $.post('deljoke',{'jokeid':str},function(data){
                        $("#stu-table").bootstrapTable("refresh");
                });
            }
        }else {
            $.messager.alert('警告','请先选择要删除的内容');
        };
    }

    function quejoke(id){
        BootstrapDialog.show({
            title: '查看',
            message: $('<div></div>').load('quejoke?jokeid='+id),
            buttons: [{
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