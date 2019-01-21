package com.ccunix.icar.basedb.service;
import com.ccunix.icar.basedb.domain.T_u_coupon_receive;
import java.util.List;
public interface T_u_coupon_receive_Service_Iface {
public void insert_t_u_coupon_receive(T_u_coupon_receive t_u_coupon_receive) throws Exception;
public void update_t_u_coupon_receive(T_u_coupon_receive t_u_coupon_receive) throws Exception;
public void delete_t_u_coupon_receive(T_u_coupon_receive t_u_coupon_receive) throws Exception;
public List queryAll_t_u_coupon_receive(T_u_coupon_receive t_u_coupon_receive) throws Exception;
public List queryBy_t_u_coupon_receive(T_u_coupon_receive t_u_coupon_receive) throws Exception;
}
