package com.ccunix.icar.basedb.service;
import com.ccunix.icar.basedb.domain.T_u_answer;
import java.util.List;
public interface T_u_answer_Service_Iface {
public void insert_t_u_answer(T_u_answer t_u_answer) throws Exception;
public void update_t_u_answer(T_u_answer t_u_answer) throws Exception;
public void delete_t_u_answer(T_u_answer t_u_answer) throws Exception;
public List queryAll_t_u_answer(T_u_answer t_u_answer) throws Exception;
public List queryBy_t_u_answer(T_u_answer t_u_answer) throws Exception;
}
