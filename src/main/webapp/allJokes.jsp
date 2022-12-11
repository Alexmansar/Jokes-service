<%--
  Created by IntelliJ IDEA.
  User: Alexmansar
  Date: 11.12.2022
  Time: 21:19
  To change this template use File | Settings | File Templates.
--%>
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
        <c:forEach items="${requestScope.models}" var="model">
            <tr>
                <td>${model.id}</td>
                <td>${model.type}</td>
                <td>${model.setup}</td>
                <td>${model.punchline}</td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>