<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'regist.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta http-equiv="refresh" content="4; url=http://localhost:8080/ShoesSell/regist1.jsp"/>
	
<style type="text/css">

#STYLE1{ width:474px; margin:auto; margin-top:50px; border:1px #7F9DB9 solid}

#STYLE2 {font-size:15px; text-align:center; height:28px; line-height:28px; background-color:#7F9DB9;border:1px #CCCCCC solid}
#STYLE3{ font-size:13px; text-align:center; color:#666666}
#STYLE4{color:#666666; text-decoration:underline}
#STYLE4:visted{color:#666666;text-decoration:underline}
#STYLE4:hover{color:#FF6633; text-decoration:underline}
#STYLE4:active {color:#666666;text-decoration:underline}
</style>
  </head>
  
  <body>
     <table width="474"  id="STYLE1">
  <tr>
    <td  id="STYLE2">信息提示</td>
  </tr>
  <tr>
    <td id="STYLE3">请检查你输入的信息是否正确,4秒后自动跳转到注册页面</td>
  </tr>
   <tr>
    <td id="STYLE3"><a href="regist1.jsp" id="STYLE4">若不能自动跳转，请单击这里</a></td>
  </tr>
</table>
  </body>
</html>
