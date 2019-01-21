package com.ccunix.icar.userlogin.service;

import com.ccunix.icar.userlogin.domain.User_info;

public interface Userlogin_Service_iface {

	public User_info insert_user(String name, String photo) throws Exception;

}
