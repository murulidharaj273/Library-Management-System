<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add Book</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            flex-direction: column;
        }

        h2 {
            color: #333;
            margin-bottom: 20px;
        }

        form {
            background-color: #fff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 4px 12px rgba(0, 0, 0, 0.1);
            width: 80%;
            max-width: 500px;
            margin-top: 20px;
        }

        label {
            font-size: 16px;
            color: #555;
            display: block;
            margin: 10px 0 5px;
        }

        input[type="text"],
        input[type="number"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 15px;
            border: 1px solid #ddd;
            border-radius: 4px;
            font-size: 16px;
        }

        input[type="submit"] {
            width: 100%;
            padding: 10px;
            background-color: #4CAF50;
            color: white;
            border: none;
            border-radius: 4px;
            font-size: 16px;
            cursor: pointer;
            transition: background-color 0.3s;
        }

        input[type="submit"]:hover {
            background-color: #45a049;
        }

    </style>
</head>
<body>

    <h2>Add New Book</h2>

    <form action="addbook">
        <label for="title">Title</label>
        <input type="text" id="title" name="title" required>

        <label for="author">Author</label>
        <input type="text" id="author" name="author" required>

        <label for="genre">Genre</label>
        <input type="text" id="genre" name="genre" required>

        <label for="isbn">ISBN</label>
        <input type="text" id="isbn" name="isbn" required>

        <label for="quantity">Quantity</label>
        <input type="number" id="quantity" name="quantity" required>

        <label for="book_condition">Book Condition</label>
        <input type="text" id="book_condition" name="book_condition" required>

        <input type="submit" value="Add Book">
    </form>

</body>
</html>

