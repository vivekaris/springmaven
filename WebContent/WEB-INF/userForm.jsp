<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="mvc" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>User Registration Form</h2>
<mvc:form modelAttribute="student1" action="result">
<table>
<tr>
<td><mvc:label path="student_id">ID</mvc:label></td>
<td><mvc:input path="student_id" /></td>
</tr>
<tr>
<td><mvc:label path="student_name"> Name</mvc:label></td>
<td><mvc:input path="student_name" /></td>
</tr>
<tr>
<td><mvc:label path="student_msg">msg</mvc:label></td>
<td><mvc:input path="student_msg" /></td>
</tr>


<tr>
<td colspan="2">
<input type="submit" value="Submit" />
</td>
</tr>
</table>
</mvc:form>

</body>
</html>