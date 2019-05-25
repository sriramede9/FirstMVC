<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
    
<!DOCTYPE html>
<html>
<head>
<style>
form{
border: 1px solid brown;


}
body{
text-content:center;
align-items:center;
background-color:tomato;
}

h4{
background-color:green;
color:white;
}

</style>
<meta charset="ISO-8859-1">
<title>Add Employee</title>
</head>
<body>
<h2>This is where you add employee</h2>

<h4 ></h4>
 
 <form action = "AddempController" method="POST">
  
   Name:<br>
  <input type="text" name="name" placeholder="Mouse">
   <br>
    
   Dob:<br>
  <input type="text" name="dob" placeholder="01-01-1990">
  <br>
  
   Dept:<br>
  <input type="text" name="dept" placeholder="Developper">
  
  
  <br><br>
  <input type="submit" value="Submit">
  
  
  <a href=" <c:url value= '/test.jsp'></c:url>" >Back</a>
</form> 
 
  <script type="text/javascript">
  
 
 //console.log("Yo bro! it's been a while where are you?")
 
 document.querySelector("form").addEventListener("submit", displayDate);
 
 function displayDate(e) {
	
	 document.querySelector("h4").textContent= "A new Employee is added "+Date();
	}
 
//document.querySelector("h4").textContent="Yo mama added";
//  console.log(h);
  </script>

</body>
</html>