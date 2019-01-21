package com.ccunix.icar.anwserview.domain;

import java.io.Serializable;

public class Question_Answer implements Serializable {
	String topic_answer;// 题目选项
	String topic_describe;// 题目选项

	public String getTopic_answer() {
		return topic_answer;
	}

	public void setTopic_answer(String topic_answer) {
		this.topic_answer = topic_answer;
	}

	public String getTopic_describe() {
		return topic_describe;
	}

	public void setTopic_describe(String topic_describe) {
		this.topic_describe = topic_describe;
	}

}
