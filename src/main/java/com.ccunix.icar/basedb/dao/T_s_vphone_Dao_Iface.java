package com.ccunix.icar.basedb.dao;
import java.util.List;
import com.ccunix.icar.basedb.domain.T_s_vphone;
public interface T_s_vphone_Dao_Iface {
public void insert_t_s_vphone(T_s_vphone t_s_vphone) throws Exception;
public void update_t_s_vphone(T_s_vphone t_s_vphone) throws Exception;
public void delete_t_s_vphone(T_s_vphone t_s_vphone) throws Exception;
public List queryAll_t_s_vphone(T_s_vphone t_s_vphone) throws Exception;
public List queryBy_t_s_vphone(T_s_vphone t_s_vphone) throws Exception;
}
