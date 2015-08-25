<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'regist1.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<style type="text/css">
body { font:14px/19px Arial, Helvetica, sans-serif; color:#7F9DB9;}
#cls{ width:450px; height:480px; float:left; margin-top:120px}
.int{ margin-bottom:0px; padding-bottom:0px;}
.int label { float:left ; width:100px; text-align:right; line-height:23px}
.int input { border:1px solid #BED3DC;height:23px; width:200px; }
.high{
    color:red; height:23px; line-height:23px; 
}
label.error { float: none; color: red; padding-left: .5em; vertical-align: top; }

.sub{ padding-left:135px}

em { padding-right: 1em; vertical-align: top; font-size:12px }
em.error { width:50px; height:28px; line-height:28px;
  background:url("images/unchecked.gif") no-repeat 0px 0px;
  padding-left: 17px; font-family:"宋体"; font-style:normal; color:#FF0000; font-size:12px
}
em.success {
  background:url("images/checked.gif") no-repeat 0px 0px;
  padding-left:17px;font-style:normal;font-family:"宋体"; font-size:12px
}
.right-button01 {
	font-family: "宋体";
	font-size: 12px;
	color: #174B73;
	background-color:#CCCCCC;
	height: 20px;
	width: 63px;
	border-top-width: 0px;
	border-right-width: 0px;
	border-bottom-width: 0px;
	border-left-width: 0px;
}
.right-button02 {
	font-family: "宋体";
	background-color:#CCCCCC;
	font-size: 12px;
	color: #174B73;
	height: 20px;
	width: 45px;
	border-top-width: 0px;
	border-right-width: 0px;
	border-bottom-width: 0px;
	border-left-width: 0px;
	
}
.login-text03 {
	font-family: "宋体";
	font-size: 12px;
	color: #666666;
	text-decoration: underline;
}
.login-text03:hover {
	font-family: "宋体";
	font-size: 12px;
	color: #FF0000;
	text-decoration: underline;
}
</style>
<script type="text/javascript" src="jquery/jquery-1.3.1.js"></script>
<script type="text/javascript" src="jquery/jquery.validate.js"></script>
<script type="text/javascript" src="jquery/jquery.validate.messages_cn.js"></script>


<script type="text/javascript">
$(document).ready(function(){
$("#cls").validate({
rules:{
username:{
required:true,
minlength:2,
maxlength:8

},
password:{
required:true,
minlength:6,
maxlength:10

},
confirm_password:{
required:true,
equalTo:"#password"
},



email:{
required:true,
email:true}
},
messages: {
			   username: {
				required: '请输入姓名',
				minlength: '请至少输入两个字符',
				maxlength:'最多请输入八个字符'
			},
			password:{
			required: '请输入密码',
			minlength: '请至少输入六个字符',
			maxlength:'最多请输入十个字符'
			},
			confirm_password:{
			required: '请再次输入密码',
			equalTo:" 请检查密码是否一致"
			},
			email:{
				required: '请输入电子邮件地址',
				email: '请检查电子邮件格式'
			}
		},	
        errorElement: "em",				//用来创建错误提示信息标签
		success: function(label) {			//验证成功后的执行的回调函数
			//label指向上面那个错误提示信息标签em
			label.text(" ")				//清空错误提示消息
				.addClass("success");	//加上自定义的success类
		}


});
$("#username").blur(function(){
$.post("aja.jsp",
{
				'username' : $("#username").val()
				
				},function(data){
				   if(data==""){
					$("em").show();
					//alert("1");
					}else{
					//alert(data)
					$("em").hide();
					}
					$("#pp").html(data);
					$("#pp").show();			
					$("#pp").css({
					"margin-top":"0px",
					"margin-bottom":"0px",
					"padding-left":"100px",
					"color":"red"					
					});
					
					
					
					
						//alert(data);
					}
);
});

});


 function ReloadCode(){
 document.getElementById('code').src='verifyCode.jsp?t='+(new Date().getTime());
 
 }
</script>


  </head>
  
  <body>
    <div style="width:1000px; height:600px">
<div style="float:left; margin-top:150px; margin-left:80px">
<table   border="0" >
  <tr>
    <td width="377px" height="80px"></td>
    <td width="10" rowspan="3"><img src="images/line01.gif" /></td>
  </tr>
  <tr>
    <td height="97"><div align="center"><img src="images/logo.png" width="107" height="97" style="padding-left:160px" /></div></td>
    
  </tr>
   <tr>
    <td height="40"><div align="center" style="padding-left:160px" >用户注册</div></td>
    
  </tr>
</table>
</div>
<form method="post" action="Login.action" id="cls" >
  <p class="int">
 
      
		<label  for="username" ><span class='high'>*</span> 用户名: </label >
	   
	      <input type="text" id="username" name="username"  style=""/>
  </p>
  
  <p style="display:none" id="pp"> 111111111111111111</p>
  <p style="margin-top:0px; padding-top:2px; padding-left:100px;font-size:12px; color:#666666">2~18个字符，包括字母、数字、下划线</p>

 
 <p class="int">
 
      
		<label  for="password" ><span class='high'>*</span> 密　码: </label >
	   
	      <input type="password" id="password" name="password" />
  </p>
  <p style="margin-top:0px; padding-top:2px; padding-left:100px; font-size:12px; color:#666666">密码长度6～10位</p>
   <p class="int">
 
      
		<label  for="confirm_password" ><span class='high'>*</span> 确认密码: </label >
	   
	      <input type="password" id="confirm_password" name="confirm_password" />
  </p>
  <p style="margin-top:0px; padding-top:2px; padding-left:100px;font-size:12px; color:#666666">请确认输入的密码相同</p>
<p class="int">
        
	  <label for="email"> <span class='high'>*</span> 邮　箱:</label>
		<input type="text" id="email" name="email"  />
	</p>
    <p style="margin-top:0px; padding-top:2px; padding-left:100px;font-size:12px; color:#666666">请输入有效的邮件地址</p>
	  <table class="int">
        
	  <tr><td height="25px"> <label > <span class='high'>*</span> 验证图片:</label></td><td><img src="verifyCode.jsp" id="code" /><a class="login-text03" onClick="ReloadCode()" style="cursor : pointer;" >看不清楚，换张图片</a></td></tr>
		
	</table>

    <p class="int">
        
	  <label > <span class='high'>*</span> 验证码:</label>
		<input type="text" id="verifyCode" name="verifyCode"  />
	</p>
    
	<p class="sub">
		<input name="Submit2" type="submit" class="right-button01" value="注册"  />
          <input name="Submit232" type="reset" class="right-button02" value="重 置" />
	</p>
</form>
</div>
  </body>
</html>
