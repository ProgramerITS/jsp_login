package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Using GET and POST Method to Read Form Data</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<center>\n");
      out.write("<h1>Using GET Method to Read Form Data</h1>\n");
      out.write("<ul>\n");
      out.write("<li><p><b>First Name:</b>\n");

try {
String Host = "jdbc:mysql://localhost:3306/ebookshop";
Connection connection = null;
Statement statement = null;
ResultSet rs = null;
Class.forName("com.mysql.jdbc.Driver");
connection = DriverManager.getConnection(Host, "root", "");
statement = connection.createStatement();


String user = request.getParameter("first_name");
String Data = "select * from books WHERE title = '"+user+"'";


rs = statement.executeQuery(Data);
if(rs.next()){
         response.sendRedirect("./newjsp.jsp");
}else{
           response.sendRedirect("./");
   }
rs.close();
statement.close();
connection.close();
} catch (Exception ex) {
out.println("Can?t connect to database.");
}







      out.write("\n");
      out.write("   ");
      out.print( request.getParameter("first_name"));
      out.write("\n");
      out.write("</p></li>\n");
      out.write("<li><p><b>Last  Name:</b>\n");
      out.write("   ");
      out.print( request.getParameter("last_name"));
      out.write("\n");
      out.write("</p></li>\n");
      out.write("</ul>\n");
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
