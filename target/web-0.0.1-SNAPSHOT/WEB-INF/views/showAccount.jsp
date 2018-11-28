<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored = "false" %>
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
 <%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form" %>
<%@ taglib prefix = "spring" uri = "http://www.springframework.org/tags"  %>	
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><spring:message code ="lbl.title"/></title>
</head>
<body>

<h2><c:out value = "Using Model"/></h2>
<p><spring:message code ="lbl.accountNumber"/> : 		${account.accountNumber} </p>
<p> <spring:message code ="lbl.accountHolderName"/> : 	${account.accountHolderName} </p>
<p><spring:message code ="lbl.accountBalance"/> : 	    ${account.accountBalance} </p>
<p><spring:message code ="lbl.accountType"/> : 			${account.accountType} </p>
<p> <spring:message code ="lbl.dob"/> : 				${account.dateOfBirth} </p>
<p><spring:message code ="lbl.psCode"/> : 	   			${account.psCode} </p>



</body>
</html>