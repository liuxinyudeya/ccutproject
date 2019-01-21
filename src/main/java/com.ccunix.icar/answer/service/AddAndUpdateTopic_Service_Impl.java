package com.ccunix.icar.answer.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ccunix.icar.answer.domain.Topic;
import com.ccunix.icar.base.util.UUID_Tools;
import com.ccunix.icar.basedb.dao.T_u_answer_Dao_Iface;
import com.ccunix.icar.basedb.dao.T_u_topic_Dao_Iface;
import com.ccunix.icar.basedb.domain.T_u_answer;
import com.ccunix.icar.basedb.domain.T_u_topic;

/**
 * 
 * <p>Title: AddAndUpdateTopic_Service_Impl.java</p>  
 * <p>Description:添加或者修改题目service implements </p>  
 * @author 王家梦 
 * @date 2018年12月18日
 * @version 1.0    
 */
@Service
@Transactional
public class AddAndUpdateTopic_Service_Impl implements AddAndUpdateTopic_Service_Iface{

	@Autowired
	private T_u_topic_Dao_Iface t_u_topic_Dao_Iface;
	
	@Autowired
	private T_u_answer_Dao_Iface t_u_answer_Dao_Iface;
	
	/**
	 * 查询题目
	 * @param topic 查询条件
	 * @return 结果集
	 * @throws Exception
	 */
	@Override
	public Map queryTopic(T_u_topic t_u_topic) throws Exception {
		Map dataMap = new HashMap<String,Object>();
		List ls = t_u_topic_Dao_Iface.queryAll_t_u_topic(t_u_topic);
		if(t_u_topic.getId() != null && t_u_topic.getId() != "") {
			T_u_answer t_u_answer = new T_u_answer();
			t_u_answer.setTopic_id(t_u_topic.getId());
			List answers = t_u_answer_Dao_Iface.queryAll_t_u_answer(t_u_answer);
			dataMap.put("answers", answers);
		}
		dataMap.put("data", ls);
		dataMap.put("status", 1);
		dataMap.put("message", "查询成功");
		return dataMap;
	}
	
	/**
	 * 添加题目
	 * @param topic 题目内容
	 * @return 添加状态
	 * @throws Exception
	 */
	@Override
	public Map addTopic(Topic topic) throws Exception {
		Map dataMap = new HashMap<String,Object>();
		T_u_topic t_u_topic = topic.getT_u_topic();
		String id = UUID_Tools.getUUID();
		t_u_topic.setId(id);
		for(T_u_answer answer : topic.getAnswers()) {
			if(answer.getTopic_answer().equals(t_u_topic.getAnswer())) {
				t_u_topic.setRemarks(answer.getTopic_describe());
				break;
			}
		}
		//1.插入如题目
		t_u_topic_Dao_Iface.insert_t_u_topic(t_u_topic);
		ArrayList<T_u_answer> answers = topic.getAnswers();
		for(T_u_answer an : answers) {
			an.setId(UUID_Tools.getUUID());
			an.setTopic_id(id);
			t_u_answer_Dao_Iface.insert_t_u_answer(an);
		}
		dataMap.put("status", 1);
		dataMap.put("message", "添加成功");
		return dataMap;
	}

	/**
	 * 修改题目
	 * @param topic 题目内容
	 * @return 修改状态
	 * @throws Exception
	 */
	@Override
	public Map updateTopic(Topic topic) throws Exception {
		Map dataMap = new HashMap<String,Object>();
		T_u_topic t_u_topic = topic.getT_u_topic();
		//1.修改如题目
		for(T_u_answer answer : topic.getAnswers()) {
			if(answer.getTopic_answer().equals(t_u_topic.getAnswer())) {
				t_u_topic.setRemarks(answer.getTopic_describe());
				break;
			}
		}
		t_u_topic_Dao_Iface.update_t_u_topic(t_u_topic);
		ArrayList<T_u_answer> answers = topic.getAnswers();
		for(T_u_answer an : answers) {
			t_u_answer_Dao_Iface.update_t_u_answer(an);
		}
		dataMap.put("status", 1);
		dataMap.put("message", "修改成功");
		return dataMap;
	}

	/**
	 * 删除题目
	 * @param id 题目id(可以传多个以逗号分隔)
	 * @return 删除状态
	 * @throws Exception
	 */
	@Override
	public Map deleteTopic(String id) throws Exception {
		Map dataMap = new HashMap<String,Object>();
		//1.格式字符串id
		String[] idArr = id.split(",");
		T_u_topic t_u_topic = new T_u_topic();
		for(String i : idArr) {
			t_u_topic.setId(i);
			t_u_topic_Dao_Iface.delete_t_u_topic(t_u_topic);
		}
		dataMap.put("status", 1);
		dataMap.put("message", "删除成功");
		return dataMap;
	}

}
