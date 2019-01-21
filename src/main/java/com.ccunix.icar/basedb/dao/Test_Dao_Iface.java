package com.ccunix.icar.basedb.dao;
import java.util.List;
import com.ccunix.icar.basedb.domain.Test;
public interface Test_Dao_Iface {
public void insert_test(Test test) throws Exception;
public void update_test(Test test) throws Exception;
public void delete_test(Test test) throws Exception;
public List queryAll_test(Test test) throws Exception;
public List queryBy_test(Test test) throws Exception;
}
