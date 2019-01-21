package com.ccunix.icar.answer.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ccunix.icar.answer.domain.Score;
import com.ccunix.icar.basedb.dao.T_s_user_Dao_Iface;
import com.ccunix.icar.basedb.dao.T_u_score_Dao_Iface;
import com.ccunix.icar.basedb.domain.T_s_user;
import com.ccunix.icar.basedb.domain.T_u_score;

@Service
@Transactional
public class T_u_addscore_service_impl implements T_u_addscore_service_Iface {

	@Resource
	T_u_score_Dao_Iface dao_Iface;
	@Resource
    T_s_user_Dao_Iface t_s_user_Dao_Iface;
	@Override
	public void insert_t_u_score(T_u_score t_u_score) throws Exception {
		dao_Iface.insert_t_u_score(t_u_score);

	}

	@Override
	public void update_t_u_score(T_u_score t_u_score) throws Exception {
		dao_Iface.update_t_u_score(t_u_score);

	}

	@Override
	public void delete_t_u_score(T_u_score t_u_score) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public List queryAll_t_u_score(T_u_score t_u_score) throws Exception {

		return null;
	}

	@Override
	public List queryBy_t_u_score() throws Exception {
		List ls = dao_Iface.queryBy_t_u_score();
		for (int i = 0; i < ls.size(); i++) {
				Score score=(Score) ls.get(i);
				T_s_user t_s_user=new T_s_user();
				t_s_user.setId(score.getUser_id());
				List lss=t_s_user_Dao_Iface.queryAll_t_s_user(t_s_user);
				for (int j = 0; j < lss.size(); j++) {
					T_s_user t_s_user2=(T_s_user) lss.get(j);
					score.setName(t_s_user2.getName());
					score.setPhone(t_s_user2.getPhoto());
				}
				score.setNum(i+1);
		}
		return ls;
	}

}
