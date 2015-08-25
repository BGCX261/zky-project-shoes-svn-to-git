<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>My JSP 'topHtml.jsp' starting page</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<link rel="stylesheet" type="text/css" href="css/indexcss.css">
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
		<div id="ss">
			<table width="950px" border="0">
				<tr>
					<td width="172" rowspan="2">
						<img src="img/logo.png" width="159" height="85px" />
					</td>
					<td width="395" height="76">
						<p style="color:#666666">
							您好!
							<c:choose>
								<c:when test="${empty sessionScope.username}">
									<a href="onstage/indexLogin.jsp" id="top">请登录</a>|
							<a href="onstage/regist1.jsp" id="top">注册</a>

								</c:when>
								<c:otherwise>
							欢迎${sessionScope.username}
								<c:choose>
										<c:when test="${empty sessionScope.num}">
										</c:when>
										<c:otherwise>
							
							<a href="searchCar.action" id="top">你的购物车共有${sessionScope.num}件商品</a>
							
							</c:otherwise>

									</c:choose>


								</c:otherwise>
							</c:choose>
						</p>
						<p>
							<span style="color: #FF9966; font-size: 15px"> </span><span
								style="color: #FF9966; font-size: 15px"> 全场购物免配送费! </span>
						</p>
					</td>
					<td width="369" style="color: #FF9966; font-size: 15px">
						<form id="form1" name="form1" method="post" action="search.action">

							<input type="text" name="search" id="" size="18" />


							<input type="submit" name="con" id="button" value="搜索"
												style="background: #F6F6F6;" />

											</form></td>
				</tr>
				<tr>
					<td height="15" style="color: #666666; font-weight: bold">
						我的START SHOES | 礼品卡
					</td>
					<td style="color: #666666;">
						我的帐户 | 新手上路 | 帮助
					</td>
				</tr>
			</table>
			<ul style="background-image: url(img/title.jpg)">
				<li >
					<a href="index.jsp" id="top"> 首页 </a>
				</li>
				<li style="color:#666666">
					品牌馆
				</li>
				<li style="color:#666666">
					男鞋
				</li>
				<li style="color:#666666">
					女鞋
				</li>

			</ul>
		</div>
	</body>
</html>
