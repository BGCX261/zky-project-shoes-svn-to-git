<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'indexLogin.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link href="css/css.css" rel="stylesheet" type="text/css" />
<script type="text/javascript">
 function ReloadCode(){
 document.getElementById('code').src='verifyCode.jsp?t='+(new Date().getTime());
 
 }


</script>

  </head>
  
  <body>
		<table width="100%" border="0" cellspacing="0" cellpadding="0"
			width="776" height="147">
			<tr>
				<td></td>
			</tr>
		</table>
		<s:form action="enter.action" method="post">
			<table width="800" border="0" align="center" cellpadding="0"
				cellspacing="0" class="right-table03">
				<tr>
					<td width="221">
						<table width="95%" border="0" cellpadding="0" cellspacing="0"
							class="login-text01">

							<tr>
								<td>
									<table width="100%" border="0" cellpadding="0" cellspacing="0"
										class="login-text01">
										<tr>
											<td align="center">
												<img src="img/logo.png" width="107" height="97" />
											</td>
										</tr>
										<tr>
											<td height="40" align="center">
												用户登录
											</td>

										</tr>
										<tr>
											
										</tr>

									</table>
								</td>
								<td>
									<img src="img/line01.gif" width="5" height="292" />
								</td>
							</tr>
						</table>
					</td>
					<td>
						<table width="100%" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td width="19%" height="35" class="login-text02">
									用户名称：
									<br />
								</td>
								<td width="51%">
									<input name="username" type="text" size="30" />
								</td>


							</tr>
							<tr>
								<td height="35" class="login-text02">
									密 码：
									<br />
								</td>
								<td>
									<input name="password" type="password" size="31" />
								</td>


							</tr>
							<tr>
								<td height="35" class="login-text02">
									验证图片：
									<br />
								</td>
								<td>
									<img src="verifyCode.jsp" id="code" />
									<a class="login-text03" onClick="ReloadCode()"
										style="cursor: pointer;">看不清楚，换张图片</a>
								</td>
							</tr>
							<tr>
								<td height="35" class="login-text02">
									请输入验证码：
								</td>
								<td>
									<input name="verify" type="text" size="30" />
								</td>
							</tr>
							<tr>
								<td height="35">
									&nbsp;
								</td>
								<td>
									<input name="Submit2" type="submit" class="right-button01"
										value="确认登陆" />
									<input name="Submit232" type="reset" class="right-button02"
										value="重 置" />
								</td>
							</tr>
						</table>
					</td>
				</tr>
			</table>
		</s:form>
	</body>
</html>
