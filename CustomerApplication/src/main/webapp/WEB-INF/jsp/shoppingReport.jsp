<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table>
		<tr>
			<th>Name</th><th>Surname</th><th>Order</th><th>Product</th><th>Quantity</th><th>Price</th>
		</tr>
		<c:forEach items="${shoppingReport}" var="shoppingReport">
			<tr>
				<td>${shoppingReport.customerName}</td><td>${shoppingReport.customerSurname}</td><td>${shoppingReport.itemOrder}</td><td>${shoppingReport.itemProduct}</td><td>${shoppingReport.itemQuantity}</td><td>${shoppingReport.itemPrice}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>