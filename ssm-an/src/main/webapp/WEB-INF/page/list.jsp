<%@page import="java.text.SimpleDateFormat"%>
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
		<title>SSM(Spring SpringMVC Mybatis)学习系统</title>
		<link rel="stylesheet" href="<%=basePath%>css/bootstarp/css/bootstrap.css" />
		<link rel="stylesheet" href="<%=basePath%>datetimepicker/css/bootstrap-datetimepicker.css"/>
		<link rel="stylesheet" href="<%=basePath%>bootstrapvalidator/css/bootstrapValidator.css"/>
		
	</head>
	<body>
		<nav class="navbar navbar-default" role="navigation">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#mymenu">
					<span class="sr-only">fanjianjua</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
				
				<a href="#" class="navbar-brand">
					&nbsp;&nbsp;SSM学习系统
				</a>
				
			</div>
			
			
			<div class="navbar-collapse" id="mymenu">
				<ul class="nav navbar-nav">
					<li>&nbsp;&nbsp;</li>
					<li>&nbsp;&nbsp;</li>
					<li><a href="<%=basePath%>user/logout.do">退出</a></li>
				</ul>
			</div>
		</nav>
		
		<div class="">
		

		
		<div class="col-lg-10">
			<div id="" class="panel panel-default">
				<div id="" class="panel-heading">
					<h4 class="panel-title">查询模块</h4>
				</div>
				<div class="panel-body">
					<form class="form-inline" action="<%=basePath%>emp/list.do">
						
					<div id="" class="form-group">
						<label class="control-label" for="coursename">员工编号</label>
						<input value='${param.empno }' id="coursename" class="form-control" name="empno"/>
					</div>
					
					<div id="" class="form-group">
						<label class="control-label" for="coursename">员工姓名</label>
						<input  value='${param.ename }'id="coursename" class="form-control" name="ename"/>
					</div>
					
					<div id="" class="form-group">
						<label class="control-label" for="coursename">工种</label>
						<input  value='${param.job }'id="coursename" class="form-control" name="job"/>
					</div>
						<button type="submit" class="btn btn-danger btn-small" id="search">查询</button>
					</form>

				</div>
			</div>
			
		</div>
		
		<div class="col-lg-10">
			<div id="" class="panel panel-default">
				<div class="panel-heading">
				<h4>增、删、编辑模块</h4></div>
				<div class="panel-body">
						<button class="btn btn-default btn-small" id="allselect">全选</button>
						<button class="btn btn-danger btn-small" id="inverseselect">返选</button>
						<button class="btn btn-primary btn-small" id="deleteselect" >删除选中员工</button>
						
						<button class="btn btn-success btn-small" id="newselect" data-target="#newdialog">新增</button>
				</div>
			</div>
		</div>

		<div class="col-lg-12">
			<h2>员工信息</h2>
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
						<th ></th>
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
			
			<jack:parination url="${pageContext.request.contextPath}/emp/list.do"  pageSize="30"/>
			
		</div>
		
		<!-- 新增、编辑 模态框 -->
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
									<input type="text" id="job" name="job" class="form-control" placeholder="" />
								</div>
							</div>
							
							<div id="" class="form-group">
								<label for="hiredate" class="col-sm-2 control-label">入职日期</label>
								<div class="col-sm-10">
									<input value="2018-1-27" class="form-control" id="hiredate" name="hiredate" placeholder="" />
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
						<button type="button" class="btn btn-success btn-small"  onclick="saveOrUpdate()"  id="saveOrUpdata" >保存</button>
					</div>
				</div>
			</div>
		</div>
		
		</div>
		
		<footer class="navbar navbar-inverse col-lg-12" >
			<div style="float:left">
			 <h3 style="color:#fff">腾龙软件工作室<h3>
			 <h3 style="color:#fff">联系邮箱:<a href="mailto:hewlh@163.com">hewlh@163.com</a><h3>
			 </div>
			 <div style="float:left;margin-top: 20px;margin-left:50px">
			 	<span style="color:#fff">公众号</span>
			 	<img alt="" src="<%=basePath %>imgs/logo.jpg" style="width:80px;height:80px">
			 </div>
		</footer>
	</body>
	
	<script type="text/javascript" src="<%=basePath%>js/jquery-3.3.1.js" ></script>
	<script type="text/javascript" src="<%=basePath%>css/bootstarp/js/bootstrap.js" ></script>
	<script type="text/javascript" src="<%=basePath%>datetimepicker/js/bootstrap-datetimepicker.js"></script>
	<script type="text/javascript" src="<%=basePath%>datetimepicker/js/locales/bootstrap-datetimepicker.zh-CN.js"></script>
	<script type="text/javascript" src="<%=basePath%>bootstrapvalidator/js/bootstrapValidator.js"></script>
	
	<script type="text/javascript">
		//绑定校验规则
		function formValidator(){
			////////////绑定新增表单校验			
			 $('#empfrm').bootstrapValidator({
		            message: 'This value is not valid',
		            feedbackIcons: {/*输入框不同状态,显示图片的样式*/
		                valid: 'glyphicon glyphicon-ok',
		                invalid: 'glyphicon glyphicon-remove',
		                validating: 'glyphicon glyphicon-refresh'
		            },
		            fields: {/*验证*/
		                empno: {/*键名username和input name值对应*/
		                    message: 'The username is not valid',
		                    validators: {
		                        notEmpty: {/*非空提示*/
		                            message: '员工编号不能为空'
		                        },
		                        stringLength: {/*长度提示*/
		                            min: 4,
		                            max: 6,
		                            message: '员工编号长度必须在4到6之间'
		                        },
		                        remote:{
		                        	url:"<%=basePath%>emp/checkempno.do",
		                            message:"员工编号以存在，请换一个"
		                        }/*最后一个没有逗号*/
		                    }
		                },
		                ename: {
		                    message:'员工姓名无效',
		                    validators: {
		                        notEmpty: {
		                            message: '员工姓名不能为空'
		                        },
		                        stringLength: {
		                            min: 3,
		                            max: 8,
		                            message: '员工姓名长度必须在3到8之间'
		                        }
		                    }
		                },
		                job: {
		                    validators: {
		                        notEmpty: {
		                            message: '工种不能为空'
		                        },
		                        stringLength: {
		                            min: 2,
		                            max: 8,
		                            message: '工种必须在2到8之间'
		                        }
		                    }
		                },
		                hiredate:{
		                	validators:{
		                		notEmpty:{
		                			message:"入职日期不能为空"
		                		},
		                		date:{
		                			format:'YYYY-MM-DD',
		                			message:"日期格式不正"
		                		}
		                	}
		                },
		                dept:{
		                	validators:{
		                		notEmpty:{
		                			message:"部门编号不能为空"
		                		},
		                		stringLength: {
		                            min: 2,
		                            max: 4,
		  					        message: '部门编号在2到4之间'
		                        }
		                	}
		                }
		        	}
		        });
		}
		
		function saveOrUpdate(){
			$('#empfrm').data('bootstrapValidator').validate();  
            if(!$('#empfrm').data('bootstrapValidator').isValid()){  
                return ;  
            } 
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
			//删除empno重复的校验
			//$("#empfrm").bootstrapValidator("removeField","empno");
			
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
		
		
		Date.prototype.format = function(format)
		{
		 var o = {
		 "M+" : this.getMonth()+1, //month
		 "d+" : this.getDate(),    //day
		 "h+" : this.getHours(),   //hour
		 "m+" : this.getMinutes(), //minute
		 "s+" : this.getSeconds(), //second
		 "q+" : Math.floor((this.getMonth()+3)/3),  //quarter
		 "S" : this.getMilliseconds() //millisecond
		 }
		 if(/(y+)/.test(format)) format=format.replace(RegExp.$1,
		 (this.getFullYear()+"").substr(4 - RegExp.$1.length));
		 for(var k in o)if(new RegExp("("+ k +")").test(format))
		 format = format.replace(RegExp.$1,
		 RegExp.$1.length==1 ? o[k] :
		 ("00"+ o[k]).substr((""+ o[k]).length));
		 return format;
		}
		
		$(function(){			
			$(".select").each(function(){
				$(this).prop("checked",false);
			});
						
			//初始化日期控件
			$("#hiredate").datetimepicker({
				 format:'yyyy-mm-dd',
			     minView:'month',
			     language: 'zh-CN',
			     startDate: new Date(),
			});
			

			$("#newselect").click(function(){
				$("#empid").val("");
				$("#empno").val("");
				$("#ename").val("");
				$("#job").val("");
				$("#hiredate").val(new Date().format('yyyy-MM-dd'));
				$("#dept").val("");
				$("#newdialog").modal("hide");

				$("#newdialog").modal("show");
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
				$("#empno").attr("disabled","disabled");
				edit($(this).val());
			});
			
			
			//绑定校验规则
			formValidator();
			/*********************************校验重置重点在这里 当modal隐藏时销毁验证再重新加载验证****************************************/        

		   //Modal验证销毁重构
		    $('#newdialog').on('hide.bs.modal', function() {
		        $("#empfrm").data('bootstrapValidator').destroy();
		        $('#empfrm').data('bootstrapValidator', null);
		        formValidator();
		    });			 
		});
		
	</script>
</html>
