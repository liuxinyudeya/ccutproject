package com.ccunix.icar.anwserview.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ccunix.icar.anwserview.dao.QueryQuestions_Dao_Iface;

@Service
@Transactional
public class Questions_Service_Impl implements Questions_Service_Iface {

	@Resource
	QueryQuestions_Dao_Iface queryQuestions_Dao_Iface;

	@Override
	public List queryQuestions() throws Exception {
		List questionsList = queryQuestions_Dao_Iface.queryQuestions();
		return questionsList;
	}

}
