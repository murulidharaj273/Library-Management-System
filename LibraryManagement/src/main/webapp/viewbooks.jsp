<%@ page import="java.util.*, com.spring.boot.entity.Book" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Library Book Inventory</title>
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
            max-width: 900px;
            margin-top: 20px;
            border-collapse: collapse;
            background-color: #fff;
            box-shadow: 0 4px 12px rgba(0, 0, 0, 0.1);
        }

        th, td {
            padding: 12px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }

        th {
            background-color: #f2f2f2;
            color: #555;
        }

        tr:hover {
            background-color: #f1f1f1;
        }

        p {
            color: #888;
        }

    </style>
</head>
<body>

    <h2>Library Book Inventory</h2>

    <%
        List<Book> books = (List<Book>) request.getAttribute("books");
        if (books != null && !books.isEmpty()) {
    %>
        <table>
            <tr>
                <th>ID</th>
                <th>Title</th>
                <th>Author</th>
                <th>Genre</th>
                <th>ISBN</th>
                <th>Quantity</th>
                <th>Condition</th>
            </tr>
            <%
                for (Book book : books) {
            %>
            <tr>
                <td><%= book.getBook_id() %></td>
                <td><%= book.getTitle() %></td>
                <td><%= book.getAuthor() %></td>
                <td><%= book.getGenre() %></td>
                <td><%= book.getIsbn() %></td>
                <td><%= book.getQuantity() %></td>
                <td><%= book.getCondition() %></td>
            </tr>
            <%
                }
            %>
        </table>
    <%
        } else {
    %>
        <p>No books found in the library.</p>
    <%
        }
    %>

</body>
</html>

