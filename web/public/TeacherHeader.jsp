<%--
  Created by IntelliJ IDEA.
  User: 11322
  Date: 2020/5/20
  Time: 17:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="static/js/HeaderChose.js"></script>
<nav class="navbar navbar-default">
	<div class="container-fluid">
		<!-- Collect the nav links, forms, and other content for toggling -->
		<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
			<ul id="headnav" class="nav navbar-nav" style="margin: 0 auto;width: 40%;float: none;">
				<li id="myinfo"><a href="pages/teacher/MyInfo.jsp">张飞帆</a></li>
				<li id="home"><a href="pages/teacher/Home.jsp">主页</a></li>
				<li id="classname"><a href="pages/teacher/Class.jsp">班级详情</a></li>
				<li id="data"><a href="TeacherServlet?method=getClass">教学资源</a></li>
				<li id="course"><a href="pages/teacher/Course.jsp">课程</a></li>
				<li id="sign"><a href="pages/teacher/Sign.jsp">签到</a></li>
				<li id="signinformation"><a href="pages/teacher/SignInformation.jsp">签到详情</a></li>
				<li id="live"><a href="pages/teacher/Live.jsp">直播</a></li>
			</ul>
		</div><!-- /.navbar-collapse -->
	</div><!-- /.container-fluid -->
</nav>
