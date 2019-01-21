package com.ccunix.icar.basedb.domain;
import com.ccunix.icar.base.domain.Base_Model_Business;
import java.util.Date;
public class T_u_memer_appointment_coupon extends Base_Model_Business {
private String member_id;
public void setMember_id(String member_id){
this.member_id=member_id;
}
public String getMember_id(){
return this.member_id;
}
private String coupon_id;
public void setCoupon_id(String coupon_id){
this.coupon_id=coupon_id;
}
public String getCoupon_id(){
return this.coupon_id;
}
private Date duration_of_use_start;
public void setDuration_of_use_start(Date duration_of_use_start){
this.duration_of_use_start=duration_of_use_start;
}
public Date getDuration_of_use_start(){
return this.duration_of_use_start;
}
private Date duration_of_use_end;
public void setDuration_of_use_end(Date duration_of_use_end){
this.duration_of_use_end=duration_of_use_end;
}
public Date getDuration_of_use_end(){
return this.duration_of_use_end;
}
private Integer order_amount;
public void setOrder_amount(Integer order_amount){
this.order_amount=order_amount;
}
public Integer getOrder_amount(){
return this.order_amount;
}
private Integer amount_of_coupon;
public void setAmount_of_coupon(Integer amount_of_coupon){
this.amount_of_coupon=amount_of_coupon;
}
public Integer getAmount_of_coupon(){
return this.amount_of_coupon;
}
}
