<%--
  Created by IntelliJ IDEA.
  User: kk
  Date: 2022/10/29
  Time: 12:45
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Profile</title>
    </head>
    <body>
        <h1>Your Profile</h1>
        <c:out value="${spitter.username}"/><br/>
        <c:out value="${spitter.firstName}"/>
            <c:out value="${spitter.lastName}"/>
    </body>
</html>
