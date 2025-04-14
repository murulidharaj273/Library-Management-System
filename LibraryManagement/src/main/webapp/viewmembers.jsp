<%@ page import="java.util.*, com.spring.boot.entity.Members" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>All Members</title>
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

        table {
            width: 80%;
            margin-top: 20px;
            border-collapse: collapse;
            background-color: #fff;
            box-shadow: 0 4px 12px rgba(0, 0, 0, 0.1);
            border-radius: 8px;
        }

        th, td {
            padding: 12px;
            text-align: center;
            border: 1px solid #ddd;
        }

        th {
            background-color: #4CAF50;
            color: white;
        }

        tr:nth-child(even) {
            background-color: #f9f9f9;
        }

        tr:hover {
            background-color: #f1f1f1;
        }

        p {
            color: #777;
            font-size: 16px;
        }
    </style>
</head>
<body>

    <h2>All Members</h2>

    <%
        List<Members> members = (List<Members>) request.getAttribute("members");
        if (members != null && !members.isEmpty()) {
    %>
        <table>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Mobile</th>
            </tr>
            <%
                for (Members m : members) {
            %>
            <tr>
                <td><%= m.getMember_id() %></td>
                <td><%= m.getMember_name() %></td>
                <td><%= m.getMember_mobile() %></td>
            </tr>
            <% 
                }
            %>
        </table>
    <%
        } else {
    %>
        <p>No members found.</p>
    <%
        }
    %>

</body>
</html>
