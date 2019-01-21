package com.ccunix.icar.basedb.service;
import com.ccunix.icar.basedb.domain.T_s_user;
import java.util.List;
public interface T_s_user_Service_Iface {
public void insert_t_s_user(T_s_user t_s_user) throws Exception;
public void update_t_s_user(T_s_user t_s_user) throws Exception;
public void delete_t_s_user(T_s_user t_s_user) throws Exception;
public List queryAll_t_s_user(T_s_user t_s_user) throws Exception;
public List queryBy_t_s_user(T_s_user t_s_user) throws Exception;
}
