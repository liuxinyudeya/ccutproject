package com.ccunix.icar.base.service;

import com.ccunix.icar.base.domain.AppDataModel;
import com.ccunix.icar.base.util.UUID_Tools;
public class BaseService {
	public AppDataModel getAppDataModel() {
		AppDataModel appDataModel = new AppDataModel();
		return appDataModel;
	}
	
	public static UUID_Tools uuid_Tools;
	
	
	

	


}
