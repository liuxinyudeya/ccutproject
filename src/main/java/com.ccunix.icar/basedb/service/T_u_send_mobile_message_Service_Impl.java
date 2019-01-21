package com.ccunix.icar.basedb.service;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.ccunix.icar.base.domain.AppDataModel;
import com.ccunix.icar.base.service.BaseService;
import com.ccunix.icar.basedb.domain.T_u_send_mobile_message;
import com.ccunix.icar.basedb.dao.T_u_send_mobile_message_Dao_Iface;

@Service("T_u_send_mobile_message_Service")
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class T_u_send_mobile_message_Service_Impl extends BaseService implements T_u_send_mobile_message_Service_Iface {
@Resource
public T_u_send_mobile_message_Dao_Iface t_u_send_mobile_message_dao_iface;
public void insert_t_u_send_mobile_message(T_u_send_mobile_message t_u_send_mobile_message) throws Exception{
t_u_send_mobile_message_dao_iface.insert_t_u_send_mobile_message(t_u_send_mobile_message);
}
public void update_t_u_send_mobile_message(T_u_send_mobile_message t_u_send_mobile_message) throws Exception{
t_u_send_mobile_message_dao_iface.update_t_u_send_mobile_message(t_u_send_mobile_message);
}
public void delete_t_u_send_mobile_message(T_u_send_mobile_message t_u_send_mobile_message) throws Exception{
t_u_send_mobile_message_dao_iface.delete_t_u_send_mobile_message(t_u_send_mobile_message);
}
public List queryAll_t_u_send_mobile_message(T_u_send_mobile_message t_u_send_mobile_message) throws Exception{
return t_u_send_mobile_message_dao_iface.queryAll_t_u_send_mobile_message(t_u_send_mobile_message);
}
public List queryBy_t_u_send_mobile_message(T_u_send_mobile_message t_u_send_mobile_message) throws Exception{
return t_u_send_mobile_message_dao_iface.queryBy_t_u_send_mobile_message(t_u_send_mobile_message);
}
}