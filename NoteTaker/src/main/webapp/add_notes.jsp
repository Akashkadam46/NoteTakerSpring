<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Note Taker : Home Page</title>
<%@include file="all_js_css.jsp"%>
</head>
<body>

	<div class="container-fluid">
		<%@include file="navbar.jsp"%>
		<br>

		<h1>Please Fill Your Note Detail</h1>
		<br>

		<!--this is add Forms  -->

		<form action="SaveNoteServlet" method="post">
			<div class="form-group">
				<label for="title">Note Title</label> 
				<input required type="text"
				   name="title"
					class="form-control" 
					id="title" aria-describedby="emailHelp"
					placeholder="Enter id" />
			</div>


			<div class="form-group">
				<label for="content">Note Content</label>
				<textarea required
				name="content"
				 id="content"
					placeholder="Enter enter your content" class="form-control"
					style="height: 300px;"></textarea>
			</div>

			<div class="container text-center">

				<button type="submit" class="btn btn-primary">Add</button>

			</div>
		</form>
	</div>

</body>
</html>