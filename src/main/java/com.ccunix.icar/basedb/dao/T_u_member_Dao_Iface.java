package com.ccunix.icar.basedb.dao;
import java.util.List;
import com.ccunix.icar.basedb.domain.T_u_member;
public interface T_u_member_Dao_Iface {
public void insert_t_u_member(T_u_member t_u_member) throws Exception;
public void update_t_u_member(T_u_member t_u_member) throws Exception;
public void delete_t_u_member(T_u_member t_u_member) throws Exception;
public List queryAll_t_u_member(T_u_member t_u_member) throws Exception;
public List queryBy_t_u_member(T_u_member t_u_member) throws Exception;
}
