<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<html>
    <head><title>Web Servis Odev</title></head>
<body>
    <form method="POST" action="url.jsp">
        Username:<input type="text" name="username"/><br/>
        Select: 
        <select name="secim">
            <option value="Instagram">Instagram</option>
            <option value="Twitter">Twitter</option>
        </select><br/>
        <input type="submit" value="Get Picture"/>
    </form>
</body>
</html>