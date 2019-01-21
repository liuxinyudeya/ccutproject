package com.ccunix.icar.basedb.domain;
import com.ccunix.icar.base.domain.Base_Model_Business;
import java.util.Date;
public class T_u_register_manager extends Base_Model_Business {
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
private String check_mobile;
public void setCheck_mobile(String check_mobile){
this.check_mobile=check_mobile;
}
public String getCheck_mobile(){
return this.check_mobile;
}
private String role_id;
public void setRole_id(String role_id){
this.role_id=role_id;
}
public String getRole_id(){
return this.role_id;
}
private String role_name;
public void setRole_name(String role_name){
this.role_name=role_name;
}
public String getRole_name(){
return this.role_name;
}
private Integer can_login;
public void setCan_login(Integer can_login){
this.can_login=can_login;
}
public Integer getCan_login(){
return this.can_login;
}
private Integer can_order;
public void setCan_order(Integer can_order){
this.can_order=can_order;
}
public Integer getCan_order(){
return this.can_order;
}
private String franchisee;
public void setFranchisee(String franchisee){
this.franchisee=franchisee;
}
public String getFranchisee(){
return this.franchisee;
}
private String app_system_code;
public void setApp_system_code(String app_system_code){
this.app_system_code=app_system_code;
}
public String getApp_system_code(){
return this.app_system_code;
}
private String app_system_name;
public void setApp_system_name(String app_system_name){
this.app_system_name=app_system_name;
}
public String getApp_system_name(){
return this.app_system_name;
}
private String token;
public void setToken(String token){
this.token=token;
}
public String getToken(){
return this.token;
}
}
