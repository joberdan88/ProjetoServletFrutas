<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Calculadora JSP</title>
</head>
<body>
    <h2>Calculadora</h2>
    <form action="CalcSer" method="post">
        <input type="text" name="txtnum1" value="<%= request.getParameter("txtnum1") != null ? request.getParameter("txtnum1") : "" %>" readonly />
        <br><br>
        <input type="submit" name="btnsubmit" value="1" />
        <input type="submit" name="btnsubmit" value="2" />
        <input type="submit" name="btnsubmit" value="3" />
        <input type="submit" name="btnsubmit" value="4" />
        <br><br>
        <input type="submit" name="btnsubmit" value="+" />
        <input type="submit" name="btnsubmit" value="-" />
        <input type="submit" name="btnsubmit" value="*" />
        <input type="submit" name="btnsubmit" value="=" />
    </form>
</body>
</html>