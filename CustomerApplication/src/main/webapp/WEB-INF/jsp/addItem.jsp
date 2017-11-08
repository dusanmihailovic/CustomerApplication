<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Item</title>
<!-- Le styles -->
    <link href="assets/css/bootstrap.css" rel="stylesheet">
    <style>
      body { padding-top: 60px;
       padding-left: 60px; /* 60px to make the container go all the way
      to the bottom of the topbar */ }
    </style>
    <link href="assets/css/bootstrap-responsive.css" rel="stylesheet">

<script type="text/javascript" src="jquery-1.8.3.js"></script>

<script type="text/javascript">
	$(document).ready(
		function(){
			$.getJSON('<spring:url value="products.json"/>', {
				ajax : 'true'
			}, function(data){
				var html = '<option value="">--Please select one--</option>'
				var len = data.length;
				for(var i = 0; i < len; i++) {
					html += '<option value="' + data[i].description + '">'
							+ data[i].description + '</option>';
				}
				html += '</option>';
				
				$('#products').html(html);
			});
			
		});
	
</script>

</head>
<body>
<h1>Add New Item for Customer</h1>
<form:form commandName="item">
	<table>
		<tr>
			<td>Order Item:</td>
			<td><form:input path="orderItem"/></td>
		</tr>
		<tr>
			<td>Product:</td>
			<td>
				<form:select id="products" path="product"></form:select>
			</td>
		</tr>
		<tr>
			<td>Quantity:</td>
			<td><form:input path="quantity"/></td>
		</tr>
		<tr>
			<td>Price:</td>
			<td><form:input path="price"/></td>
		</tr>
		
		<tr>
			<td colspan="2">
				<input type="submit" value="Enter New Item"/>
			</td>
		</tr> 
	</table>
</form:form>

<a href="index.jsp">Back</a>

</body>
</html>