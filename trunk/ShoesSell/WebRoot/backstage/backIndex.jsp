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

		<title>My JSP 'backIndex.jsp' starting page</title>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<link rel="stylesheet" type="text/css" href="css/backTop.css">
		<style type="text/css">
		#pp{
		
		
		}
		
		
		</style>
	</head>

	<body>
		
		<div id="s2">
			<ul>
				<li id="a2">
					<c:choose>
						<c:when test="${!empty sessionScope.manager}">
欢迎${sessionScope.manager}
</c:when>
						<c:otherwise>
							<c:redirect url="/backstage/login.jsp"></c:redirect>
						</c:otherwise>
					</c:choose>
				</li>
				<li id="a1">
					<a href="allusers.action" >查看所有用户</a>
				</li>
				<li id="a1">
					<a href="find.action" >查看所有商品</a>
				</li>
				<li id="a1">
					<a href="#">查看所有管理员</a>
				</li>
			</ul>

		</div>
	</body>
</html>
