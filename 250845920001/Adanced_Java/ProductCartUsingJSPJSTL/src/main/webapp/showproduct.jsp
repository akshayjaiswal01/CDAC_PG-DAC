<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
  <%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

		<form action="placeorder.jsp">
			<button type="submit" name="btn" id="btn" >Place Order</button>
		</form>
		
		<c:forEach var="p" items="${plist}">
			<div>
				<form action="addtocart">
					Product ID: ${p.pid} </br>
					Product Name: ${p.pname} </br>
					Product Price: ${p.price} </br>
					<input type="hidden" name="pid" id="pid" value="${p.pid}" >
					<input type="hidden" name="pname" id="pname" value="${p.pname}" >
					<input type="hidden" name="price" id="price" value="${p.price}" >
					Quantity: <input type="text" name="qty" id="qty" >
					<button type="submit" name="btn" id="btn" >Add to cart</button>
				</form>
			</div>
		</c:forEach>
		
</body>
</html>