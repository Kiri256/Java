<%--
  Created by IntelliJ IDEA.
  User: kk
  Date: 2022/11/8
  Time: 16:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.Enumeration" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <meta charset="UTF-8"/>
    <title>Title</title>
</head>
<body>
    <table width="100%" border="1" align="center">
        <tr bgcolor="green">
            <th>Header Name</th>
        </tr>
        <%
            Enumeration<String> headerNames=request.getHeaderNames();
            while(headerNames.hasMoreElements()){
                String paramName=headerNames.nextElement();
                out.println("<tr><td>"+paramName+"</td>\n");
                String paramValue=request.getParameter(paramName);
                out.println("<td>"+paramValue+"</td></tr>\n");
            }
        %>
    </table>
</body>
</html>
