<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/30
  Time: 14:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<button type="button" class="btn btn-default" onclick="addgift()">新增礼物</button>
<table class="table" id="gift-table" border="1"></table>
<script>
    function search(){
        $("#gift-table").bootstrapTable("refresh",{'pageNumber':1});
    }

    $(function(){


        $("#gift-table").bootstrapTable({
            url:"queryGift",
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
            pageSize:2,//每页条数
            pageList:[1,2,3,4],//如果设置了分页，设置可供选择的页面数据条数。设置为All 则显示所有记录。
            sidePagination:"server",//
            method:'post',//发送请求的方式
            contentType:"application/x-www-form-urlencoded",//必须的否则条件查询时会乱码
            queryParams:function(params){
                var str = params.search;
                return {
                    page:this.pageNumber, //当前页
                    rows:this.pageSize //每页条数
                }
            },
            columns: [
                {
                    checkbox:true,
                },{
                    field: 'giftname',
                    title: '礼物名称',
                    width: 100
                },
                {
                    field: 'giftprice',
                    title: '礼物所需积分',
                    width: 100
                },
                {
                    field: 'giftcount',
                    title: '礼物库存',
                    width: 100
                },
                {
                    field: 'giftimg',
                    title: '礼物图片',
                    width: 100,
                    formatter: function(value,row,index){
                        var gifimg = '<img src="'+row.giftimg+'" height="50px" width="50px"/>';
                        return gifimg;

                    },

                },
                {
                    field: 'giftid',
                    title: '操作',
                    idField:true,
                    width: 100,
                    formatter: function(value,row,index){
                    var upbt = '<button type="button" class="btn btn-info" onclick="upgift('+row.giftid+')">修改</button><button type="button" class="btn btn-info" onclick="delgift('+row.giftid+')">删除</button>';
                    return upbt;

                    },

                }
            ]
        })
    })
    
    function upgift(id) {
        BootstrapDialog.show({
            title: '修改礼物信息',
            message: $('<div></div>').load('toupgift?giftid='+id),
            buttons: [{
                label: '保存',
                action: function(dialog) {
                    $.ajax({
                        url:"updateGift",
                        type:"post",
                        data:$("#giFm").serialize(),
                        dataType:"text",
                        success:function(aaa){
                            if(aaa==1){
                                dialog.close();
                                $("#gift-table").bootstrapTable("refresh");
                            }
                        }
                    })

                }
            }, {
                label: '取消',
                action: function(dialog) {
                    dialog.close();
                    //更改弹框标题
//	                 dialog.setTitle('Title 2');
                }
            }]
        });
    }
    function addgift() {
        BootstrapDialog.show({
            title: '添加礼物',
            message: $('<div></div>').load('toaddgift'),
            buttons: [{
                label: '保存',
                action: function(dialog) {
                    $.ajax({
                        url:"addGift",
                        type:"post",
                        data:$("#addGFM").serialize(),
                        dataType:"text",
                        success:function(aaa){
                            if(aaa==1){
                                dialog.close();
                                $("#gift-table").bootstrapTable("refresh");
                            }
                        }
                    })
                }
            }, {
                label: '取消',
                action: function(dialog) {
                    dialog.close();
                    //更改弹框标题
//	                 dialog.setTitle('Title 2');
                }
            }]
        });
    }

    function delgift(id) {
        $.ajax({
            url:"deleteGift",
            type:"post",
            data:{"giftid":id},
            dataType:"text",
            success:function(aaa){
                if(aaa==1){
                    $("#gift-table").bootstrapTable("refresh");
                }
            }
        })
    }
</script>
</body>
</html>
