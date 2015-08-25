<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'indexHref.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="css/indexcss.css">

  </head>
  
  <body>
    <jsp:include page="../partHtml/topHtml.jsp"></jsp:include>
     <div style="width:919px; margin:auto;margin-top:5px ">
<table width="919" border="1" >
  <tr>
    <td width="92" height="65"><div align="center" style="color:#666666">商品名称</div></td>
    <td width="154"><div align="center" style="color:#666666">${add.name }</div></td>
    <td width="405" rowspan="3"><img src="${add.img}" width="405px"/></td>
    <td width="122" height="40"><img  src="img/zhengpinbaozheng.jpg"/></td>
  </tr>
  <tr>
    <td height="63"><div align="center" style="color:#666666">商品原价</div></td>
    <td><div align="center" style="color:#666666">${add.oldprice }</div></td>
    <td width="122" height="40"><img  src="img/mianfeipeisong.jpg" width="122" height="40"/></td>
  </tr>
  <tr>
    <td height="83"><div align="center" style="color:#666666">商品现价</div></td>
    <td><div align="center" style="color:#666666">${add.newprice }</div></td>
    <td width="122" height="40"><img  src="img/wuliyoutuihuan.jpg"/></td>
  </tr>
</table>
<p align="center"><a href="index.jsp"><img  src="img/buy_it_now.jpg" style="border:#FFFFFF 1px solid"/></a>　　<a href="buyCartAction.action?id=${add.id }"><img  src="img/put_shoppingcart.jpg" style="border:#FFFFFF 1px solid" /></a></p>
</div>
  </body>
</html>
