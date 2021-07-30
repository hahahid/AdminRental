package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class InputData_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write("\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\t\t<title>Rentor</title>\n");
      out.write("\t</head>\n");
      out.write("\t<style type=\"text/css\">\n");
      out.write("\tbody{\n");
      out.write("    position: relative;\n");
      out.write("\tbackground: linear-gradient(116.37deg, rgba(27, 207, 180, 0.47) 0%, rgba(27, 207, 180, 0.3666) 59.94%);\n");
      out.write("\t}\n");
      out.write("    #card{\n");
      out.write("    position: absolute;\n");
      out.write("    width: 450px;\n");
      out.write("    height: 400px;\n");
      out.write("    left: 425px;\n");
      out.write("    top: 100px;\n");
      out.write("    background: #FFFFFF;\n");
      out.write("    border-radius: 40px;\n");
      out.write("    }\n");
      out.write("    #font-data{\n");
      out.write("    font-family: sans-serif;\n");
      out.write("    font-style: normal;\n");
      out.write("    font-weight: normal;\n");
      out.write("    font-size: 40px;\n");
      out.write("    line-height: 57px;\n");
      out.write("    color: #000000;\n");
      out.write("    }\n");
      out.write("    #font-form{\n");
      out.write("    font-family: sans-serif;\n");
      out.write("    font-style: normal;\n");
      out.write("    font-weight: 300;\n");
      out.write("    font-size: 20px;\n");
      out.write("    line-height: 36px;\n");
      out.write("    color: #000000;\n");
      out.write("    }\n");
      out.write("    .button {\n");
      out.write("    position: absolute;\n");
      out.write("    left: 265px;\n");
      out.write("    top: 300px;\n");
      out.write("    background: rgba(47, 157, 191, 0.75);\n");
      out.write("    height: 35px;\n");
      out.write("    width: 125px;\n");
      out.write("    border: 1px;\n");
      out.write("    cursor: pointer;\n");
      out.write("    color: #ffffff;\n");
      out.write("    padding-up: 20px;\n");
      out.write("    padding-bottom: 20px;\n");
      out.write("    font-size: 19pt;\n");
      out.write("    border-radius: 10px;\n");
      out.write("    }\n");
      out.write("\t</style>\n");
      out.write("\t<body>\n");
      out.write("        <form method=\"POST\" action=\"TambahServlet\">\n");
      out.write("        <div id=\"card\" align=\"center\"> \n");
      out.write("            <br><div id=\"font-data\">DATA MOTOR</div><br>\n");
      out.write("                    <table border=\"0\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td width=\"150px\"><div id=\"font-form\" align=\"left\">ID Motor</div></td>\n");
      out.write("                        <td width=\"200px\"><div id=\"font-form\" align=\"center\"><input type=\"text\" class=\"form\" name=\"id_motor\" value=\"\"></div></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td width=\"150px\"><div id=\"font-form\" align=\"left\">Jenis Motor</div></td>\n");
      out.write("                        <td width=\"200px\"><div id=\"font-form\" align=\"center\"><input type=\"text\" name=\"jenis_motor\" value=\"\"></div></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td width=\"150px\"><div id=\"font-form\" align=\"left\">Plat Nomor</div></td>\n");
      out.write("                        <td width=\"200px\"><div id=\"font-form\" align=\"center\"><input type=\"text\" name=\"plat_nomor\" value=\"\"></div></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td width=\"150px\"><div id=\"font-form\" align=\"left\">Merk Motor</div></td>\n");
      out.write("                        <td width=\"200px\"><div id=\"font-form\" align=\"center\"><input type=\"text\" name=\"merk_motor\" value=\"\"></div></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td width=\"150px\"><div id=\"font-form\" align=\"left\">Harga</div></td>\n");
      out.write("                        <td width=\"200px\"><div id=\"font-form\" align=\"center\"><input type=\"text\" name=\"harga\" value=\"\"></div></td>\n");
      out.write("                    </tr>\n");
      out.write("                    </table>\n");
      out.write("                    <br><br>\n");
      out.write("                    <input type=\"submit\" name=\"simpan\" class=\"button\" value=\"SIMPAN\">\n");
      out.write("                </div>\n");
      out.write("        </div>\n");
      out.write("        </form>\n");
      out.write("\t</body>\n");
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
