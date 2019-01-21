package com.ccunix.icar.basedbmodel.dao;

import java.util.List;

import com.ccunix.icar.basedbmodel.domain.Table;



public interface Table_Dao_Iface {
	
	public List<Table> queryAllTables() throws Exception;

}
