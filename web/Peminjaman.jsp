<%-- 
    Document   : Peminjaman
    Created on : Dec 9, 2020, 2:42:09 AM
    Author     : ADELINE
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Model.Peminjaman"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Peminjaman</title>
	
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

		.tombol{
			position: absolute;
width: 100px;
height: 35px;
right: 10px;
top: 5px;

background: #1BCFB4;
box-shadow: 0px 0px 1px rgba(200, 200, 200, 0.1);
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
	<div class="kotak">
		<div class="tabel">
		<table border="1" class="table">
			<thead>
				<tr>
					<th>ID Peminjaman</th>
					<th>ID User</th>
                                        <th>ID Motor</th>
					<th>Tanggal Sewa</th>
					<th>Waktu Ambil</th>
					<th>Waktu Kembali</th>
					<th>Durasi</th>
				</tr>
			</thead>
                                         <%
            Peminjaman km = new Peminjaman();
            List<Peminjaman> data = new ArrayList<Peminjaman>();
            
                data = km.tampil();
            int[] id = new int[data.size()];
            for (int x = 0; x < data.size(); x++) {
                id[x] = data.get(x).getId_peminjaman();
        %>                
				<tr>
					<td><%=data.get(x).getId_peminjaman()%></td>
                                        <td><%=data.get(x).getId_user()%></td>
                                        <td><%=data.get(x).getId_motor()%></td>
                                        <td><%=data.get(x).getTgl_sewa()%></td>
					<td><%=data.get(x).getWaktu_ambil()%></td>
					<td><%=data.get(x).getWaktu_kembali()%></td>
                                        <td><%=data.get(x).getDurasi()%></td>
                                </tr>
<%}%>
		</table>
	</div>
	</div>
</body>
</html>