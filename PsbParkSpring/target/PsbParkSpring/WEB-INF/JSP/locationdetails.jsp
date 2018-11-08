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

.location {
	font-family: "Comic Sans MS", cursive, sans-serif
}
.w3-blue{background-color:#4e69a2, color:#4e69a2 }
</style>
<title>PSB Parks</title>

</head>
<body>

<div class="w3-container  w3-center  w3-red"
		style="padding: 40px 16px">
		<h1>Details of Selected Location</h1>
	</div>

<div class="w3-row-padding  w3-padding-64 w3-container w3-white ">
		<div class="w3-content w3-red w3-container w3-white">
			<div class="w3-twothird w3-white">
				<!-- <h2 class="">Details of Tenants in the selected Location </h2> -->
				<h4 class="tenant w3-row-padding w3-white">
				
					<div>
						<h3 class='w3-container  w3-center  w3-red loc'>
							Location : ${Location.location}
						</h3>
					</div>
					
					<div class="w3-container location ">

Address Line 1 : ${Location.address.addr_line1}<br>

City : ${Location.address.city}<br>

State : ${Location.address.state}<br>

Zipcode: ${Location.address.zipcode}<br>

Email Id : ${Location.contact.email_id}<br>

Contact Number : ${Location.contact.phone_number}<br>
</div>
	</h4>

			</div>
		</div>
	</div>

	<div class="w3-container w3-center  w3-red">
		<h1 class="w3-margin w3-xlarge ">Quote of the day: live life</h1>
	</div>
	
</body>
</html>