package com.ccunix.icar.anwserview.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ccunix.icar.anwserview.service.Questions_Service_Iface;

@Controller
@RequestMapping("/AnwserView_Controller")
public class AnwserView_Controller {

	@Resource
	Questions_Service_Iface questions_Service_Iface;

	@RequestMapping("/queryQuestions")
	@ResponseBody
	public List queryQuestions() {
		List questionsList = null;
		try {
			questionsList = questions_Service_Iface.queryQuestions();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return questionsList;
	}

}
