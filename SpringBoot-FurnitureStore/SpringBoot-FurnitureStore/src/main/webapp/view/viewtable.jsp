<%@page import="com.SpringBootPractice2.SpringBootFurnitureStore.Model.Furniture"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Data </title>
</head>
<body style="background-color:cyan;">

<center>
		<h1 style="background-color: rgb(255, 99, 71);">Furniture Menu</h1>
	</center>
	<table >
		<span style="margin-left:10em"><tr>
			<th><span style="margin-left:10em">ID</th>
			<th>FurnitureName</th>
			<th>Price</th>
	</tr>
		<%
		List<Furniture> list = (List<Furniture>) request.getAttribute("al");
		%>

		<%
		for (Furniture c1 : list) {
		%>
		<tr>
			<td>
				<span style="margin-left:10em"><%
				out.print(c1.getId());
				%>
			</td>
			<td>
				<span style="margin-left:1.5em"><%
				out.print(c1.getProductName());
				%>
			</td>
			<td>
				<span style="margin-left:3em"><%
				out.print(c1.getPrice());
				%>
			</td>
		</tr>

		<%
		}
		%>


</body>
</html>



