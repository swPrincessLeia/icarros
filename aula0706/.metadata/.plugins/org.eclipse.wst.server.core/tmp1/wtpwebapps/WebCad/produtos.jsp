
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Produtos</title>
</head>
<body>

	<h1>Sistema de venda de produtos</h1>
	<%
	ArrayList<String> lista = new ArrayList<String>();
	lista.add("Mouse");
	lista.add("Teclado");
	lista.add("Scanner");
	lista.add("Impressora");
	lista.add("Monitor");
	//String[] lista = { "Mouse", "Teclado", "Scanner", "Impressora", "Monitor" };
	%>
	<ul>
		<%
		for (String p : lista)
			out.print("<li>" + p + "</li>");
		%>
	</ul>

	<h1>Sistema de Bandeiras</h1>
	<%
	ArrayList<String> bandeiras = new ArrayList<String>();
	bandeiras.add("Brasil");
	bandeiras.add("Alemanha");
	bandeiras.add("Italia");
	bandeiras.add("Mexico");

	//String[] lista = { "Mouse", "Teclado", "Scanner", "Impressora", "Monitor" };
	%>
	<ul>
		<%
		for (String b : bandeiras)
			out.print("<li>" + b + "<br>" + "<br>" + "<img src=" + "img/" + b + ".jpg>" + "<br>" + "<br>" + "</li>");
		%>
	</ul>

	<table border="1" width="50%">

		<tr>
			<td>a</td>
			<td>b</td>
			<td>c</td>
			<td>d</td>

		</tr>

		<tr>
			<td>a</td>
			<td>b</td>
			<td>c</td>
			<td>d</td>

		</tr>

	</table>




	<a href="index.html"><button>Voltar</button></a>

</body>
</html>