<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/19
  Time: 20:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<br>
<input type="button"  value="新增主播" onclick="addDialog()">
<table class="table" id="zhubo_table" border="1"></table>
<script>

    $(function(){
        $("#zhubo_table").bootstrapTable({
            url:"/queryZhuBo",
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
                    field: 'zhuboid',
                    title: 'id',
                    idField:true,
                    width: 60
                },{
                    field: 'zhuboname',
                    title: '主播名字',
                    width: 100
                },{
                    field: 'idcard',
                    title: '省份证',
                    width: 100

                },{
                    field: 'loginname',
                    title: '昵称',
                    width: 100

                },{
                    field: 'loginpass',
                    title: '密码',
                    width: 100

                }/*,{
                    field: '操作',
                    title: '操作',
                    width: 100,
                    formatter: function(value,row,index){
                        return "<input type='button' value='删除' class='btn btn-primary' onclick='todeletetoarticle(\""+row.articleid+"\")'>";
                    }
                }*/]
        })
    })

    function addDialog(){
        BootstrapDialog.show({
            title: '新增员工',
            message: $('<div></div>').load('/toaddZhubo'),
            buttons: [{
                label: '保存',
                action: function(dialog) {
                    $.ajax({
                        url:'addZhubo',
                        type:'post',
                        data:$("#addpowerForm").serialize(),
                        dataType:'text',
                        success:function(a){
                            if (a>0) {
                               $("#zhubo_table").bootstrapTable("refresh");
                                dialog.close();
                            }
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
