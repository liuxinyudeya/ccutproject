package com.ccunix.icar.basedb.service;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.ccunix.icar.base.domain.AppDataModel;
import com.ccunix.icar.base.service.BaseService;
import com.ccunix.icar.basedb.domain.T_u_answer;
import com.ccunix.icar.basedb.dao.T_u_answer_Dao_Iface;

@Service("T_u_answer_Service")
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class T_u_answer_Service_Impl extends BaseService implements T_u_answer_Service_Iface {
@Resource
public T_u_answer_Dao_Iface t_u_answer_dao_iface;
public void insert_t_u_answer(T_u_answer t_u_answer) throws Exception{
t_u_answer_dao_iface.insert_t_u_answer(t_u_answer);
}
public void update_t_u_answer(T_u_answer t_u_answer) throws Exception{
t_u_answer_dao_iface.update_t_u_answer(t_u_answer);
}
public void delete_t_u_answer(T_u_answer t_u_answer) throws Exception{
t_u_answer_dao_iface.delete_t_u_answer(t_u_answer);
}
public List queryAll_t_u_answer(T_u_answer t_u_answer) throws Exception{
return t_u_answer_dao_iface.queryAll_t_u_answer(t_u_answer);
}
public List queryBy_t_u_answer(T_u_answer t_u_answer) throws Exception{
return t_u_answer_dao_iface.queryBy_t_u_answer(t_u_answer);
}
}