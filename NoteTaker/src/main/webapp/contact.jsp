<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Contact Us</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            display: flex;
            flex-direction: column;
            min-height: 100vh;
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
            flex: 1;
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
            position: relative;
            bottom: 0;
            width: 100%;
        }
        form {
            display: flex;
            flex-direction: column;
        }
        label {
            margin: 10px 0 5px;
        }
        input, textarea {
            padding: 10px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }
        button {
            padding: 10px;
            background-color: #4CAF50;
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }
        button:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
    <header>
        <h1>Contact Us</h1>
    </header>
    <nav>
        <a href="home.jsp">Home</a>
        <a href="about.jsp">About</a>
        <a href="contact.jsp">Contact</a>
    </nav>
    <main>
        <h2>Get in Touch</h2>
        <p>If you have any questions or need further information, please feel free to contact us through the form below.</p>
        <form action="contact-form-handler.jsp" method="post">
            <label for="name">Name:</label>
            <input type="text" id="name" name="name" required>
            <label for="email">Email:</label>
            <input type="email" id="email" name="email" required>
            <label for="message">Message:</label>
            <textarea id="message" name="message" rows="5" required></textarea>
            <button type="submit">Submit</button>
        </form>
    </main>
    <footer>
        <p>&copy; 2024 Your Company. All rights reserved.</p>
    </footer>
</body>
</html>
