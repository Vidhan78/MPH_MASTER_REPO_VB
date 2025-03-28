<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>"
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> <!-- Added JSTL library -->
 
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>List of Users that are added</title>
</head>
<body>
	<h2>User List</h2>
 
	<!--  Form to add USer -->
	<form action="add" method="post">
		<input type="text" name="name" >
		<button type="Submit" >Add User</button>
	</form>
 
	<!--  Display User list -->
	<ul>
		<c:choose>
			<c:when test="${not empty users }">
				<c:forEach var="user" items="${users }">
					<li> ${user.name}</li>
			
				</c:forEach>
			</c:when>
			<c:otherwise>
				<li>No users available.</li>
			</c:otherwise>
		</c:choose>
	
		
	</ul>
 
</body>
</html>