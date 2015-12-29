<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Form Submitted</title>
</head>
<body>
<h1>${headerMessage}</h1>
<h1>Form SucessFully Submitted</h1>
<h2>Your Details :</h2>
<table>
<tr><td>Your name :</td>
<td>${student1.name}</td>
</tr>

<tr>
<td>Your Hobby :</td>
<td>${student1.hobby}</td>
</tr>

<tr>
<td>Your DOB :</td>
<td>${student1.dob}</td>
</tr>

<tr>
<td>Your Mobile :</td>
<td>${student1.mobile}</td>
</tr>

<tr>
<td>Your Address :</td>
<td>Country :${student1.address.country}
City :${student1.address.city}
Street :${student1.address.street}
ZipCode :${student1.address.zipcode}</td>
</tr>

<tr>
<td>Your Skills :</td>
<td>${student1.skills}</td>
</tr>
</table>

</body>
</html>