/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-01-27 09:26:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.page;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fjack_005fparination_0026_005furl_005fpageSize_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fjack_005fparination_0026_005furl_005fpageSize_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.release();
    _005fjspx_005ftagPool_005fjack_005fparination_0026_005furl_005fpageSize_005fnobody.release();
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
      response.setContentType("text/html; charset=utf-8");
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
      out.write("datetimepicker/css/bootstrap-datetimepicker.css\"/>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"");
      out.print(basePath);
      out.write("bootstrapvalidator/css/bootstrapValidator.css\"/>\r\n");
      out.write("\t\t\r\n");
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
      out.write("\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-danger btn-small\" id=\"search\">查询</button>\r\n");
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
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /WEB-INF/page/list.jsp(112,6) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/page/list.jsp(112,6) '${requestScope.page.data }'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${requestScope.page.data }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /WEB-INF/page/list.jsp(112,6) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("e");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t\t\t\t\t\t<tr>\r\n");
            out.write("\t\t\t\t\t\t\t\t<td><input type=\"checkbox\" class=\"select\" value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${e.empid }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write("\" ></td>\t\t\t\t\t\t\r\n");
            out.write("\t\t\t\t\t\t\t\t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${e.empno }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t\t\t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${e.ename }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t\t\t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${e.job }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t\t\t<td>");
            if (_jspx_meth_fmt_005fformatDate_005f0(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
              return;
            out.write("  </td>\r\n");
            out.write("\t\t\t\t\t\t\t\t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${e.dept }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t\t\t<td>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t<button class=\"btn btn-sm btn-info edit\" value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${e.empid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write("\">编辑</button>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t<button class=\"btn btn-sm btn-danger\" onclick=\"javascript:if( confirm('确认删除吗?')==true)location.href='");
            out.print(basePath);
            out.write("emp/delete.do?empid=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${e.empid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write("'\">删除</button>\r\n");
            out.write("\t\t\t\t\t\t\t\t</td>\r\n");
            out.write("\t\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t\t\t");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
        _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      }
      out.write("\r\n");
      out.write("\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_jack_005fparination_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\r\n");
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
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"job\" name=\"job\" class=\"form-control\" placeholder=\"\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"\" class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"hiredate\" class=\"col-sm-2 control-label\">入职日期</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input value=\"2018-1-27\" class=\"form-control\" id=\"hiredate\" name=\"hiredate\" placeholder=\"\" />\r\n");
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
      out.write("\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-success btn-small\"  onclick=\"saveOrUpdate()\"  id=\"saveOrUpdata\" >保存</button>\r\n");
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
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$(\".select\").each(function(){\r\n");
      out.write("\t\t\t\t$(this).prop(\"checked\",false);\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t//初始化日期控件\r\n");
      out.write("\t\t\t$(\"#hiredate\").datetimepicker({\r\n");
      out.write("\t\t\t\t format:'yyyy-mm-dd',\r\n");
      out.write("\t\t\t     minView:'month',\r\n");
      out.write("\t\t\t     language: 'zh-CN',\r\n");
      out.write("\t\t\t     startDate: new Date(),\r\n");
      out.write("\t\t\t     initialDate:new Date()\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t\r\n");
      out.write("\r\n");
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
      out.write("\t\t\t\r\n");
      out.write("\t\t\t////////////绑定新增表单校验\t\t\t\r\n");
      out.write("\t\t\t $('#empfrm').bootstrapValidator({\r\n");
      out.write("\t\t            message: 'This value is not valid',\r\n");
      out.write("\t\t            feedbackIcons: {/*输入框不同状态,显示图片的样式*/\r\n");
      out.write("\t\t                valid: 'glyphicon glyphicon-ok',\r\n");
      out.write("\t\t                invalid: 'glyphicon glyphicon-remove',\r\n");
      out.write("\t\t                validating: 'glyphicon glyphicon-refresh'\r\n");
      out.write("\t\t            },\r\n");
      out.write("\t\t            fields: {/*验证*/\r\n");
      out.write("\t\t                empno: {/*键名username和input name值对应*/\r\n");
      out.write("\t\t                    message: 'The username is not valid',\r\n");
      out.write("\t\t                    validators: {\r\n");
      out.write("\t\t                        notEmpty: {/*非空提示*/\r\n");
      out.write("\t\t                            message: '员工编号不能为空'\r\n");
      out.write("\t\t                        },\r\n");
      out.write("\t\t                        stringLength: {/*长度提示*/\r\n");
      out.write("\t\t                            min: 4,\r\n");
      out.write("\t\t                            max: 6,\r\n");
      out.write("\t\t                            message: '员工编号长度必须在4到6之间'\r\n");
      out.write("\t\t                        }/*最后一个没有逗号*/\r\n");
      out.write("\t\t                    }\r\n");
      out.write("\t\t                },\r\n");
      out.write("\t\t                ename: {\r\n");
      out.write("\t\t                    message:'员工姓名无效',\r\n");
      out.write("\t\t                    validators: {\r\n");
      out.write("\t\t                        notEmpty: {\r\n");
      out.write("\t\t                            message: '员工姓名不能为空'\r\n");
      out.write("\t\t                        },\r\n");
      out.write("\t\t                        stringLength: {\r\n");
      out.write("\t\t                            min: 3,\r\n");
      out.write("\t\t                            max: 8,\r\n");
      out.write("\t\t                            message: '员工姓名长度必须在3到8之间'\r\n");
      out.write("\t\t                        }\r\n");
      out.write("\t\t                    }\r\n");
      out.write("\t\t                },\r\n");
      out.write("\t\t                job: {\r\n");
      out.write("\t\t                    validators: {\r\n");
      out.write("\t\t                        notEmpty: {\r\n");
      out.write("\t\t                            message: '工种不能为空'\r\n");
      out.write("\t\t                        },\r\n");
      out.write("\t\t                        stringLength: {\r\n");
      out.write("\t\t                            min: 2,\r\n");
      out.write("\t\t                            max: 8,\r\n");
      out.write("\t\t                            message: '工种必须在2到8之间'\r\n");
      out.write("\t\t                        }\r\n");
      out.write("\t\t                    }\r\n");
      out.write("\t\t                },\r\n");
      out.write("\t\t                hiredate:{\r\n");
      out.write("\t\t                \tvalidators:{\r\n");
      out.write("\t\t                \t\tnotEmpty:{\r\n");
      out.write("\t\t                \t\t\tmessage:\"入职日期不能为空\"\r\n");
      out.write("\t\t                \t\t},\r\n");
      out.write("\t\t                \t\tdate:{\r\n");
      out.write("\t\t                \t\t\tformat:'YYYY-MM-DD'\r\n");
      out.write("\t\t                \t\t}\r\n");
      out.write("\t\t                \t}\r\n");
      out.write("\t\t                },\r\n");
      out.write("\t\t                dept:{\r\n");
      out.write("\t\t                \tvalidators:{\r\n");
      out.write("\t\t                \t\tnotEmpty:{\r\n");
      out.write("\t\t                \t\t\tmessage:\"部门编号不能为空\"\r\n");
      out.write("\t\t                \t\t},\r\n");
      out.write("\t\t                \t\tstringLength: {\r\n");
      out.write("\t\t                            min: 2,\r\n");
      out.write("\t\t                            max: 4,\r\n");
      out.write("\t\t                            message: '部门编号在2到4之间'\r\n");
      out.write("\t\t                        }\r\n");
      out.write("\t\t                \t}\r\n");
      out.write("\t\t                }\r\n");
      out.write("\t\t            },\r\n");
      out.write("\t\t            live:\"enabled\"\r\n");
      out.write("\t\t        });\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction saveOrUpdate(){\r\n");
      out.write("\t\t\t$('#empfrm').data('bootstrapValidator').validate();  \r\n");
      out.write("            if(!$('#empfrm').data('bootstrapValidator').isValid()){  \r\n");
      out.write("                return ;  \r\n");
      out.write("            } \r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
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
      out.write("\t\t\t\t\talert(json.hiredate);\r\n");
      out.write("\t\t\t\t\t$(\"#hiredate\").val(json.hiredate);\r\n");
      out.write("\t\t\t\t\t$(\"#dept\").val(json.dept);\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t$(\"#newdialogtitle\").html(\"编辑员工\");\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t$(\"#newdialog\").modal();\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t);\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t</script>\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_fmt_005fformatDate_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_005fformatDate_005f0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fformatDate_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /WEB-INF/page/list.jsp(118,12) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f0.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${e.hiredate }", java.util.Date.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    // /WEB-INF/page/list.jsp(118,12) name = pattern type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f0.setPattern("yyyy-MM-dd");
    int _jspx_eval_fmt_005fformatDate_005f0 = _jspx_th_fmt_005fformatDate_005f0.doStartTag();
    if (_jspx_th_fmt_005fformatDate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f0);
    return false;
  }

  private boolean _jspx_meth_jack_005fparination_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  jack:parination
    org.fjh.tag.Pagination _jspx_th_jack_005fparination_005f0 = (org.fjh.tag.Pagination) _005fjspx_005ftagPool_005fjack_005fparination_0026_005furl_005fpageSize_005fnobody.get(org.fjh.tag.Pagination.class);
    _jspx_th_jack_005fparination_005f0.setPageContext(_jspx_page_context);
    _jspx_th_jack_005fparination_005f0.setParent(null);
    // /WEB-INF/page/list.jsp(130,3) name = url type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_jack_005fparination_005f0.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}/emp/list.do", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    // /WEB-INF/page/list.jsp(130,3) name = pageSize type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_jack_005fparination_005f0.setPageSize(new java.lang.Integer(30));
    int _jspx_eval_jack_005fparination_005f0 = _jspx_th_jack_005fparination_005f0.doStartTag();
    if (_jspx_th_jack_005fparination_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fjack_005fparination_0026_005furl_005fpageSize_005fnobody.reuse(_jspx_th_jack_005fparination_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fjack_005fparination_0026_005furl_005fpageSize_005fnobody.reuse(_jspx_th_jack_005fparination_005f0);
    return false;
  }
}