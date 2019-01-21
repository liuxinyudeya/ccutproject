package com.ccunix.icar.basedb.domain;
import com.ccunix.icar.base.domain.Base_Model_Business;
import java.util.Date;
public class T_u_manager extends Base_Model_Business {
private String name;
public void setName(String name){
this.name=name;
}
public String getName(){
return this.name;
}
private String sex_type_code;
public void setSex_type_code(String sex_type_code){
this.sex_type_code=sex_type_code;
}
public String getSex_type_code(){
return this.sex_type_code;
}
private String sex_type_name;
public void setSex_type_name(String sex_type_name){
this.sex_type_name=sex_type_name;
}
public String getSex_type_name(){
return this.sex_type_name;
}
private String mobile;
public void setMobile(String mobile){
this.mobile=mobile;
}
public String getMobile(){
return this.mobile;
}
private String idcard_no;
public void setIdcard_no(String idcard_no){
this.idcard_no=idcard_no;
}
public String getIdcard_no(){
return this.idcard_no;
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
}
