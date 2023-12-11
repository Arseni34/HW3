<%@page contentType="text/html" pageEncoding="UTF-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Book Upload Servlet - Java web application</title>
</head>
<body>
<div>
    <h3> Choose File to Upload in Server </h3>
    <form action="load-book" method="post" enctype="multipart/form-data">
        <input type="file" name="file"/>
        <input type="submit" value="upload"/>
    </form>
</div>
</body>
</html>