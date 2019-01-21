package com.ccunix.icar.basedb.service;
import com.ccunix.icar.basedb.domain.T_s_color;
import java.util.List;
public interface T_s_color_Service_Iface {
public void insert_t_s_color(T_s_color t_s_color) throws Exception;
public void update_t_s_color(T_s_color t_s_color) throws Exception;
public void delete_t_s_color(T_s_color t_s_color) throws Exception;
public List queryAll_t_s_color(T_s_color t_s_color) throws Exception;
public List queryBy_t_s_color(T_s_color t_s_color) throws Exception;
}
