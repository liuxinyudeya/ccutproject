package com.ccunix.icar.basedb.dao;
import java.util.List;
import com.ccunix.icar.basedb.domain.T_u_register_manager;
public interface T_u_register_manager_Dao_Iface {
public void insert_t_u_register_manager(T_u_register_manager t_u_register_manager) throws Exception;
public void update_t_u_register_manager(T_u_register_manager t_u_register_manager) throws Exception;
public void delete_t_u_register_manager(T_u_register_manager t_u_register_manager) throws Exception;
public List queryAll_t_u_register_manager(T_u_register_manager t_u_register_manager) throws Exception;
public List queryBy_t_u_register_manager(T_u_register_manager t_u_register_manager) throws Exception;
}
