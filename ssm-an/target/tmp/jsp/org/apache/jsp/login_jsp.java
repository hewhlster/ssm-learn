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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>SSM(Spring SpringMVC Mybatis)学习系统</title>\r\n");
      out.write("\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"");
      out.print(basePath);
      out.write("css/bootstarp/css/bootstrap.css\" />\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"");
      out.print(basePath);
      out.write("datetimepicker/css/bootstrap-datetimepicker.css\"/>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"");
      out.print(basePath);
      out.write("bootstrapvalidator/css/bootstrapValidator.css\"/>\r\n");
      out.write("\t\t<style type=\"text/css\">\r\n");
      out.write("\t\t\t.col-centered {  \r\n");
      out.write("                display:inline-block;  \r\n");
      out.write("                float:none;  \r\n");
      out.write("                text-align:left;  \r\n");
      out.write("                margin-right:-4px;  \r\n");
      out.write("            }  \r\n");
      out.write("\t\t</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"container \">\r\n");
      out.write("\t\t<div class=\"panel panel-info\">\r\n");
      out.write("\t\t<div class=\"panel-heading\">\r\n");
      out.write("\t\t\t<div class=\"panel-title\">\r\n");
      out.write("\t\t\t\t<h1>SSM(Spring SpringMVC Mybatis)学习系统</h1>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"panel-body\">\r\n");
      out.write("\t\t\t\t<form class=\"form-horizontal\" id=\"loginfrm\" action=\"");
      out.print(basePath);
      out.write("user/login.do\">\r\n");
      out.write("\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t<label for=\"username\" class=\"control-label col-sm-2\" >用户名</label>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-6\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"username\" name=\"username\"/>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t<label for=\"password\" class=\"control-label col-sm-2\">密码</label>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-6\">\r\n");
      out.write("\t\t\t\t\t<input type=\"password\" class=\"form-control\" id=\"password\" name=\"password\"/>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t<label class=\"control-label col-sm-2\"></label>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-10\">\r\n");
      out.write("\t\t\t\t\t<button type=\"submit\" class=\"btn btn-success btn-small\" id=\"loginbtn\">登陆</button>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<footer class=\"navbar navbar-inverse col-lg-12 navbar-fixed-bottom\" >\r\n");
      out.write("\t\t\t<div style=\"float:left\">\r\n");
      out.write("\t\t\t <h3 style=\"color:#fff\">腾龙软件工作室<h3>\r\n");
      out.write("\t\t\t <h3 style=\"color:#fff\">联系邮箱:<a href=\"mailto:hewlh@163.com\">hewlh@163.com</a><h3>\r\n");
      out.write("\t\t\t </div>\r\n");
      out.write("\t\t\t <div style=\"float:left;margin-top: 20px;margin-left:50px\">\r\n");
      out.write("\t\t\t \t<span style=\"color:#fff\">公众号</span>\r\n");
      out.write("\t\t\t \t<img alt=\"\" src=\"");
      out.print(basePath );
      out.write("imgs/logo.jpg\" style=\"width:80px;height:80px\">\r\n");
      out.write("\t\t\t </div>\r\n");
      out.write("\t\t</footer>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"modal fade\" id=\"1000\" role=\"dialog\"  aria-hidden=\"true\"  data-backdrop=\"static\">\r\n");
      out.write("\t\t\t<div class=\"modal-dialog\">\r\n");
      out.write("\t\t\t\t<div class=\"modal-content\">\r\n");
      out.write("\t\t\t\t\t<div class=\"modal-header\">\r\n");
      out.write("\t\t\t\t\t\t<button data-dismiss=\"modal\" class=\"close\">\r\n");
      out.write("\t\t\t\t\t\t\t<span aria-hidden=\"false\">&times;</span>\r\n");
      out.write("\t\t\t\t\t\t</button>\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<h4 class=\"modal-title\">登陆失败</h4>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"modal-body\">\r\n");
      out.write("\t\t\t\t\t用户名或密码不对，请再试！\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"modal-footer\">\r\n");
      out.write("\t\t\t\t\t<button class=\"btn btn-primary\" data-dismiss=\"modal\">关闭</button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("js/jquery-3.3.1.js\" ></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("css/bootstarp/js/bootstrap.js\" ></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("datetimepicker/js/bootstrap-datetimepicker.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("datetimepicker/js/locales/bootstrap-datetimepicker.zh-CN.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("bootstrapvalidator/js/bootstrapValidator.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t$(function(){\r\n");
      out.write("\t\t\t//绑定表单校验规则\r\n");
      out.write("\t\t\t$(\"#loginfrm\").bootstrapValidator({\r\n");
      out.write("\t\t\t\tmessage:\"此项目校验没有通过\",\r\n");
      out.write("\t\t\t\tfields:{\r\n");
      out.write("\t\t\t\t\t'username':{\r\n");
      out.write("\t\t\t\t\t\tvalidators:{\r\n");
      out.write("\t\t\t\t\t\t\tnotEmpty:{\r\n");
      out.write("\t\t\t\t\t\t\t\tmessage:\"用户名不能为空\"\r\n");
      out.write("\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\tstringLength:{\r\n");
      out.write("\t\t\t\t\t\t\t\tmin:3,\r\n");
      out.write("\t\t\t\t\t\t\t\tmax:10,\r\n");
      out.write("\t\t\t\t\t\t\t\tmessage:\"用户名至少3个字符最多10个字符\"\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t'password':{\r\n");
      out.write("\t\t\t\t\t\tvalidators:{\r\n");
      out.write("\t\t\t\t\t\t\tnotEmpty:{\r\n");
      out.write("\t\t\t\t\t\t\t\tmessage:\"密码不能为空\"\r\n");
      out.write("\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\tstringLength:{\r\n");
      out.write("\t\t\t\t\t\t\t\tmin:4,\r\n");
      out.write("\t\t\t\t\t\t\t\tmax:12,\r\n");
      out.write("\t\t\t\t\t\t\t\tmessage:\"密码至少4个字符最多12个字符\"\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t}).on(\"success.form.bv\",function(e){\r\n");
      out.write("\t\t\t\te.preventDefault();\r\n");
      out.write("\t\t\t\tvar $frm=$(e.target);\r\n");
      out.write("\t\t\t\tvar bv=$frm.data(\"bootstrapValidator\");\r\n");
      out.write("\t\t\t\t$.post($frm.attr('action'),$frm.serialize(),function(json){\r\n");
      out.write("\t\t\t\t\tif( json.ret == 0)\r\n");
      out.write("\t\t\t\t\t\t//alert('用户名或密码不对！');\r\n");
      out.write("\t\t\t\t\t\t$(\"#1000\").modal(\"show\");\r\n");
      out.write("\t\t\t\t\telse if( json.ret==1){\r\n");
      out.write("\t\t\t\t\t\tvar url = \"");
      out.print(basePath);
      out.write("\"+json.url;\r\n");
      out.write("\t\t\t\t\t\twindow.location.href=url;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t});\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$(\"#1000\").on(\"hide.bs.modal\",function(){\r\n");
      out.write("\t\t\t\t$(\"#password\").val(\"\");\r\n");
      out.write("\t\t\t})\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\r\n");
      out.write("\t</script>\r\n");
      out.write("\t\r\n");
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
