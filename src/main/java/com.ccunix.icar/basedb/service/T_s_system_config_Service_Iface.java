package com.ccunix.icar.basedb.service;
import com.ccunix.icar.basedb.domain.T_s_system_config;
import java.util.List;
public interface T_s_system_config_Service_Iface {
public void insert_t_s_system_config(T_s_system_config t_s_system_config) throws Exception;
public void update_t_s_system_config(T_s_system_config t_s_system_config) throws Exception;
public void delete_t_s_system_config(T_s_system_config t_s_system_config) throws Exception;
public List queryAll_t_s_system_config(T_s_system_config t_s_system_config) throws Exception;
public List queryBy_t_s_system_config(T_s_system_config t_s_system_config) throws Exception;
}