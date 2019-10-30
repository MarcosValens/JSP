<html>
<body>
<h2>Hello World!</h2>
<%="Hola Mundo!"%>
<br>
<%
String string = "Hola String";
out.println(string);
out.println(request.getAttribute("atributo"));//Este es el que coje el guardado en la clase
%>
</body>
</html>
