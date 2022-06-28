<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Criando a nossa página com java jsp</h1>

	<%
	//out.print("Seja bem vindo" +"<p>Ricardo</p>" );
	for(int i=0; i<10; i++){
		 out.print("<h1>"+ i+"</h1>" + "<br>");		
	}
	
	%>
	<!-- chamando outra página -->
	<a href="noticia.html">Clique Aqui!</a>
	

</body>
</html>