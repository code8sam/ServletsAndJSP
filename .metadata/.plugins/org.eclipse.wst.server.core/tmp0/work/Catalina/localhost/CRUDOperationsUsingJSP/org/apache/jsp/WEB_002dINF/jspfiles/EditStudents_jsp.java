/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.47
 * Generated at: 2022-04-06 05:36:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jspfiles;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import edu.jspiders.studentapp.dto.Student;
import edu.jspiders.studentapp.dao.StudentDataBaseOperations;

public final class EditStudents_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("edu.jspiders.studentapp.dto.Student");
    _jspx_imports_classes.add("edu.jspiders.studentapp.dao.StudentDataBaseOperations");
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Edit Students</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"./resources/css/mystyle2.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<header>\r\n");
      out.write("\t\t<h1 class=\"title\">Student App</h1>\r\n");
      out.write("\t</header>\r\n");
      out.write("\t\r\n");
      out.write("\t<nav>\r\n");
      out.write("\t\t<a href=\"\">Search Students</a>\r\n");
      out.write("\t\t<a href=\"./insertStudentsForm\">Insert Students</a>\r\n");
      out.write("\t\t<a href=\"./dispalyAll\">Display All Students</a>\r\n");
      out.write("\t\t<a href=\"\">Display Based on Ranks</a>\r\n");
      out.write("\t</nav>\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t");

		int id = Integer.parseInt(request.getParameter("id"));
		
	StudentDataBaseOperations op = new StudentDataBaseOperations();
	Student s = op.searchStudent(id);
	
      out.write("\r\n");
      out.write("\t\t<form action=\"update\" method=\"POST\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"user-details\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"input-box\">\r\n");
      out.write("\t\t\t\t\t<span class=\"details\">Student ID</span> <input type=\"number\"\r\n");
      out.write("\t\t\t\t\t\tname=\"id\" placeholder=\"Enter the Student id\" required value=\"");
      out.print( s.getId() );
      out.write("\" readonly=\"readonly\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"input-box\">\r\n");
      out.write("\t\t\t\t\t<span class=\"details\">Student First Name</span> <input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\tname=\"fname\" placeholder=\"Enter the Student First Name\" required value=\"");
      out.print( s.getFirstName());
      out.write("\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"input-box\">\r\n");
      out.write("\t\t\t\t\t<span class=\"details\">Student Last Name</span> <input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\tname=\"lname\" placeholder=\"Enter the Student last Name\" required value=\"");
      out.print( s.getLastName());
      out.write("\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"input-box\">\r\n");
      out.write("\t\t\t\t\t<span class=\"details\">Student Marks</span> <input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\tname=\"marks\" placeholder=\"Enter the Student Marks\" required value=\"");
      out.print( s.getMarks());
      out.write("\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"input-box\">\r\n");
      out.write("\t\t\t\t\t<span class=\"details\">Mail ID</span> <input type=\"email\"\r\n");
      out.write("\t\t\t\t\t\tname=\"Email\" placeholder=\"Enter the Mail id\" required value=\"");
      out.print( s.getEmail());
      out.write("\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"button\">\r\n");
      out.write("\t\t\t\t\t<input type=\"submit\" value=\"Update Student\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
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
