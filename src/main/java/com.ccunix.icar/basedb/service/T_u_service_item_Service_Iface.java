package com.ccunix.icar.basedb.service;
import com.ccunix.icar.basedb.domain.T_u_service_item;
import java.util.List;
public interface T_u_service_item_Service_Iface {
public void insert_t_u_service_item(T_u_service_item t_u_service_item) throws Exception;
public void update_t_u_service_item(T_u_service_item t_u_service_item) throws Exception;
public void delete_t_u_service_item(T_u_service_item t_u_service_item) throws Exception;
public List queryAll_t_u_service_item(T_u_service_item t_u_service_item) throws Exception;
public List queryBy_t_u_service_item(T_u_service_item t_u_service_item) throws Exception;
}
