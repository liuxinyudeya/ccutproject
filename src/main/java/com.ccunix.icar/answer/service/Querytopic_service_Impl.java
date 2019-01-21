package com.ccunix.icar.answer.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ccunix.icar.basedb.dao.T_u_topic_Dao_Iface;
import com.ccunix.icar.basedb.domain.T_u_topic;
@Service
@Transactional
public class Querytopic_service_Impl implements Querytopic_service_Iface{
  @Resource
  T_u_topic_Dao_Iface t_u_topic_Dao_Iface;
  @Override
  public List queryAll_t_u_topic(T_u_topic t_u_topic) throws Exception {
	  List ls=t_u_topic_Dao_Iface.queryAll_t_u_topic(t_u_topic);
	  return ls;
  }
	@Override
	public void insert_t_u_topic(T_u_topic t_u_topic) throws Exception {
		t_u_topic_Dao_Iface.insert_t_u_topic(t_u_topic);
	}

	@Override
	public void update_t_u_topic(T_u_topic t_u_topic) throws Exception {
		t_u_topic_Dao_Iface.update_t_u_topic(t_u_topic);
	}

	@Override
	public void delete_t_u_topic(T_u_topic t_u_topic) throws Exception {
		// TODO Auto-generated method stub
		
	}


}
