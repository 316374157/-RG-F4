<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="./CSS/Clean.css">
    <link rel="stylesheet" href="./CSS/ChangeInfo.css">
    <link rel="stylesheet" href="../../static/css/bootstrap.css"/>
    <script src="./JS/HeaderChose.js"></script>
</head>
<body>
<jsp:include page="../../public/TeacherHeader.jsp"/>
<div class="main">
    <div class="main_part">
        <div class="main_part_top">
            <div class="kj">修改信息</div>
        </div>
        <div class="main_part_nav">
            <ul>
                <form action="" method="post">
                    <li>
                        <a>姓名：</a><input type="text" placeholder="" />
                    </li>
                    <li>
                        <a>年龄：</a><input type="text" placeholder="" />
                    </li>
                    <li>
                        <a>密码：</a><input type="password" />
                    </li>
                    <input style="margin-left: 100px;" type="submit" value="提交" />
                </form>
            </ul>
        </div>
    </div>
</div>
<div class="footer">
    <p style="padding-top: 30px;">软件工程</p>
    <p>Copyright ©</p>
    <p>http://</p>
</div>
<span id="Only" style="display: none;">ChangeInfo</span>
</body>
</html>
