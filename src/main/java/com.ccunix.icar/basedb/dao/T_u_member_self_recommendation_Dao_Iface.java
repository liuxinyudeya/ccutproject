package com.ccunix.icar.basedb.dao;
import java.util.List;
import com.ccunix.icar.basedb.domain.T_u_member_self_recommendation;
public interface T_u_member_self_recommendation_Dao_Iface {
public void insert_t_u_member_self_recommendation(T_u_member_self_recommendation t_u_member_self_recommendation) throws Exception;
public void update_t_u_member_self_recommendation(T_u_member_self_recommendation t_u_member_self_recommendation) throws Exception;
public void delete_t_u_member_self_recommendation(T_u_member_self_recommendation t_u_member_self_recommendation) throws Exception;
public List queryAll_t_u_member_self_recommendation(T_u_member_self_recommendation t_u_member_self_recommendation) throws Exception;
public List queryBy_t_u_member_self_recommendation(T_u_member_self_recommendation t_u_member_self_recommendation) throws Exception;
}
