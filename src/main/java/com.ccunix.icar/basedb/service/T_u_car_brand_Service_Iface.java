package com.ccunix.icar.basedb.service;
import com.ccunix.icar.basedb.domain.T_u_car_brand;
import java.util.List;
public interface T_u_car_brand_Service_Iface {
public void insert_t_u_car_brand(T_u_car_brand t_u_car_brand) throws Exception;
public void update_t_u_car_brand(T_u_car_brand t_u_car_brand) throws Exception;
public void delete_t_u_car_brand(T_u_car_brand t_u_car_brand) throws Exception;
public List queryAll_t_u_car_brand(T_u_car_brand t_u_car_brand) throws Exception;
public List queryBy_t_u_car_brand(T_u_car_brand t_u_car_brand) throws Exception;
}
