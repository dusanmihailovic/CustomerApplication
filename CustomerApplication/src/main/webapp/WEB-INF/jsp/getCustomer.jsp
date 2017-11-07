<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Report</title>
</head>
<body>

	<table>
	
		<tr>
			<th>ID</th><th>First Name</th><th>Last Name</th>
		</tr>
		<c:forEach items="${customers}" var="customer">
			<tr>
				<td>${customer.customerId}</td><td>${customer.firstName}</td><td>${customer.lastName}</td>
				<td>
					<table>
						<tr>
							<th>ID</th><th>Order Item</th><th>Product</th><th>Quantity</th><th>Price</th>
						</tr>
						<c:forEach items="${customer.items}" var="item">
							<tr>
								<td>${item.customerId}</td><td>${item.orderItem}</td><td>${item.product}</td><td>${item.quantity}</td><td>${item.price}</td>
							</tr>
						</c:forEach>
					</table>
				</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>
