<!DOCTYPE html>
<html lang="en" >

<head>
    <meta charset="UTF-8">
    <title>CSS Login form</title>
    <link rel="stylesheet" href="css/style.css">
    <!-- bootstrap 3.0.2 -->
    <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" />
    <!-- font Awesome -->
    <link href="css/font-awesome.min.css" rel="stylesheet" type="text/css" />
    <!-- Ionicons -->
    <link href="css/ionicons.min.css" rel="stylesheet" type="text/css" />
    <!-- Morris chart -->
    <link href="css/morris/morris.css" rel="stylesheet" type="text/css" />
    <!-- jvectormap -->
    <link href="css/jvectormap/jquery-jvectormap-1.2.2.css" rel="stylesheet" type="text/css" />
    <!-- fullCalendar -->
    <link href="css/fullcalendar/fullcalendar.css" rel="stylesheet" type="text/css" />
    <!-- Daterange picker -->
    <link href="css/daterangepicker/daterangepicker-bs3.css" rel="stylesheet" type="text/css" />
    <!-- bootstrap wysihtml5 - text editor -->
    <link href="css/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css" rel="stylesheet" type="text/css" />
    <!-- Theme style -->
    <link href="css/AdminLTE.css" rel="stylesheet" type="text/css" />
    <link href="js/bootstrap-treeview/dist/bootstrap-treeview.min.css" rel="stylesheet" type="text/css" />
    <link href="js/bootStrap-addTabs/bootstrap.addtabs.css" rel="stylesheet">
    <link href="js/bootstrap-table/dist/bootstrap-table.css" rel="stylesheet">
    <!-- bootstrap-datetimepicker css -->
    <link href="js/bootstrap-datetimepicker/css/bootstrap-datetimepicker.css" rel="stylesheet">
    <!-- bootstrap-dialog css -->
    <link href="js/bootstrap-dialog/dist/css/bootstrap-dialog.css" rel="stylesheet">

</head>

<body>

<div id="boxForm">
    <h2 id="title">My Login Form</h2>
    <form>
        <input class='text' type='text' name='employeename' placeholder='Email' required id="username">
        <br>
        <input class='text' id='pass'  type='password' placeholder='Password' required name="employeepass">
        <br>
        <input class='button' type='button' value='Connection' onclick="loginCheck()">
    </form>
</div>


<!-- jQuery 2.0.2 -->
<script src="js/jquery.min.js"></script>
<!-- jQuery UI 1.10.3 -->
<script src="js/jquery-ui-1.10.3.min.js" type="text/javascript"></script>
<!-- Bootstrap -->
<script src="js/bootstrap.min.js" type="text/javascript"></script>
<!-- Morris.js charts -->
<script src="js/raphael-min.js"></script>
<script src="js/plugins/morris/morris.min.js" type="text/javascript"></script>
<!-- Sparkline -->
<script src="js/plugins/sparkline/jquery.sparkline.min.js" type="text/javascript"></script>
<!-- jvectormap -->
<script src="js/plugins/jvectormap/jquery-jvectormap-1.2.2.min.js" type="text/javascript"></script>
<script src="js/plugins/jvectormap/jquery-jvectormap-world-mill-en.js" type="text/javascript"></script>
<!-- fullCalendar -->
<script src="js/plugins/fullcalendar/fullcalendar.min.js" type="text/javascript"></script>
<!-- jQuery Knob Chart -->
<script src="js/plugins/jqueryKnob/jquery.knob.js" type="text/javascript"></script>
<!-- daterangepicker -->
<script src="js/plugins/daterangepicker/daterangepicker.js" type="text/javascript"></script>
<!-- Bootstrap WYSIHTML5 -->
<script src="js/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js" type="text/javascript"></script>
<!-- iCheck -->
<script src="js/plugins/iCheck/icheck.min.js" type="text/javascript"></script>

<!-- AdminLTE App -->
<script src="js/AdminLTE/app.js" type="text/javascript"></script>

<!-- AdminLTE dashboard demo (This is only for demo purposes) -->
<script src="js/AdminLTE/dashboard.js" type="text/javascript"></script>
<script src="js/bootstrap-treeview/dist/bootstrap-treeview.min.js"></script>
<script src="js/bootStrap-addTabs/bootstrap.addtabs.js"></script>
<!-- bootStrap table -->
<script src="js/bootstrap-table/dist/bootstrap-table.js"></script>
<!-- bootStrap table 语言包中文-->
<script src="js/bootstrap-table/dist/locale/bootstrap-table-zh-CN.js"></script>

<!-- bootstrap-datetimepicker -->
<script src="js/bootstrap-datetimepicker/js/bootstrap-datetimepicker.js"></script>
<script src="js/bootstrap-datetimepicker/js/locales/bootstrap-datetimepicker.zh-CN.js"></script>

<!-- bootstrap-dialog -->
<script src="js/bootstrap-dialog/dist/js/bootstrap-dialog.js"></script>

<script>
    function loginCheck(){
        $.ajax({
            url:"loginUser",
            type:"post",
            data:{"employeename":$("#username").val(),"employeepass":$("#pass").val()},
            Typedata:"text",
            success:function(a){
                if (a=="MiNo") {
                    alert("密码错误!");
                }else if (a=="Yes") {
                    location.href="index.jsp";
                }else if (a=="NO") {
                    alert("用户名不存在或者错误!");
                }
            },
        });
    };
</script>
</body>
</html>
