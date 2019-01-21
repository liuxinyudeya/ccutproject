package com.ccunix.icar.answer.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ccunix.icar.answer.domain.Topic;
import com.ccunix.icar.answer.service.AddAndUpdateTopic_Service_Iface;
import com.ccunix.icar.basedb.domain.T_u_topic;

/**
 * <p>Title: AddAndUpdateTopic_Controller.java</p>  
 * <p>Description: 添加或者修改题目controller.</p>  
 * @author 王家梦 
 * @date 2018年12月18日
 * @version 1.0    
 */
@Controller
@RequestMapping("/AddAndUpdateTopic_Controller")
public class AddAndUpdateTopic_Controller {
	
	@Autowired
	private AddAndUpdateTopic_Service_Iface addAndUpdateTopic_Service_Iface;
	
	/**
	 * 查询题目
	 * @param t_u_topic 题目
	 * @return 
	 * @throws Exception
	 */
	@RequestMapping("/query")
	@ResponseBody
	public Map query(T_u_topic t_u_topic) {
		Map dataMap = null;
		try {
			dataMap = addAndUpdateTopic_Service_Iface.queryTopic(t_u_topic);
		} catch (Exception e) {
			dataMap = new HashMap();
			dataMap.put("status", 0);
			dataMap.put("message", "服务器异常，请稍后重试");
			e.printStackTrace();
		}
		return dataMap;
	}
	
	/**
	 * 添加题目
	 * @param topic 题目内容
	 * @return 添加状态
	 * @throws Exception
	 */
	@RequestMapping("/add")
	@ResponseBody
	public Map add(Topic topic) {
		Map dataMap = null;
		try {
			dataMap = addAndUpdateTopic_Service_Iface.addTopic(topic);
		} catch (Exception e) {
			dataMap = new HashMap();
			dataMap.put("status", 0);
			dataMap.put("message", "服务器异常，请稍后重试");
			e.printStackTrace();
		}
		return dataMap;
	}
	
	/**
	 * 修改题目
	 * @param topic 题目内容
	 * @return 修改状态
	 * @throws Exception
	 */
	@RequestMapping("/update")
	@ResponseBody
	public Map update(Topic topic) {
		Map dataMap = null;
		try {
			dataMap = addAndUpdateTopic_Service_Iface.updateTopic(topic);
		} catch (Exception e) {
			dataMap = new HashMap();
			dataMap.put("status", 0);
			dataMap.put("message", "服务器异常，请稍后重试");
			e.printStackTrace();
		}
		return dataMap;
	}
	
	/**
	 * 删除题目
	 * @param t_u_topic 题目
	 * @return 删除状态
	 * @throws Exception
	 */
	@RequestMapping("/delete")
	@ResponseBody
	public Map delete(String id) {
		Map dataMap = null;
		try {
			dataMap = addAndUpdateTopic_Service_Iface.deleteTopic(id);
		} catch (Exception e) {
			dataMap = new HashMap();
			dataMap.put("status", 0);
			dataMap.put("message", "服务器异常，请稍后重试");
			e.printStackTrace();
		}
		return dataMap;
	}
}
