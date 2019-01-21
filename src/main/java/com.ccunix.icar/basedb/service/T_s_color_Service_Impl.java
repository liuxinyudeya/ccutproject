package com.ccunix.icar.basedb.service;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.ccunix.icar.base.domain.AppDataModel;
import com.ccunix.icar.base.service.BaseService;
import com.ccunix.icar.basedb.domain.T_s_color;
import com.ccunix.icar.basedb.dao.T_s_color_Dao_Iface;

@Service("T_s_color_Service")
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class T_s_color_Service_Impl extends BaseService implements T_s_color_Service_Iface {
@Resource
public T_s_color_Dao_Iface t_s_color_dao_iface;
public void insert_t_s_color(T_s_color t_s_color) throws Exception{
t_s_color_dao_iface.insert_t_s_color(t_s_color);
}
public void update_t_s_color(T_s_color t_s_color) throws Exception{
t_s_color_dao_iface.update_t_s_color(t_s_color);
}
public void delete_t_s_color(T_s_color t_s_color) throws Exception{
t_s_color_dao_iface.delete_t_s_color(t_s_color);
}
public List queryAll_t_s_color(T_s_color t_s_color) throws Exception{
return t_s_color_dao_iface.queryAll_t_s_color(t_s_color);
}
public List queryBy_t_s_color(T_s_color t_s_color) throws Exception{
return t_s_color_dao_iface.queryBy_t_s_color(t_s_color);
}
}