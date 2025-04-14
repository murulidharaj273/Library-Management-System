<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Borrow a Book</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f9f9f9;
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
            color: #333;
            margin-top: 40px;
            font-size: 24px;
        }

        form {
            background-color: #fff;
            padding: 20px;
            margin: 20px;
            border-radius: 8px;
            box-shadow: 0 2px 6px rgba(0, 0, 0, 0.1);
            width: 100%;
            max-width: 400px;
        }

        input[type="text"] {
            width: 90%;
            padding: 10px;
            margin: 8px 0;
            border: 1px solid #ccc;
            border-radius: 5px;
            font-size: 14px;
        }

        input[type="submit"] {
            width: 100%;
            padding: 12px;
            background-color: #007bff;
            color: white;
            border: none;
            border-radius: 6px;
            font-size: 16px;
            cursor: pointer;
            margin-top: 12px;
            transition: background-color 0.3s ease;
        }

        input[type="submit"]:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>

    <h3>Borrow a Book</h3>

    <form action="borrowbook">
        <input type="text" name="member_mobile" placeholder="Member Mobile" required><br>
        <input type="text" name="isbn" placeholder="Book ISBN" required><br>
        <input type="submit" value="Borrow Book">
    </form>

    <form action="viewborrows">
        <input type="submit" value="Show Borrower Details">
    </form>

</body>
</html>
