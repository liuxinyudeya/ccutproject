package com.ccunix.icar.basedb.dao;
import java.util.List;
import com.ccunix.icar.basedb.domain.T_s_administrive_area;
public interface T_s_administrive_area_Dao_Iface {
public void insert_t_s_administrive_area(T_s_administrive_area t_s_administrive_area) throws Exception;
public void update_t_s_administrive_area(T_s_administrive_area t_s_administrive_area) throws Exception;
public void delete_t_s_administrive_area(T_s_administrive_area t_s_administrive_area) throws Exception;
public List queryAll_t_s_administrive_area(T_s_administrive_area t_s_administrive_area) throws Exception;
public List queryBy_t_s_administrive_area(T_s_administrive_area t_s_administrive_area) throws Exception;
}
