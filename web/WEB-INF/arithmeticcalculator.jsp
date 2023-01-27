<%-- 
    Document   : arithmeticcalculator
    Created on : Jan 27, 2023, 12:19:52 PM
    Author     : Home
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <form method="post" action="hello">
            First: <input type="text" name="firstNum"><br>
            Second: <input type="text" name="secondNum"><br>
            <input type="" value="+"> <input type="" value="-"> <input type="" value="*"> <input type="" value="/">
        </form>
            <p>Result:${message}</p>
    </body>
</html>
