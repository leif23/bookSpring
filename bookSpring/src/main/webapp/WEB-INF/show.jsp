<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
      
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/style.css"/>
<!-- For any Bootstrap that uses JS -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>

<title>Show</title>
</head>
<body>

 <div class="p-3 m-3 card border-dark col-md-3 ">
		<h1> <c:out value="${books.title}"/> </h1>
		<p>Description: <c:out value="${books.description}"/> </p>
		<p>Languages: <c:out value="${books.language}"/> </p>
		<p>#Pages: <c:out value="${books.numberOfPages}"/> </p>
	</div>
	
	
	
	
		


</body>
</html>