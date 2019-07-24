<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>Welcome to login page</h2><br>

<form method = "POST" action="/loginvalidate"> 
  Username:   <input id="col-xs-2" type="text" name="username"><br> 
  
  Password:   <input id="col-xs-2" type="password" name="pwd"><br>  
 
  <input class="btn btn-success" type="submit" value="Submit"> 
</form>  

</body>
</html>