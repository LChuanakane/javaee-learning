<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %><html>
<body>
<button onclick="location.href='${pageContext.request.contextPath}/'">返回首页</button>
<br><br>
<h2>课程详情</h2>
<p>ID: ${course.courseId}</p>
<p>名称: ${course.courseName}</p>
<p>学时: ${course.period}</p>
<p>学分: ${course.credit}</p>
</body>
</html>