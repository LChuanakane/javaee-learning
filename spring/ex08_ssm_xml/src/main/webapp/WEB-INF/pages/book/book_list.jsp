<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>教材列表</title>
    <style>
        tr:hover {
            background-color: #eee;
            cursor: pointer;
        }

        button {
            margin: 0 2px;
            cursor: pointer;
        }
    </style>
</head>
<body>
<h2>教材列表</h2>

<!-- 返回按钮 -->
<button onclick="location.href='${pageContext.request.contextPath}/'">返回首页</button>
<br><br>
<table width="500" border="1" cellspacing="0" cellpadding="0" style="border-collapse:collapse">
    <tbody>
    <tr>
        <td>教材ID</td>
        <td>教材名称</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${books}" var="b">
        <tr>
            <td onclick="location.href='${pageContext.request.contextPath}/book/detail?id=${b.bookId}'">${b.bookId}</td>
            <td>${b.bookName}</td>
            <td>
                <button onclick="location.href='${pageContext.request.contextPath}/book/detail?id=${b.bookId}'">
                    查看详情
                </button>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>