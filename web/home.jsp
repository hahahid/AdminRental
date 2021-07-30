<%-- 
    Document   : home
    Created on : Dec 9, 2020, 2:37:28 AM
    Author     : ADELINE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Rentor</title>
	</head>
	<style type="text/css">
	body{
    background: #E0ECEA;
	}
    .navbar{
    position: absolute;
    width: 100%;
    height: 7%;
    left: 0px;
    top: 0px;
    background: #FFFFFF;
    box-shadow: 0px 0px 10px rgba(159, 159, 159, 0.84);
    }
    .button{
    position: absolute;
    width: 100px;
    height: 35px;
    right: 10px;
    top: 5px;
    background: #1BCFB4;
    box-shadow: 0px 0px 4px rgba(83, 83, 83, 0.25);
    border-radius: 10px;
    border-width: 0px;
    }
    .box1{
    position: absolute;
    width: 300px;
    height: 250px;
    left: 335px;
    top: 210px;
    background: #FFFFFF;
    box-shadow: 0px 0px 4px rgba(150, 150, 150, 0.25);
    border-radius: 20px;
    border-width: 0px;
    font-family: sans-serif;
    font-size: 25px;
    color: #1BCFB4;
    }
    .box2{
    position: absolute;
    width: 300px;
    height: 250px;
    left: 735px;
    top: 210px;
    background: #FFFFFF;
    box-shadow: 0px 0px 4px rgba(150, 150, 150, 0.25);
    border-radius: 20px;
    border-width: 0px;
    font-family: sans-serif;
    font-size: 25px;
    color: #1BCFB4;
    }
    .font{
    font-family: sans-serif;
    font-style: normal;
    font-weight: normal;
    font-size: 50px;
    line-height: 57px;
    text-align: center;
    color: #1BCFB4;
    }
    .img{
    width: 130px;
    height: 130px;
    }

	</style>
	<body>
    <div class="navbar">
        <img src="icon.png" width="40" height="40">
        <img src="rentor.png" width="147" height="32">
        <form action="LogoutServlet">
        <button class="button">LOGOUT</button>
        </form>
    </div>
    <form method="POST" action="DataMotor.jsp">
    <button type="submit" value="data motor" class="box1">
        <img src="motor.png" class="img"><br><br>
        DATA MOTOR
    </button>
    </form>
    <form method="POST" action="Peminjaman.jsp">
    <button type="submit" value="data motor" class="box2">
        <img src="peminjaman.png" class="img"><br><br>
        PEMINJAMAN
    </button>
    </form>
	</body>
</html>
