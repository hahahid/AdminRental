<%-- 
    Document   : InputData
    Created on : Dec 9, 2020, 2:55:33 AM
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
    position: relative;
	background: linear-gradient(116.37deg, rgba(27, 207, 180, 0.47) 0%, rgba(27, 207, 180, 0.3666) 59.94%);
	}
    #card{
    position: absolute;
    width: 450px;
    height: 400px;
    left: 425px;
    top: 100px;
    background: #FFFFFF;
    border-radius: 40px;
    }
    #font-data{
    font-family: sans-serif;
    font-style: normal;
    font-weight: normal;
    font-size: 40px;
    line-height: 57px;
    color: #000000;
    }
    #font-form{
    font-family: sans-serif;
    font-style: normal;
    font-weight: 300;
    font-size: 20px;
    line-height: 36px;
    color: #000000;
    }
    .button {
    position: absolute;
    left: 265px;
    top: 300px;
    background: rgba(47, 157, 191, 0.75);
    height: 35px;
    width: 125px;
    border: 1px;
    cursor: pointer;
    color: #ffffff;
    padding-up: 20px;
    padding-bottom: 20px;
    font-size: 19pt;
    border-radius: 10px;
    }
	</style>
	<body>
        <form method="POST" action="TambahServlet">
        <div id="card" align="center"> 
            <br><div id="font-data">DATA MOTOR</div><br>
                    <table border="0">
                    <tr>
                        <td width="150px"><div id="font-form" align="left">ID Motor</div></td>
                        <td width="200px"><div id="font-form" align="center"><input type="text" class="form" name="id_motor" value=""></div></td>
                    </tr>
                    <tr>
                        <td width="150px"><div id="font-form" align="left">Plat Motor</div></td>
                        <td width="200px"><div id="font-form" align="center"><input type="text" name="plat_motor" value=""></div></td>
                    </tr>
                    <tr>
                        <td width="150px"><div id="font-form" align="left">Merk Nomor</div></td>
                        <td width="200px"><div id="font-form" align="center"><input type="text" name="merk_motor" value=""></div></td>
                    </tr>
                    <tr>
                        <td width="150px"><div id="font-form" align="left">Jenis Motor</div></td>
                        <td width="200px"><div id="font-form" align="center"><input type="text" name="jenis_motor" value=""></div></td>
                    </tr>
                    <tr>
                        <td width="150px"><div id="font-form" align="left">Harga</div></td>
                        <td width="200px"><div id="font-form" align="center"><input type="text" name="harga" value=""></div></td>
                    </tr>
                    </table>
                    <br><br>
                    <input type="submit" name="simpan" class="button" value="SIMPAN">
                </div>
        </div>
        </form>
	</body>
</html>