<%@ page import="java.util.ArrayList" %>
<%@ page import="jspExamples.kz.zhelezyaka.models.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    ArrayList<User> users = (ArrayList) request.getAttribute("usersFromServer");
%>
<table>
    <tr>
        <th>User name</th>
        <th>Birth Date</th>
    </tr>
    <% for (User user : users) {%>
    <tr>
        <td><%=user.getName()%>
        </td>
        <td><%=user.getBirthDate()%>
        </td>
    </tr>
    <%}%>
</table>
</body>
</html>
