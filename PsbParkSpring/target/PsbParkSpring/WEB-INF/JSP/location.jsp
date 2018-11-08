<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lato">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Montserrat">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
.dropdown,body,h1,h2,h3,h4,h5,h6 {font-family: "Lato", sans-serif}
.dropdown,.w3-bar,h1,button {font-family: "Montserrat", sans-serif}
.fa-anchor,.fa-coffee {font-size:200px}
.dropdown  {font-size:20px}
.w3-blue{background-color:#4e69a2, color:#4e69a2 }
</style>
<title>PSB Parks</title>

</head>
<body>
<div class="w3-top">
  <div class="w3-bar w3-red w3-card w3-left-align w3-large">
    <a class="w3-bar-item w3-button w3-hide-medium w3-hide-large w3-right w3-padding-large w3-hover-white w3-large w3-red" href="javascript:void(0);" onclick="myFunction()" title="Toggle Navigation Menu"><i class="fa fa-bars"></i></a>
    
    <a href="#" class="w3-bar-item w3-button w3-padding-large w3-white">Home</a>
   
    <a href="login.html" class="w3-bar-item w3-button w3-hide-small w3-padding-large w3-hover-white">Login</a>
   
    <a href="register.html" class="w3-bar-item w3-button w3-hide-small w3-padding-large w3-hover-white">Register</a>
   <!--  <a href="#" class="w3-bar-item w3-button w3-hide-small w3-padding-large w3-hover-white"></a>
    <a href="#" class="w3-bar-item w3-button w3-hide-small w3-padding-large w3-hover-white">Link 4</a> -->
  </div>

  <!-- Navbar on small screens -->
  <div id="navDemo" class="w3-bar-block w3-white w3-hide w3-hide-large w3-hide-medium w3-large">
    <a href="#" class="w3-bar-item w3-button w3-padding-large">Link 1</a>
    <a href="#" class="w3-bar-item w3-button w3-padding-large">Link 2</a>
    <a href="#" class="w3-bar-item w3-button w3-padding-large">Link 3</a>
    <a href="#" class="w3-bar-item w3-button w3-padding-large">Link 4</a>
  </div>
</div>
	<h1>PSB Parks</h1>
	<div> </div>
<div>
<header class="w3-container  w3-red w3-border-pale-red w3-center " style="padding:40px 16px">
  <h1 class="w3-margin w3-jumbo">PSBusiness Properties</h1>
  <p class="w3-xlarge"></p>
  <!-- <button class="w3-button w3-black w3-padding-large w3-large w3-margin-top">Get Started</button> -->
  <div>
		<form action="tenant" method="post">
			<div class="w3-text-grey">
				<select class="dropdown" id="mySelect" name="location">
					<option value="select valid location">SELECT LOCATION</option>
					<c:forEach items="${finalmap}" var="entry">
						<option value="${entry.key}">${entry.key}</option>
					</c:forEach>
				</select>
			</div>
			<br> <br> <input class="dropdown" type="submit"
				value="Get Tenants">
		</form>
	</div>
</header>

<!-- First Grid -->
<div class="w3-row-padding w3-center w3-container" style="padding:15px 8px">
  <div class="w3-content">
    <div class="w3-twothird">
      <h1><br>PSBusiness Parks</br></h1>
      <h2>Our business is helping your business grow.</h2>
<!--       <h5 class="w3-padding-32">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</h5>
 -->
      <p class="w3-text-grey">
Business parks in great locations offering office/warehouse, industrial and traditional office space. Easily navigate available properties and information to save you time. Onsite leasing and management teams are ready to serve your business needs.</p>
    </div>

    <div class="w3-third w3-center">
      <i class="fa fa-anchor w3-padding-64 w3-text-red"></i>
    </div>
  </div>
</div>

<!-- Second Grid -->
<div class="w3-row-padding w3-light-grey  w3-container">
  <div class="w3-content">
    <div class="w3-third w3-center">
      <i class="fa fa-coffee w3-padding-64 w3-text-red w3-margin-right"></i>
    </div>

    <div class="w3-twothird">
      <h1><br>Customer Center</br></h1>
      <h2>      888-782-6110</h2>

      <p class="w3-text-grey">The PS Business Parks Customer Center provides an easy way to access the payment center, leave comments and questions, or view frequently asked questions. Our online payment center is easy to use and is the best option for last-minute payments. Are we doing a great job or can we do better? Leave your feedback and let us know. View FAQs to get quick answers to your questions.</p>
    </div>
  </div>
</div>

<div class="w3-container w3-center  w3-red">
    <h1 class="w3-margin w3-xlarge ">Quote of the day: live life</h1>
</div>

<!-- Footer -->
<footer class="w3-container w3-padding-64 w3-center w3-opacity">  
  <div class="w3-xlarge w3-padding-32">
    <i class="fa fa-facebook-official w3-hover-opacity"></i>
    <i class="fa fa-instagram w3-hover-opacity"></i>
    <i class="fa fa-snapchat w3-hover-opacity"></i>
    <i class="fa fa-pinterest-p w3-hover-opacity"></i>
    <i class="fa fa-twitter w3-hover-opacity"></i>
    <i class="fa fa-linkedin w3-hover-opacity"></i>
 </div>
<!--  <p>Powered by <a href="https://www.w3schools.com/w3css/default.asp" target="_blank">w3.css</a></p>
 --></footer>

<script>
// Used to toggle the menu on small screens when clicking on the menu button
function myFunction() {
    var x = document.getElementById("navDemo");
    if (x.className.indexOf("w3-show") == -1) {
        x.className += " w3-show";
    } else { 
        x.className = x.className.replace(" w3-show", "");
    }
}
</script>

</body>
</html>
