package com.ccunix.icar.basedb.service;
import com.ccunix.icar.basedb.domain.T_s_system_code;
import java.util.List;
public interface T_s_system_code_Service_Iface {
public void insert_t_s_system_code(T_s_system_code t_s_system_code) throws Exception;
public void update_t_s_system_code(T_s_system_code t_s_system_code) throws Exception;
public void delete_t_s_system_code(T_s_system_code t_s_system_code) throws Exception;
public List queryAll_t_s_system_code(T_s_system_code t_s_system_code) throws Exception;
public List queryBy_t_s_system_code(T_s_system_code t_s_system_code) throws Exception;
}
