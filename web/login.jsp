<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>login</title>
	<style type="text/css">
		body{
			background: linear-gradient(116.37deg, rgba(27, 207, 180, 0.47) 0%, rgba(27, 207, 180, 0.3666) 59.94%);
		}.login-box{
			position: absolute;
			width: 350px;
			height: 400px;
			top: 110px;
			left: 510px;
			background: #FFFFFF;
			border-radius: 40px;
		}.font-login{
			font-family: sans-serif;
			font-style: normal;
			font-weight: lighter;
			font-size: 35px;
			text-align: center;
			line-height: 100px;
			color: #000000;
		}.btn-login{
			position: absolute;
			width: 100px;
			height: 30px;
			left: 125px;
			top: 280px;
			background: rgba(47, 157, 191, 0.75);
			border-radius: 20px;
			font-family: sans-serif;
			font-size: 17px;
			color: #FFFFFF;
		}.username-box{
			position: absolute;
			width: 220px;
			height: 30px;
			left: 80px;
			top: 140px;
			background: #FFFFFF;
			mix-blend-mode: normal;
			border: 1px solid #000000;
			box-sizing: border-box;
			font-style: oblique;
		}.password-box{
			position: absolute;
			width: 220px;
			height: 30px;
			left: 80px;
			top: 200px;
			background: #FFFFFF;
			mix-blend-mode: normal;
			border: 1px solid #000000;
			box-sizing: border-box;
			font-style: oblique;
		}.user-icon{
			position: absolute;
			width: 21px;
			height: 21px;
			left: 50px;
			top: 144.5px;
		}.pass-icon{
			position: absolute;
			width: 20px;
			height: 20px;
			left: 50px;
			top: 205px;
		}
	</style>
</head>
<body>
	<form method="POST" action="LoginServlet">
		<div class="login-box">
			<h2 class="font-login">LOGIN</h2>
			<img src="user.png" class="user-icon">
			<input type="text" name="nama" placeholder="Username"class="username-box">
			<img src="pass.png" class="pass-icon">
			<input type="password" class="password-box" name="password" placeholder="Password">
			<button type="submit" value="login" class="btn-login">Login</button>
		</div>
	</form>
	
</body>
</html>
