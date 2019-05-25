<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<style>
table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

td, th {
	border: 1px solid #dddddd;
	text-align: left;
	padding: 6px;
}

tr:nth-child(even) {
	background-color: #dddddd;
}

tr:nth-child(odd) {
	background-color: grey;
}

a:link {
	color: #6d6d6d;
}

a:hover {
	color: white;
}

a:active {
	color: green;
}
</style>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body style='background-color: lightblue'>
	<h1 style='color: white'>This is going to be my first MVC app and
		should be keep coming</h1>

	<h2 style='border: 2px dotted orange'>The date is ${datee}</h2>


	<!-- using tables 

	<table>

		<c:forEach items="${elist}" var="x">
			<tr>
				<td> ${x.getId()}:id</td>
				<td> ${x.getName()}</td>
			</tr>
			
		</c:forEach>
		
		
		
		
		
	</table>
-->
	<%
		//  request.getAttribute("elist");

		;

		out.println(request.getAttribute("elist"));
	%>

	<%!int lengt(String s) {

		return s.length();
	}%>

	<table>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Dob</th>
			<th>Dept</th>
			<th>Modify</th>
		</tr>
		<c:forEach items="${elist}" var="x" varStatus="status">
			<tr>
				<td>${x.getId()}</td>
				<td>${x.getName()}</td>
				<td>${x.getDob()}</td>
				<td>${x.getDept()}</td>

				<td><a href="Edit.jsp?count1=${status.count}">Edit</a>|<a
					href="#">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
	<br>
	<button>
		<a href="AddEmployee.jsp">Add Employee</a>
	</button>
</body>
</html>