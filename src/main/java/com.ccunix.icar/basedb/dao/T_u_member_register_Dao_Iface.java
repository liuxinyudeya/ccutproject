package com.ccunix.icar.basedb.dao;
import java.util.List;
import com.ccunix.icar.basedb.domain.T_u_member_register;
public interface T_u_member_register_Dao_Iface {
public void insert_t_u_member_register(T_u_member_register t_u_member_register) throws Exception;
public void update_t_u_member_register(T_u_member_register t_u_member_register) throws Exception;
public void delete_t_u_member_register(T_u_member_register t_u_member_register) throws Exception;
public List queryAll_t_u_member_register(T_u_member_register t_u_member_register) throws Exception;
public List queryBy_t_u_member_register(T_u_member_register t_u_member_register) throws Exception;
}
