package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');

 
   if(session.getAttribute("status")=="login"){
            response.sendRedirect("./newjsp.jsp");
   }
 
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <title>LOGIN</title>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js\"></script>\n");
      out.write("  <script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js\"></script>\n");
      out.write("  <link href=\"http://www.jqueryscript.net/css/jquerysctipttop.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("<script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.10.1/jquery.min.js\"></script>\n");
      out.write("<script src=\"jquery.inputmask.bundle.min.js\"></script>\n");
      out.write("\n");
      out.write("  <style>\n");
      out.write("\n");
      out.write("body {\n");
      out.write("    padding-top: 90px;\n");
      out.write("}\n");
      out.write(".panel-login {\n");
      out.write("  border-color: #ccc;\n");
      out.write("  -webkit-box-shadow: 0px 2px 3px 0px rgba(0,0,0,0.2);\n");
      out.write("  -moz-box-shadow: 0px 2px 3px 0px rgba(0,0,0,0.2);\n");
      out.write("  box-shadow: 0px 2px 3px 0px rgba(0,0,0,0.2);\n");
      out.write("}\n");
      out.write(".panel-login>.panel-heading {\n");
      out.write("  color: #00415d;\n");
      out.write("  background-color: #fff;\n");
      out.write("  border-color: #fff;\n");
      out.write("  text-align:center;\n");
      out.write("}\n");
      out.write(".panel-login>.panel-heading a{\n");
      out.write("  text-decoration: none;\n");
      out.write("  color: #666;\n");
      out.write("  font-weight: bold;\n");
      out.write("  font-size: 15px;\n");
      out.write("  -webkit-transition: all 0.1s linear;\n");
      out.write("  -moz-transition: all 0.1s linear;\n");
      out.write("  transition: all 0.1s linear;\n");
      out.write("}\n");
      out.write(".panel-login>.panel-heading a.active{\n");
      out.write("  color: #029f5b;\n");
      out.write("  font-size: 18px;\n");
      out.write("}\n");
      out.write(".panel-login>.panel-heading hr{\n");
      out.write("  margin-top: 10px;\n");
      out.write("  margin-bottom: 0px;\n");
      out.write("  clear: both;\n");
      out.write("  border: 0;\n");
      out.write("  height: 1px;\n");
      out.write("  background-image: -webkit-linear-gradient(left,rgba(0, 0, 0, 0),rgba(0, 0, 0, 0.15),rgba(0, 0, 0, 0));\n");
      out.write("  background-image: -moz-linear-gradient(left,rgba(0,0,0,0),rgba(0,0,0,0.15),rgba(0,0,0,0));\n");
      out.write("  background-image: -ms-linear-gradient(left,rgba(0,0,0,0),rgba(0,0,0,0.15),rgba(0,0,0,0));\n");
      out.write("  background-image: -o-linear-gradient(left,rgba(0,0,0,0),rgba(0,0,0,0.15),rgba(0,0,0,0));\n");
      out.write("}\n");
      out.write(".panel-login input[type=\"text\"],.panel-login input[type=\"email\"],.panel-login input[type=\"password\"] {\n");
      out.write("  height: 45px;\n");
      out.write("  border: 1px solid #ddd;\n");
      out.write("  font-size: 16px;\n");
      out.write("  -webkit-transition: all 0.1s linear;\n");
      out.write("  -moz-transition: all 0.1s linear;\n");
      out.write("  transition: all 0.1s linear;\n");
      out.write("}\n");
      out.write(".panel-login input:hover,\n");
      out.write(".panel-login input:focus {\n");
      out.write("  outline:none;\n");
      out.write("  -webkit-box-shadow: none;\n");
      out.write("  -moz-box-shadow: none;\n");
      out.write("  box-shadow: none;\n");
      out.write("  border-color: #ccc;\n");
      out.write("}\n");
      out.write(".btn-login {\n");
      out.write("  background-color: #59B2E0;\n");
      out.write("  outline: none;\n");
      out.write("  color: #fff;\n");
      out.write("  font-size: 14px;\n");
      out.write("  height: auto;\n");
      out.write("  font-weight: normal;\n");
      out.write("  padding: 14px 0;\n");
      out.write("  text-transform: uppercase;\n");
      out.write("  border-color: #59B2E6;\n");
      out.write("}\n");
      out.write(".btn-login:hover,\n");
      out.write(".btn-login:focus {\n");
      out.write("  color: #fff;\n");
      out.write("  background-color: #53A3CD;\n");
      out.write("  border-color: #53A3CD;\n");
      out.write("}\n");
      out.write(".forgot-password {\n");
      out.write("  text-decoration: underline;\n");
      out.write("  color: #888;\n");
      out.write("}\n");
      out.write(".forgot-password:hover,\n");
      out.write(".forgot-password:focus {\n");
      out.write("  text-decoration: underline;\n");
      out.write("  color: #666;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btn-register {\n");
      out.write("  background-color: #1CB94E;\n");
      out.write("  outline: none;\n");
      out.write("  color: #fff;\n");
      out.write("  font-size: 14px;\n");
      out.write("  height: auto;\n");
      out.write("  font-weight: normal;\n");
      out.write("  padding: 14px 0;\n");
      out.write("  text-transform: uppercase;\n");
      out.write("  border-color: #1CB94A;\n");
      out.write("}\n");
      out.write(".btn-register:hover,\n");
      out.write(".btn-register:focus {\n");
      out.write("  color: #fff;\n");
      out.write("  background-color: #1CA347;\n");
      out.write("  border-color: #1CA347;\n");
      out.write("}\n");
      out.write("\n");
      out.write("  </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"container\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("      <div class=\"col-md-6 col-md-offset-3\">\n");
      out.write("        <div class=\"panel panel-login\">\n");
      out.write("          <div class=\"panel-heading\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("              <div class=\"col-xs-6\">\n");
      out.write("                <a href=\"#\" class=\"active\" id=\"login-form-link\">เข้าสู่ระบบ</a>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"col-xs-6\">\n");
      out.write("                <a href=\"#\" id=\"register-form-link\">สมัคร</a>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <hr>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"panel-body\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("              <div class=\"col-lg-12\">\n");
      out.write("                <form id=\"login-form\" action=\"main.jsp\" method=\"post\" role=\"form\" style=\"display: block;\">\n");
      out.write("                  <div class=\"form-group\">\n");
      out.write("                    <input type=\"text\" name=\"usr\" id=\"username\" tabindex=\"1\" class=\"form-control\" placeholder=\"อีเมล์\" value=\"\">\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"form-group\">\n");
      out.write("                    <input type=\"password\" name=\"pwd\" id=\"password\" tabindex=\"2\" class=\"form-control\" placeholder=\"รหัสผ่าน\">\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"form-group text-center\">\n");
      out.write("                    <input type=\"checkbox\" tabindex=\"3\" class=\"\" name=\"remember\" id=\"remember\">\n");
      out.write("                    <label for=\"remember\"> จดจำ</label>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"form-group\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                      <div class=\"col-sm-6 col-sm-offset-3\">\n");
      out.write("                        <input type=\"submit\" name=\"login-submit\" id=\"login-submit\" tabindex=\"4\" class=\"form-control btn btn-login\" value=\"เข้าสู่ระบบ\">\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"form-group\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                      <div class=\"col-lg-12\">\n");
      out.write("                        <div class=\"text-center\">\n");
      out.write("                          <a href=\"#\" tabindex=\"5\" class=\"forgot-password\">Forgot Password?</a>\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                </form>\n");
      out.write("                <form id=\"register-form\" action=\"reg.jsp\" method=\"post\" role=\"form\" style=\"display: none;\">\n");
      out.write("                  <div class=\"form-group\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"name\" name=\"name\" placeholder=\"ชือผู้ใช้\"  required autofocus>\n");
      out.write("                    </div>\n");
      out.write("                  <div class=\"form-group\">\n");
      out.write("                        <input type=\"tel\" class=\"form-control\" maxlength=\"11\" minlength=\"11\" id=\"txtboxToFilter\" name=\"tel\" placeholder=\"เบอร์โทรศัพท์\" data-inputmask=\"'mask': '999-9999999'\" required autofocus>\n");
      out.write("                  </div>\n");
      out.write("                      <div class=\"form-group\">\n");
      out.write("                        <input type=\"email\" class=\"form-control\" id=\"email\" name=\"email\" placeholder=\"อีเมล์\" required autofocus>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"form-group\">\n");
      out.write("                        <input type=\"password\" class=\"form-control\" id=\"pwd1\" name=\"password\" placeholder=\"รหัสผ่าน\" required autofocus>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"form-group\">\n");
      out.write("                        <input type=\"password\" class=\"form-control\" id=\"pw2d\" name=\"confirmpassword\" placeholder=\"ยืนยันรหัสผ่าน\" required autofocus>\n");
      out.write("                      </div>     \n");
      out.write("                  <div class=\"form-group\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                      <div class=\"col-sm-6 col-sm-offset-3\">\n");
      out.write("                        <input type=\"submit\" name=\"register-submit\" id=\"register-submit\" tabindex=\"4\" class=\"form-control btn btn-register\" value=\"สมัคเดี๋ยวนี้!!\">\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                </form>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <script type=\"text/javascript\">\n");
      out.write("$(function() {\n");
      out.write("\n");
      out.write("    $('#login-form-link').click(function(e) {\n");
      out.write("    $(\"#login-form\").delay(100).fadeIn(100);\n");
      out.write("    $(\"#register-form\").fadeOut(100);\n");
      out.write("    $('#register-form-link').removeClass('active');\n");
      out.write("    $(this).addClass('active');\n");
      out.write("    e.preventDefault();\n");
      out.write("  });\n");
      out.write("  $('#register-form-link').click(function(e) {\n");
      out.write("    $(\"#register-form\").delay(100).fadeIn(100);\n");
      out.write("    $(\"#login-form\").fadeOut(100);\n");
      out.write("    $('#login-form-link').removeClass('active');\n");
      out.write("    $(this).addClass('active');\n");
      out.write("    e.preventDefault();\n");
      out.write("  });\n");
      out.write("\n");
      out.write("});\n");
      out.write("$(document).ready(function() {\n");
      out.write("    $(\"#txtboxToFilter\").keydown(function (e) {\n");
      out.write("        // Allow: backspace, delete, tab, escape, enter and .\n");
      out.write("        if ($.inArray(e.keyCode, [46, 8, 9, 27, 13, 110, 190]) !== -1 ||\n");
      out.write("             // Allow: Ctrl+A, Command+A\n");
      out.write("            (e.keyCode == 65 && ( e.ctrlKey === true || e.metaKey === true ) ) || \n");
      out.write("             // Allow: home, end, left, right, down, up\n");
      out.write("            (e.keyCode >= 35 && e.keyCode <= 40)) {\n");
      out.write("                 // let it happen, don't do anything\n");
      out.write("                 return;\n");
      out.write("        }\n");
      out.write("        // Ensure that it is a number and stop the keypress\n");
      out.write("        if ((e.shiftKey || (e.keyCode < 48 || e.keyCode > 57)) && (e.keyCode < 96 || e.keyCode > 105)) {\n");
      out.write("            e.preventDefault();\n");
      out.write("        }\n");
      out.write("    });\n");
      out.write("});\n");
      out.write("\n");
      out.write("\n");
      out.write("  </script>\n");
      out.write("  <script>\n");
      out.write("$(document).ready(function(){\n");
      out.write("    $(\":input\").inputmask();\n");
      out.write("});\n");
      out.write("</script>\n");
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
