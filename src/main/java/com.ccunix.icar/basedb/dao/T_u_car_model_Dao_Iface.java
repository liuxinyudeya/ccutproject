package com.ccunix.icar.basedb.dao;
import java.util.List;
import com.ccunix.icar.basedb.domain.T_u_car_model;
public interface T_u_car_model_Dao_Iface {
public void insert_t_u_car_model(T_u_car_model t_u_car_model) throws Exception;
public void update_t_u_car_model(T_u_car_model t_u_car_model) throws Exception;
public void delete_t_u_car_model(T_u_car_model t_u_car_model) throws Exception;
public List queryAll_t_u_car_model(T_u_car_model t_u_car_model) throws Exception;
public List queryBy_t_u_car_model(T_u_car_model t_u_car_model) throws Exception;
}
