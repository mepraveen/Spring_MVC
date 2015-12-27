<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Addmission Form</title>
</head>
<body>
	<h1>${headerMessage}</h1>
	<h1>Enter your Details:</h1>
	<form:errors path="student1.*"/>
	
	<form action="/Spring_MVC/form/submit" method="POST">
		<table>
			<tr>
				<td>Student Name :</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>Student Hobby :</td>
				<td><input type="text" name="hobby"></td>
			</tr>
			<tr>
				<td>Student Mobile :</td>
				<td><input type="text" name="mobile"></td>
			</tr>
			<tr>
				<td>Student DOB :</td>
				<td><input type="text" name="dob"></td>
			</tr>

			<tr>
				<td>Student SkillS :</td>
				<td><select name="skills" multiple="multiple">
						<option value="java">JAVA</option>
						<option value="spring">SPRING</option>
						<option value="hibernate">HIBERNATE</option>
						<option value="jsp">JSP</option>

				</select></td>
			</tr>

			<tr>
				<td>Student Adress :</td>
			</tr>
			<tr>
				<td>Country :<input type="text" name="address.country"></td>
				<td>City :<input type="text" name="address.city"></td>
				<td>Street :<input type="text" name="address.street"></td>
				<td>Zipcode :<input type="text" name="address.zipcode"></td>
			</tr>



			<tr>
				<td><input type="submit" value="SUBMIT"></td>
			</tr>

		</table>


	</form>

</body>
</html>