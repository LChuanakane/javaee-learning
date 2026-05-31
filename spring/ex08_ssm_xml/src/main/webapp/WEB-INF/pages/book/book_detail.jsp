<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %><html>
<body>
<button onclick="location.href='${pageContext.request.contextPath}/'">返回首页</button>
<br><br>
<h2>教材详情</h2>
<p>ID: ${book.bookId}</p>
<p>名称: ${book.bookName}</p>
<p>作者: ${book.author}</p>
<p>价格: ${book.price}</p>
</body>
</html>