package com.ccunix.icar.basedb.domain;
import com.ccunix.icar.base.domain.Base_Model_Business;
import java.util.Date;
public class T_u_send_mobile_message extends Base_Model_Business {
private String user_id;
public void setUser_id(String user_id){
this.user_id=user_id;
}
public String getUser_id(){
return this.user_id;
}
private String title;
public void setTitle(String title){
this.title=title;
}
public String getTitle(){
return this.title;
}
private String content;
public void setContent(String content){
this.content=content;
}
public String getContent(){
return this.content;
}
private String parameter;
public void setParameter(String parameter){
this.parameter=parameter;
}
public String getParameter(){
return this.parameter;
}
private String system_code;
public void setSystem_code(String system_code){
this.system_code=system_code;
}
public String getSystem_code(){
return this.system_code;
}
private String system_name;
public void setSystem_name(String system_name){
this.system_name=system_name;
}
public String getSystem_name(){
return this.system_name;
}
private String token;
public void setToken(String token){
this.token=token;
}
public String getToken(){
return this.token;
}
private Date send_time;
public void setSend_time(Date send_time){
this.send_time=send_time;
}
public Date getSend_time(){
return this.send_time;
}
private Date receive_time;
public void setReceive_time(Date receive_time){
this.receive_time=receive_time;
}
public Date getReceive_time(){
return this.receive_time;
}
}
