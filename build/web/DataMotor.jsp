<%-- 
    Document   : DataMotor
    Created on : Dec 9, 2020, 2:40:35 AM
    Author     : ADELINE
--%>

<%@page import="Model.Motor"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>stok</title>
	
	<style type="text/css">
		body{
				background: #E0ECEA;
		}
		.kotak{
			position: fixed;
			width: 85%;
			height: 75%;
			top: 100px;
			left: 100px;
			background: #FFFFFF;
			box-shadow: 0px 0px 5px rgba(115, 115, 115, 0.25);

		}
		.navv{
			position: absolute;
                        width: 100%;
                        height: 7%;
                        left: 0px;
                        top: 0px;

                        background: #FFFFFF;
                        box-shadow: 0px 0px 10px rgba(159, 159, 159, 0.84);
		}
		.title{
			position: absolute;
			width: 85%;
			height: 10%;
			left: 100px;
			top: 50px;
		}
		.tombol{
			position: absolute;
                        width: 100px;
                        height: 35px;
                        right: 10px;
                        top: 5px;

                        border-width: 0px;

                        background: #1BCFB4;
                        box-shadow: 0px 0px 4px rgba(83, 83, 83, 0.25);
                        border-radius: 10px;
		}
				.tomboltbl{
                        width: 80px;
                        height: 35px;
                        border-width: 0px;
                        margin: 0px 5px;
                        background: #1BCFB4;
                        box-shadow: 0px 0px 4px rgba(83, 83, 83, 0.25);
                        border-radius: 10px;
		}

		.tabel{
                        width: 100%;
                        height: 100%;
                        overflow-y: scroll;
}

		table {border-collapse: collapse; }

		.table {
                        width: 100%;
                        margin-bottom: 1rem;
                        color: #212529; }
                        .table th,
                        .table td {
                          padding: 0.9375rem;
                          vertical-align: top;
                          border-top: 1px solid #ebedf2; }
                        .table thead th {
                          vertical-align: bottom;
                          border-bottom: 2px solid #ebedf2; }
                        .table tbody + tbody {
                          border-top: 2px solid #ebedf2; }

                      .table-sm th,
                      .table-sm td {
                        padding: 0.3rem; }

                        .table-bordered {
                          border: 1px solid #ebedf2; }
                          .table-bordered th,
                          .table-bordered td {
                            border: 1px solid #ebedf2; }
                          .table-bordered thead th,
                          .table-bordered thead td {
                            border-bottom-width: 2px; }

                        .table-borderless th,
                        .table-borderless td,
                        .table-borderless thead th,
                        .table-borderless tbody + tbody {
                          border: 0; }

                        .table-striped tbody tr:nth-of-type(odd) {
                          background-color: #f2edf3; }

                        .table-hover tbody tr:hover {
                          color: #212529;
                          background-color: #f2edf3; }

                        .table-primary,
                        .table-primary > th,
                        .table-primary > td {
                          background-color: #ebd6ff; }

                        .table-primary th,
                        .table-primary td,
                        .table-primary thead th,
                        .table-primary tbody + tbody {
                          border-color: #d9b3ff; }

                        .table-hover .table-primary:hover {
                          background-color: #dfbdff; }
                          .table-hover .table-primary:hover > td,
                          .table-hover .table-primary:hover > th {
                            background-color: #dfbdff; }

	</style>
</head>
<body>
	<div class="navv">
		<img src="icon.png" width="40" height="40">
		<img src="rentor.png" width="126" height="30">
                <form action="LogoutServlet">
		<button class="tombol">LOGOUT</button>
                </form>
	</div>
	<div class="title">
		<h2>Daftar Motor</h2>
                
		<button onclick="window.location.href='InputData.jsp'" class="tombol">INPUT DATA</button>
                
	</div>
	<div class="kotak">
		<div class="tabel">
		<table border="1" class="table">
				<tr>
					<th>ID Motor</th>
					<th>Jenis Motor</th>
					<th>No. Plat</th>
					<th>Merk</th>
					<th>Harga</th>
					<th>Proses</th>
				</tr>
                 <%
            Motor km = new Motor();
            List<Motor> data = new ArrayList<Motor>();
            
                data = km.tampil();
            int[] id = new int[data.size()];
            for (int x = 0; x < data.size(); x++) {
                id[x] = data.get(x).getId_motor();
        %>                
				<tr>
					<td><%=data.get(x).getId_motor()%></td>
                                        <td><%=data.get(x).getJenis()%></td>
					<td><%=data.get(x).getPlat()%></td>
					<td><%=data.get(x).getMerk()%></td>
                                        <td><%=data.get(x).getHarga()%></td>
					<td width="190px"> 
                                            <form method="POST" action="update.jsp">
                                            <button type="submit" class="tomboltbl" name="id_mtr" value="<%=id[x]%>">UPDATE</button>   
                                            </form>
                                                <button onclick="window.location.href='DataMotor.jsp'" class="tomboltbl" name="id" value="<%
                                                    km.setId_motor(data.get(x).getId_motor());
                                                km.hapus();%>">DELETE</button></td>
                                </tr><%}%>
		</table>
	</div>
	</div>
</body>
</html>