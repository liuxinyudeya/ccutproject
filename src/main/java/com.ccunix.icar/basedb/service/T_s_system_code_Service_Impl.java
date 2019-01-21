package com.ccunix.icar.basedb.service;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.ccunix.icar.base.domain.AppDataModel;
import com.ccunix.icar.base.service.BaseService;
import com.ccunix.icar.basedb.domain.T_s_system_code;
import com.ccunix.icar.basedb.dao.T_s_system_code_Dao_Iface;

@Service("T_s_system_code_Service")
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class T_s_system_code_Service_Impl extends BaseService implements T_s_system_code_Service_Iface {
@Resource
public T_s_system_code_Dao_Iface t_s_system_code_dao_iface;
public void insert_t_s_system_code(T_s_system_code t_s_system_code) throws Exception{
t_s_system_code_dao_iface.insert_t_s_system_code(t_s_system_code);
}
public void update_t_s_system_code(T_s_system_code t_s_system_code) throws Exception{
t_s_system_code_dao_iface.update_t_s_system_code(t_s_system_code);
}
public void delete_t_s_system_code(T_s_system_code t_s_system_code) throws Exception{
t_s_system_code_dao_iface.delete_t_s_system_code(t_s_system_code);
}
public List queryAll_t_s_system_code(T_s_system_code t_s_system_code) throws Exception{
return t_s_system_code_dao_iface.queryAll_t_s_system_code(t_s_system_code);
}
public List queryBy_t_s_system_code(T_s_system_code t_s_system_code) throws Exception{
return t_s_system_code_dao_iface.queryBy_t_s_system_code(t_s_system_code);
}
}