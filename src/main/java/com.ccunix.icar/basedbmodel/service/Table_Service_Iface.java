package com.ccunix.icar.basedbmodel.service;

import java.util.List;

import com.ccunix.icar.basedbmodel.domain.Table;


public interface Table_Service_Iface {
	
	public List<Table> queryAllTable() throws Exception;
	
	public boolean makecode(String tables) throws Exception;

}
