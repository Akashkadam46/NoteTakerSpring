<%@page import="in.infinite.entities.Note"%>
<%@page import="in.infinite.helper.FactoryProvider"%>
<%@page import="org.hibernate.Session"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@include file="all_js_css.jsp"%>
</head>
<body>


	<div class="container-fluid">
		<%@include file="navbar.jsp"%>


		<h1>Edit Your Note</h1>
		<%
			int noteId = Integer.parseInt(request.getParameter("note_id").trim());
			Session s = FactoryProvider.getFactory().openSession();
			Note note = s.get(Note.class, noteId);
		%>

		<form action="UpdateServlet" method="post">
		
		<input value="<%= note.getId()%>" name="noteId" type="hidden" />
		
			<div class="form-group">
				<label for="title">Note Title</label> <input required type="text"
					name="title" class="form-control" id="title"
					aria-describedby="emailHelp" placeholder="Enter id" value="<%=note.getNote() %>" />
			</div>


			<div class="form-group">
				<label for="content">Note Content</label>
				<textarea required name="content" id="content"
					placeholder="Enter enter your content" class="form-control"
					style="height: 300px;"><%=note.getTitle() %></textarea>
			</div>

			<div class="container text-center">

				<button type="submit" class="btn btn-success">Save Your Note</button>

			</div>
		</form>
	</div>

</body>
</html>