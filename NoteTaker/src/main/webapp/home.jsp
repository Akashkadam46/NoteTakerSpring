<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Home Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f0f0f0;
        }
        header {
            background-color: #4CAF50;
            color: white;
            padding: 10px 0;
            text-align: center;
        }
        nav {
            margin: 20px;
            text-align: center;
        }
        nav a {
            margin: 0 15px;
            text-decoration: none;
            color: #333;
        }
        nav a:hover {
            text-decoration: underline;
        }
        main {
            margin: 20px;
            padding: 20px;
            background-color: white;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
        }
        footer {
            background-color: #4CAF50;
            color: white;
            text-align: center;
            padding: 10px 0;
            position: fixed;
            width: 100%;
            bottom: 0;
        }
    </style>
</head>
<body>
    <header>
        <h1>Welcome to Home Page</h1>
    </header>
    <nav>
        <a href="home.jsp">Home</a>
        <a href="add_notes.jsp">Add Note</a>
        <a href="all_notes.jsp">Show Note</a>
        <a href="about.jsp">About</a>
        <a href="contact.jsp">Contact</a>
    </nav>
    <main>
        <h2>Home Page Content</h2>
        <p>Welcome to the home page! This is where you can find the latest updates and news.</p>
    </main>
    <footer>
        <p>&copy; 2024 Your Company. All rights reserved.</p>
    </footer>
</body>
</html>
