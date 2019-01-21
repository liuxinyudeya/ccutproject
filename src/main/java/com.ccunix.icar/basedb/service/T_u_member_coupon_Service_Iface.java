package com.ccunix.icar.basedb.service;
import com.ccunix.icar.basedb.domain.T_u_member_coupon;
import java.util.List;
public interface T_u_member_coupon_Service_Iface {
public void insert_t_u_member_coupon(T_u_member_coupon t_u_member_coupon) throws Exception;
public void update_t_u_member_coupon(T_u_member_coupon t_u_member_coupon) throws Exception;
public void delete_t_u_member_coupon(T_u_member_coupon t_u_member_coupon) throws Exception;
public List queryAll_t_u_member_coupon(T_u_member_coupon t_u_member_coupon) throws Exception;
public List queryBy_t_u_member_coupon(T_u_member_coupon t_u_member_coupon) throws Exception;
}
