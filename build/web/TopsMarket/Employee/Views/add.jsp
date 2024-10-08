<%-- 
    Document   : add
    Created on : Jun 3, 2024, 1:20:01 AM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
                <h2 style="color: red">${requestScope.error}</h2>
        <form action="addnhanvien">
            <input type="number" name="id" placeholder="ID">
            <input type="text" name="name" placeholder="Ho ten">
             <input type="text" name="sex" placeholder="Gioi tinh">
             <input type="text" name="sex" placeholder="Gioi tinh">
             <input type="text" name="sex" placeholder="Gioi tinh">
             <input type="number" name="SDT" placeholder="So Dien Thoai">
             <input type="submit" value="Them">
        </form>
    </body>
</html>
