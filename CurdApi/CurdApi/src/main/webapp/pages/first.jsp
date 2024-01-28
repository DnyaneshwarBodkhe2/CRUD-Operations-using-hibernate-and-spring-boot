_<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>

	<form action="saveinformation" method="post">
		<h3>Login page</h3>
		id: <input type="text" name=id><br> <br> name: <input
			type="text" name=name><br> <br> <input
			type="Submit">

		<button type="submit" formaction="updatedata">Update</button>
		<button type="submit" formaction="deletedata">Delete</button>
		<input type="reset">

	</form>
<html>
<head>
<style>
table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

td, th {
	border: 1px solid #dddddd;
	text-align: left;
	padding: 8px;
}

tr:nth-child(even) {
	background-color: #dddddd;
}
</style>
</head>
<body>
	<center>
		<h2>Employee Detail</h2>
	</center>


	<table>
		<tr>
			<th>EmpId</th>
			<th>EmpName</th>

		</tr>

		<%
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/b156", "root", "root");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(" SELECT * FROM b156.employee_detail;");
		while (rs.next()) {
			out.println("<tr><td>" + rs.getString(1) + "</td><td>" + rs.getString(2) + "</td></tr>");

		}
		%>

	</table>
</body>
</html>