<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.fruitstuff.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
	<h1>Fruit Stand - Read</h1>

	<table style="width: 80%;">
		<tr>
			<th>idfruit_id</th>
			<th>fruit_name</th>
			<th>fruit_taste</th>
			<th>fruit_price</th>
			<th>fruit_season</th>
		</tr>
		<%
			DAO.readFromDB();
		%>
		<%
			Fruit readToJSP = new Fruit();
			for (int i = 0; i < DAO.ourFruit.size(); i++) {

				readToJSP = DAO.ourFruit.get(i);
		%>
		<tr>
			<td><%=readToJSP.getIdfruit_id()%></td>
			<td><%=readToJSP.getFruit_name()%></td>
			<td><%=readToJSP.getFruit_taste()%></td>
			<td><%=readToJSP.getFruit_price()%></td>
			<td><%=readToJSP.getFruit_season()%></td>
		</tr>
		<%} %>
		<%DAO.ourFruit.clear(); %>
	</table>

<div>
</div>
<div>
</div>
<!-- /#page-content-wrapper -->

	</div>
	<!-- /#wrapper -->

	<!-- jQuery -->
	<script src="js/jquery.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="js/bootstrap.min.js"></script>

	<!-- Menu Toggle Script -->
	<script>
		$("#menu-toggle").click(function(e) {
			e.preventDefault();
			$("#wrapper").toggleClass("toggled");
		});
	</script>

</html><!-- /#page-content-wrapper -->

	</div>
	<!-- /#wrapper -->

	<!-- jQuery -->
	<script src="js/jquery.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="js/bootstrap.min.js"></script>

	<!-- Menu Toggle Script -->
	<script>
		$("#menu-toggle").click(function(e) {
			e.preventDefault();
			$("#wrapper").toggleClass("toggled");
		});
	</script>

</html>