package com.ccunix.icar.base.controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.ccunix.icar.base.domain.AppDataModel;
import com.ccunix.icar.base.domain.AppDataModel_Sec;
import com.ccunix.icar.base.domain.WebLoginInfo;
import com.ccunix.icar.base.util.TokenUtil;

@Controller
@RequestMapping("/BaseMultiController")
public class BaseMultiController {

	@Resource
	public HttpServletRequest request;

	public TokenUtil tokenUtil = new TokenUtil();

	protected ModelAndView toView(final String url, final Map<String, Object> map) {
		ModelAndView view = new ModelAndView(url);
		return view;
	}

	public void checkSessionAndToken(HttpServletRequest request) {
		HttpSession session = request.getSession();
	}

	public AppDataModel_Sec getAppDataMode_sec() {
		return new AppDataModel_Sec();
	}

	public HttpSession getSession() {
		return request.getSession(true);
	}

	public String encodeURI(AppDataModel appDataModel) {
		// 涓存椂鍔犲叆
		AppDataModel k = new AppDataModel();
		request.getSession(true).setAttribute(LOGIN_SESSION_STR, k);
		// 鍔燭oken

		if (appDataModel.getData() == null) {
			appDataModel.data = new HashMap<>();
			appDataModel.data.put("msg", "-");
			appDataModel.data.put("logicStatus", "01");
		}
		appDataModel.token = tokenUtil.getTokenString(request.getSession());

		String str = null;

		try {
			str = URLEncoder.encode(URLEncoder.encode(JSONObject.toJSONString(appDataModel), "UTF-8"), "UTF-8");
			System.out.println("encoding:" + str);
			// str = DesUtil.encrypt(str, DesUtil.DES_KEY);
			System.out.println("des:" + str);
		} catch (Exception e) {

			e.printStackTrace();
		}
		return str;
	}

	//
	public static String LOGIN_SESSION_STR = "loginuser";

	public WebLoginInfo getWebLoginUser() {
		return (WebLoginInfo) request.getSession(true).getAttribute(LOGIN_SESSION_STR);
	}

	@RequestMapping("setWebLoginInfo")
	public WebLoginInfo setWebLoginInfo(String user_id) {
		WebLoginInfo info = new WebLoginInfo();
		info.setUser_id(user_id);
		request.getSession(true).setAttribute(LOGIN_SESSION_STR, info);
		return info;
	}

//	@Resource
//	ParamManager_Service_Iface paramManager_Service_Iface;
//
//	@PostConstruct
//	public void initController() {
//		try {
//			int param_size = paramManager_Service_Iface.initSystemParam();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}

	public String wx_resutl(String wx_callback_methodname, AppDataModel_Sec k) {
		String str = wx_callback_methodname.replace("undefined,", "") + "(" + JSON.toJSONString(k) + ")";
		str = str.substring(str.indexOf(",") + 1);
		System.out.println(str);
		return str;
	}

	@RequestMapping("toPage")
	public String toPage(String page) {
		return page;
	}
	String path ="d:/downloadnum.txt";
	@RequestMapping("recordDownLoadNum")
	@ResponseBody
	public void recordDownLoadNum() {
		
	}
	
//	@RequestMapping("getDownLoadNum")
//	@ResponseBody
//	public String getDownLoadNum(){
//		
//		
//	}
	
	
	
	
	
	

}
