<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>
<table class="table" id="stu-tableAQ2" border="1"></table>
<script type="text/javascript" src="js/My97DatePicker/WdatePicker.js"></script>
<script type="text/javascript">

    function Xiang(id){
                BootstrapDialog.show({
                    title: '详情信息',
                    message: $('<div></div>').load('Xiangqings?voiceid='+id+''),
                    buttons: [{
                        label: '取消',
                        action: function(dialog) {
                            dialog.close();
                            //更改弹框标题
                        }
                    }]
                });
    };

    function search2(){
        $("#stu-tableAQ2").bootstrapTable("refresh",{'pageNumber':1});
    }

    $("#stu-tableAQ2").bootstrapTable({
        url:"querySelects",
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
            var str = params.search;
            return {
                stuname:str,//搜索框
                page:this.pageNumber,//当前页
                rows:this.pageSize //每页条数
            }
        },
        columns: [
            {
                checkbox:true,
            },{
                field: 'voiceid',
                title: '话题编号',
                idField:true,
                width: 100
            },{
                field: 'voicetitle',
                title: '话题标题',
                width: 100
            },{
                field: 'boname',
                title: '主播名称',
                width: 100
            },{
                field: 'neirongs',
                title: '话题内容',
                width: 100,
                formatter:function(value,row,index){
                    var t="";
                    if (value.length>8) {
                        t=value.substring(0,7)+"......";
                        return t;
                    }else{
                        t=value;
                        return t;
                    }
                }
            },{
                field: 'voicimg',
                title: '话题封面',
                width: 100,
                formatter:function(value,row,index){
                   return "<IMG src='value' HEIGHT='50' WIDTH='50'>";
                }
            },{
                field: 'vurls',
                title: 'Music',
                width: 100,
                formatter:function(value,row,index){
                    return "<input type='button' value='播放内容' onclick='speckText(\""+row.neirongs+"\")'>";
                }
            },{
                field: '详情',
                title: '详情',
                width: 100,
                formatter:function(value,row,index){
                    return "<input type='button' value='详情' onclick='Xiang("+row.voiceid+")'>";
                }
            }]
    })

   function speckText(str){
        alert(str);
        var url = "http://tts.baidu.com/text2audio?lan=zh&ie=UTF-8&text="+str+""

        var n = new Audio(url);
        n.src = url;
        n.play();

    }
</script>
</body>
</html>