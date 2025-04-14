<%@ page import="java.util.*" %>
<html>
<head>
    <title>Genre-wise Borrow Report</title>
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

        h2 {
            color: #333;
            margin-top: 40px;
            font-size: 24px;
        }

        table {
            border-collapse: collapse;
            width: 80%;
            max-width: 800px;
            background-color: white;
            box-shadow: 0 2px 6px rgba(0, 0, 0, 0.1);
            margin-top: 20px;
        }

        th, td {
            border: 1px solid #ddd;
            padding: 12px 16px;
            text-align: center;
        }

        th {
            background-color: #17a2b8;
            color: white;
        }

        tr:nth-child(even) {
            background-color: #f9f9f9;
        }

        p {
            font-size: 16px;
            color: #666;
        }
    </style>
</head>
<body>

    <h2>Genre-wise Borrow Report</h2>

    <%
        List<Map<String, Object>> reportData = (List<Map<String, Object>>) request.getAttribute("reportData");
        if (reportData != null && !reportData.isEmpty()) {
    %>
        <table>
            <tr>
                <th>Genre</th>
                <th>Borrow Count</th>
            </tr>
            <% for (Map<String, Object> row : reportData) { %>
                <tr>
                    <td><%= row.get("genre") %></td>
                    <td><%= row.get("count") %></td>
                </tr>
            <% } %>
        </table>
    <%
        } else {
    %>
        <p>No borrow report data available.</p>
    <%
        }
    %>

</body>
</html>

