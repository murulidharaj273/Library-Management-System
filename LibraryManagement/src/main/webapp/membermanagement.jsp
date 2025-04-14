<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Manage Members</title>
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

        .container {
            background-color: #fff;
            padding: 30px;
            border-radius: 8px;
            box-shadow: 0 4px 12px rgba(0, 0, 0, 0.1);
            width: 100%;
            max-width: 600px;
            text-align: center;
        }

        h3 {
            color: #333;
            margin-bottom: 20px;
        }

        a {
            color: #4CAF50;
            text-decoration: none;
            font-weight: bold;
            display: block;
            margin: 10px 0;
        }

        a:hover {
            text-decoration: underline;
        }

        hr {
            border: 0;
            border-top: 1px solid #ddd;
            margin: 20px 0;
        }

        input[type="submit"] {
            padding: 12px 20px;
            background-color: #4CAF50;
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            font-size: 16px;
            width: 100%;
            margin-top: 20px;
        }

        input[type="submit"]:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
    <div class="container">
        <h3>Manage Members</h3>
        
        <a href="addmember.jsp">Insert member</a>
        <a href="deletemember.jsp">Delete members</a>
        <a href="updatemember.jsp">Update members</a>
        
        <form action="viewmembers">
            <input type="submit" value="Show all members">
        </form>
    </div>
</body>
</html>
