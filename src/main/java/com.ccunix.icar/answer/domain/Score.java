package com.ccunix.icar.answer.domain;

import java.util.ArrayList;

import com.ccunix.icar.basedb.domain.T_u_score;


public class Score extends T_u_score{
	private ArrayList<Query> t;
	public String time; //时间
	public int scores; //分数
	public String name;//姓名
	public String phone;//电话
	public int num;//序号
	public String getPhone() {
		return phone;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getTime() {
		return time;
	}
	
	public ArrayList<Query> getT() {
		return t;
	}

	public void setT(ArrayList<Query> t) {
		this.t = t;
	}

	public void setTime(String time) {
		this.time = time;
	}
	public int getScores() {
		return scores;
	}

	public void setScores(int scores) {
		this.scores = scores;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
