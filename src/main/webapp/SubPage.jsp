<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
  function validate(){
	  var SubName = document.getElementById("subject");
	  if(SubName.value == ""){
		  alert("Please Enter Subject Name");
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
   <h2>This page gives All Students Average in the given Subject</h2>
   </br></br>
   <form onSubmit="return Validate()" action="Subject" method="get">
        Enter Subject Name : <input id="subject" name="subject" type="text"> 
        <input type="submit" value="Subject Average" >
   </form>
   
</body>
</html>