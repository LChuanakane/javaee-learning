<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html>

<head>
    <title>课程信息</title>

    <style>
        /* 鼠标悬浮变成手型，提示可点击 */
        tr:hover {
            background-color: #eee;
            cursor: pointer;
        }
        button {
            margin: 0 3px;
            cursor: pointer;
        }
    </style>
<body>
<button onclick="location.href='${pageContext.request.contextPath}/'">返回首页</button>
<br><br>
<h2>课程列表</h2>
<table width="400" border="1" cellspacing="0" cellpadding="0" style="border-collapse:collapse">
    <tbody>
    <tr>
        <td>课程ID</td>
        <td>课程名称</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${courses}" var="course">
        <tr>
            <td onclick="location.href='${pageContext.request.contextPath}/book/detail?id=${course.courseId}'">${course.courseId}</td>
            <td onclick="location.href='${pageContext.request.contextPath}/course/detail?id=${course.courseId}'">${course.courseName}</td>
            <td>
                <button onclick="location.href='${pageContext.request.contextPath}/book/detail?id=${course.courseId}'">查看教材</button>
                <button onclick="location.href='${pageContext.request.contextPath}/course/detail?id=${course.courseId}'">查看课程</button>
            </td>        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>