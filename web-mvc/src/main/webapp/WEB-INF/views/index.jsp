<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <style>
        body {
            background-color: black;
            color: azure;
            margin: 20%;
            display: flex;
            flex-direction: column;
            justify-content: center;
            gap: 20px;
        }
        header {
            align-self: center;
            text-align: center;
            border: dotted white;
            border-radius: 10px;
            display: flex;
            justify-content: center;
        }
        div {
            background-color: rgb(75, 75, 75);
            align-self: center;
            text-align: center;
            padding: 10px;
            border: 2px solid white;
            border-radius: 10px;
            display: flex;
            flex-direction: column;
            justify-content: center;
        }
    </style>
</head>
<body>

<header>
    <h1>
        <i class="fa fa-graduation-cap"></i>
        Welcome Canifete #${id}
        <i class="fa fa-thumbs-o-up"></i>
    </h1>
</header>

<div>
    <h2><i class="fa fa-hand-peace-o"></i> ${name}</h2>
    <h3><i class="fa fa-envelope"></i> ${email}</h3>
    <h3><i class="fa fa-mobile-phone"></i> ${phone}</h3>
</div>

</body>
</html>
