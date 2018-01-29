<%--
  Created by IntelliJ IDEA.
  User: 王志军
  Date: 2018/1/19
  Time: 18:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<input type="button" value="批量删除" onclick="todeletetoarticle2()" class="btn btn-primary">

        <table class="table" id="article_table" border="1"></table>

        <script>
            function search(){
                $("#article_table").bootstrapTable("refresh",{'pageNumber':1});
            }

            $(function(){
                $("[name='time']").datetimepicker({
                    format: 'yyyy-mm-dd'
                });

                $("#article_table").bootstrapTable({
                    url:"/querytoarticle",
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
                            field: 'articleid',
                            title: '文章编号',
                            idField:true,
                            width: 100
                        },{
                            field: 'articletitle',
                            title: '文章主题',
                            width: 100
                        },{
                            field: 'usernickname',
                            title: '用户昵称',
                            width: 100

                        },{
                            field: 'articlecontent',
                            title: '文章内容',
                            width: 100

                        },{
                            field: 'time',
                            title: '上传时间',
                            width: 100

                        },{
                            field: 'topictitle',
                            title: '文章话题标题',
                            width: 100

                        },{
                            field: 'articleimg',
                            title: '文章对应图片',
                            width: 100

                        },{
                            field: '操作',
                            title: '操作',
                            width: 100,
                            formatter: function(value,row,index){
                                return "<input type='button' value='删除' class='btn btn-primary' onclick='todeletetoarticle(\""+row.articleid+"\")'>";
                            }
                        }]
                })
            })

            //删除
            function todeletetoarticle(articleid) {
                $.ajax({
                    url:"/todeletetoarticle1",
                    type:"post",
                    data:{"articleid":articleid},
                    dataType:"text",
                    success:function(data){
                        if (data>0) {
                            $("#article_table").bootstrapTable("refresh");
                        }
                    }
                })
            }
//批量删除
        function todeletetoarticle2() {
            var a=$("#article_table").bootstrapTable("getSelections")
            var str="";
            for (var i = 0; i < a.length; i++) {
                str+=","+a[i].articleid
            }
            ids=str.substr(1);
            $.ajax({
                url:"/todeletetoarticle2",
                type:"post",
                data:{"ids":ids},
                dataType:"text",
                success:function(data){
                    if (data>0) {
                        $("#article_table").bootstrapTable("refresh");
                    }
                }
            })
        }



        </script>

</body>
</html>
