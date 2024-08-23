<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Table</title>
    <link rel="icon" type="image/png" href="images/Bharti_Airtel_Logo.png">
</head>
<body>
<h1>Customer Table</h1>
<p><a href="/Customer">Go to Customer Page</a></p>
<p><a href="/">Go to Index Page</a></p>

<!-- Form for submitting customer details -->
<form action="/saveCustomer" method="post">
    <label for="customerName">Customer Name:</label>
    <input type="text" id="customerName" name="customerName" required><br><br>
    
    <label for="address">Address:</label>
    <input type="text" id="address" name="address" required><br><br>
    
    <label for="status">Status:</label>
    <select id="status" name="status" required>
        <option value="ACTIVE">ACTIVE</option>
        <option value="INACTIVE">INACTIVE</option>
        <option value="TEMPORARILY_HOLDED">TEMPORARILY HOLDED</option>
    </select><br><br>
    
    <input type="submit" value="Submit">
</form>

</body>
</html>
