package com.ccunix.icar.basedbmodel.dao;

import java.util.List;

import com.ccunix.icar.basedbmodel.domain.Table_Column;

public interface Table_Column_Dao_Iface {

	public List<Table_Column> queryColumn_By_Table(Table_Column column) throws Exception;

}
