<%@page import="java.text.SimpleDateFormat"%>
<%@ page import="org.fjh.tag.*" %>
<%@ page contentType="text/html; charset=utf-8"  pageEncoding="utf-8" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://www.fanjianhua.com/jack/parination"  prefix="jack"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
		<link rel="stylesheet" href="<%=basePath%>css/bootstarp/css/bootstrap.css" />
		<link rel="stylesheet" href="<%=basePath%>css/datetimepicker/css/bootstrap-datetimepicker.css"/>
	</head>
	<body>
		<nav class="navbar navbar-default">
			<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#mymenu">
					<span class="sr-only">fanjianjua</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
				<a href="#" class="navbar-brand">kkkk</a>
			</div>
			
			<div class="collapse navbar-collapse" id="mymenu">
				<ul class="nav navbar-nav">
					<li><a href="#">2se</a></li>
					<li><a href="#">j2me</a></li>
					<li><a href="#">j2ee</a></li>
				</ul>
			</div>
			</div>
		</nav>
		
		<div class="col-lg-10">
			<div id="" class="panel panel-default">
				<div class="panel-body">
						<button class="btn btn-default btn-small" id="allselect">全选</button>
						<button class="btn btn-danger btn-small" id="inverseselect">返选</button>
						<button class="btn btn-default btn-small" id="deleteselect" >删除选中员工</button>
						
						<button class="btn btn-success btn-small" id="newselect" data-target="#newdialog">新增</button>
				</div>
			</div>
		</div>
		
		<div class="col-lg-10">
			<div id="" class="panel panel-default">
				<div id="" class="panel-heading">
					<h4 class="panel-title">客户查询</h4>
				</div>
				<div class="panel-body">
					<form class="form-inline" action="<%=basePath%>emp/list.do">
						
					<div id="" class="form-group">
						<label class="control-label" for="coursename">员工编号</label>
						<input id="coursename" class="form-control" name="empno"/>
					</div>
					
					<div id="" class="form-group">
						<label class="control-label" for="coursename">员工姓名</label>
						<input id="coursename" class="form-control" name="ename"/>
					</div>
					
					<div id="" class="form-group">
						<label class="control-label" for="coursename">工种</label>
						<input id="coursename" class="form-control" name="job"/>
					</div>
					<button type="submit" class="btn btn-danger btn-small">查询</button>
					</form>

				</div>
			</div>
			
		</div>
		

		<div class="col-lg-12">
			<h2>课程信息</h2>
			<div class="panel panel-default">
				<table class="table table-bordered table-striped">
					<colgroup>
						<col style="width:50px;align-items: auto;">
						<col style >
						<col style >
						<col style >
						<col style >
						<col style >
					</colgroup>
					<thead>
					<tr>
						<th ><input type="checkbox" ></th>
						<th>员工编号</th>
						<th>员工姓名</th>
						<th>工种</th>
						<th>入职日期</th>
						<th>部门编号</th>
						<th>操作</th>
					</tr>
					</thead>
					<tbody>
						<c:forEach items="${requestScope.page.data }" var="e">
						<tr>
								<td><input type="checkbox" class="select" value="${e.empid }" ></td>						
								<td>${e.empno }</td>
								<td>${e.ename }</td>
								<td>${e.job }</td>
								<td><fmt:formatDate value="${e.hiredate }" pattern="yyyy-MM-dd"/>  </td>
								<td>${e.dept }</td>
								<td>
									<button class="btn btn-sm btn-info edit" value="${e.empid}">编辑</button>
									<button class="btn btn-sm btn-danger" onclick="javascript:if( confirm('确认删除吗?')==true)location.href='<%=basePath%>emp/delete.do?empid=${e.empid}'">删除</button>
								</td>
						</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
			

			<nav class="text-right">
				  <ul class="pagination">				  
				    	
				    		Page p = (Page)request.getAttribute("page");
				    		Integer length= p.getPageLength();
				    		String url = p.getUrl().toString();
				    		Integer pageCurrent=p.getPageCurrent();
				    		
				    		if( url.indexOf("pageCurrent")>0){
		    					url=url.replaceAll("&pageCurrent=[0-9]", "");
		    				}
				    		
				    		StringBuffer html=new StringBuffer();
				    		//上一页
				    		if( pageCurrent>1){
				    			  html.append("<a href='").append(url).append("&pageCurrent=").append((pageCurrent-1)+"'>");
						    		html.append("<li>");

					    		  html.append("<span aria-hidden='true'>上一页</span>");
				    		}
						      else{
						    		html.append("<li  class='disabled'>");

						    	  html.append("<a href='#'>");
					    		  html.append("<span aria-hidden='true'>上一页</span>");
						      }						    	  
				    		html.append("</a></li>");
				    		out.write(html.toString());
				    		int index;
				    		if( pageCurrent>20)
				    			index = pageCurrent;
				    		else
				    			index =1;
				    		for(;index<= length;index++){
				    			
				    				 String h="";
					    			if(index>pageCurrent+20){
				    					 h="<li><a href="+url+"&pageCurrent="+index+">"+index+"...</a></li>";
						    				out.write(h);
											break;
					    			}
				    				if( index==pageCurrent)
				    					 h="<li class='active'><a href="+url+"&pageCurrent="+index+">"+index+"</a></li>";
				    				else
				    					 h="<li><a href="+url+"&pageCurrent="+index+">"+index+"</a></li>";
				    				out.write(h);
				    				
				    					
				    			
				    		}
				    		
				    		//下一页
				    		html.setLength(0);
				    		if( pageCurrent< p.getPageLength()){
					    		html.append("<li>");

				    			  html.append("<a href='").append(url).append("&pageCurrent=").append((pageCurrent+1)+"'>");
					    		  html.append("<span aria-hidden='true'>下一页</span>");
				    		}
						      else{
						    		html.append("<li class='disabled'>");

						    	  html.append("<a href='#' >");
					    		  html.append("<span aria-hidden='true'>下一页</span>");
						      }						    	  
				    		html.append("</a></li>");
				    		out.write(html.toString());
				    	
				  </ul>
			</nav>
						
		</div>
		
		
		<div class="modal fade" role="dialog" id="newdialog" tabindex="-1" data-backdrop="static">
			<div class="modal-dialog" role="document">
				<div class="modal-content">
					<div class="modal-header">
						<button class="close" data-dismiss="modal" >
							<span aria-hidden="false">&times;</span>
						</button>
						<h4 class="modal-title" id="newdialogtitle">新增员工</h4>
					</div>
					
					<div class="modal-body">
						<form class="form-horizontal" id="empfrm">
							<input type="hidden" name="empid" id="empid" />
							<div class="form-group">
								<label for="empno" class="col-sm-2 control-label">员工编号</label>
								<div class="col-sm-10">
									<input type="text" id="empno" name="empno" class="form-control"/>
								</div>
							</div>
							
							<div class="form-group">
								<label for="ename" class="col-sm-2 control-label">员工姓名</label>
								<div class="col-sm-10">
									<input type="text" id="ename" name="ename" class="form-control"/>
								</div>
							</div>
							
							<div id="" class="form-group">
								<label for="job" class="col-sm-2 control-label">工种</label>
								<div class="col-sm-10">
									<input type="text" id="job" name="job" class="form-control" placeholder="最多五颗星" />
								</div>
							</div>
							
							<div id="" class="form-group">
								<label for="hiredate" class="col-sm-2 control-label">入职日期</label>
								<div class="col-sm-10">
									<input class="form-control" id="hiredate" name="hiredate" placeholder="最多五颗星" />
								</div>
							</div>
							
							<div id="" class="form-group">
								<label for="dept" class="col-sm-2 control-label">部门</label>
								<div class="col-sm-10">
									<input type="text" id="dept" name="dept" class="form-control" placeholder="最多五颗星" />
								</div>
							</div>
						</form>
					</div>
					
					<div class="modal-footer">
						<button class="btn btn-danger btn-small" data-dismiss="modal">关闭</button>
						<button class="btn btn-success btn-small"  onclick="saveOrUpdate()" id="saveOrUpdata">保存</button>
					</div>
				</div>
			</div>
		</div>
		
		
		<footer class="navbar navbar-inverse col-lg-12">
			 <span class="text-danger">hewhlster@gmail.com</span>
		</footer>
		
			
	</body>
	
	<script type="text/javascript" src="<%=basePath%>js/jquery-3.3.1.js" ></script>
	<script type="text/javascript" src="<%=basePath%>css/bootstarp/js/bootstrap.js" ></script>
	<script type="text/javascript" src="<%=basePath%>css/datetimepicker/js/bootstrap-datetimepicker.js"></script>
	<script type="text/javascript" src="<%=basePath%>css/datetimepicker/js/locales/bootstrap-datetimepicker.zh-CN.js"></script>
	
	
	<script type="text/javascript">
		$(function(){
			
			$(".select").each(function(){
				$(this).prop("checked",false);
			});
			
			
			//初始化日期控件
			$("#hiredate").datetimepicker({
				 format: 'yyyy-mm-dd',
			     minView:'month',
			     language: 'zh-CN',
			     initialDate: new Date()
			});
			
			$("#newselect").click(function(){
				$("#empid").val("");
				$("#empno").val("");
				$("#ename").val("");
				$("#job").val("");
				$("#hiredate").val(new Date());
				$("#dept").val("");
				$("#newdialog").modal();
			});
			
			
			$("#allselect").click(function(){
				$(".select").each(function(){
				  $(this).prop("checked",true);
				  });
			});
			
			
			$("#inverseselect").click(function(){
				$(".select").each(function(){
					  if($(this).prop("checked")){
					  		$(this).prop('checked',false);
					  } else {
					  		$(this).prop('checked',true);
					  }
				  });
			});
			
			$("#deleteselect").click(function(){
				if(confirm("确认删除")==true){
					detelselect();
				}
			});
			
			$(".edit").click(function(){
				edit($(this).val());
			});
		})
		
		
		function saveOrUpdate(){
			$.ajax({
				type:"get",
				url:"<%=basePath%>emp/saveorupdate.do",
				data:$("#empfrm").serialize(),
				success:function(json){
					if(json.ret>=1){
						alert("操作成功");
						window.location.reload();
						}
					}
				}
			);
		}
		
		function detelselect(){
			var params=[];
			$(".select").each(function(){
				  if($(this).prop("checked")){
					  params.push($(this).val());
				  }
			  });
			$.ajax({
				type:"post",
				url:"<%=basePath%>emp/deleteselect.do",
				data:{"ids":params.join()},
				dataType:"json",
				success:function(json){
					if(json.ret>1){
						alert("删除"+json.ret+"员工信息");
						window.location.reload();
						}
					}
				}
			);
		}
		
		function edit(id){
			$.get(
				"<%=basePath%>emp/detail.do",
				"id="+id,
				function(json){
					$("#empid").val(json.empid);
					$("#empno").val(json.empno);
					$("#ename").val(json.ename);
					$("#job").val(json.job);
					$("#hiredate").val(json.hiredate);
					$("#dept").val(json.dept);					
					$("#newdialogtitle").html("编辑员工");	
					$("#newdialog").modal();
				}
			);			
		}
		
		
	</script>
</html>
