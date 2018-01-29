<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
   <IMG src="${a.voicimg}" HEIGHT="50" WIDTH="50"><br><br>
    歌曲:<input type='button' value='详情' onclick='speckText2("+${a.neirongs}+")'>${a.vurls}<br><br>
    曲名:${a.voicetitle}<br><br>
    NJ:${a.boname}<br><br>
    发布时间:${a.voicetime}<br><br>
   ${a.neirongs}
    <SCRIPT>
        function speckText2(str){
            var url = "http://tts.baidu.com/text2audio?lan=zh&ie=UTF-8&text="+str+""
            var n = new Audio(url);
            n.src = url;
            n.play();
        }
    </SCRIPT>
</body>
</html>
