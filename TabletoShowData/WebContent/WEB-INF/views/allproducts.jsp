<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.datatables.net/1.10.21/css/jquery.dataTables.min.css"
	rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
<script
	src="https://cdn.datatables.net/1.10.21/js/jquery.dataTables.min.js"></script>
<script>
	$(document).ready(function() {
		$('#example').DataTable();
	});
</script>
<style>
  #example{
  border-color:black;
  color:blue;
  width:75%
  }
</style>
</head>
<body>
	All Products Details
	<c:if test="${not empty lists}">
		<table id="example" border="1px">
			<tr style="color:red;text-align:center;">
				<th>ID</th>
				<th>Product Name</th>
				<th>Company</th>
				<th>Product Type</th>
				<th>Product Price</th>
				<th>Sales</th>
			</tr>
			<c:forEach items="${lists}" var="item">
				<tr>
					<td>${item.id}</td>
					<td>${item.productName}</td>
					<td>${item.company}</td>
					<td>${item.type}</td>
					<td>${item.price}</td>
					<td>${item.sales}</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
	<br>
	<br>
	<a href="regestration">Regester New Product</a>
	<br>
	<br>
	<a href="index.jsp">Welcome Page</a>
</body>
</html>