<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>
<input type="button"  value="一键删除投诉" onclick="deDialog2()">
<input type='button' value='一键回复评论' onclick='Hui2()'>
<center>
    用户名: <INPUT TYPE="text" id="suggestid1"><br>
    投诉时间: <input class="Wdate" type="text" id="date1" onclick="WdatePicker()"/>-
    <input class="Wdate" type="text"id="date2" onclick="WdatePicker()"/><br>
    <INPUT TYPE="button" value="搜索" onclick="search2()">
</center>
<table class="table" id="stu-tableA2" border="1"></table>
<script type="text/javascript" src="js/My97DatePicker/WdatePicker.js"></script>
<script type="text/javascript">

    function Hui2(){
        var  b=$("#stu-tableA2").bootstrapTable('getSelections')
        var str=[];
        for (var i = 0; i < b.length; i++) {
            str.push(b[i].userides);
        }
        if (str!="" && str!=null) {
            var bbb = confirm("你确定要评论吗？");
            if (bbb) {
                BootstrapDialog.show({
                    title: '添加评论',
                    message: $('<div></div>').load('PingLuns'),
                    buttons: [{
                        label: '保存',
                        action: function(dialog) {
                            $.ajax({
                                url:'insertAdds?qid[]='+str,
                                type:'post',
                                data:$("#myforms").serialize(),
                                dataType:'text',
                                success:function(a){
                                    if (a>0) {
                                        $("#stu-tableA2").bootstrapTable("refresh");
                                        dialog.close();
                                    }
                                },

                            });
                        }
                    }, {
                        label: '取消',
                        action: function(dialog) {
                            dialog.close();
                            //更改弹框标题
//                 dialog.setTitle('Title 2');
                        }
                    }]
                });

            }

        }else {
            alert('请先选择要回复的内容');
        };
    };

    function search2(){
        $("#stu-tableA2").bootstrapTable("refresh",{'pageNumber':1});
    }

    $("#stu-tableA2").bootstrapTable({
        url:"queryStuPage?xx=2",
        striped: true,//隔行变色
        showColumns:true,//是否显示 内容列下拉框
        showPaginationSwitch:true,//是否显示 分页工具栏
        minimumCountColumns:1,//最小留下一个
        showRefresh:true,//显示刷新按钮
        showToggle:true,//显示切换视图
        //search:true,//是否显示搜索框
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
//	             alert(name+",                          "+sex);
//	             return 的数据 是action类中的参数传递到


            var str = params.search;
            return {
                stuname:str,//搜索框
                usernames:$("#suggestid1").val(),
                date1:$("#date1").val(),
                date2:$("#date2").val(),
                //ttype:$("[name='claids'] option:selected").val(),
                page:this.pageNumber,//当前页
                rows:this.pageSize //每页条数
            }
        },
        columns: [
            {
                checkbox:true,
            },{
                field: 'suggestid',
                title: '编号',
                idField:true,
                width: 100
            },{
                field: 'usernames',
                title: '用户名称',
                width: 100
            },{
                field: 'suggestmsg',
                title: '投诉内容',
                width: 100
            },{
                field: 'time',
                title: '投诉时间',
                width: 100
            }]
    })

    function deDialog2(){
        var  b=$("#stu-tableA2").bootstrapTable('getSelections')
        var str=[];
        var jj=[];
        for (var i = 0; i < b.length; i++) {
            str.push(b[i].suggestid);
        }
        for (var i = 0; i < b.length; i++) {
            jj.push(b[i].userides);
        }

        if (str!="" && str!=null) {
            var bbb = confirm("确定要删除吗？");
            if (bbb) {
                $.post('deleteTouSu',{'qid':str,'qqid':jj},function(data){

                    if (data == "0")
                        alert("删除失败！");
                    else {

                        $("#stu-tableA2").bootstrapTable("refresh");

                    }
                });
            }

        }else {
            alert('请先选择要删除的内容');
        };
    }

</script>
</body>
</html>