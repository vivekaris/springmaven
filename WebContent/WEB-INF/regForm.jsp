<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="mvc" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.formFieldError { background-color: #FFC; }
</style>
</head>
<body>

<h2>User Registration Form</h2>
<mvc:form modelAttribute="s" action="result" method="post">
<table>
<tr>
<td>ID</td>
<td><input type="text" name="student_id" /></td>
</tr>
<tr>
<td>Name</td>
<td><input type="text" name="student_name" /></td>
<td><mvc:errors path="student_name" /></td>
</tr>
<tr>
<td>Msg</td>
<td><input type="text" name="student_msg" /></td>
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