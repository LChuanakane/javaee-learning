<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>出版社信息</title>
    <style>
        /* 鼠标悬浮变成手型，提示可点击 */
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
<button onclick="location.href='${pageContext.request.contextPath}/'">返回首页</button>
<br><br>
<h2>出版社信息列表</h2>
<table width="500" border="1" cellspacing="0" cellpadding="0" style="border-collapse:collapse">
    <tbody>
    <tr>
        <td>编号</td>
        <td>名称</td>
        <td>联系人</td>
        <td>操作</td>
    </tr>
    <c:forEach var="publisher" items="${publishers}">
        <tr>
            <td>${publisher.pubId}</td>
            <td onclick="location.href='${pageContext.request.contextPath}/publisher/find_by_name?name=${publisher.pubName}'">${publisher.pubName}</td>
            <td onclick="location.href='${pageContext.request.contextPath}/publisher/find_by_contacter?contacter=${publisher.contacter}'">${publisher.contacter}</td>
            <td>
                <button onclick="location.href='${pageContext.request.contextPath}/publisher/find_by_name?name=${publisher.pubName}'">按名称查询</button>
                <button onclick="location.href='${pageContext.request.contextPath}/publisher/find_by_contacter?contacter=${publisher.contacter}'">按联系人查询</button>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>