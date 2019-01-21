package com.ccunix.icar.answer.domain;

import java.io.Serializable;
import java.util.ArrayList;

import com.ccunix.icar.basedb.domain.T_u_answer;
import com.ccunix.icar.basedb.domain.T_u_topic;

/**
 * 
 * <p>Title: Topic.java</p>  
 * <p>Description: 出题包装类</p>  
 * @author 王家梦 
 * @date 2018年12月18日
 * @version 1.0    
 */
public class Topic implements Serializable{
	
	private T_u_topic t_u_topic;
	private ArrayList<T_u_answer> answers;
	
	public T_u_topic getT_u_topic() {
		return t_u_topic;
	}
	public void setT_u_topic(T_u_topic t_u_topic) {
		this.t_u_topic = t_u_topic;
	}
	public ArrayList<T_u_answer> getAnswers() {
		return answers;
	}
	public void setAnswers(ArrayList<T_u_answer> answers) {
		this.answers = answers;
	}
	
}
