/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2016-06-01 11:13:30 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.sampleCalculatorProxy;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class TestClient_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("<HTML>\r\n");
      out.write("<HEAD>\r\n");
      out.write("<TITLE>Web Services Test Client</TITLE>\r\n");
      out.write("</HEAD>\r\n");
      out.write("<FRAMESET  COLS=\"220,*\">\r\n");
      out.write("<FRAME SRC=\"Method.jsp\" NAME=\"methods\" MARGINWIDTH=\"1\" MARGINHEIGHT=\"1\" SCROLLING=\"yes\" FRAMEBORDER=\"1\">\r\n");
      out.write("<FRAMESET  ROWS=\"80%,20%\">\r\n");
      out.write("<FRAME SRC=\"Input.jsp\" NAME=\"inputs\"  MARGINWIDTH=\"1\" MARGINHEIGHT=\"1\" SCROLLING=\"yes\" FRAMEBORDER=\"1\">\r\n");

StringBuffer resultJSP = new StringBuffer("Result.jsp");
resultJSP.append("?");
java.util.Enumeration resultEnum = request.getParameterNames();while (resultEnum.hasMoreElements()) {
Object resultObj = resultEnum.nextElement();
resultJSP.append(resultObj.toString()).append("=").append(request.getParameter(resultObj.toString())).append("&");
}

      out.write("\r\n");
      out.write("<FRAME SRC=\"");
      out.print(org.eclipse.jst.ws.util.JspUtils.markup(resultJSP.toString()));
      out.write("\" NAME=\"result\"  MARGINWIDTH=\"1\" MARGINHEIGHT=\"1\" SCROLLING=\"yes\" FRAMEBORDER=\"1\">\r\n");
      out.write("</FRAMESET>\r\n");
      out.write("<NOFRAMES>\r\n");
      out.write("<BODY>\r\n");
      out.write("The Web Services Test Client requires a browser that supports frames.\r\n");
      out.write("</BODY>\r\n");
      out.write("</NOFRAMES>\r\n");
      out.write("</FRAMESET>\r\n");
      out.write("</HTML>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
