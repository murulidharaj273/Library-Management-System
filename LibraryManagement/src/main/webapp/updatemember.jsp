<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Update Member</title>
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

        input[type="text"] {
            padding: 12px;
            margin: 10px 0;
            width: 100%;
            border: 1px solid #ddd;
            border-radius: 5px;
            font-size: 16px;
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
        <h3>Update Member's Mobile Number</h3>
        
        <form action="updatemember">
            <label for="member_name">Name</label>
            <input type="text" id="member_name" name="member_name" required>

            <label for="member_mobile">Old Mobile Number</label>
            <input type="text" id="member_mobile" name="member_mobile" required>

            <label for="newmember_mobile">New Mobile Number</label>
            <input type="text" id="newmember_mobile" name="newmember_mobile" required>

            <input type="submit" value="Change Mobile Number">
        </form>
    </div>
</body>
</html>
