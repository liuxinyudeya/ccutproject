package com.ccunix.icar.userlogin.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ccunix.icar.base.util.UUID_Tools;
import com.ccunix.icar.basedb.dao.T_s_user_Dao_Iface;
import com.ccunix.icar.userlogin.dao.UserLogin_Insert_Dao_Iface;
import com.ccunix.icar.userlogin.domain.User_info;

@Service
@Transactional
public class Userlogin_Service_Impl implements Userlogin_Service_iface {

	@Resource
	UserLogin_Insert_Dao_Iface userLogin_Insert_Dao_Iface;

	@Override
	public User_info insert_user(String name, String photo) throws Exception {
		User_info user_info = new User_info();
		user_info = userLogin_Insert_Dao_Iface.queryUser(photo);
		if (user_info == null) {
			user_info = new User_info();
			String id = UUID_Tools.getUUID();
			user_info.setId(id);
			user_info.setName(name);
			user_info.setPhoto(photo);
			userLogin_Insert_Dao_Iface.insert_user(user_info);
		}

		return user_info;

	}

}
