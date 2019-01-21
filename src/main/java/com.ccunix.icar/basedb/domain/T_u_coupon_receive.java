package com.ccunix.icar.basedb.domain;
import com.ccunix.icar.base.domain.Base_Model_Business;
import java.util.Date;
public class T_u_coupon_receive extends Base_Model_Business {
private Date time_receive;
public void setTime_receive(Date time_receive){
this.time_receive=time_receive;
}
public Date getTime_receive(){
return this.time_receive;
}
private String receiver_id;
public void setReceiver_id(String receiver_id){
this.receiver_id=receiver_id;
}
public String getReceiver_id(){
return this.receiver_id;
}
private String receiver_name;
public void setReceiver_name(String receiver_name){
this.receiver_name=receiver_name;
}
public String getReceiver_name(){
return this.receiver_name;
}
private String receive_channel;
public void setReceive_channel(String receive_channel){
this.receive_channel=receive_channel;
}
public String getReceive_channel(){
return this.receive_channel;
}
private String type_code_receive;
public void setType_code_receive(String type_code_receive){
this.type_code_receive=type_code_receive;
}
public String getType_code_receive(){
return this.type_code_receive;
}
private String type_name_receive;
public void setType_name_receive(String type_name_receive){
this.type_name_receive=type_name_receive;
}
public String getType_name_receive(){
return this.type_name_receive;
}
private String parameter_receive;
public void setParameter_receive(String parameter_receive){
this.parameter_receive=parameter_receive;
}
public String getParameter_receive(){
return this.parameter_receive;
}
private String all_coupons_receive;
public void setAll_coupons_receive(String all_coupons_receive){
this.all_coupons_receive=all_coupons_receive;
}
public String getAll_coupons_receive(){
return this.all_coupons_receive;
}
}
