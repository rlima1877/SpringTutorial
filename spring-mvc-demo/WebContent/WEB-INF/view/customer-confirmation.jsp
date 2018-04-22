<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

<head>
<title>Customer Confirmation Page</title>
</head>

<body>

The customer is confirmed : ${customer.firstName} ${customer.lastName }

<br><br>

Free passes: ${customer.freePasses }

<br><br>

Postal code: ${customer.zipCode }

<br><br>

Course code: ${customer.courseCode }

</body>

</html>