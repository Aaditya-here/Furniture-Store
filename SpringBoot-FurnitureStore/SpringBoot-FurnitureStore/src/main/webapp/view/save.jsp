<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Furniture Store</title>
</head>
<body
	style="font-family:Verdana; text-align: center; background-color: yellow;">
	<p><h1>Furniture Store</h1>
	<form action="/insert" action="insert">
		<input type="text" placeholder="Enter Id here" name="id"> 
		<input type="text" placeholder="Enter Name here" name="productName"> 
		<input type="text" placeholder="Enter price in Rs" name="price">
		
		<br>
		<br>
		<button type="submit" formaction="save">
			Save <a href="save"></a>
			
			<button type="submit" formaction="update">
				Update <a href="update"></a>
				<button type="submit" formaction="delete">
					Delete <a href="delete"></a>
					<button type="reset" formaction="reset">
					Reset

				</button>
				<br>
				<br>
				<span></span>
					<button type="submit" formaction="viewtable">
					View All Data <a href="delete"></a>
				<br>
		</button>
	
	</form>
</body>
</html>