/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.32
 * Generated at: 2023-08-25 20:42:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.helper.UserModel;
import com.helper.UserModel;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/pages/../tiles/nav.jsp", Long.valueOf(1692976976000L));
    _jspx_dependants.put("/pages/../tiles/inc.jsp", Long.valueOf(1692884008000L));
    _jspx_dependants.put("/pages/../tiles/footer.jsp", Long.valueOf(1692766914000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.helper.UserModel");
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
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("  \r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"x-ua-compatible\" content=\"ie=edge\">\r\n");
      out.write("    <title>Cradle of Life</title>\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\r\n");
      out.write("    <!-- <link rel=\"manifest\" href=\"site.webmanifest\"> -->\r\n");
      out.write("    <link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"");
      out.print(request.getContextPath());
      out.write("/theme/img/favicon.png\">\r\n");
      out.write("    <!-- Place favicon.ico in the root directory -->\r\n");
      out.write("\r\n");
      out.write("    <!-- CSS here -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/theme/css/bootstrap.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/theme/css/owl.carousel.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/theme/css/magnific-popup.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/theme/css/font-awesome.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/theme/css/themify-icons.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/theme/css/nice-select.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/theme/css/flaticon.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/theme/css/gijgo.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/theme/css/animate.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/theme/css/slicknav.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/theme/css/style.css\">\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css\">\r\n");
      out.write("    \r\n");
      out.write(" ");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<header>\r\n");
      out.write("\t<div class=\"header-area \">\r\n");
      out.write("\t\t<div id=\"sticky-header\" class=\"main-header-area\">\r\n");
      out.write("\t\t\t<div class=\"container-fluid p-0\">\r\n");
      out.write("\t\t\t\t<div class=\"row align-items-center no-gutters\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-xl-2 col-lg-2\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"text-left\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("/pages/index.jsp\"> <img\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"");
      out.print(request.getContextPath());
      out.write("/theme/img/logo.png\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h3 class=\"font-weight-bold text-white text-uppercase\">Cradle\r\n");
      out.write("\t\t\t\t\t\t\t\t\tof Life</h3>\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t");

						UserModel um = null;
						String role = "", name = "", uid = "";
						boolean isUser = false;
						boolean isAdmin = false;
						boolean isNGO = false;
						if (session.getAttribute("USER_MODEL") != null) {
							um = (UserModel) session.getAttribute("USER_MODEL");
							if (um.getRoleid().equalsIgnoreCase("2")) { // user
								role = "User";
								uid = um.getUserid();
								isUser = true;
							} else if (um.getRoleid().equalsIgnoreCase("1")) {
								role = "NGO";
								uid = um.getUserid();
								isNGO = true;
							} else if (um.getRoleid().equalsIgnoreCase("3")) {
								role = "Administrator";
								uid = um.getUserid();
								isAdmin = true;
							}

						}
					
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"col-xl-7 col-lg-7\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"main-menu  d-none d-lg-block float-right\">\r\n");
      out.write("\t\t\t\t\t\t\t<nav>\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul id=\"navigation\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

										if (isAdmin) {
									
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a class=\"active\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\thref=\"");
      out.print(request.getContextPath());
      out.write("/pages/index.jsp\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\thref=\"");
      out.print(request.getContextPath());
      out.write("/pages/ngoinfo.jsp\">Registered\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tNGO LIST </a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\thref=\"");
      out.print(request.getContextPath());
      out.write("/pages/transactions.jsp\">Transaction</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\thref=\"");
      out.print(request.getContextPath());
      out.write("/pages/login.jsp\">Log\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tOut</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

										}
									
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

										if (isUser) {
									
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a class=\"active\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\thref=\"");
      out.print(request.getContextPath());
      out.write("/pages/index.jsp\">Home</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\thref=\"");
      out.print(request.getContextPath());
      out.write("/pages/donation.jsp\">Donation</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\thref=\"");
      out.print(request.getContextPath());
      out.write("/pages/transactions.jsp\">My Transaction</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\thref=\"");
      out.print(request.getContextPath());
      out.write("/pages/aboutus.jsp\">About\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tUS</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\thref=\"");
      out.print(request.getContextPath());
      out.write("/pages/login.jsp\">Log\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tOut</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

										}
									
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

										if (isNGO) {
									
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a class=\"active\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\thref=\"");
      out.print(request.getContextPath());
      out.write("/pages/index.jsp\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\thref=\"");
      out.print(request.getContextPath());
      out.write("/pages/aboutus.jsp\">About\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tUS</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\thref=\"");
      out.print(request.getContextPath());
      out.write("/pages/login.jsp\">Log\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tOut</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

										}
									
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t</nav>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"col-12\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"mobile_menu d-block d-lg-none\"></div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</header>\r\n");
      out.write("<!-- header-end -->");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

UserModel u=null;


      out.write("\r\n");
      out.write(" <div class=\"slider_area \">\r\n");
      out.write("        <div class=\"single_slider d-flex align-items-center justify-content-center slider_bg_1\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row align-items-center justify-content-center\">\r\n");
      out.write("                    <h1>Welcome <span class=\"white-text\"> </span></h1>\r\n");
      out.write("                 \r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("<footer>\r\n");
      out.write("\t<div class=\"copy-right_text\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"footer_border\"></div>\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-xl-12\">\r\n");
      out.write("\t\t\t\t\t<p class=\"copy_right text-center\">\r\n");
      out.write("\t\t\t\t\t\t<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\r\n");
      out.write("\t\t\t\t\t\tCopyright &copy;\r\n");
      out.write("\t\t\t\t\t\t<script>\r\n");
      out.write("\t\t\t\t\t\t\tdocument.write(new Date().getFullYear());\r\n");
      out.write("\t\t\t\t\t\t</script>\r\n");
      out.write("\t\t\t\t\t\tAll rights reserved | This template is made with <i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"fa fa-heart-o\" aria-hidden=\"true\"></i> by <a\r\n");
      out.write("\t\t\t\t\t\t\thref=\"https://colorlib.com\" target=\"_blank\">Colorlib</a>\r\n");
      out.write("\t\t\t\t\t\t<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</footer>");
      out.write("\r\n");
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
