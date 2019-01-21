package com.ccunix.icar.answer.controller;

import java.text.SimpleDateFormat;
import com.ccunix.icar.base.controller.BaseMultiController;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ccunix.icar.answer.domain.Query;
import com.ccunix.icar.answer.domain.Score;
import com.ccunix.icar.answer.service.T_u_addscore_service_Iface;
import com.ccunix.icar.base.domain.AppDataModel;
import com.ccunix.icar.base.domain.PageModel;
import com.ccunix.icar.base.service.PageServiceIface;
import com.ccunix.icar.base.util.UUID_Tools;
import com.ccunix.icar.basedb.dao.T_u_topic_Dao_Iface;
import com.ccunix.icar.basedb.domain.T_u_score;
import com.ccunix.icar.basedb.domain.T_u_topic;
import com.ccunix.icar.userlogin.domain.User_info;

@Controller
@RequestMapping("/Addscore_Controller_4M")
public class Addscore_Controller_4M {
	@Resource
	PageServiceIface pageServiceIface;
	@Resource
	T_u_addscore_service_Iface score_service_Iface;
	@Resource
	T_u_topic_Dao_Iface t_u_topic_Dao_Iface;
	@Resource
	public HttpServletRequest request;

	@RequestMapping("/addScore")
	@ResponseBody
	public Score add(Score a, HttpSession session) throws Exception {
		AppDataModel appDataModel = null;
		Score s = new Score();
		int fenshu = 0;
		for (Query q : a.getT()) {
			T_u_topic t_u_score = new T_u_topic();
			t_u_score.setId(q.name);
			List ls = t_u_topic_Dao_Iface.queryAll_t_u_topic(t_u_score);
			for (int i = 0; i < ls.size(); i++) {
				T_u_topic topic = (T_u_topic) ls.get(i);
				if (topic.getAnswer().equals(q.value)) {
					fenshu += topic.getMark();
				}
			}
			System.out.println(fenshu);
		}
		try {
			T_u_score score = new T_u_score();
			score.setId(UUID_Tools.getUUID());
			Calendar calendar = Calendar.getInstance();
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			score.setCreatetime(calendar.getTime());
			score.setScore(fenshu);
			// getWebLoginUser().getId()
			User_info info = (User_info) request.getSession(true).getAttribute("loginuser");
			score.setUser_id(info.getId());
			score_service_Iface.insert_t_u_score(score);
			s.setName(info.getName());
			s.setScore(fenshu);
			s.setTime(dateFormat.format(calendar.getTime()));
		} catch (Exception e) {
			appDataModel = new AppDataModel();
			appDataModel.setStatus(0);
			appDataModel.setMessage("执行失败，出现异常错误");
			e.printStackTrace();
		}
		return s;
	}

	@RequestMapping("/queryScore")
	@ResponseBody
	public List query() throws Exception {

		T_u_score t_u_score = new T_u_score();
		List ls = null;
		try {
			ls = score_service_Iface.queryBy_t_u_score();
//			// 用于分页
			PageModel model = pageServiceIface.setPageData(request, ls);
			return pageServiceIface.getNowPageData(request, model);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ls;

	}

}
