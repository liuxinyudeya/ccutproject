package com.ccunix.icar.userlogin.dao;

import com.ccunix.icar.userlogin.domain.User_info;

public interface UserLogin_Insert_Dao_Iface {
	public void insert_user(User_info User_info) throws Exception ;
	public User_info queryUser(String phone) throws Exception ;

}
