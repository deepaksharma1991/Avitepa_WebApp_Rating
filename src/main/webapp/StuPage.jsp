<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
  function validate(){
	  var StuName = document.getElementById("name");
	  if(StuName.value == ""){
		  alert("Please Enter Student Name");
		  return false;
	  }else{
		  return true;
	  }
  }
</script>
</head>
<body style="background-color: yellow;">
   <center><h1>Welcome To Artha Educational Institute</hl></center>
   </br></br>
   <h2>This page gives Student Average in All the subject</h2>
   </br></br>
   <form onSubmit="return Validate()" action="Student" method="get">
        Enter Student Name : <input id="name" name="name" type="text"> 
        <input type="submit" value="Student Average" >
   </form>
   
</body>
</html>