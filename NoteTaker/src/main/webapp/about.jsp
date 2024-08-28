<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>About Us</title>
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
        <h1>About Us</h1>
    </header>
    <nav>
        <a href="home.jsp">Home</a>
        <a href="about.jsp">About</a>
        <a href="contact.jsp">Contact</a>
    </nav>
    <main>
        <h2>Our Story</h2>
        <p>We are a company dedicated to providing the best services to our customers. Our journey began in [Year], and since then, we have been committed to excellence in every aspect of our business.</p>
        <h3>Our Mission</h3>
        <p>Our mission is to [mission statement]. We strive to achieve this by [how you achieve your mission].</p>
        <h3>Our Team</h3>
        <p>Our team is composed of experienced professionals who are passionate about what they do. Meet our team members:</p>
        <ul>
            <li>Akash Kadam - CEO</li>
            <li>Ganesh Kadam - CTO</li>
            <li>Saurabh Kadam - CFO</li>
        </ul>
    </main>
    <footer>
        <p>&copy; 2024 Your Company. All rights reserved.</p>
    </footer>
</body>
</html>
