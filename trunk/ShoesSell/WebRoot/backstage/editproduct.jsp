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
    
    <title>My JSP 'editproduct.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<style type="text/css">
	#font1 {
	color: #555555;
	}
	</style>
	

  </head>
  
  <body>
   <form name="addNoteBook" action="update.action" method="post"  enctype="multipart/form-data">
<table align="center" width="600" border="0" bgcolor="#DFEEF7" id="font1">
<tr><td colspan="2" align="center">添加商品信息</td></tr>
<tr><td width="%">商品名称</td><td><input type="text" name="add.name" value="${add.name}"></td></tr>
<tr><td>品牌</td><td><input type="text" name="add.bank" value="${add.bank}"></td></tr>
<tr><td>商品类型</td><td><input type="text" name="add.type" value="${add.type}"></td></tr>
<tr><td>编号</td><td><input type="text" name="add.cid" value="${add.cid}"></td></tr>
<tr><td>图片</td><td><img src="${add.img}" width=126/><input name="add.img" type="hidden" value="${add.img}"/></td></tr>
<tr><td>市场价</td><td><input type="text" size="35" name="add.oldprice" value="${add.oldprice}" ></td></tr>
<tr><td>产品现价</td><td><input type="text" size="35" name="add.newprice" value="${add.newprice}"></td></tr>
<tr><td align="right"><input type="submit" value="确定"></td><td><input type="reset" value="重置"></td></tr>
</table>
</form>
  </body>
</html>
