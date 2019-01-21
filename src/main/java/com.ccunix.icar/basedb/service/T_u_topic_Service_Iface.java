package com.ccunix.icar.basedb.service;
import com.ccunix.icar.basedb.domain.T_u_topic;
import java.util.List;
public interface T_u_topic_Service_Iface {
public void insert_t_u_topic(T_u_topic t_u_topic) throws Exception;
public void update_t_u_topic(T_u_topic t_u_topic) throws Exception;
public void delete_t_u_topic(T_u_topic t_u_topic) throws Exception;
public List queryAll_t_u_topic(T_u_topic t_u_topic) throws Exception;
public List queryBy_t_u_topic(T_u_topic t_u_topic) throws Exception;
}
