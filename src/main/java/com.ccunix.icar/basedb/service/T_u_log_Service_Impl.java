package com.ccunix.icar.basedb.service;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.ccunix.icar.base.domain.AppDataModel;
import com.ccunix.icar.base.service.BaseService;
import com.ccunix.icar.basedb.domain.T_u_log;
import com.ccunix.icar.basedb.dao.T_u_log_Dao_Iface;

@Service("T_u_log_Service")
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class T_u_log_Service_Impl extends BaseService implements T_u_log_Service_Iface {
@Resource
public T_u_log_Dao_Iface t_u_log_dao_iface;
public void insert_t_u_log(T_u_log t_u_log) throws Exception{
t_u_log_dao_iface.insert_t_u_log(t_u_log);
}
public void update_t_u_log(T_u_log t_u_log) throws Exception{
t_u_log_dao_iface.update_t_u_log(t_u_log);
}
public void delete_t_u_log(T_u_log t_u_log) throws Exception{
t_u_log_dao_iface.delete_t_u_log(t_u_log);
}
public List queryAll_t_u_log(T_u_log t_u_log) throws Exception{
return t_u_log_dao_iface.queryAll_t_u_log(t_u_log);
}
public List queryBy_t_u_log(T_u_log t_u_log) throws Exception{
return t_u_log_dao_iface.queryBy_t_u_log(t_u_log);
}
}