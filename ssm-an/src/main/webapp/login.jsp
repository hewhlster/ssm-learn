<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SSM(Spring SpringMVC Mybatis)学习系统</title>

		<link rel="stylesheet" href="<%=basePath%>css/bootstarp/css/bootstrap.css" />
		<link rel="stylesheet" href="<%=basePath%>datetimepicker/css/bootstrap-datetimepicker.css"/>
		<link rel="stylesheet" href="<%=basePath%>bootstrapvalidator/css/bootstrapValidator.css"/>
		<style type="text/css">
			.col-centered {  
                display:inline-block;  
                float:none;  
                text-align:left;  
                margin-right:-4px;  
            }  
		</style>
</head>
<body>
	<div class="container ">
		<div class="panel panel-info">
		<div class="panel-heading">
			<div class="panel-title">
				<h1>SSM(Spring SpringMVC Mybatis)学习系统</h1>
			</div>
		</div>
		<div class="panel-body">
				<form class="form-horizontal" id="loginfrm" action="<%=basePath%>user/login.do">
				<div class="form-group">
					<label for="username" class="control-label col-sm-2" >用户名</label>
					<div class="col-sm-6">
						<input type="text" class="form-control" id="username" name="username"/>
					</div>
				</div>
				<div class="form-group">
					<label for="password" class="control-label col-sm-2">密码</label>
					<div class="col-sm-6">
					<input type="password" class="form-control" id="password" name="password"/>
					</div>
				</div>
				
				<div class="form-group">
					<label class="control-label col-sm-2"></label>
					<div class="col-sm-10">
					<button type="submit" class="btn btn-success btn-small" id="loginbtn">登陆</button>
					</div>
				</div>
		</form>
		</div>
		</div>
		</div>
		
		
		<footer class="navbar navbar-inverse col-lg-12 navbar-fixed-bottom" >
			<div style="float:left">
			 <h3 style="color:#fff">腾龙软件工作室<h3>
			 <h3 style="color:#fff">联系邮箱:<a href="mailto:hewlh@163.com">hewlh@163.com</a><h3>
			 </div>
			 <div style="float:left;margin-top: 20px;margin-left:50px">
			 	<span style="color:#fff">公众号</span>
			 	<img alt="" src="<%=basePath %>imgs/logo.jpg" style="width:80px;height:80px">
			 </div>
		</footer>
		
		<div class="modal fade" id="1000" role="dialog"  aria-hidden="true"  data-backdrop="static">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button data-dismiss="modal" class="close">
							<span aria-hidden="false">&times;</span>
						</button>					
						<h4 class="modal-title">登陆失败</h4>
					</div>
				<div class="modal-body">
					用户名或密码不对，请再试！
				</div>
				<div class="modal-footer">
					<button class="btn btn-primary" data-dismiss="modal">关闭</button>
				</div>
				</div>
			</div>
		</div>
</body>

	<script type="text/javascript" src="<%=basePath%>js/jquery-3.3.1.js" ></script>
	<script type="text/javascript" src="<%=basePath%>css/bootstarp/js/bootstrap.js" ></script>
	<script type="text/javascript" src="<%=basePath%>datetimepicker/js/bootstrap-datetimepicker.js"></script>
	<script type="text/javascript" src="<%=basePath%>datetimepicker/js/locales/bootstrap-datetimepicker.zh-CN.js"></script>
	<script type="text/javascript" src="<%=basePath%>bootstrapvalidator/js/bootstrapValidator.js"></script>
	
	<script type="text/javascript">
		$(function(){
			//绑定表单校验规则
			$("#loginfrm").bootstrapValidator({
				message:"此项目校验没有通过",
				fields:{
					'username':{
						validators:{
							notEmpty:{
								message:"用户名不能为空"
							},
							stringLength:{
								min:3,
								max:10,
								message:"用户名至少3个字符最多10个字符"
							}
						}
					},
					'password':{
						validators:{
							notEmpty:{
								message:"密码不能为空"
							},
							stringLength:{
								min:4,
								max:12,
								message:"密码至少4个字符最多12个字符"
							}
						}
					}
				}
				
			}).on("success.form.bv",function(e){
				e.preventDefault();
				var $frm=$(e.target);
				var bv=$frm.data("bootstrapValidator");
				$.post($frm.attr('action'),$frm.serialize(),function(json){
					if( json.ret == 0)
						//alert('用户名或密码不对！');
						$("#1000").modal("show");
					else if( json.ret==1){
						var url = "<%=basePath%>"+json.url;
						window.location.href=url;
					}
				});
			});		
			
			$("#1000").on("hide.bs.modal",function(){
				$("#password").val("");
			})
		});
	
	</script>
	
</html>