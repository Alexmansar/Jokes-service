<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta charset="utf-8">
    <link href="styles.css" rel="stylesheet" type="text/css">
    <title>All jokes</title>
</head>
<body>
<div>
    <table>
        <caption><h1>Jokes</h1></caption>
        <tr>
            <td>id</td>
            <td>type</td>
            <td>setup</td>
            <td>punchline</td>
        </tr>
        <c:forEach items="${requestScope.jokes}" var="joke">
            <tr>
                <td>${joke.id}</td>
                <td>${joke.type}</td>
                <td>${joke.setup}</td>
                <td>${joke.punchline}</td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>