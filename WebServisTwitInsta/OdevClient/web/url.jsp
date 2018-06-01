<%-- 
    Document   : url
    Created on : 26.Kas.2017, 22:30:51
    Author     : sercan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
    <h4>Web Service Homework 5</h4>

    <%-- start web service invocation --%><hr/>
    <%
        String isim=request.getParameter("username");
        String sec=request.getParameter("secim");
    if(sec.equals("Instagram"))
    {
    try {
	servis.Servis_Service service = new servis.Servis_Service();
	servis.Servis port = service.getServisPort();
	 // TODO initialize WS operation arguments here
	java.lang.String arg0 = isim;
	// TODO process result here
	java.lang.String result = port.getInstaPic(arg0);
	out.println("<img src="+result+"></img><br/>");
        out.println("<a href="+result+" target='_blank'>"+isim+" Instagram Profile Picture URL Click here...</a>");
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    }else if(sec.equals("Twitter")){
     try {
	servis.Servis_Service service = new servis.Servis_Service();
	servis.Servis port = service.getServisPort();
	 // TODO initialize WS operation arguments here
	java.lang.String arg0 = isim;
	// TODO process result here
	java.lang.String result = port.getTwitPic(arg0);
        out.println("<img src="+result+" ></img><br/>");
	out.println("<a href="+result+" target='_blank'>"+isim+" Twitter Profile Picture URL Click here...</a>");
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    }
    %>
    <%-- end web service invocation --%><hr/>
   
</body>
</html>
