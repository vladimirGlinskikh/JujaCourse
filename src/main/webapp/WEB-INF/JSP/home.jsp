<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<span style="color: ${cookie.color.value}">Hello Juja!</span>
<form method="post" action="/JujaCourse_war_exploded/home">
    <label for="color">
        <select name="color" id="color">
            <option value="blue">This blue color</option>
            <option value="black">This black color</option>
            <option value="red">This red color</option>
        </select>
    </label>
    <input type="submit" value="Color send">
</form>
</body>
</html>
