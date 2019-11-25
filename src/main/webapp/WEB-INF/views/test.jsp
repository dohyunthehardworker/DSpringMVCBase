<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>TestPage</title>
</head>
<body>
	<h1>Hello world!</h1>

	<P>Server Time : ${serverTime}</P>
	<P>Database connection : ${databaseConnectionResult}</P>

</body>
</html>
