<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %><html>
<body>
<button onclick="location.href='${pageContext.request.contextPath}/'">返回首页</button>
<br><br>
<h2>课程对应教材</h2>
<ul>
    <c:forEach items="${books}" var="b">
        <li>${b.bookName} (ID: ${b.bookId})</li>
    </c:forEach>
</ul>
</body>
</html>