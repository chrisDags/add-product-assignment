<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>All Products</title>

    <body>
        <table class="table">
            <thead>
            <tr>
                <th>Product Name</th>
                <th>Product Price</th>
            </tr>
            </thead>

            <tbody>
            <jsp:useBean id="products" scope="request" type="java.util.List"/>
            <c:forEach items="${products}" var="product">
                <tr>
                    <td>${product.getProductName()}</td>
                    <td>${product.getProductPrice()}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>

    <input type="button" value="Back to index page" onclick="window.location='/'" >

    </body>
</html>