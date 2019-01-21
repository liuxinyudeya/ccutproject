package com.ccunix.icar.answer.service;
import java.util.List;
import com.ccunix.icar.basedb.domain.T_u_score;
import com.ccunix.icar.basedb.domain.T_u_topic;
public interface Querytopic_service_Iface {
	public void insert_t_u_topic(T_u_topic t_u_topic) throws Exception;
	public void update_t_u_topic(T_u_topic t_u_topic) throws Exception;
	public void delete_t_u_topic(T_u_topic t_u_topic) throws Exception;
	public List queryAll_t_u_topic(T_u_topic t_u_topic) throws Exception;
}
