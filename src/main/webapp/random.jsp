<%--
  Created by IntelliJ IDEA.
  User: Alexmansar
  Date: 11.12.2022
  Time: 21:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
  <link href="styles.css" rel="stylesheet" type="text/css">
  <title>Jokes</title>
</head>
<body>
<div class="one">
  <h1>Random joke :)</h1>
  <p>${requestScope.name}</p>
</div>

<a href="controller?action=all">All jokes</a>
</body>
</html>
