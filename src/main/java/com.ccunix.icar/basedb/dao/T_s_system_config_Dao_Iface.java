package com.ccunix.icar.basedb.dao;
import java.util.List;
import com.ccunix.icar.basedb.domain.T_s_system_config;
public interface T_s_system_config_Dao_Iface {
public void insert_t_s_system_config(T_s_system_config t_s_system_config) throws Exception;
public void update_t_s_system_config(T_s_system_config t_s_system_config) throws Exception;
public void delete_t_s_system_config(T_s_system_config t_s_system_config) throws Exception;
public List queryAll_t_s_system_config(T_s_system_config t_s_system_config) throws Exception;
public List queryBy_t_s_system_config(T_s_system_config t_s_system_config) throws Exception;
}
