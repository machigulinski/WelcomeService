<%-- 
    Document   : welcomepage
    Created on : Jan 27, 2014, 10:09:56 AM
    Author     : Machi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Greeting page</title>
    </head>
    <body>
        <h1>Finally!!!</h1>	<%
	    
	    String name = (String)request.getAttribute("guest_name");
	    
	    out.print(name);
	%>
	
    </body>
</html>
