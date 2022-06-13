<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ARTHA WEB APP</title>
</head>
<body style="background-color: yellow;">
   <center><h1>Welcome To Artha Educational Institute</hl></center>
   </br>
   <center><h4>Please Choose The Option</h4></center>
   <center>
   <form action="StuPage.jsp" > 
        <input type="submit" value="Student Average" >
   </form>
   </br></br></br>
   <form action="SubPage.jsp" > 
        <input type="submit" value="Subject Average" >
   </form>
   </br></br></br>
   <form action="StudentData"  method="get"> 
        <input type="submit" value="Display Data" >
   </form>
   </br></br></br>
   <form action="Logout.jsp"> 
        <input type="submit" value=" Exit " >
   </form>
   </center>
</body>
</html>