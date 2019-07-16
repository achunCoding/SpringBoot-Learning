<%--
  Created by IntelliJ IDEA.
  User: wayc1hz1
  Date: 2019/7/15
  Time: 9:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>User</title>
</head>
<body>
<h3>一行Java代码</h3>
<p>今天的日期是 ： <%=(new java.util.Date())%>
</p>
<h3>多行的代码</h3>
<p>你的IP地址是：
    <%
        out.println("Your IP address is :" + request.getRemoteAddr() + "</br>");
        out.println("一段代码");
    %>
</p>

<h3>For 循环 Demo</h3>
<%
    int count = (int) session.getAttribute("count");
    for (int fontSize = 1; fontSize <= count; fontSize++) {
%>
嘻嘻哈哈哈哈哈哈哈
<br>
<%}%>

<h3>标签 c:if</h3>
<c:if test="${username != null}">
    <p>用户名为： username</p>
</c:if>

<h3>标签 c:choose</h3>
<c:choose>
    <c:when test="${salary <= 0}">
        太惨了。
    </c:when>
    <c:when test="${salary > 1000}">
        不错的薪水，OK啦
    </c:when>
    <c:otherwise>
        什么都木得了
    </c:otherwise>
</c:choose>

<h3>布局</h3>
<%@include file="footer.jsp"%>

</body>
</html>
