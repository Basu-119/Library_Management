<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body{

background-size: 100% 100%;
color:#fff;
min-height: 550px;
  background: linear-gradient(rgba(0,0,0,0.3),rgba(0,0,0,0.4)), url('https://img.freepik.com/premium-photo/blurred-bookshelf-many-old-books-book-shop-library_36051-477.jpg?w=1060');
  background-size: cover;
  


}
h1{
font-size:40px;}
p {
font-size:25px;
background: aliceblue;
    color: black;
    
}
img{

 width:200px;
 height:200px;
 cursor: pointer;
 
 }
 div{
 display: flex;
 justify-content: space-around;
 align-items: center;
 }
 

</style>
</head>
<body>
<center>
<h1>Are you a ?</h1>
<div>
<section>
<a href="adminLoginPage.jsp"><img src="https://img.freepik.com/free-icon/learning_318-232057.jpg?size=626&ext=jpg&ga=GA1.2.520229863.1691002586&semt=ais" alt="Pic"></a><p>Admin</p>
</section>
<section><a href="UserLogin.jsp"><img src="https://cdn.pixabay.com/photo/2016/04/15/18/05/computer-1331579_1280.png" alt="Pic" ></a><p>User</p>
</section>
</div>
 </center>
</body>
</html>