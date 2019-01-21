package com.ccunix.icar.basedb.domain;
import com.ccunix.icar.base.domain.Base_Model_Business;
import java.util.Date;
public class T_u_integral_usergoods extends Base_Model_Business {
private String member_id;
public void setMember_id(String member_id){
this.member_id=member_id;
}
public String getMember_id(){
return this.member_id;
}
private String integral_id;
public void setIntegral_id(String integral_id){
this.integral_id=integral_id;
}
public String getIntegral_id(){
return this.integral_id;
}
private Integer integral_num;
public void setIntegral_num(Integer integral_num){
this.integral_num=integral_num;
}
public Integer getIntegral_num(){
return this.integral_num;
}
private String integal_status;
public void setIntegal_status(String integal_status){
this.integal_status=integal_status;
}
public String getIntegal_status(){
return this.integal_status;
}
private String sender_id;
public void setSender_id(String sender_id){
this.sender_id=sender_id;
}
public String getSender_id(){
return this.sender_id;
}
private String sender_name;
public void setSender_name(String sender_name){
this.sender_name=sender_name;
}
public String getSender_name(){
return this.sender_name;
}
private String order_id;
public void setOrder_id(String order_id){
this.order_id=order_id;
}
public String getOrder_id(){
return this.order_id;
}
private String goods_name;
public void setGoods_name(String goods_name){
this.goods_name=goods_name;
}
public String getGoods_name(){
return this.goods_name;
}
}
