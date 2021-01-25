<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<html>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
      integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <style>
        strong {text-align: center;}
        head {text-align: center;}
        div {text-align: center;}
        br {text-align: center;}
        body {text-align: center;}
        span, input {margin: 5px;}

        button {
            background-color: #4CAF50;
            color: white;
        }

    </style>

    <title>Index</title>
    <body>

        <div>
            <form method="post" action="/post">
                Product Name:
                <label>
                    <input type="text" name="productName">
                </label>

                Product Price:
                <label>
                    <input type="number"  step="0.01" min="0" name="productPrice">
                </label>

                <div>
                    <button type="submit">Post The Product!</button>
                </div>

            </form>
            <form method="get" action="/all">
                <div>
                    <button type="submit">Get All</button>
                </div>
            </form>
        </div>
    </body>
</html>