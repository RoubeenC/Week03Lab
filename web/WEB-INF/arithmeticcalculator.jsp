<%-- 
    Document   : arithmeticcalculator
    Created on : Jan 27, 2023, 12:19:52 PM
    Author     : Roubeen Chaudhry
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            First: <input type="text" name="firstNum" value=${firstNum}><br>
            Second: <input type="text" name="secondNum" value=${secondNum}><br>
            <input name="type" type="submit" value="+"> 
            <input name="type" type="submit" value="-"> 
            <input name="type" type="submit" value="*"> 
            <input name="type" type="submit" value="%">
        </form>
            <p>Result: ${result}</p>
            
            <a href="age">Age calculator</a>
    </body>
</html>
