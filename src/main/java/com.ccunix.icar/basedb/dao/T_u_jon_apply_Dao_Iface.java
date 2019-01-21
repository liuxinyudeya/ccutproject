package com.ccunix.icar.basedb.dao;
import java.util.List;
import com.ccunix.icar.basedb.domain.T_u_jon_apply;
public interface T_u_jon_apply_Dao_Iface {
public void insert_t_u_jon_apply(T_u_jon_apply t_u_jon_apply) throws Exception;
public void update_t_u_jon_apply(T_u_jon_apply t_u_jon_apply) throws Exception;
public void delete_t_u_jon_apply(T_u_jon_apply t_u_jon_apply) throws Exception;
public List queryAll_t_u_jon_apply(T_u_jon_apply t_u_jon_apply) throws Exception;
public List queryBy_t_u_jon_apply(T_u_jon_apply t_u_jon_apply) throws Exception;
}
