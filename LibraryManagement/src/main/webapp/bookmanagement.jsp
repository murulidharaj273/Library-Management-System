<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Manage Books</title>
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

        h2 {
            color: #333;
            margin: 30px 0;
            font-size: 24px;
        }

        .links-container {
            width: 100%;
            max-width: 400px;
            margin: 0 auto;
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
            background-color: #28a745;
            color: white;
            border: none;
            border-radius: 5px;
            font-size: 16px;
            width: 100%;
            transition: background-color 0.3s ease;
        }

        input[type="submit"]:hover {
            background-color: #218838;
        }
    </style>
</head>
<body>

    <h2>Manage Books</h2>

    <div class="links-container">
        <a href="addbook.jsp">Add new book</a>
        <a href="updatebook.jsp">Update book</a>
        <a href="deletebook.jsp">Delete book</a>
    </div>

    <form action="viewbooks">
        <input type="submit" value="View all books">
    </form>

</body>
</html>
