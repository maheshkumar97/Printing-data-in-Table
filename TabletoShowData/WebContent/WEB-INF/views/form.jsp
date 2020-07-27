<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
</head>
<h3>Product Regestration Form</h3>
<body>
	<form:form action="submitForm" modelAttribute="reservation">
		<table>
			<tr>
				<td>Select Type:</td>
				<td><form:select path="type">
						<form:option value="Electronic" label="Electronic" />
						<form:option value="Clothing" label="Clothing" />
						<form:option value="Home Appliances" label="Home Appliances" />
						<form:option value="Groceries" label="Groceries" />
					</form:select></td>
			</tr>
			<tr>
				<td>Product Name:</td>
				<td><form:input path="productName" /></td>
			</tr>
			<tr>
				<td>Brand:</td>
				<td><form:input path="company" /></td>
			</tr>
			<tr>
				<td>Price:</td>
				<td><form:input path="price" /></td>
			</tr>
			<tr>
				<td>Sales till date:</td>
				<td><form:input type="number" path="sales" /></td>
			</tr>
		</table>
		<input type="submit" value="Submit">
	</form:form>
	<br><br>
	<a href="getproducts">Get all Registered products</a><br><br>
	<a href="index.jsp">Welcome Page</a>
</body>
</html>