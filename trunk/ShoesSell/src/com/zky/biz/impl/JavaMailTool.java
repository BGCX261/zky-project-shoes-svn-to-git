package com.zky.biz.impl;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.springframework.stereotype.Service;

import com.common.Email;
import com.zky.biz.JavaMailToolBiz;


@Service
public class JavaMailTool implements JavaMailToolBiz {
	
	public void appacheSimpleSend(Email email){
		SimpleEmail simpleEmail = new SimpleEmail();
		//设置源email服务器地�?
		simpleEmail.setHostName(email.getSmtpServSrc());
		//是否采用SSL方式连接服务
		simpleEmail.setSSL(false);
		//设置字条编码
		simpleEmail.setCharset("utf-8");
		try {
			//设置源email地址
			simpleEmail.setFrom(email.getAddressSrc());
			//设置目的email地址
			simpleEmail.addTo(email.getAddressStd());
			//设置发�?者的用户名和密码
			simpleEmail.setAuthentication(email.getUsernameSrc(), email.getPasswordSrc());
			//email.setSmtpPort(587);
			//设置发�?标题
			simpleEmail.setSubject(email.getTitle());
			//设置发�?内容
			simpleEmail.setMsg(email.getContent());
			//邮件发�?
			simpleEmail.send();
		} catch (EmailException e1) {
			e1.printStackTrace();
		}		
	}
	
	

}
