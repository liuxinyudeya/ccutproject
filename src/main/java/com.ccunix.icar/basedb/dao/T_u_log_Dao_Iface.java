package com.ccunix.icar.basedb.dao;
import java.util.List;
import com.ccunix.icar.basedb.domain.T_u_log;
public interface T_u_log_Dao_Iface {
public void insert_t_u_log(T_u_log t_u_log) throws Exception;
public void update_t_u_log(T_u_log t_u_log) throws Exception;
public void delete_t_u_log(T_u_log t_u_log) throws Exception;
public List queryAll_t_u_log(T_u_log t_u_log) throws Exception;
public List queryBy_t_u_log(T_u_log t_u_log) throws Exception;
}
