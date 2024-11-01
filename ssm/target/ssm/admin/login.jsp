<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: 26591
  Date: 2023/3/11
  Time: 15:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/login.css" />
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
    <title>login</title>
</head>

<body>
<div id="login">
    <div id="top">
        <img src="${pageContext.request.contextPath}/images/cloud.jpg" /><span>LOGIN</span>
    </div>
    <div id="bottom">
        <form action="/login" method="post">
            <table style="border: 0px" id="table">
                <tr>
                    <td class="td1">用户名：</td>
                    <td>
                        <input type="text" value="admin" placeholder="Username" class="td2" name="username">
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td>
                        <span id="nameerr"></span>
                    </td>
                </tr>
                <tr>
                    <td class="td1">密码：</td>
                    <td>
                        <input type="password"  value="000000" placeholder="Password" class="td2" name="password">
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td>
                        <span id="pwderr"></span><input type="checkbox" name="remember-me" value="记住我"/>
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td>
                        <input type="submit" value="登录" class="td3">
                        <a href="${pageContext.request.contextPath}/admin/register.jsp">
                            <input type="button" value="注册" class="td3	"></a>
                    </td>
                </tr>
            </table>
        </form>
        ${errmsg}
    </div>
</div>
</body>
</html>
