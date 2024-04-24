<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Product Discount Calculator</title>
</head>
<body>
    <h1><%= "Product Discount Calculator" %></h1>
    <form action = "discount" method="post">
        <labelfor ="description">Product Description:</label>
        <input type="text" id="description" name="description" required><br><br>

        <label for="listPrice">List Price:</label>
        <input type="number" id="listPrice" name="listPrice" min="0" required><br><br>

        <label for="discountPercent">Discount Percent:</label>
        <input type="number" id="discountPercent" name="discountPercent" min="0" max="100" required><br><br>

        <button type="submit">Calculate Discount</button>
    </form>
<br/>
<a href="Product Discount Calculator">Product Discount Calculator</a>
</body>
</html>