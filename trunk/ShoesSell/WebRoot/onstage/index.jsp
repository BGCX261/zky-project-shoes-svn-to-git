<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>My JSP 'index.jsp' starting page</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<link rel="stylesheet" type="text/css" href="css/indexcss.css">
		<link rel="stylesheet" type="text/css" href="css/index.css">
		
        <script type="text/javascript" src="js/idex.js"></script>
        
		<script type="text/javascript" src="js/jquery-1.3.1.js"></script>

		<script type="text/javascript" src="js/ad.js"></script>
		
        <script type="text/javascript" src="js/scroll.js"></script>
	</head>

	<body>
		<jsp:include page="../partHtml/topHtml.jsp"></jsp:include>
		<jsp:include page="../partHtml/indexBody.jsp"></jsp:include>
		<div
			style="width: 950px; height: 22px; background-color: #DED4BB; border-top: #B8A479 1px solid; border-bottom: #B8A479 1px solid;">
			<span style="font-size: 14px; line-height: 22px; color: #666666">
				　　　热卖款--休闲鞋 <span style="padding-left: 740px">更多</span> </span>

		</div>
			           <div id="pp3">
	           <c:forEach items="${list}" var="Shoe">	
			<div id="pp4">			
			<a href="indexHref.action?id=${Shoe.id}"><img src="${Shoe.img}" width="163px"; height="107px"/></a>
				<p><a href="">${Shoe.name}<br>特价:${Shoe.newprice} 原价:${Shoe.oldprice}</a></p>
	</div>
	</c:forEach>	
		</div>
	<div style="width:950px; height:22px; background-color:#DED4BB; border-top:#B8A479 1px solid; border-bottom:#B8A479 1px solid;clear:both ">
<span style="font-size:14px; line-height:22px; color:#666666">　七月新款--清凉一夏<span style="padding-left:740px">更多</span></span>
</div>	
 <div id="pp3">
	           <c:forEach items="${list1}" var="Shoe">	
			<div id="pp4">			
			<a href="indexHref.action?id=${Shoe.id}"><img src="${Shoe.img}" width="163px"; height="107px"/></a>
				<p ><a href="">${Shoe.name}<br>特价:${Shoe.newprice} 原价:${Shoe.oldprice}</a></p>
	</div>
	</c:forEach>	
		</div>


	</body>
</html>
