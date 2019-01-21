package com.ccunix.icar.anwserview.domain;

import java.io.Serializable;
import java.util.List;

public class Questions implements Serializable {
	String id;// 题目ID
	String topic_name;// 题目名称
	List<Question_Answer> anwser;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTopic_name() {
		return topic_name;
	}

	public void setTopic_name(String topic_name) {
		this.topic_name = topic_name;
	}

	public List<Question_Answer> getAnwser() {
		return anwser;
	}

	public void setAnwser(List<Question_Answer> anwser) {
		this.anwser = anwser;
	}

}
