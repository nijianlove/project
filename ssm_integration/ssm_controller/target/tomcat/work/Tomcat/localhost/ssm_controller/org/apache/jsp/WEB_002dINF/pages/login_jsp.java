/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-02-17 00:36:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"zh-CN\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\"/>\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\"/>\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\"/>\r\n");
      out.write("    <title>管理员登录</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- 1. 导入CSS的全局样式 -->\r\n");
      out.write("    <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <!-- 2. jQuery导入，建议使用1.9以上的版本 -->\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery-2.1.0.min.js\"></script>\r\n");
      out.write("    <!-- 3. 导入bootstrap的js文件 -->\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("    </script>\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("  \t");

		String username="";
		String password="";
		String checked="";
		Cookie[] cookie=request.getCookies();

		if(cookie!=null){
			for (int i=0;i<cookie.length;i++){
				if("username".equals(cookie[i].getName())){
					username=cookie[i].getValue();
					checked="checked";
				}
				if("password".equals(cookie[i].getName())){
					password=cookie[i].getValue();
				}
			}
			request.setAttribute("username",username);
			request.setAttribute("password",password);
			request.setAttribute("checked",checked);
		}
  	
      out.write("\r\n");
      out.write("\r\n");
      out.write("  \t<div class=\"container\" style=\"width: 400px;\">\r\n");
      out.write("  \t\t<h3 style=\"text-align: center;\">管理员登录</h3>\r\n");
      out.write("        <form action=\"user/login\" method=\"post\">\r\n");
      out.write("\t      <div class=\"form-group\">\r\n");
      out.write("\t        <label for=\"user\">用户名：</label>\r\n");
      out.write("\t        <input type=\"text\" name=\"username\" class=\"form-control\" id=\"user\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${username}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" placeholder=\"请输入用户名\"/>\r\n");
      out.write("\t      </div>\r\n");
      out.write("\t      \r\n");
      out.write("\t      <div class=\"form-group\">\r\n");
      out.write("\t        <label for=\"password\">密码：</label>\r\n");
      out.write("\t        <input type=\"password\" name=\"password\" class=\"form-control\" id=\"password\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${password}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" placeholder=\"请输入密码\"/>\r\n");
      out.write("\t      </div>\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<label for=\"password\">记住我：</label>\r\n");
      out.write("\t\t\t\t<input type=\"checkbox\" name=\"ck\" class=\"form-control\" value=\"1\"  ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${checked}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" id=\"ck\"/>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t      <hr/>\r\n");
      out.write("\t      <div class=\"form-group\" style=\"text-align: center;\">\r\n");
      out.write("\t        <input class=\"btn btn btn-primary\" type=\"submit\" value=\"登录\">\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t  \t</form>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!-- 出错显示的信息框 -->\r\n");
      out.write("\t  \t<div class=\"alert alert-warning alert-dismissible\" role=\"alert\">\r\n");
      out.write("\t\t  <button type=\"button\" class=\"close\" data-dismiss=\"alert\" >\r\n");
      out.write("\t\t  \t<span>&times;</span>\r\n");
      out.write("\t\t  </button>\r\n");
      out.write("\t\t   <strong>登录失败!</strong>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("  \t</div>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>");
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
