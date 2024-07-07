<%@ page language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Result Page</title>
</head>
<body>
    <!-- Using Session -->
    <%-- <h1>Sum of the Digits : <%= session.getAttribute("res") %> </h1>--%>

    <%-- Using JsTl --%>
    <h1>Sum of the Digits : ${res}</h1>
</body>
</html>
