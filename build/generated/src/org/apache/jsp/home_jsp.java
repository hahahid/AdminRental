package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write("\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\t\t<title>Rentor</title>\n");
      out.write("\t</head>\n");
      out.write("\t<style type=\"text/css\">\n");
      out.write("\tbody{\n");
      out.write("    background: #E0ECEA;\n");
      out.write("\t}\n");
      out.write("    .navbar{\n");
      out.write("    position: absolute;\n");
      out.write("    width: 100%;\n");
      out.write("    height: 7%;\n");
      out.write("    left: 0px;\n");
      out.write("    top: 0px;\n");
      out.write("    background: #FFFFFF;\n");
      out.write("    box-shadow: 0px 0px 10px rgba(159, 159, 159, 0.84);\n");
      out.write("    }\n");
      out.write("    .button{\n");
      out.write("    position: absolute;\n");
      out.write("    width: 100px;\n");
      out.write("    height: 35px;\n");
      out.write("    right: 10px;\n");
      out.write("    top: 5px;\n");
      out.write("    background: #1BCFB4;\n");
      out.write("    box-shadow: 0px 0px 4px rgba(83, 83, 83, 0.25);\n");
      out.write("    border-radius: 10px;\n");
      out.write("    border-width: 0px;\n");
      out.write("    }\n");
      out.write("    .box1{\n");
      out.write("    position: absolute;\n");
      out.write("    width: 300px;\n");
      out.write("    height: 250px;\n");
      out.write("    left: 335px;\n");
      out.write("    top: 210px;\n");
      out.write("    background: #FFFFFF;\n");
      out.write("    box-shadow: 0px 0px 4px rgba(150, 150, 150, 0.25);\n");
      out.write("    border-radius: 20px;\n");
      out.write("    border-width: 0px;\n");
      out.write("    font-family: sans-serif;\n");
      out.write("    font-size: 25px;\n");
      out.write("    color: #1BCFB4;\n");
      out.write("    }\n");
      out.write("    .box2{\n");
      out.write("    position: absolute;\n");
      out.write("    width: 300px;\n");
      out.write("    height: 250px;\n");
      out.write("    left: 735px;\n");
      out.write("    top: 210px;\n");
      out.write("    background: #FFFFFF;\n");
      out.write("    box-shadow: 0px 0px 4px rgba(150, 150, 150, 0.25);\n");
      out.write("    border-radius: 20px;\n");
      out.write("    border-width: 0px;\n");
      out.write("    font-family: sans-serif;\n");
      out.write("    font-size: 25px;\n");
      out.write("    color: #1BCFB4;\n");
      out.write("    }\n");
      out.write("    .font{\n");
      out.write("    font-family: sans-serif;\n");
      out.write("    font-style: normal;\n");
      out.write("    font-weight: normal;\n");
      out.write("    font-size: 50px;\n");
      out.write("    line-height: 57px;\n");
      out.write("    text-align: center;\n");
      out.write("    color: #1BCFB4;\n");
      out.write("    }\n");
      out.write("    .img{\n");
      out.write("    width: 130px;\n");
      out.write("    height: 130px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("\t</style>\n");
      out.write("\t<body>\n");
      out.write("    <div class=\"navbar\">\n");
      out.write("        <img src=\"icon.png\" width=\"40\" height=\"40\">\n");
      out.write("        <img src=\"rentor.png\" width=\"147\" height=\"32\">\n");
      out.write("        <form action=\"LogoutServlet\">\n");
      out.write("        <button class=\"button\">LOGOUT</button>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("    <form method=\"POST\" action=\"hapus.jsp\">\n");
      out.write("    <button type=\"submit\" value=\"data motor\" class=\"box1\">\n");
      out.write("        <img src=\"motor.png\" class=\"img\"><br><br>\n");
      out.write("        DATA MOTOR\n");
      out.write("    </button>\n");
      out.write("    </form>\n");
      out.write("    <form method=\"POST\" action=\"Peminjaman.jsp\">\n");
      out.write("    <button type=\"submit\" value=\"data motor\" class=\"box2\">\n");
      out.write("        <img src=\"peminjaman.png\" class=\"img\"><br><br>\n");
      out.write("        PEMINJAMAN\n");
      out.write("    </button>\n");
      out.write("    </form>\n");
      out.write("\t</body>\n");
      out.write("</html>\n");
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
