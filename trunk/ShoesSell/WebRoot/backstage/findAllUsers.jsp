<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'FindAllUsers.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
    <link rel="stylesheet" type="text/css" href="css/fenye.css">
	<link rel="stylesheet" type="text/css" href="css/backTop.css">
 </head>
  
  <body>
   <table width="1000" style="margin:auto" class="newfont03">
 <tr>
 <td width="50" height="20"><strong>选择</strong>：</td>
 <td width="105" height="20" background="images/button10.gif" > <div align="center" id="a1"><a href="#">添加功能</a></div></td>
 <td width="105" height="20" background="images/button10.gif" > <div align="center" id="a1"><a href="backstage/backIndex.jsp">返回首页</a></div></td>
<td width="824"></td>
 </tr>  
   </table>
		<table width="800px" height="182px" border="0" cellpadding="9"
			cellspacing="1" bgcolor="#CCCCCC" class="newfont03"
			style="margin-left: 24px; margin-top: 18px">
			<tr>
				<td height="20" colspan="9" bgcolor="#6795B4"
					style="padding-left: 20px; color: #FFFFFF; font-size: 16px;">
					查看所有用户
				</td>
			</tr>
			<tr>
				<td width="212" height="20" bgcolor="#EEEEEE">
					<div align="center">
						用户名
					</div>
				</td>
				<td width="158" height="20" bgcolor="#EEEEEE">
					<div align="center">
						密码
					</div>
				</td>
				<td width="185" height="20" bgcolor="#EEEEEE">
					<div align="center">
						Email
					</div>
				</td>
				<td width="168" height="20" bgcolor="#EEEEEE">
					<div align="center">
						操作
					</div>
				</td>
			</tr>
			<c:forEach items="${list}" var="Users1">
				<tr>
					<td height="20" bgcolor="#FFFFFF">
						<div align="center" id="ll">
							${Users1.username}
						</div>
					</td>
					<td height="20" bgcolor="#FFFFFF">
						<div align="center">
							${Users1.psw}
						</div>
					</td>
					<td bgcolor="#FFFFFF">
						<div align="center">
							${Users1.email}
						</div>
					</td>

					<td bgcolor="#FFFFFF">
						<div align="center" id="a1">
							<a href="#">编辑</a>|
							<a href="#"> 删除</a>
						</div>
					</td>
				</tr>
			</c:forEach>
		</table>
		${pagination}
	</body>
</html>
