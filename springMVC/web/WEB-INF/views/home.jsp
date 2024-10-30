<%--
  Created by IntelliJ IDEA.
  User: kk
  Date: 2022/10/21
  Time: 17:26
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>spitter</title>
    <link rel="stylesheet"
          type="text/css"
          href="<c:url value="/>resource/style.css" />">
</head>
<body>
    <h1>Welcome to Spitter</h1>
    <a href="<c:url value="/spittles" />">Spittles</a>
    <a href="<c:url value="/spitter/register" />">Register</a>
</body>
</html>
