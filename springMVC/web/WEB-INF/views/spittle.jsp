<%--
  Created by IntelliJ IDEA.
  User: kk
  Date: 2022/10/28
  Time: 17:18
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div class="spittleMessage">
        <c:out value="${spittle.message}"/>
    </div>
    <div>
        <c:out value="${spittle.time}"/>
    </div>
</body>
</html>
