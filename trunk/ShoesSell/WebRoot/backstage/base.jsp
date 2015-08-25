<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'base.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	

  </head>
  
<frameset rows="59,*" cols="*" frameborder="no" border="0" framespacing="0">
  <frame  src="backstage/top.jsp" name="topFrame" scrolling="No" noresize="noresize"   id="topFrame"  title="topFrame" />
  <frameset cols="213,*" frameborder="no" border="0" framespacing="0">
    <frame   src="backstage/leftFrame.jsp" name="leftFrame" scrolling="no"  noresize="noresize"  id="leftFrame" title="leftFrame" />
    <frame src="backstage/mainFrame.jsp" name="mainFrame" id="mainFrame" title="mainFrame" />
  </frameset>
</frameset>
<noframes>
<body>
</body>
</noframes>
</html>
