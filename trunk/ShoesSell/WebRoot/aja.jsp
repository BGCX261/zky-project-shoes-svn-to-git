<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="java.io.PrintWriter"%>
<%@ page import="com.zky.biz.impl.*"%>
<%@ page import="org.springframework.context.ApplicationContext"%>
<%@ page import="org.springframework.context.support.ClassPathXmlApplicationContext"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'aja.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
       <%
    	      response.setContentType("text/html");
        		response.setCharacterEncoding("utf-8");
        		PrintWriter ou = response.getWriter();
        		String name1=request.getParameter("username");
        		String msg="";
        		ApplicationContext ctx=new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
		        Aja1 aa=(Aja1) ctx.getBean("aja1");
        		//Aja1 aa=new Aja1();
        		if(aa.find(name1).size()==0||aa.find(name1)==null){
        		msg="";
        		ou.print(msg);
        		}else{
        		msg="用户名已存在";
        		ou.print(msg);
        		}
        		
        		   ou.flush();
		           ou.close();
    %>
  </body>
</html>
