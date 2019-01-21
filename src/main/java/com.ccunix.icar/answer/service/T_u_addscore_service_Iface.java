package com.ccunix.icar.answer.service;
import java.util.List;

import com.ccunix.icar.answer.domain.Score;
import com.ccunix.icar.basedb.domain.T_u_score;
public interface T_u_addscore_service_Iface {
public void insert_t_u_score(T_u_score t_u_score) throws Exception;
public void update_t_u_score(T_u_score t_u_score) throws Exception;
public void delete_t_u_score(T_u_score t_u_score) throws Exception;
public List queryAll_t_u_score(T_u_score t_u_score) throws Exception;
public List queryBy_t_u_score() throws Exception;
}
