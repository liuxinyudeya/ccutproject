package com.ccunix.icar.basedb.dao;
import java.util.List;
import com.ccunix.icar.basedb.domain.T_s_weather;
public interface T_s_weather_Dao_Iface {
public void insert_t_s_weather(T_s_weather t_s_weather) throws Exception;
public void update_t_s_weather(T_s_weather t_s_weather) throws Exception;
public void delete_t_s_weather(T_s_weather t_s_weather) throws Exception;
public List queryAll_t_s_weather(T_s_weather t_s_weather) throws Exception;
public List queryBy_t_s_weather(T_s_weather t_s_weather) throws Exception;
}
