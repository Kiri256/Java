<%--
  Created by IntelliJ IDEA.
  User: kk
  Date: 2022/10/29
  Time: 10:05
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Spittr</title>
        <link rel="stylesheet" type="text/css"
              href="<c:url value="/resources/style.css"/>">
    </head>
    <body>
        <h1>Register</h1>
        <%--
        <form method="POST">
            First Name:<input type="text" name="firstName"/><br/>
            Last Name:<input type="text" name="lastName"/><br/>
            UserName:<input type="text" name="uesrname"/><br/>
            Password:<input type="password" name="password"/><br/>
            <input type="submit" value="Register"/>
        </form>
        --%>
        <sf:form method="post" commandName="spitter">
            First Name:<sf:input path="firstName"/><br/>
            Last Name:<sf:password path="lastName"/><br/>
            UserName:<sf:input path="username"/><br/>
            Password:<sf:password path="password"/><br/>
            <input type="submit" value="Register"/><br/>
            <sf:errors path="*" cssClass="error"/>
        </sf:form>
    </body>
</html>
