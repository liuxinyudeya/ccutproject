package com.ccunix.icar.basedb.domain;
import com.ccunix.icar.base.domain.Base_Model_Business;
import java.util.Date;
public class T_u_member_coupon extends Base_Model_Business {
private String coupon_photo;
public void setCoupon_photo(String coupon_photo){
this.coupon_photo=coupon_photo;
}
public String getCoupon_photo(){
return this.coupon_photo;
}
private Integer is_used;
public void setIs_used(Integer is_used){
this.is_used=is_used;
}
public Integer getIs_used(){
return this.is_used;
}
private Date time_used;
public void setTime_used(Date time_used){
this.time_used=time_used;
}
public Date getTime_used(){
return this.time_used;
}
private String order_used;
public void setOrder_used(String order_used){
this.order_used=order_used;
}
public String getOrder_used(){
return this.order_used;
}
private Double order_amount;

public Double getOrder_amount() {
	return order_amount;
}
public void setOrder_amount(Double order_amount) {
	this.order_amount = order_amount;
}
private Double amount_of_coupon;

public Double getAmount_of_coupon() {
	return amount_of_coupon;
}
public void setAmount_of_coupon(Double amount_of_coupon) {
	this.amount_of_coupon = amount_of_coupon;
}
private Double deduction_amount;

public Double getDeduction_amount() {
	return deduction_amount;
}
public void setDeduction_amount(Double deduction_amount) {
	this.deduction_amount = deduction_amount;
}
private String order_owner_id;
public void setOrder_owner_id(String order_owner_id){
this.order_owner_id=order_owner_id;
}
public String getOrder_owner_id(){
return this.order_owner_id;
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
}
