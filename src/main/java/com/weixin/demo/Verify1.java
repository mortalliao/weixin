package com.weixin.demo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 1. 验证消息的确来自微信服务器
 * 
 * http://jimliao.free.idcfengye.com/wechat/wx
 */
@WebServlet(urlPatterns = "/wx")
public class Verify1 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		/*
		 *  signature	微信加密签名，signature结合了开发者填写的token参数和请求中的timestamp参数、nonce参数。
		 *	timestamp	时间戳
		 *	nonce	随机数
		 *	echostr	随机字符串
		 */
		System.out.println("get");
		String signature = req.getParameter("signature");
		String timestamp = req.getParameter("timestamp");
		String nonce = req.getParameter("nonce");
		String echostr = req.getParameter("echostr");
		System.out.println(signature);
		System.out.println(timestamp);
		System.out.println(nonce);
		System.out.println(echostr);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("post");
	}

}
