<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Customer</title>

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
			$.getJSON('<spring:url value="states.json"/>', {
				ajax : 'true'
			}, function(data){
				var html = '<option value="">--Please select one--</option>'
				var len = data.length;
				for(var i = 0; i < len; i++) {
					html += '<option value="' + data[i].desc + '">'
							+ data[i].desc + '</option>';
				}
				html += '</option>';
				
				$('#states').html(html);
			});
			
		});
	
</script>

</head>
<body>
<h1>Add New Customer</h1>
<form:form commandName="customer">
	<table>
		<tr>
			<td>First Name:</td>
			<td><form:input path="firstName"/></td>
		</tr>	
		<tr>
			<td>Last Name:</td>
			<td><form:input path="lastName"/></td>
		</tr>
		<tr>
			<td>City:</td>
			<td><form:input path="city"/></td>
		</tr>
		<tr>
			<td>State:</td>
			<td>
				<form:select id="states" path="state"></form:select>
			</td>
		</tr>
		
		<tr>
			<td colspan="3">
				<input type="submit" value="Enter New Customer"/>
			</td>
		</tr> 
	</table>
</form:form>

</body>
</html>