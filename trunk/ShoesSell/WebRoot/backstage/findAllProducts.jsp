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

		<title>My JSP 'findAllProducts.jsp' starting page</title>

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
 <td width="105" height="20" background="images/button10.gif" > <div align="center" id="a1" ><a href="backstage/addproduct.jsp"  >添加功能</a></div></td>
 <td width="105" height="20" background="images/button10.gif" > <div align="center" id="a1"><a href="backstage/backIndex.jsp" >返回首页</a></div></td>
<td width="824"></td>
 </tr>  
   
   
   </table>
     <table width="1000" border="0" cellpadding="9" cellspacing="1" bgcolor="#CCCCCC" class="newfont03" style="margin:auto">
  
					                  <tr>
                    <td height="20" colspan="9"  bgcolor="#6795B4" style="padding-left:20px; color: #FFFFFF; font-size: 16px;"> 查看所有商品 </td>
                    </tr>
                  <tr>
				  
                    <td   height="20"  bgcolor="#EEEEEE"><div align="center">产品</div></td>
					<td  height="20"  bgcolor="#EEEEEE"><div align="center">产品名称
				      </div>
					</td>
					<td  height="20"  bgcolor="#EEEEEE"><div align="center">产品编号</div></td>
                    <td   bgcolor="#EEEEEE"><div align="center">产品类型</div></td>
                    <td  bgcolor="#EEEEEE"><div align="center">品牌</div></td>
                    <td   bgcolor="#EEEEEE"><div align="center">产品原价</div></td>
                    <td    bgcolor="#EEEEEE"><div align="center" >产品特价</div></td>
                 
                     <td    bgcolor="#EEEEEE"><div align="center">操作</div></td>
       </tr>
          	<c:forEach items="${list1}" var="Shoe">
                  <tr>				 
                    <td height="20" bgcolor="#FFFFFF" ><div align="center">	<img src="${Shoe.img} " width=100 /></div></td>
					<td height="20" bgcolor="#FFFFFF" ><div align="center">${Shoe.name}</div></td>
					 <td bgcolor="#FFFFFF"><div align="center">${Shoe.cid}</div></td>
                    <td bgcolor="#FFFFFF"><div align="center">${Shoe.type}</div></td> 
                   <td bgcolor="#FFFFFF"><div align="center">${Shoe.bank}</div></td>
                    <td bgcolor="#FFFFFF"><div align="center">${Shoe.oldprice}</div></td>
                     <td bgcolor="#FFFFFF"><div align="center">${Shoe.newprice}</div></td>
                      <td bgcolor="#FFFFFF"><div align="center" id="a1"><a href="edit.action?id=${Shoe.id}" >编辑</a>|<a  href="delete.action?id=${Shoe.id}" > 删除</a> </div></td>
                  </tr>
                  </c:forEach>
                  </table>
                  ${pagination}
       
</body>
</html>
