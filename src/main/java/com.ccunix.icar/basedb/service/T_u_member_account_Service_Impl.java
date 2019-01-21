package com.ccunix.icar.basedb.service;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.ccunix.icar.base.domain.AppDataModel;
import com.ccunix.icar.base.service.BaseService;
import com.ccunix.icar.basedb.domain.T_u_member_account;
import com.ccunix.icar.basedb.dao.T_u_member_account_Dao_Iface;

@Service("T_u_member_account_Service")
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class T_u_member_account_Service_Impl extends BaseService implements T_u_member_account_Service_Iface {
@Resource
public T_u_member_account_Dao_Iface t_u_member_account_dao_iface;
public void insert_t_u_member_account(T_u_member_account t_u_member_account) throws Exception{
t_u_member_account_dao_iface.insert_t_u_member_account(t_u_member_account);
}
public void update_t_u_member_account(T_u_member_account t_u_member_account) throws Exception{
t_u_member_account_dao_iface.update_t_u_member_account(t_u_member_account);
}
public void delete_t_u_member_account(T_u_member_account t_u_member_account) throws Exception{
t_u_member_account_dao_iface.delete_t_u_member_account(t_u_member_account);
}
public List queryAll_t_u_member_account(T_u_member_account t_u_member_account) throws Exception{
return t_u_member_account_dao_iface.queryAll_t_u_member_account(t_u_member_account);
}
public List queryBy_t_u_member_account(T_u_member_account t_u_member_account) throws Exception{
return t_u_member_account_dao_iface.queryBy_t_u_member_account(t_u_member_account);
}
}