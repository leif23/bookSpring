<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
    
    
<!DOCTYPE html>
<html>
<head>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/style.css"/>
<!-- For any Bootstrap that uses JS -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>

<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
	
<div class="d-flex justify-content-center bd-highlight mb-2 ">


	<table class="table table-striped table-hover ">
		<thead class="table-dark">
			<tr> 
				<td class="table-hover round"> #</td>
				<td class="table-hover round"> Title</td>
				<td class="table-hover round"> Description</td>
				<td class="table-hover round"> Language</td>
				<td class="table-hover round"> # Of Pages</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="allBooks" items="${books}">
				<tr>
				 
					<td> <c:out value="${allBooks.id}"/>   </td>
					<td> <a> <c:out value="${allBooks.title}"/> </a> </td>
					<td>  <c:out value="${allBooks.description}"/>  </td>
					<td>  <c:out value="${allBooks.language}"/>  </td>
					<td> <c:out value="${allBooks.numberOfPages}"/>  </td>
					

					
				</tr>
			</c:forEach>
		</tbody>
	
	</table>
	
	</div>

</body>
</html>