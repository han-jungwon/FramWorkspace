/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.57
 * Generated at: 2020-09-15 01:20:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class memberJoinForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"></script>\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\r\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("<style>\r\n");
      out.write("\t#joinForm{\r\n");
      out.write("\t\twidth:600px;\r\n");
      out.write("\t\tmargin-left:auto;\r\n");
      out.write("\t\tmargin-right:auto;\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../common/menubar.jsp", out, false);
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<br>\r\n");
      out.write("\t\r\n");
      out.write("\t<h1 align=\"center\">회원가입</h1>\r\n");
      out.write("\t\r\n");
      out.write("\t<br>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<form action=\"insert.me\" method=\"post\" id=\"joinForm\">\r\n");
      out.write("\t\t  <div class=\"form-group row\">\r\n");
      out.write("\t\t    <label for=\"userId\" class=\"col-sm-3 col-form-label\">* ID</label>\r\n");
      out.write("\t\t    <div class=\"col-sm-8\">\r\n");
      out.write("\t\t      <input type=\"text\" class=\"form-control\" name=\"userId\" id=\"userId\" placeholder=\"아이디를 입력하시오\" required>\r\n");
      out.write("\t\t    </div>\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t  <div class=\"form-group row\">\r\n");
      out.write("\t\t    <label for=\"userPwd\" class=\"col-sm-3 col-form-label\">* Password</label>\r\n");
      out.write("\t\t    <div class=\"col-sm-8\">\r\n");
      out.write("\t\t      <input type=\"password\" class=\"form-control\" name=\"userPwd\" id=\"userPwd\" placeholder=\"비밀번호를 입력하시오\" required>\r\n");
      out.write("\t\t    </div>\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t  <div class=\"form-group row\">\r\n");
      out.write("\t\t    <label for=\"userPwd2\" class=\"col-sm-3 col-form-label\">* Confirm</label>\r\n");
      out.write("\t\t    <div class=\"col-sm-8\">\r\n");
      out.write("\t\t      <input type=\"password\" class=\"form-control\" name=\"userPwd2\" id=\"userPwd2\" placeholder=\"다시 비밀번호를 입력하시오\" required>\r\n");
      out.write("\t\t    </div>\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t  <div class=\"form-group row\">\r\n");
      out.write("\t\t    <label for=\"userName\" class=\"col-sm-3 col-form-label\">* Name</label>\r\n");
      out.write("\t\t    <div class=\"col-sm-8\">\r\n");
      out.write("\t\t      <input type=\"text\" class=\"form-control\" name=\"userName\" id=\"userName\" placeholder=\"이름을 입력하시오\" required>\r\n");
      out.write("\t\t    </div>\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t  <div class=\"form-group row\">\r\n");
      out.write("\t\t    <label for=\"email\" class=\"col-sm-3 col-form-label\">&nbsp;&nbsp;Email</label>\r\n");
      out.write("\t\t    <div class=\"col-sm-8\">\r\n");
      out.write("\t\t      <input type=\"email\" class=\"form-control\" name=\"email\" id=\"email\" placeholder=\"이메일을 입력하시오\">\r\n");
      out.write("\t\t    </div>\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t  <div class=\"form-group row\">\r\n");
      out.write("\t\t    <label for=\"birthDay\" class=\"col-sm-3 col-form-label\">&nbsp;&nbsp;BirthDay</label>\r\n");
      out.write("\t\t    <div class=\"col-sm-8\">\r\n");
      out.write("\t\t      <input type=\"text\" class=\"form-control\" name=\"birthDay\" id=\"birthDay\" placeholder=\"생년월일을 입력하시오(6자리)\">\r\n");
      out.write("\t\t    </div>\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t  <fieldset class=\"form-group\">\r\n");
      out.write("\t\t    <div class=\"row\">\r\n");
      out.write("\t\t      <legend class=\"col-form-label col-sm-3 pt-0\">&nbsp;&nbsp;Gender</legend>\r\n");
      out.write("\t\t      <div class=\"col-sm-8\">\r\n");
      out.write("\t\t        <div class=\"form-check\">\r\n");
      out.write("\t\t          <input class=\"form-check-input\" type=\"radio\" name=\"gender\" id=\"M\" value=\"M\">\r\n");
      out.write("\t\t          <label class=\"form-check-label\" for=\"M\">Male</label>\r\n");
      out.write("\t\t        </div>\r\n");
      out.write("\t\t        <div class=\"form-check\">\r\n");
      out.write("\t\t          <input class=\"form-check-input\" type=\"radio\" name=\"gender\" id=\"F\" value=\"F\">\r\n");
      out.write("\t\t          <label class=\"form-check-label\" for=\"F\">Female</label>\r\n");
      out.write("\t\t        </div>\r\n");
      out.write("\t\t      </div>\r\n");
      out.write("\t\t    </div>\r\n");
      out.write("\t\t  </fieldset>\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t  <div class=\"form-group row\">\r\n");
      out.write("\t\t    <label for=\"phone\" class=\"col-sm-3 col-form-label\">&nbsp;&nbsp;Phone</label>\r\n");
      out.write("\t\t    <div class=\"col-sm-8\">\r\n");
      out.write("\t\t      <input type=\"tel\" class=\"form-control\" name=\"phone\" id=\"phone\" placeholder=\"전화번호를 입력하시오(-포함)\">\r\n");
      out.write("\t\t    </div>\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t  <div class=\"form-group row\">\r\n");
      out.write("\t\t    <label for=\"address\" class=\"col-sm-3 col-form-label\">&nbsp;&nbsp;Address</label>\r\n");
      out.write("\t\t    <div class=\"col-sm-8\">\r\n");
      out.write("\t\t      <input type=\"text\" class=\"form-control\" name=\"address\" id=\"address\" placeholder=\"주소를 입력하시오\">\r\n");
      out.write("\t\t    </div>\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t  <div class=\"form-group row\" align=\"center\">\r\n");
      out.write("\t\t    <div class=\"col-sm-10\">\r\n");
      out.write("\t\t    \t<button type=\"reset\" class=\"btn btn-outline-secondary\">Reset</button>\r\n");
      out.write("\t\t        <button type=\"submit\" class=\"btn btn-outline-success\">Sign in</button>\r\n");
      out.write("\t\t    </div>\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\r\n");
      out.write("\t</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
