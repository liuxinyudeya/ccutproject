package com.ccunix.icar.basedb.dao;
import java.util.List;
import com.ccunix.icar.basedb.domain.T_u_apply_cancel_order;
public interface T_u_apply_cancel_order_Dao_Iface {
public void insert_t_u_apply_cancel_order(T_u_apply_cancel_order t_u_apply_cancel_order) throws Exception;
public void update_t_u_apply_cancel_order(T_u_apply_cancel_order t_u_apply_cancel_order) throws Exception;
public void delete_t_u_apply_cancel_order(T_u_apply_cancel_order t_u_apply_cancel_order) throws Exception;
public List queryAll_t_u_apply_cancel_order(T_u_apply_cancel_order t_u_apply_cancel_order) throws Exception;
public List queryBy_t_u_apply_cancel_order(T_u_apply_cancel_order t_u_apply_cancel_order) throws Exception;
}
