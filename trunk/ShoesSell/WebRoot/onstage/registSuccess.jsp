<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'registSuccess.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta http-equiv="refresh" content="4; url=http://localhost:8080/ShoesSell/indexshoes.action"/>
<style type="text/css">
#STYLE1{ width:350px; margin:auto;margin-top:160px}
#STYLE2{float:left}
#STYLE3{font-size:13px;color:#666666;float:left; margin-top:110px;}
#STYLE4{color:#666666; text-decoration:underline}
#STYLE4:visted{color:#666666;text-decoration:underline}
#STYLE4:hover{color:#FF6633; text-decoration:underline}
#STYLE4:active {color:#666666;text-decoration:underline}
	</style>

  </head>
  
  <body>
     <div id="STYLE1"><img  src="images/174.jpg" id="STYLE2"/><p id="STYLE3">注册成功,4秒后跳转到主页面<br />
   <a href="#" id="STYLE4">若不能自动跳转请单击这里</a></p></div>
  </body>
</html>
