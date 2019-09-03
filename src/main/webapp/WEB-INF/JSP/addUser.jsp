<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <style>
        <%@include file="/WEB-INF/css/style.css" %>
    </style>
</head>
<body>
<div class="form-style-2">
    <div class="form-style-2-heading">
        Please add user.
    </div>
    <form method="post" action="/JujaCourse_war_exploded/users">
        <label for="first-name">First name
            <input class="input-field" type="text" id="first-name" name="first-name">
        </label>
        <label for="last-name">Last name
            <input class="input-field" type="text" id="last-name" name="last-name">
        </label>
        <input type="submit" value="Add user">
    </form>
</div>
</body>
</html>
