<%@ page import="java.util.*, com.spring.boot.entity.BorrowRecord" %>
<html>
<head>
    <title>Currently Borrowed Books</title>
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

        table {
            border-collapse: collapse;
            width: 95%;
            max-width: 1000px;
            background-color: white;
            box-shadow: 0 2px 6px rgba(0,0,0,0.1);
            margin: 20px 0;
        }

        th, td {
            border: 1px solid #ddd;
            padding: 12px 16px;
            text-align: center;
        }

        th {
            background-color: #007BFF;
            color: white;
        }

        tr:nth-child(even) {
            background-color: #f9f9f9;
        }

        p {
            font-size: 16px;
            margin-top: 20px;
            color: #666;
        }
    </style>
</head>
<body>

    <h3>Currently Borrowed Books</h3>

    <%
        List<BorrowRecord> borrowList = (List<BorrowRecord>) request.getAttribute("borrowList");
        if (borrowList != null && !borrowList.isEmpty()) {
    %>
        <table>
            <tr>
                <th>Member Name</th>
                <th>Member Mobile</th>
                <th>ISBN</th>
                <th>Title</th>
                <th>Borrow Date</th>
                <th>Due Date</th>
                <th>Status</th>
            </tr>
            <% for (BorrowRecord b : borrowList) { %>
                <tr>
                    <td><%= b.getMember_name() %></td>
                    <td><%= b.getMember_mobile() %></td>
                    <td><%= b.getIsbn() %></td>
                    <td><%= b.getTitle() %></td>
                    <td><%= b.getBorrow_date() %></td>
                    <td><%= b.getDue_date() %></td>
                    <td><%= b.getStatus() %></td>
                </tr>
            <% } %>
        </table>
    <%
        } else {
    %>
        <p>No borrowed records available.</p>
    <%
        }
    %>

</body>
</html>
