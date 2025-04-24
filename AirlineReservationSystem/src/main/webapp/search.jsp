<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>✈️✈️Search Flight✈️✈️</title>
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
  <h1> 🙏Search Flight🙏</h1>
  <form action="searchFlight" method="post">
     From: <input type="text" name="from"><br> <br>
      TO: <input type="text" name="to"><br> <br>
       Date: <input type="date" name="date"><br> <br>
       <input type="submit" value="Search">
  
  </form>
  </div>
</body>
</html>