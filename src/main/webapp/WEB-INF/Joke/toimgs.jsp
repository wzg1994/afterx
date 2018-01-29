<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="javascript:quejoke()">上传图片</a>
<a href="javascript:addtpz()">添加图片组</a>
<input type="button" value="删除" onclick="deDialog()">

<div id="stu-imgs"></div>
<script>
    function search() {
        $("#stu-imgs").bootstrapTable("refresh", {'pageNumber': 1});
    }
var id="";
    $(function () {
        $("[name='datet']").datetimepicker({
            format: 'yyyy-mm-dd'
        });
        $("#stu-imgs").bootstrapTable({
            url: "queimgs",
            striped: true,//隔行变色
            showColumns: true,//是否显示 内容列下拉框
            showPaginationSwitch: true,//是否显示 分页工具栏
            minimumCountColumns: 1,//最小留下一个
            showRefresh: true,//显示刷新按钮
            showToggle: true,//显示切换视图
            search: false,//是否显示搜索框
            searchOnEnterKey: true,//设置为 true时，按回车触发搜索方法，否则自动触发搜索方法
            pagination: true,//开启分页
            paginationLoop: true,//开启分页无限循环
            pageNumber: 1,//当前页数
            pageSize: 3,//每页条数
            pageList: [5, 8, 10],//如果设置了分页，设置可供选择的页面数据条数。设置为All 则显示所有记录。
            sidePagination: "server",//
            method: 'post',//发送请求的方式
            contentType: "application/x-www-form-urlencoded",//必须的否则条件查询时会乱码
            queryParams: function (params) {
                console.info(params.search);
                var str = params.search;
                return {
                    stuname: str,//搜索框
                    joke: $("#gg").val(),
                    ttype: $("[name='claids'] option:selected").val(),
                    page: this.pageNumber,//当前页
                    rows: this.pageSize //每页条数
                }
            },
            columns: [
                {
                    checkbox: true,
                }, {
                    field: 'picgroupid',
                    title: '图片编号',
                    idField: true,
                    width: 100
                }, {
                    field: 'picid',
                    title: '图片xzx',
                    idField: true,
                    width: 100
                }, {
                    field: 'groupname',
                    title: '名称',
                    width: 100
                }, {
                    field: 'text',
                    title: '类型',
                    width: 100
                }, {
                    field: 'photourl',
                    title: '封面',
                    width: 100,  //imgid
                    formatter: function (value, row, index) {
                        console.info(row.picid)
                        var str = '<a href="javascript:zc(\''+row.picid+'\','+row.picgroupid+')"><img src="'+row.photourl+'" width="150px" height="150px" ></a>';
                        return str;
                    }
                }]
        })
    })

    function deDialog(){
        var  b=$("#stu-imgs").bootstrapTable('getSelections')
        var str=[];
        for (var i = 0; i < b.length; i++) {
            str.push(b[i].picgroupid);
        }
        if (str!='' && str!=null) {
            var bbb = confirm("确定要删除吗？");
            if (bbb) {
                $.post('delimg',{'picgroupid':str},function(data){
                    $("#stu-imgs").bootstrapTable("refresh");
                });
            }
        }else {
            $.messager.alert('警告','请先选择要删除的内容');
        };
    }

    function addtpz() {
        BootstrapDialog.show({
            title: '添加图片组',
            message: $('<div></div>').load('toaddtpz'),
            buttons: [{
                label: '保存',
                action: function (dialog) {
                    $.ajax({
                        url: "addtpz",
                        type: "post",
                        data: $("#tpz").serialize(),
                        dataType: "text",
                        success: function () {
                            alert("成功")
                            dialog.close();
                            $("#stu-imgs").bootstrapTable("refresh");
                        },
                        error: function () {
                            alert("系统错误")
                        }
                    })
                }
            }, {
                label: '取消',
                action: function (dialog) {
                    dialog.close();
                }
            }]
        });
    }

    function quejoke() {
        BootstrapDialog.show({
            title: '查看',
            message: $('<div></div>').load('toupldf'),
            buttons: [{
                label: '保存',
                action: function (dialog) {
                    $.ajax({
                        url: "addimg",
                        type: "post",
                        data: $("#addimg").serialize(),
                        dataType: "text",
                        success: function () {
                            alert("成功")
                            dialog.close();
                        },
                        error: function () {
                            alert("系统错误")
                        }
                    })
                }
            }, {
                label: '取消',
                action: function (dialog) {
                    dialog.close();
                }
            }]
        });
    }

    function zc(id,ids) {
        console.info(id)
        BootstrapDialog.show({
              title: '查看',
              message: $('<div></div>').load("selectimgs?ss="+id+"&aa="+ids),
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
