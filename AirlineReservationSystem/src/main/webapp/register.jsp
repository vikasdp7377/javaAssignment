<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register User</title>
<style type="text/css">
   #box
   {
     margin: auto;
     width: 500;
     height : auto;
   
   }
   

</style>
</head>
<body align="center">
  <div id="box">
  <h1> 🙏Register User🙏</h1>
  <form action="register" method="post">
     Name: <input type="text" name="name"><br> <br>
      Email: <input type="text" name="email"><br> <br>
       Password: <input type="text" name="password"><br> <br>
       <input type="submit" value="Register">
  
  </form>
  </div>
</body>
</html>