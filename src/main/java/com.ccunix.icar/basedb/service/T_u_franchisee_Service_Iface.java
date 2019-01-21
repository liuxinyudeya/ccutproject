package com.ccunix.icar.basedb.service;
import com.ccunix.icar.basedb.domain.T_u_franchisee;
import java.util.List;
public interface T_u_franchisee_Service_Iface {
public void insert_t_u_franchisee(T_u_franchisee t_u_franchisee) throws Exception;
public void update_t_u_franchisee(T_u_franchisee t_u_franchisee) throws Exception;
public void delete_t_u_franchisee(T_u_franchisee t_u_franchisee) throws Exception;
public List queryAll_t_u_franchisee(T_u_franchisee t_u_franchisee) throws Exception;
public List queryBy_t_u_franchisee(T_u_franchisee t_u_franchisee) throws Exception;
}
