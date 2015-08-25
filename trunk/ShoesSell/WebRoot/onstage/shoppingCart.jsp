<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'shoppingCart.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
    <script type="text/javascript" src="js/checkout.js" ></script>
    <style type="text/css">
			#top {
					color: #666666;
					text-decoration: none;
			}

			#top:hover {
					color: #FF0000;
					text-decoration: underline;
			}
		</style>
  </head>
  
  <body>
		<jsp:include page="../partHtml/topHtml.jsp"></jsp:include>
		<div
			style="padding-top: 4px; margin-top: 0px; border: 1px #CCCCCC solid; width: 940px;">
			<form name="carform" action="" method="post">
				<table style="border: solid 1px #CCCCCC" align="center" width="940">
					<tr>
						<td colspan="6" align="center" style="color: #666666">
							购物车商品列表
						</td>
					</tr>
					<tr>
						<th width="100" style="color: #666666">
							商品图片
						</th>
						<th width="300" style="color: #666666">
							商品名称
						</th>
						<th width="100" style="color: #666666">
							单价
						</th>
						<th width="100" style="color: #666666">
							数量
						</th>
						<th width="150" style="color: #666666">
							金额
						</th>
						<th width="100" style="color: #666666">
							操作
						</th>
					</tr>
					<c:forEach items="${items}" var="BuyItem">
						<tr>
							<td align="center" style="">
								<img src="${BuyItem.shoe.img }" width=80 />
							</td>
							<td align="center"
								style="color: #666666; font-size: 14px; font-weight: 200">
								${BuyItem.shoe.name}
							</td>
							<td align="center" style="color:#666666" >
								${BuyItem.shoe.newprice}
							</td>
							<td align="center">
								<input name="num" value="${BuyItem.amount}" size="3"
									onblur="check(this,${BuyItem.shoe.id })" style="color: #666666;text-align:center" />
							</td>
							<td align="center" style="color:#666666">
								${BuyItem.shoe.newprice*BuyItem.amount}
							</td>
							<td align="center">
								<a href="delCart.action?id=${BuyItem.shoe.id}" id="top">删除</a>
							</td>
						</tr>
					</c:forEach>
					<tr>
						<td colspan="2" align="center">
							<a href="index.jsp" id="top">继续购买</a>
						</td>
						<td colspan="2" align="center">
							<a href="shoppingOrder.action" id="top">结账</a>
						</td>
						<td colspan="2" align="center">
							<font color="#1290E9">总价格：¥ ${totals}</font>
						</td>
					</tr>
				</table>
			</form>
		</div>
	</body>
</html>
			
			
			

		
