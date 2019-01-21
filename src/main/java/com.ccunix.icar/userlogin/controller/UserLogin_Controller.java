package com.ccunix.icar.userlogin.controller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ccunix.icar.userlogin.domain.User_info;
import com.ccunix.icar.userlogin.service.Userlogin_Service_iface;

@Controller
@RequestMapping("/UserLogin")
public class UserLogin_Controller {

	@Resource
	Userlogin_Service_iface userlogin_Service_iface;
	@Resource
	public HttpServletRequest request;

	public static String LOGIN_SESSION_STR = "loginuser";

	@RequestMapping("/add")
	@ResponseBody
	public String addUser(String name, String photo) throws ServletException, IOException {
		User_info User_info =new User_info();
		String message="";
		try {
			User_info = userlogin_Service_iface.insert_user(name, photo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return message;
		}

		request.getSession(true).setAttribute(LOGIN_SESSION_STR,User_info);
		return message="登录成功";
	}

	public User_info getWebLoginUser() {
		return (User_info) request.getSession(true).getAttribute(LOGIN_SESSION_STR);
	}

	
	
	@RequestMapping(value = "jump", method = RequestMethod.GET)
	public String jump() {

		return "anwserview/anwserview";
	}

}
