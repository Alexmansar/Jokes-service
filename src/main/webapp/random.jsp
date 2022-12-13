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
