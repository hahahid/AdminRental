package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.Motor;
import java.util.List;
import java.util.ArrayList;

public final class DataMotor_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>stok</title>\n");
      out.write("\t\n");
      out.write("\t<style type=\"text/css\">\n");
      out.write("\t\tbody{\n");
      out.write("\t\t\t\tbackground: #E0ECEA;\n");
      out.write("\t\t}\n");
      out.write("\t\t.kotak{\n");
      out.write("\t\t\tposition: fixed;\n");
      out.write("\t\t\twidth: 85%;\n");
      out.write("\t\t\theight: 75%;\n");
      out.write("\t\t\ttop: 100px;\n");
      out.write("\t\t\tleft: 100px;\n");
      out.write("\t\t\tbackground: #FFFFFF;\n");
      out.write("\t\t\tbox-shadow: 0px 0px 5px rgba(115, 115, 115, 0.25);\n");
      out.write("\n");
      out.write("\t\t}\n");
      out.write("\t\t.navv{\n");
      out.write("\t\t\tposition: absolute;\n");
      out.write("                        width: 100%;\n");
      out.write("                        height: 7%;\n");
      out.write("                        left: 0px;\n");
      out.write("                        top: 0px;\n");
      out.write("\n");
      out.write("                        background: #FFFFFF;\n");
      out.write("                        box-shadow: 0px 0px 10px rgba(159, 159, 159, 0.84);\n");
      out.write("\t\t}\n");
      out.write("\t\t.title{\n");
      out.write("\t\t\tposition: absolute;\n");
      out.write("\t\t\twidth: 85%;\n");
      out.write("\t\t\theight: 10%;\n");
      out.write("\t\t\tleft: 100px;\n");
      out.write("\t\t\ttop: 50px;\n");
      out.write("\t\t}\n");
      out.write("\t\t.tombol{\n");
      out.write("\t\t\tposition: absolute;\n");
      out.write("                        width: 100px;\n");
      out.write("                        height: 35px;\n");
      out.write("                        right: 10px;\n");
      out.write("                        top: 5px;\n");
      out.write("\n");
      out.write("                        border-width: 0px;\n");
      out.write("\n");
      out.write("                        background: #1BCFB4;\n");
      out.write("                        box-shadow: 0px 0px 4px rgba(83, 83, 83, 0.25);\n");
      out.write("                        border-radius: 10px;\n");
      out.write("\t\t}\n");
      out.write("\t\t\t\t.tomboltbl{\n");
      out.write("                        width: 80px;\n");
      out.write("                        height: 35px;\n");
      out.write("                        border-width: 0px;\n");
      out.write("                        margin: 0px 5px;\n");
      out.write("                        background: #1BCFB4;\n");
      out.write("                        box-shadow: 0px 0px 4px rgba(83, 83, 83, 0.25);\n");
      out.write("                        border-radius: 10px;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t.tabel{\n");
      out.write("                        width: 100%;\n");
      out.write("                        height: 100%;\n");
      out.write("                        overflow-y: scroll;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\t\ttable {border-collapse: collapse; }\n");
      out.write("\n");
      out.write("\t\t.table {\n");
      out.write("                        width: 100%;\n");
      out.write("                        margin-bottom: 1rem;\n");
      out.write("                        color: #212529; }\n");
      out.write("                        .table th,\n");
      out.write("                        .table td {\n");
      out.write("                          padding: 0.9375rem;\n");
      out.write("                          vertical-align: top;\n");
      out.write("                          border-top: 1px solid #ebedf2; }\n");
      out.write("                        .table thead th {\n");
      out.write("                          vertical-align: bottom;\n");
      out.write("                          border-bottom: 2px solid #ebedf2; }\n");
      out.write("                        .table tbody + tbody {\n");
      out.write("                          border-top: 2px solid #ebedf2; }\n");
      out.write("\n");
      out.write("                      .table-sm th,\n");
      out.write("                      .table-sm td {\n");
      out.write("                        padding: 0.3rem; }\n");
      out.write("\n");
      out.write("                        .table-bordered {\n");
      out.write("                          border: 1px solid #ebedf2; }\n");
      out.write("                          .table-bordered th,\n");
      out.write("                          .table-bordered td {\n");
      out.write("                            border: 1px solid #ebedf2; }\n");
      out.write("                          .table-bordered thead th,\n");
      out.write("                          .table-bordered thead td {\n");
      out.write("                            border-bottom-width: 2px; }\n");
      out.write("\n");
      out.write("                        .table-borderless th,\n");
      out.write("                        .table-borderless td,\n");
      out.write("                        .table-borderless thead th,\n");
      out.write("                        .table-borderless tbody + tbody {\n");
      out.write("                          border: 0; }\n");
      out.write("\n");
      out.write("                        .table-striped tbody tr:nth-of-type(odd) {\n");
      out.write("                          background-color: #f2edf3; }\n");
      out.write("\n");
      out.write("                        .table-hover tbody tr:hover {\n");
      out.write("                          color: #212529;\n");
      out.write("                          background-color: #f2edf3; }\n");
      out.write("\n");
      out.write("                        .table-primary,\n");
      out.write("                        .table-primary > th,\n");
      out.write("                        .table-primary > td {\n");
      out.write("                          background-color: #ebd6ff; }\n");
      out.write("\n");
      out.write("                        .table-primary th,\n");
      out.write("                        .table-primary td,\n");
      out.write("                        .table-primary thead th,\n");
      out.write("                        .table-primary tbody + tbody {\n");
      out.write("                          border-color: #d9b3ff; }\n");
      out.write("\n");
      out.write("                        .table-hover .table-primary:hover {\n");
      out.write("                          background-color: #dfbdff; }\n");
      out.write("                          .table-hover .table-primary:hover > td,\n");
      out.write("                          .table-hover .table-primary:hover > th {\n");
      out.write("                            background-color: #dfbdff; }\n");
      out.write("\n");
      out.write("\t</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div class=\"navv\">\n");
      out.write("\t\t<img src=\"icon.png\" width=\"40\" height=\"40\">\n");
      out.write("\t\t<img src=\"rentor.png\" width=\"126\" height=\"30\">\n");
      out.write("                <form action=\"LogoutServlet\">\n");
      out.write("\t\t<button class=\"tombol\">LOGOUT</button>\n");
      out.write("                </form>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"title\">\n");
      out.write("\t\t<h2>Daftar Motor</h2>\n");
      out.write("                \n");
      out.write("\t\t<button onclick=\"window.location.href='InputData.jsp'\" class=\"tombol\">INPUT DATA</button>\n");
      out.write("                \n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"kotak\">\n");
      out.write("\t\t<div class=\"tabel\">\n");
      out.write("\t\t<table border=\"1\" class=\"table\">\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<th>ID Motor</th>\n");
      out.write("\t\t\t\t\t<th>Jenis Motor</th>\n");
      out.write("\t\t\t\t\t<th>No. Plat</th>\n");
      out.write("\t\t\t\t\t<th>Merk</th>\n");
      out.write("\t\t\t\t\t<th>Harga</th>\n");
      out.write("\t\t\t\t\t<th>Proses</th>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("                 ");

            Motor km = new Motor();
            List<Motor> data = new ArrayList<Motor>();
            
                data = km.tampil();
            int[] id = new int[data.size()];
            for (int x = 0; x < data.size(); x++) {
                id[x] = data.get(x).getId_motor();
        
      out.write("                \n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td>");
      out.print(data.get(x).getId_motor());
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(data.get(x).getJenis());
      out.write("</td>\n");
      out.write("\t\t\t\t\t<td>");
      out.print(data.get(x).getPlat());
      out.write("</td>\n");
      out.write("\t\t\t\t\t<td>");
      out.print(data.get(x).getMerk());
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(data.get(x).getHarga());
      out.write("</td>\n");
      out.write("\t\t\t\t\t<td width=\"190px\"> \n");
      out.write("                                            <form method=\"POST\" action=\"update.jsp\">\n");
      out.write("                                            <button type=\"submit\" class=\"tomboltbl\" name=\"id_mtr\" value=\"");
      out.print(id[x]);
      out.write("\">UPDATE</button>   \n");
      out.write("                                            </form>\n");
      out.write("                                                <button onclick=\"window.location.href='DataMotor.jsp'\" class=\"tomboltbl\" name=\"id\" value=\"");

                                                    km.setId_motor(data.get(x).getId_motor());
                                                km.hapus();
      out.write("\">DELETE</button></td>\n");
      out.write("                                </tr>");
}
      out.write("\n");
      out.write("\t\t</table>\n");
      out.write("\t</div>\n");
      out.write("\t</div>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
