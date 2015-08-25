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
    
    <title>My JSP 'shoppingOrder.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	 <script type="text/javascript" src="js/checkout1.js" ></script>
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
		<div style="padding-top: 0px; margin-top: 0px; border: 1px #DECEA5 solid; width: 940;">
  	 <form name="carform" action="doUpdateCar.jsp"  method="post">
  	 <p style=" font-size:15px; color:#000000；padding-bottom:0px; margin-bottom:0px;padding-left:22px">你所选购的商品</p>
   <table  style="margin-top:0px; padding-top:0px;" align="center" width="940" >
		<tr>
			<td colspan="6" style=" font-size:13px; color:#000000" ></td>
		</tr>
		<tr>
			<th width="100" style="color: #666666">商品图片</th>
			<th width="300" style="color: #666666">商品名称</th>
			<th width="100" style="color: #666666">单价</th>
			<th width="100" style="color: #666666">数量</th>
			<th width="150" style="color: #666666">金额</th>
			<th width="100" style="color: #666666">操作</th>
		</tr>
		<c:forEach items="${items}" var="BuyItem">
		<tr >
			<td align="center"><img src="${BuyItem.shoe.img }"  width="45px"/></td>
			<td align="center" style="color: #666666;font-size:14px;font-weight:200">${BuyItem.shoe.name}</td>
			<td align="center" style="color: #666666">${BuyItem.shoe.newprice}</td>
			<td align="center" ><input name="num" value="${BuyItem.amount}" size="3" onblur="check(this,${BuyItem.shoe.id })" style="color: #666666;text-align:center"/></td>
			<td align="center" style="color: #666666">¥${BuyItem.shoe.newprice*BuyItem.amount}</td>
			<td align="center"><a href="delcartOrder.action?id=${BuyItem.shoe.id}" id="top">删除</a></td>
		</tr>
		</c:forEach>	
		</table>	
	</form>
			<s:form action="orderTable.action" method="post" >
				<table border="0" align="center" width="930px" >
					<tr>
						<th colspan="2"  >				
						</th>
					</tr>
					<tr>
						<td align="right" style="color: #666666">订单号：</td>
						<td width="650px" style="color: #666666">${orderId}<input type="hidden" name="order.orderId" value="${orderId}" /></td>
					</tr>						
					<tr>
						<td align="right" style="color: #666666">订单信息：</td>					
						<td style="color: #666666">${orderMsg}<input type="hidden" name="order.orderMsg" value="${orderMsg}" /></td>					
					</tr>
					<tr>
						<td align="right" style="color: #666666">总金额：</td>					
						<td style="color: #666666">${totals}<input type="hidden" name="order.amount" value="${totals}" /></td>
					</tr>								
					<tr>
						<td align="right" style="color: #666666">发货邮箱地址：</td>					
						<td ><input type="text" size="60" name="order.address" style="color: #666666" /></td>
					</tr>
					<tr>
						<td align="right" style="color: #666666">顾客邮箱地址：</td>				
						<td><input type="text" size="60" name="order.email" style="color: #666666" /></td>	
					</tr>	
					<tr>
						<td align="right" style="color: #666666">备注：</td>				
						<td valign="middle"><textarea rows="5" cols="50" name="order.memo" style="color: #666666"></textarea></td>												
					</tr>
					<tr>
						<td colspan="2">
							<table width="800">
								<tr>
									<td width="300" align="center" valign="middle">
										<input type="submit" value="提交定单"  style="color: #666666"/>
									</td>
									<td width="250" align="center" valign="middle">
										<input type="reset" value=" 重 填  " style="color: #666666" />
									</td>
									<td width="250" align="center" valign="middle">
										<input type="button" value="  取 消  " style="color: #666666" />
											
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
			</s:form>
		</div>
  </body>
</html>
