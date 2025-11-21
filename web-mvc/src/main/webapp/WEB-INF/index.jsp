<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
    body {
        background-color: black;
        color: azure;
        margin: 20%;
    }

    h1 {
        text-align: center;
    }

    div {
        background-color: rgb(75, 75, 75);
        align-self: center;
        text-align: center;
    }
</style>
<html>
<body>

    <h1><i class="fa fa"></i>   Welcome Canifete #${id}   <i class="fa fa-thumbs-o-up"></i></h1>

    <hr>

    <div>

        <h2><i class="fa fa-hand-peace-o"></i>  ${name}</h2>

        <h3><i class="fa fa-envelope"></i>   ${email}</h3>

        <h3><i class="fa fa-mobile-phone"></i>   ${phone}</h3>

    </div>

</body>
</html>
