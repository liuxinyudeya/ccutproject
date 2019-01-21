package com.ccunix.icar.basedb.domain;
import com.ccunix.icar.base.domain.Base_Model_Business;
import java.util.Date;
public class T_u_member_register extends Base_Model_Business {
private Date login_time;
public void setLogin_time(Date login_time){
this.login_time=login_time;
}
public Date getLogin_time(){
return this.login_time;
}
private String account;
public void setAccount(String account){
this.account=account;
}
public String getAccount(){
return this.account;
}
private String pwd;
public void setPwd(String pwd){
this.pwd=pwd;
}
public String getPwd(){
return this.pwd;
}
private String valid_mobile;
public void setValid_mobile(String valid_mobile){
this.valid_mobile=valid_mobile;
}
public String getValid_mobile(){
return this.valid_mobile;
}
private Integer login_access;
public void setLogin_access(Integer login_access){
this.login_access=login_access;
}
public Integer getLogin_access(){
return this.login_access;
}
private Integer order_access;
public void setOrder_access(Integer order_access){
this.order_access=order_access;
}
public Integer getOrder_access(){
return this.order_access;
}
private String member_id;
public void setMember_id(String member_id){
this.member_id=member_id;
}
public String getMember_id(){
return this.member_id;
}
private String operating_system_for_user_code;
public void setOperating_system_for_user_code(String operating_system_for_user_code){
this.operating_system_for_user_code=operating_system_for_user_code;
}
public String getOperating_system_for_user_code(){
return this.operating_system_for_user_code;
}
private String operating_system_for_user_name;
public void setOperating_system_for_user_name(String operating_system_for_user_name){
this.operating_system_for_user_name=operating_system_for_user_name;
}
public String getOperating_system_for_user_name(){
return this.operating_system_for_user_name;
}
private String token;
public void setToken(String token){
this.token=token;
}
public String getToken(){
return this.token;
}
}
