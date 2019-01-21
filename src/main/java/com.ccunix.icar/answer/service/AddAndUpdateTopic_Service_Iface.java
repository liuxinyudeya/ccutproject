package com.ccunix.icar.answer.service;

import java.util.Map;

import com.ccunix.icar.answer.domain.Topic;
import com.ccunix.icar.basedb.domain.T_u_topic;

/**
 * 
 * <p>Title: AddAndUpdateTopic_Service_Iface.java</p>  
 * <p>Description: 添加或者修改题目service interface</p>  
 * @author 王家梦 
 * @date 2018年12月18日
 * @version 1.0    
 */
public interface AddAndUpdateTopic_Service_Iface {
	/**
	 * 查询题目
	 * @param t_u_topic 查询条件
	 * @return 结果集
	 * @throws Exception
	 */
	public Map queryTopic(T_u_topic t_u_topic)throws Exception;
	/**
	 * 添加题目
	 * @param topic 题目内容
	 * @return 添加状态
	 * @throws Exception
	 */
	public Map addTopic(Topic topic)throws Exception;
	/**
	 * 修改题目
	 * @param topic 题目内容
	 * @return 修改状态
	 * @throws Exception
	 */
	public Map updateTopic(Topic topic)throws Exception;
	/**
	 * 删除题目
	 * @param id 题目id(可以传多个以逗号分隔)
	 * @return 删除状态
	 * @throws Exception
	 */
	public Map deleteTopic(String id)throws Exception;
}
