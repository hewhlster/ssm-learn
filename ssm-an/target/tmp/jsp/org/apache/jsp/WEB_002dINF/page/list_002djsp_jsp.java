package org.apache.jsp.WEB_002dINF.page;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;
import org.fjh.tag.*;

public final class list_002djsp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_formatDate_value_pattern_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_formatDate_value_pattern_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_fmt_formatDate_value_pattern_nobody.release();
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
      response.setContentType("text/html; charset=utf-8");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t\t<title></title>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"");
      out.print(basePath);
      out.write("css/bootstarp/css/bootstrap.css\" />\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"");
      out.print(basePath);
      out.write("css/datetimepicker/css/bootstrap-datetimepicker.css\"/>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<nav class=\"navbar navbar-default\">\r\n");
      out.write("\t\t\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t\t<div class=\"navbar-header\">\r\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#mymenu\">\r\n");
      out.write("\t\t\t\t\t<span class=\"sr-only\">fanjianjua</span>\r\n");
      out.write("\t\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t<a href=\"#\" class=\"navbar-brand\">kkkk</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"collapse navbar-collapse\" id=\"mymenu\">\r\n");
      out.write("\t\t\t\t<ul class=\"nav navbar-nav\">\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">2se</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">j2me</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">j2ee</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</nav>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"col-lg-10\">\r\n");
      out.write("\t\t\t<div id=\"\" class=\"panel panel-default\">\r\n");
      out.write("\t\t\t\t<div class=\"panel-body\">\r\n");
      out.write("\t\t\t\t\t\t<button class=\"btn btn-default btn-small\" id=\"allselect\">全选</button>\r\n");
      out.write("\t\t\t\t\t\t<button class=\"btn btn-danger btn-small\" id=\"inverseselect\">返选</button>\r\n");
      out.write("\t\t\t\t\t\t<button class=\"btn btn-default btn-small\" id=\"deleteselect\" >删除选中员工</button>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<button class=\"btn btn-success btn-small\" id=\"newselect\" data-target=\"#newdialog\">新增</button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"col-lg-10\">\r\n");
      out.write("\t\t\t<div id=\"\" class=\"panel panel-default\">\r\n");
      out.write("\t\t\t\t<div id=\"\" class=\"panel-heading\">\r\n");
      out.write("\t\t\t\t\t<h4 class=\"panel-title\">客户查询</h4>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"panel-body\">\r\n");
      out.write("\t\t\t\t\t<form class=\"form-inline\" action=\"");
      out.print(basePath);
      out.write("emp/list.do\">\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div id=\"\" class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t<label class=\"control-label\" for=\"coursename\">员工编号</label>\r\n");
      out.write("\t\t\t\t\t\t<input id=\"coursename\" class=\"form-control\" name=\"empno\"/>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div id=\"\" class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t<label class=\"control-label\" for=\"coursename\">员工姓名</label>\r\n");
      out.write("\t\t\t\t\t\t<input id=\"coursename\" class=\"form-control\" name=\"ename\"/>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div id=\"\" class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t<label class=\"control-label\" for=\"coursename\">工种</label>\r\n");
      out.write("\t\t\t\t\t\t<input id=\"coursename\" class=\"form-control\" name=\"job\"/>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<button type=\"submit\" class=\"btn btn-danger btn-small\">查询</button>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"col-lg-12\">\r\n");
      out.write("\t\t\t<h2>课程信息</h2>\r\n");
      out.write("\t\t\t<div class=\"panel panel-default\">\r\n");
      out.write("\t\t\t\t<table class=\"table table-bordered table-striped\">\r\n");
      out.write("\t\t\t\t\t<colgroup>\r\n");
      out.write("\t\t\t\t\t\t<col style=\"width:50px;align-items: auto;\">\r\n");
      out.write("\t\t\t\t\t\t<col style >\r\n");
      out.write("\t\t\t\t\t\t<col style >\r\n");
      out.write("\t\t\t\t\t\t<col style >\r\n");
      out.write("\t\t\t\t\t\t<col style >\r\n");
      out.write("\t\t\t\t\t\t<col style >\r\n");
      out.write("\t\t\t\t\t</colgroup>\r\n");
      out.write("\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<th ><input type=\"checkbox\" ></th>\r\n");
      out.write("\t\t\t\t\t\t<th>员工编号</th>\r\n");
      out.write("\t\t\t\t\t\t<th>员工姓名</th>\r\n");
      out.write("\t\t\t\t\t\t<th>工种</th>\r\n");
      out.write("\t\t\t\t\t\t<th>入职日期</th>\r\n");
      out.write("\t\t\t\t\t\t<th>部门编号</th>\r\n");
      out.write("\t\t\t\t\t\t<th>操作</th>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_0.setParent(null);
      _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.page.data }", java.lang.Object.class, (PageContext)_jspx_page_context, null));
      _jspx_th_c_forEach_0.setVar("e");
      int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t\t\t\t\t\t<tr>\r\n");
            out.write("\t\t\t\t\t\t\t\t<td><input type=\"checkbox\" class=\"select\" value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${e.empid }", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\" ></td>\t\t\t\t\t\t\r\n");
            out.write("\t\t\t\t\t\t\t\t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${e.empno }", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t\t\t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${e.ename }", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t\t\t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${e.job }", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t\t\t<td>");
            if (_jspx_meth_fmt_formatDate_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
              return;
            out.write("  </td>\r\n");
            out.write("\t\t\t\t\t\t\t\t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${e.dept }", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t\t\t<td>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t<button class=\"btn btn-sm btn-info edit\" value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${e.empid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\">编辑</button>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t<button class=\"btn btn-sm btn-danger\" onclick=\"javascript:if( confirm('确认删除吗?')==true)location.href='");
            out.print(basePath);
            out.write("emp/delete.do?empid=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${e.empid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("'\">删除</button>\r\n");
            out.write("\t\t\t\t\t\t\t\t</td>\r\n");
            out.write("\t\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t\t\t");
            int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_forEach_0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_forEach_0.doFinally();
        _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
      }
      out.write("\r\n");
      out.write("\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t<nav class=\"text-right\">\r\n");
      out.write("\t\t\t\t  <ul class=\"pagination\">\t\t\t\t  \r\n");
      out.write("\t\t\t\t    \t\r\n");
      out.write("\t\t\t\t    \t\tPage p = (Page)request.getAttribute(\"page\");\r\n");
      out.write("\t\t\t\t    \t\tInteger length= p.getPageLength();\r\n");
      out.write("\t\t\t\t    \t\tString url = p.getUrl().toString();\r\n");
      out.write("\t\t\t\t    \t\tInteger pageCurrent=p.getPageCurrent();\r\n");
      out.write("\t\t\t\t    \t\t\r\n");
      out.write("\t\t\t\t    \t\tif( url.indexOf(\"pageCurrent\")>0){\r\n");
      out.write("\t\t    \t\t\t\t\turl=url.replaceAll(\"&pageCurrent=[0-9]\", \"\");\r\n");
      out.write("\t\t    \t\t\t\t}\r\n");
      out.write("\t\t\t\t    \t\t\r\n");
      out.write("\t\t\t\t    \t\tStringBuffer html=new StringBuffer();\r\n");
      out.write("\t\t\t\t    \t\t//上一页\r\n");
      out.write("\t\t\t\t    \t\tif( pageCurrent>1){\r\n");
      out.write("\t\t\t\t    \t\t\t  html.append(\"<a href='\").append(url).append(\"&pageCurrent=\").append((pageCurrent-1)+\"'>\");\r\n");
      out.write("\t\t\t\t\t\t    \t\thtml.append(\"<li>\");\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t    \t\t  html.append(\"<span aria-hidden='true'>上一页</span>\");\r\n");
      out.write("\t\t\t\t    \t\t}\r\n");
      out.write("\t\t\t\t\t\t      else{\r\n");
      out.write("\t\t\t\t\t\t    \t\thtml.append(\"<li  class='disabled'>\");\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t    \t  html.append(\"<a href='#'>\");\r\n");
      out.write("\t\t\t\t\t    \t\t  html.append(\"<span aria-hidden='true'>上一页</span>\");\r\n");
      out.write("\t\t\t\t\t\t      }\t\t\t\t\t\t    \t  \r\n");
      out.write("\t\t\t\t    \t\thtml.append(\"</a></li>\");\r\n");
      out.write("\t\t\t\t    \t\tout.write(html.toString());\r\n");
      out.write("\t\t\t\t    \t\tint index;\r\n");
      out.write("\t\t\t\t    \t\tif( pageCurrent>20)\r\n");
      out.write("\t\t\t\t    \t\t\tindex = pageCurrent;\r\n");
      out.write("\t\t\t\t    \t\telse\r\n");
      out.write("\t\t\t\t    \t\t\tindex =1;\r\n");
      out.write("\t\t\t\t    \t\tfor(;index<= length;index++){\r\n");
      out.write("\t\t\t\t    \t\t\t\r\n");
      out.write("\t\t\t\t    \t\t\t\t String h=\"\";\r\n");
      out.write("\t\t\t\t\t    \t\t\tif(index>pageCurrent+20){\r\n");
      out.write("\t\t\t\t    \t\t\t\t\t h=\"<li><a href=\"+url+\"&pageCurrent=\"+index+\">\"+index+\"...</a></li>\";\r\n");
      out.write("\t\t\t\t\t\t    \t\t\t\tout.write(h);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tbreak;\r\n");
      out.write("\t\t\t\t\t    \t\t\t}\r\n");
      out.write("\t\t\t\t    \t\t\t\tif( index==pageCurrent)\r\n");
      out.write("\t\t\t\t    \t\t\t\t\t h=\"<li class='active'><a href=\"+url+\"&pageCurrent=\"+index+\">\"+index+\"</a></li>\";\r\n");
      out.write("\t\t\t\t    \t\t\t\telse\r\n");
      out.write("\t\t\t\t    \t\t\t\t\t h=\"<li><a href=\"+url+\"&pageCurrent=\"+index+\">\"+index+\"</a></li>\";\r\n");
      out.write("\t\t\t\t    \t\t\t\tout.write(h);\r\n");
      out.write("\t\t\t\t    \t\t\t\t\r\n");
      out.write("\t\t\t\t    \t\t\t\t\t\r\n");
      out.write("\t\t\t\t    \t\t\t\r\n");
      out.write("\t\t\t\t    \t\t}\r\n");
      out.write("\t\t\t\t    \t\t\r\n");
      out.write("\t\t\t\t    \t\t//下一页\r\n");
      out.write("\t\t\t\t    \t\thtml.setLength(0);\r\n");
      out.write("\t\t\t\t    \t\tif( pageCurrent< p.getPageLength()){\r\n");
      out.write("\t\t\t\t\t    \t\thtml.append(\"<li>\");\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t    \t\t\t  html.append(\"<a href='\").append(url).append(\"&pageCurrent=\").append((pageCurrent+1)+\"'>\");\r\n");
      out.write("\t\t\t\t\t    \t\t  html.append(\"<span aria-hidden='true'>下一页</span>\");\r\n");
      out.write("\t\t\t\t    \t\t}\r\n");
      out.write("\t\t\t\t\t\t      else{\r\n");
      out.write("\t\t\t\t\t\t    \t\thtml.append(\"<li class='disabled'>\");\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t    \t  html.append(\"<a href='#' >\");\r\n");
      out.write("\t\t\t\t\t    \t\t  html.append(\"<span aria-hidden='true'>下一页</span>\");\r\n");
      out.write("\t\t\t\t\t\t      }\t\t\t\t\t\t    \t  \r\n");
      out.write("\t\t\t\t    \t\thtml.append(\"</a></li>\");\r\n");
      out.write("\t\t\t\t    \t\tout.write(html.toString());\r\n");
      out.write("\t\t\t\t    \t\r\n");
      out.write("\t\t\t\t  </ul>\r\n");
      out.write("\t\t\t</nav>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"modal fade\" role=\"dialog\" id=\"newdialog\" tabindex=\"-1\" data-backdrop=\"static\">\r\n");
      out.write("\t\t\t<div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("\t\t\t\t<div class=\"modal-content\">\r\n");
      out.write("\t\t\t\t\t<div class=\"modal-header\">\r\n");
      out.write("\t\t\t\t\t\t<button class=\"close\" data-dismiss=\"modal\" >\r\n");
      out.write("\t\t\t\t\t\t\t<span aria-hidden=\"false\">&times;</span>\r\n");
      out.write("\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t<h4 class=\"modal-title\" id=\"newdialogtitle\">新增员工</h4>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"modal-body\">\r\n");
      out.write("\t\t\t\t\t\t<form class=\"form-horizontal\" id=\"empfrm\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"hidden\" name=\"empid\" id=\"empid\" />\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"empno\" class=\"col-sm-2 control-label\">员工编号</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"empno\" name=\"empno\" class=\"form-control\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"ename\" class=\"col-sm-2 control-label\">员工姓名</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"ename\" name=\"ename\" class=\"form-control\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"\" class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"job\" class=\"col-sm-2 control-label\">工种</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"job\" name=\"job\" class=\"form-control\" placeholder=\"最多五颗星\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"\" class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"hiredate\" class=\"col-sm-2 control-label\">入职日期</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input class=\"form-control\" id=\"hiredate\" name=\"hiredate\" placeholder=\"最多五颗星\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"\" class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"dept\" class=\"col-sm-2 control-label\">部门</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"dept\" name=\"dept\" class=\"form-control\" placeholder=\"最多五颗星\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"modal-footer\">\r\n");
      out.write("\t\t\t\t\t\t<button class=\"btn btn-danger btn-small\" data-dismiss=\"modal\">关闭</button>\r\n");
      out.write("\t\t\t\t\t\t<button class=\"btn btn-success btn-small\"  onclick=\"saveOrUpdate()\" id=\"saveOrUpdata\">保存</button>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<footer class=\"navbar navbar-inverse col-lg-12\">\r\n");
      out.write("\t\t\t <span class=\"text-danger\">hewhlster@gmail.com</span>\r\n");
      out.write("\t\t</footer>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t</body>\r\n");
      out.write("\t\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("js/jquery-3.3.1.js\" ></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("css/bootstarp/js/bootstrap.js\" ></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("css/datetimepicker/js/bootstrap-datetimepicker.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("css/datetimepicker/js/locales/bootstrap-datetimepicker.zh-CN.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t$(function(){\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$(\".select\").each(function(){\r\n");
      out.write("\t\t\t\t$(this).prop(\"checked\",false);\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t//初始化日期控件\r\n");
      out.write("\t\t\t$(\"#hiredate\").datetimepicker({\r\n");
      out.write("\t\t\t\t format: 'yyyy-mm-dd',\r\n");
      out.write("\t\t\t     minView:'month',\r\n");
      out.write("\t\t\t     language: 'zh-CN',\r\n");
      out.write("\t\t\t     initialDate: new Date()\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$(\"#newselect\").click(function(){\r\n");
      out.write("\t\t\t\t$(\"#empid\").val(\"\");\r\n");
      out.write("\t\t\t\t$(\"#empno\").val(\"\");\r\n");
      out.write("\t\t\t\t$(\"#ename\").val(\"\");\r\n");
      out.write("\t\t\t\t$(\"#job\").val(\"\");\r\n");
      out.write("\t\t\t\t$(\"#hiredate\").val(new Date());\r\n");
      out.write("\t\t\t\t$(\"#dept\").val(\"\");\r\n");
      out.write("\t\t\t\t$(\"#newdialog\").modal();\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$(\"#allselect\").click(function(){\r\n");
      out.write("\t\t\t\t$(\".select\").each(function(){\r\n");
      out.write("\t\t\t\t  $(this).prop(\"checked\",true);\r\n");
      out.write("\t\t\t\t  });\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$(\"#inverseselect\").click(function(){\r\n");
      out.write("\t\t\t\t$(\".select\").each(function(){\r\n");
      out.write("\t\t\t\t\t  if($(this).prop(\"checked\")){\r\n");
      out.write("\t\t\t\t\t  \t\t$(this).prop('checked',false);\r\n");
      out.write("\t\t\t\t\t  } else {\r\n");
      out.write("\t\t\t\t\t  \t\t$(this).prop('checked',true);\r\n");
      out.write("\t\t\t\t\t  }\r\n");
      out.write("\t\t\t\t  });\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$(\"#deleteselect\").click(function(){\r\n");
      out.write("\t\t\t\tif(confirm(\"确认删除\")==true){\r\n");
      out.write("\t\t\t\t\tdetelselect();\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$(\".edit\").click(function(){\r\n");
      out.write("\t\t\t\tedit($(this).val());\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t})\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction saveOrUpdate(){\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\ttype:\"get\",\r\n");
      out.write("\t\t\t\turl:\"");
      out.print(basePath);
      out.write("emp/saveorupdate.do\",\r\n");
      out.write("\t\t\t\tdata:$(\"#empfrm\").serialize(),\r\n");
      out.write("\t\t\t\tsuccess:function(json){\r\n");
      out.write("\t\t\t\t\tif(json.ret>=1){\r\n");
      out.write("\t\t\t\t\t\talert(\"操作成功\");\r\n");
      out.write("\t\t\t\t\t\twindow.location.reload();\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction detelselect(){\r\n");
      out.write("\t\t\tvar params=[];\r\n");
      out.write("\t\t\t$(\".select\").each(function(){\r\n");
      out.write("\t\t\t\t  if($(this).prop(\"checked\")){\r\n");
      out.write("\t\t\t\t\t  params.push($(this).val());\r\n");
      out.write("\t\t\t\t  }\r\n");
      out.write("\t\t\t  });\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\ttype:\"post\",\r\n");
      out.write("\t\t\t\turl:\"");
      out.print(basePath);
      out.write("emp/deleteselect.do\",\r\n");
      out.write("\t\t\t\tdata:{\"ids\":params.join()},\r\n");
      out.write("\t\t\t\tdataType:\"json\",\r\n");
      out.write("\t\t\t\tsuccess:function(json){\r\n");
      out.write("\t\t\t\t\tif(json.ret>1){\r\n");
      out.write("\t\t\t\t\t\talert(\"删除\"+json.ret+\"员工信息\");\r\n");
      out.write("\t\t\t\t\t\twindow.location.reload();\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction edit(id){\r\n");
      out.write("\t\t\t$.get(\r\n");
      out.write("\t\t\t\t\"");
      out.print(basePath);
      out.write("emp/detail.do\",\r\n");
      out.write("\t\t\t\t\"id=\"+id,\r\n");
      out.write("\t\t\t\tfunction(json){\r\n");
      out.write("\t\t\t\t\t$(\"#empid\").val(json.empid);\r\n");
      out.write("\t\t\t\t\t$(\"#empno\").val(json.empno);\r\n");
      out.write("\t\t\t\t\t$(\"#ename\").val(json.ename);\r\n");
      out.write("\t\t\t\t\t$(\"#job\").val(json.job);\r\n");
      out.write("\t\t\t\t\t$(\"#hiredate\").val(json.hiredate);\r\n");
      out.write("\t\t\t\t\t$(\"#dept\").val(json.dept);\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t$(\"#newdialogtitle\").html(\"编辑员工\");\t\r\n");
      out.write("\t\t\t\t\t$(\"#newdialog\").modal();\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t);\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t</script>\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_fmt_formatDate_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_value_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_formatDate_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatDate_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_fmt_formatDate_0.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${e.hiredate }", java.util.Date.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatDate_0.setPattern("yyyy-MM-dd");
    int _jspx_eval_fmt_formatDate_0 = _jspx_th_fmt_formatDate_0.doStartTag();
    if (_jspx_th_fmt_formatDate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_0);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_0);
    return false;
  }
}
