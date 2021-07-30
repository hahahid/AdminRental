<%-- 
    Document   : hapus
    Created on : Dec 9, 2020, 11:54:32 PM
    Author     : ADELINE
--%>

<%@page import="Model.Motor"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    Motor km = new Motor();
    String id = request.getParameter("id_motor") ;
    String plt = request.getParameter("plat_motor") ;
    String mrk = request.getParameter("merk_motor") ;
    String jns = request.getParameter("jenis_motor") ;
    String hrg = request.getParameter("harga") ;
    int x = Integer.parseInt(id);
    km.update(x, plt, mrk, jns, hrg);
    response.sendRedirect("DataMotor.jsp");
    %>