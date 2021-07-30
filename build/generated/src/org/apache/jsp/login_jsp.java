package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("\t<title>login</title>\n");
      out.write("\t<style type=\"text/css\">\n");
      out.write("\t\tbody{\n");
      out.write("\t\t\tbackground: linear-gradient(116.37deg, rgba(27, 207, 180, 0.47) 0%, rgba(27, 207, 180, 0.3666) 59.94%);\n");
      out.write("\t\t}.login-box{\n");
      out.write("\t\t\tposition: absolute;\n");
      out.write("\t\t\twidth: 350px;\n");
      out.write("\t\t\theight: 400px;\n");
      out.write("\t\t\ttop: 110px;\n");
      out.write("\t\t\tleft: 510px;\n");
      out.write("\t\t\tbackground: #FFFFFF;\n");
      out.write("\t\t\tborder-radius: 40px;\n");
      out.write("\t\t}.font-login{\n");
      out.write("\t\t\tfont-family: sans-serif;\n");
      out.write("\t\t\tfont-style: normal;\n");
      out.write("\t\t\tfont-weight: lighter;\n");
      out.write("\t\t\tfont-size: 35px;\n");
      out.write("\t\t\ttext-align: center;\n");
      out.write("\t\t\tline-height: 100px;\n");
      out.write("\t\t\tcolor: #000000;\n");
      out.write("\t\t}.btn-login{\n");
      out.write("\t\t\tposition: absolute;\n");
      out.write("\t\t\twidth: 100px;\n");
      out.write("\t\t\theight: 30px;\n");
      out.write("\t\t\tleft: 125px;\n");
      out.write("\t\t\ttop: 280px;\n");
      out.write("\t\t\tbackground: rgba(47, 157, 191, 0.75);\n");
      out.write("\t\t\tborder-radius: 20px;\n");
      out.write("\t\t\tfont-family: sans-serif;\n");
      out.write("\t\t\tfont-size: 17px;\n");
      out.write("\t\t\tcolor: #FFFFFF;\n");
      out.write("\t\t}.username-box{\n");
      out.write("\t\t\tposition: absolute;\n");
      out.write("\t\t\twidth: 220px;\n");
      out.write("\t\t\theight: 30px;\n");
      out.write("\t\t\tleft: 80px;\n");
      out.write("\t\t\ttop: 140px;\n");
      out.write("\t\t\tbackground: #FFFFFF;\n");
      out.write("\t\t\tmix-blend-mode: normal;\n");
      out.write("\t\t\tborder: 1px solid #000000;\n");
      out.write("\t\t\tbox-sizing: border-box;\n");
      out.write("\t\t\tfont-style: oblique;\n");
      out.write("\t\t}.password-box{\n");
      out.write("\t\t\tposition: absolute;\n");
      out.write("\t\t\twidth: 220px;\n");
      out.write("\t\t\theight: 30px;\n");
      out.write("\t\t\tleft: 80px;\n");
      out.write("\t\t\ttop: 200px;\n");
      out.write("\t\t\tbackground: #FFFFFF;\n");
      out.write("\t\t\tmix-blend-mode: normal;\n");
      out.write("\t\t\tborder: 1px solid #000000;\n");
      out.write("\t\t\tbox-sizing: border-box;\n");
      out.write("\t\t\tfont-style: oblique;\n");
      out.write("\t\t}.user-icon{\n");
      out.write("\t\t\tposition: absolute;\n");
      out.write("\t\t\twidth: 21px;\n");
      out.write("\t\t\theight: 21px;\n");
      out.write("\t\t\tleft: 50px;\n");
      out.write("\t\t\ttop: 144.5px;\n");
      out.write("\t\t}.pass-icon{\n");
      out.write("\t\t\tposition: absolute;\n");
      out.write("\t\t\twidth: 20px;\n");
      out.write("\t\t\theight: 20px;\n");
      out.write("\t\t\tleft: 50px;\n");
      out.write("\t\t\ttop: 205px;\n");
      out.write("\t\t}\n");
      out.write("\t</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<form method=\"POST\" action=\"LoginServlet\">\n");
      out.write("\t\t<div class=\"login-box\">\n");
      out.write("\t\t\t<h2 class=\"font-login\">LOGIN</h2>\n");
      out.write("\t\t\t<img src=\"user.png\" class=\"user-icon\">\n");
      out.write("\t\t\t<input type=\"text\" name=\"nama\" placeholder=\"Username\"class=\"username-box\">\n");
      out.write("\t\t\t<img src=\"pass.png\" class=\"pass-icon\">\n");
      out.write("\t\t\t<input type=\"password\" class=\"password-box\" name=\"password\" placeholder=\"Password\">\n");
      out.write("\t\t\t<button type=\"submit\" value=\"login\" class=\"btn-login\">Login</button>\n");
      out.write("\t\t</div>\n");
      out.write("\t</form>\n");
      out.write("\t\n");
      out.write("</body>\n");
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
