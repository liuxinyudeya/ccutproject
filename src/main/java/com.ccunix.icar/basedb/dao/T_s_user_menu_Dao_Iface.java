package com.ccunix.icar.basedb.dao;
import java.util.List;
import com.ccunix.icar.basedb.domain.T_s_user_menu;
public interface T_s_user_menu_Dao_Iface {
public void insert_t_s_user_menu(T_s_user_menu t_s_user_menu) throws Exception;
public void update_t_s_user_menu(T_s_user_menu t_s_user_menu) throws Exception;
public void delete_t_s_user_menu(T_s_user_menu t_s_user_menu) throws Exception;
public List queryAll_t_s_user_menu(T_s_user_menu t_s_user_menu) throws Exception;
public List queryBy_t_s_user_menu(T_s_user_menu t_s_user_menu) throws Exception;
}
