package com.ccunix.icar.basedb.domain;
import com.ccunix.icar.base.domain.Base_Model_Business;
import java.util.Date;
public class T_u_member extends Base_Model_Business {
private String head_photo;
public void setHead_photo(String head_photo){
this.head_photo=head_photo;
}
public String getHead_photo(){
return this.head_photo;
}
private Double pay_total;
public void setPay_total(Double pay_total){
this.pay_total=pay_total;
}
public Double getPay_total(){
return this.pay_total;
}
private Integer get_coupon_count;
public void setGet_coupon_count(Integer get_coupon_count){
this.get_coupon_count=get_coupon_count;
}
public Integer getGet_coupon_count(){
return this.get_coupon_count;
}
private Integer pay_coupon_count;
public void setPay_coupon_count(Integer pay_coupon_count){
this.pay_coupon_count=pay_coupon_count;
}
public Integer getPay_coupon_count(){
return this.pay_coupon_count;
}
private Integer get_free_voucher_count;
public void setGet_free_voucher_count(Integer get_free_voucher_count){
this.get_free_voucher_count=get_free_voucher_count;
}
public Integer getGet_free_voucher_count(){
return this.get_free_voucher_count;
}
private Integer pay_free_voucher_count;
public void setPay_free_voucher_count(Integer pay_free_voucher_count){
this.pay_free_voucher_count=pay_free_voucher_count;
}
public Integer getPay_free_voucher_count(){
return this.pay_free_voucher_count;
}
private Double get_coupon_total;
public void setGet_coupon_total(Double get_coupon_total){
this.get_coupon_total=get_coupon_total;
}
public Double getGet_coupon_total(){
return this.get_coupon_total;
}
private Double pay_coupon_total;
public void setPay_coupon_total(Double pay_coupon_total){
this.pay_coupon_total=pay_coupon_total;
}
public Double getPay_coupon_total(){
return this.pay_coupon_total;
}
private Integer cancel_count;
public void setCancel_count(Integer cancel_count){
this.cancel_count=cancel_count;
}
public Integer getCancel_count(){
return this.cancel_count;
}
private Double pay_damages_total;
public void setPay_damages_total(Double pay_damages_total){
this.pay_damages_total=pay_damages_total;
}
public Double getPay_damages_total(){
return this.pay_damages_total;
}
private String city_id_of_member;
public void setCity_id_of_member(String city_id_of_member){
this.city_id_of_member=city_id_of_member;
}
public String getCity_id_of_member(){
return this.city_id_of_member;
}
private String city_name_of_member;
public void setCity_name_of_member(String city_name_of_member){
this.city_name_of_member=city_name_of_member;
}
public String getCity_name_of_member(){
return this.city_name_of_member;
}
private String nick;
public void setNick(String nick){
this.nick=nick;
}
public String getNick(){
return this.nick;
}
private Integer count_of_car;
public void setCount_of_car(Integer count_of_car){
this.count_of_car=count_of_car;
}
public Integer getCount_of_car(){
return this.count_of_car;
}
private Integer order_count;
public void setOrder_count(Integer order_count){
this.order_count=order_count;
}
public Integer getOrder_count(){
return this.order_count;
}
private Date last_time_of_order;
public void setLast_time_of_order(Date last_time_of_order){
this.last_time_of_order=last_time_of_order;
}
public Date getLast_time_of_order(){
return this.last_time_of_order;
}
private String last_position_of_order;
public void setLast_position_of_order(String last_position_of_order){
this.last_position_of_order=last_position_of_order;
}
public String getLast_position_of_order(){
return this.last_position_of_order;
}
private String last_order_id;
public void setLast_order_id(String last_order_id){
this.last_order_id=last_order_id;
}
public String getLast_order_id(){
return this.last_order_id;
}
private String last_order_car_number;
public void setLast_order_car_number(String last_order_car_number){
this.last_order_car_number=last_order_car_number;
}
public String getLast_order_car_number(){
return this.last_order_car_number;
}
}
