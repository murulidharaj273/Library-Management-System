
<html>
<head>
    <title>Register New Library Admin</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f3f3f3;
            margin: 0;
            padding: 0;
            display: flex;
            flex-direction: column;
            align-items: center;
        }

        h3 {
            color: #333;
            margin-top: 40px;
            font-size: 24px;
        }

        form {
            width: 80%;
            max-width: 400px;
            background-color: white;
            padding: 20px;
            box-shadow: 0 2px 6px rgba(0, 0, 0, 0.1);
            margin-top: 20px;
        }

        label {
            display: block;
            margin-bottom: 8px;
            font-weight: bold;
        }

        input[type="text"],
        input[type="password"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 20px;
            border: 1px solid #ddd;
            border-radius: 4px;
        }

        input[type="submit"] {
            padding: 12px 20px;
            font-size: 16px;
            cursor: pointer;
            background-color: #17a2b8;
            color: white;
            border: none;
            border-radius: 4px;
        }

        input[type="submit"]:hover {
            background-color: #138496;
        }

        p {
            font-size: 16px;
            color: #666;
            margin-top: 20px;
        }

        a {
            color: #17a2b8;
            text-decoration: none;
        }

        a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>

    <h3>Register New Library Admin</h3>

    <form action="addUser">
        <label for="name">Name</label>
        <input type="text" id="name" name="name" required>

        <label for="username">Username</label>
        <input type="text" id="username" name="username" required>

        <label for="password">Password</label>
        <input type="password" id="password" name="password" required>

        <input type="submit" value="Register New Library Admin">
    </form>

    <p>Pre-existing User? <a href="login.jsp">Login here</a></p>

</body>
</html>