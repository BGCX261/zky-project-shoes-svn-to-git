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
    
    <title>My JSP 'findAllOrders.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	 <link rel="stylesheet" type="text/css" href="css/fenye.css">
	<link rel="stylesheet" type="text/css" href="css/backTop.css">

  </head>
  
  <body>
    <table width="1000" border="0" cellpadding="9" cellspacing="1" bgcolor="#CCCCCC" class="newfont03" style="margin:auto">
  
					                  <tr>
                    <td height="20" colspan="9"  bgcolor="#6795B4" style="padding-left:20px; color: #FFFFFF; font-size: 16px;"> 查看所有订单 </td>
                    </tr>
                  <tr>
				  
                    <td   height="20"  bgcolor="#EEEEEE"><div align="center">订单号</div></td>
					<td  height="20"  bgcolor="#EEEEEE"><div align="center">订单金额
				      </div>
					</td>
                    <td   bgcolor="#EEEEEE"><div align="center">email地址</div></td>
                    <td  bgcolor="#EEEEEE"><div align="center">订单内容</div></td>
                    <td   bgcolor="#EEEEEE"><div align="center">详细备注</div></td>
                    
                 
                     <td    bgcolor="#EEEEEE"><div align="center">操作</div></td>
       </tr>
          	<c:forEach items="${list}" var="Orderss">
                  <tr>				 
                    <td height="20" bgcolor="#FFFFFF" ><div align="center">	${Orderss.orderId}</div></td>
					<td height="20" bgcolor="#FFFFFF" ><div align="center">${Orderss.amount}</div></td>
					 <td bgcolor="#FFFFFF"><div align="center">${Orderss.email}</div></td>
                    <td bgcolor="#FFFFFF"><div align="center">${Orderss.orderMsg}</div></td> 
                   <td bgcolor="#FFFFFF"><div align="center">${Orderss.memo}</div></td>

                      <td bgcolor="#FFFFFF"><div align="center" id="a1"><a href="#" >编辑</a>|<a  href="#" > 删除</a> </div></td>
                  </tr>
                  </c:forEach>
                  </table>
                  ${pagination}
  </body>
</html>
