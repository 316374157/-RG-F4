<%--
  Created by IntelliJ IDEA.
  User: 31637
  Date: 2020/5/29
  Time: 14:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="FileUploadServlet" method="post" enctype="multipart/form-data">
        <input name="className" value="2017级软件工程">
        <input name="courseName" value="软件工程">
        <input name="dataType" value="图片">
        <input type="file" name="file">
        <input type="submit" value="上传">
    </form>

    <form action="FileDownloadServlet" method="post">
        <input name="id" value="001">
        <input type="submit" value="下载">
    </form>
</body>
</html>