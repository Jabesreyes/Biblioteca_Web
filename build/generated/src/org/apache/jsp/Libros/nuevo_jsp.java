package org.apache.jsp.Libros;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class nuevo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Biblioteca</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h2>Nuevo registro</h2>\n");
      out.write("        \n");
      out.write("        <form action=\"\" method=\"POST\" autocomplete=\"off\">\n");
      out.write("            <p>\n");
      out.write("                Titulo:\n");
      out.write("                <input id=\"titulo\" name=\"titulo\" type=\"text\" />\n");
      out.write("            </p>\n");
      out.write("            <p>\n");
      out.write("                Autor:\n");
      out.write("                <input id=\"autor\" name=\"autor\" type=\"text\" />\n");
      out.write("            </p>\n");
      out.write("            <p>\n");
      out.write("                Paginas:\n");
      out.write("                <input id=\"paginas\" name=\"paginas\" type=\"text\" />\n");
      out.write("            </p>\n");
      out.write("            <p>\n");
      out.write("                Editorial\n");
      out.write("                <input id=\"editorial\" name=\"editorial\" type=\"text\" />\n");
      out.write("            </p>\n");
      out.write("            <p>\n");
      out.write("                ISBN:\n");
      out.write("                <input id=\"isbn\" name=\"isbn\" type=\"text\" />\n");
      out.write("            </p>\n");
      out.write("            <p>\n");
      out.write("                Fecha Publicacion:\n");
      out.write("                <input id=\"fechapublicacion\" name=\"fechapublicacion\" type=\"text\" />\n");
      out.write("            </p>\n");
      out.write("            <p>\n");
      out.write("                Ubicacion:\n");
      out.write("                <input id=\"ubicacion\" name=\"ubicacion\" type=\"text\" />\n");
      out.write("            </p>\n");
      out.write("            <p>\n");
      out.write("                Unidades\n");
      out.write("                <input id=\"unidades\" name=\"unidades\" type=\"text\" />\n");
      out.write("            </p>\n");
      out.write("            <button id=\"guardar\" name=\"guardar\" type=\"submit\">Guardar</button>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
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
