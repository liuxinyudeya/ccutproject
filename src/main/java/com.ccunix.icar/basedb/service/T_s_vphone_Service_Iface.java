package com.ccunix.icar.basedb.service;
import com.ccunix.icar.basedb.domain.T_s_vphone;
import java.util.List;
public interface T_s_vphone_Service_Iface {
public void insert_t_s_vphone(T_s_vphone t_s_vphone) throws Exception;
public void update_t_s_vphone(T_s_vphone t_s_vphone) throws Exception;
public void delete_t_s_vphone(T_s_vphone t_s_vphone) throws Exception;
public List queryAll_t_s_vphone(T_s_vphone t_s_vphone) throws Exception;
public List queryBy_t_s_vphone(T_s_vphone t_s_vphone) throws Exception;
}
