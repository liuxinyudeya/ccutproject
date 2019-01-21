package com.ccunix.icar.basedb.dao;
import java.util.List;
import com.ccunix.icar.basedb.domain.T_u_distribution;
public interface T_u_distribution_Dao_Iface {
public void insert_t_u_distribution(T_u_distribution t_u_distribution) throws Exception;
public void update_t_u_distribution(T_u_distribution t_u_distribution) throws Exception;
public void delete_t_u_distribution(T_u_distribution t_u_distribution) throws Exception;
public List queryAll_t_u_distribution(T_u_distribution t_u_distribution) throws Exception;
public List queryBy_t_u_distribution(T_u_distribution t_u_distribution) throws Exception;
}
