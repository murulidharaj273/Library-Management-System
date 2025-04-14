<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Borrowing Management</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f5f5f5;
            margin: 0;
            padding: 0;
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: flex-start;
            height: 100vh;
            text-align: center;
        }

        h3 {
            margin-top: 40px;
            font-size: 24px;
            color: #333;
        }

        .links-container {
            margin-top: 30px;
            width: 100%;
            max-width: 400px;
        }

        a {
            display: block;
            margin: 12px 0;
            padding: 12px;
            text-decoration: none;
            background-color: #007bff;
            color: white;
            border-radius: 5px;
            font-size: 16px;
            transition: background-color 0.3s ease;
        }

        a:hover {
            background-color: #0056b3;
        }

        form {
            margin-top: 30px;
        }

        input[type="submit"] {
            padding: 12px;
            background-color: #dc3545;
            color: white;
            border: none;
            border-radius: 5px;
            font-size: 16px;
            width: 100%;
            max-width: 400px;
            transition: background-color 0.3s ease;
        }

        input[type="submit"]:hover {
            background-color: #bd2130;
        }
    </style>
</head>
<body>

    <h3>Borrowing Management</h3>

    <div class="links-container">
        <a href="borrow.jsp">Borrow Book</a>
        <a href="return.jsp">Return Book</a>
    </div>

    <form action="viewoverdue">
        <input type="submit" value="View Overdue Members">
    </form>

</body>
</html>



