<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 26591
  Date: 2023/3/10
  Time: 13:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>chat</title>
    <script>

    </script>
</head>
<body>
聊天室：
    <div style="text-align: center;background-color: bisque;overflow: scroll;height: 500px" >
        <c:forEach var="message" items="${messageList}">
            <ul>
                <li>${message.name} : ${message.talks}</li>
            </ul>
        </c:forEach>
    </div>
    <div style="text-align: center">
        <form method="post">
            name : <input name="name" type="text"> <br>
            talk : <input name="talks" type="text"><br>
            <input type="submit" value="submit">
        </form>
    </div>
</body>
</html>
