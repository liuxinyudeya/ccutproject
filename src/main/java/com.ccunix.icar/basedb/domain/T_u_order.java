package com.ccunix.icar.basedb.domain;
import com.ccunix.icar.base.domain.Base_Model_Business;
import java.util.Date;
public class T_u_order extends Base_Model_Business {
private String place_order_type_code;
public void setPlace_order_type_code(String place_order_type_code){
this.place_order_type_code=place_order_type_code;
}
public String getPlace_order_type_code(){
return this.place_order_type_code;
}
private String place_order_type_name;
public void setPlace_order_type_name(String place_order_type_name){
this.place_order_type_name=place_order_type_name;
}
public String getPlace_order_type_name(){
return this.place_order_type_name;
}
private Integer is_opinion;
public void setIs_opinion(Integer is_opinion){
this.is_opinion=is_opinion;
}
public Integer getIs_opinion(){
return this.is_opinion;
}
private double worker_score;
public void setWorker_score(double worker_score){
this.worker_score=worker_score;
}
public double getWorker_score(){
return this.worker_score;
}
private double base_service_score;
public void setBase_service_score(double base_service_score){
this.base_service_score=base_service_score;
}
public double getBase_service_score(){
return this.base_service_score;
}
private double extend_service_score;
public void setExtend_service_score(double extend_service_score){
this.extend_service_score=extend_service_score;
}
public double getExtend_service_score(){
return this.extend_service_score;
}
private String opinion;
public void setOpinion(String opinion){
this.opinion=opinion;
}
public String getOpinion(){
return this.opinion;
}
private double total_score;
public void setTotal_score(double total_score){
this.total_score=total_score;
}
public double getTotal_score(){
return this.total_score;
}
private String blemish_photo1_before_service;
public void setBlemish_photo1_before_service(String blemish_photo1_before_service){
this.blemish_photo1_before_service=blemish_photo1_before_service;
}
public String getBlemish_photo1_before_service(){
return this.blemish_photo1_before_service;
}
private String belmish_photo2_before_service;
public void setBelmish_photo2_before_service(String belmish_photo2_before_service){
this.belmish_photo2_before_service=belmish_photo2_before_service;
}
public String getBelmish_photo2_before_service(){
return this.belmish_photo2_before_service;
}
private String blemish_photo3_before_service;
public void setBlemish_photo3_before_service(String blemish_photo3_before_service){
this.blemish_photo3_before_service=blemish_photo3_before_service;
}
public String getBlemish_photo3_before_service(){
return this.blemish_photo3_before_service;
}
private String belmish_photo4_before_service;
public void setBelmish_photo4_before_service(String belmish_photo4_before_service){
this.belmish_photo4_before_service=belmish_photo4_before_service;
}
public String getBelmish_photo4_before_service(){
return this.belmish_photo4_before_service;
}
private String blemish_photo1_after_service;
public void setBlemish_photo1_after_service(String blemish_photo1_after_service){
this.blemish_photo1_after_service=blemish_photo1_after_service;
}
public String getBlemish_photo1_after_service(){
return this.blemish_photo1_after_service;
}
private String belmish_photo2_after_service;
public void setBelmish_photo2_after_service(String belmish_photo2_after_service){
this.belmish_photo2_after_service=belmish_photo2_after_service;
}
public String getBelmish_photo2_after_service(){
return this.belmish_photo2_after_service;
}
private String blemish_photo3_after_service;
public void setBlemish_photo3_after_service(String blemish_photo3_after_service){
this.blemish_photo3_after_service=blemish_photo3_after_service;
}
public String getBlemish_photo3_after_service(){
return this.blemish_photo3_after_service;
}
private String belmish_photo4_after_service;
public void setBelmish_photo4_after_service(String belmish_photo4_after_service){
this.belmish_photo4_after_service=belmish_photo4_after_service;
}
public String getBelmish_photo4_after_service(){
return this.belmish_photo4_after_service;
}
private String opinion_tge;
public void setOpinion_tge(String opinion_tge){
this.opinion_tge=opinion_tge;
}
public String getOpinion_tge(){
return this.opinion_tge;
}
private String franchisee_visual_mobile;
public void setFranchisee_visual_mobile(String franchisee_visual_mobile){
this.franchisee_visual_mobile=franchisee_visual_mobile;
}
public String getFranchisee_visual_mobile(){
return this.franchisee_visual_mobile;
}
private String member_visual_mobile;
public void setMember_visual_mobile(String member_visual_mobile){
this.member_visual_mobile=member_visual_mobile;
}
public String getMember_visual_mobile(){
return this.member_visual_mobile;
}
private String cancel_side_code;
public void setCancel_side_code(String cancel_side_code){
this.cancel_side_code=cancel_side_code;
}
public String getCancel_side_code(){
return this.cancel_side_code;
}
private String cancel_side_name;
public void setCancel_side_name(String cancel_side_name){
this.cancel_side_name=cancel_side_name;
}
public String getCancel_side_name(){
return this.cancel_side_name;
}
private String cancel_order_person;
public void setCancel_order_person(String cancel_order_person){
this.cancel_order_person=cancel_order_person;
}
public String getCancel_order_person(){
return this.cancel_order_person;
}
private double amount__refundment;
public void setAmount__refundment(double amount__refundment){
this.amount__refundment=amount__refundment;
}
public double getAmount__refundment(){
return this.amount__refundment;
}
private String break_contract_state_code;
public void setBreak_contract_state_code(String break_contract_state_code){
this.break_contract_state_code=break_contract_state_code;
}
public String getBreak_contract_state_code(){
return this.break_contract_state_code;
}
private String break_contract_state_name;
public void setBreak_contract_state_name(String break_contract_state_name){
this.break_contract_state_name=break_contract_state_name;
}
public String getBreak_contract_state_name(){
return this.break_contract_state_name;
}
private String break_contract_reason;
public void setBreak_contract_reason(String break_contract_reason){
this.break_contract_reason=break_contract_reason;
}
public String getBreak_contract_reason(){
return this.break_contract_reason;
}
private String damage_of_payment_state_code;
public void setDamage_of_payment_state_code(String damage_of_payment_state_code){
this.damage_of_payment_state_code=damage_of_payment_state_code;
}
public String getDamage_of_payment_state_code(){
return this.damage_of_payment_state_code;
}
private String damage_of_payment_state_name;
public void setDamage_of_payment_state_name(String damage_of_payment_state_name){
this.damage_of_payment_state_name=damage_of_payment_state_name;
}
public String getDamage_of_payment_state_name(){
return this.damage_of_payment_state_name;
}
private Double total_damage;
public void setTotal_damage(Double total_damage){
this.total_damage=total_damage;
}
public Double getTotal_damage(){
return this.total_damage;
}
private String worker_id;
public void setWorker_id(String worker_id){
this.worker_id=worker_id;
}
public String getWorker_id(){
return this.worker_id;
}
private String worker_name;
public void setWorker_name(String worker_name){
this.worker_name=worker_name;
}
public String getWorker_name(){
return this.worker_name;
}
private String gps_positon_of_worker;
public void setGps_positon_of_worker(String gps_positon_of_worker){
this.gps_positon_of_worker=gps_positon_of_worker;
}
public String getGps_positon_of_worker(){
return this.gps_positon_of_worker;
}
private String province_id_of_service;
public void setProvince_id_of_service(String province_id_of_service){
this.province_id_of_service=province_id_of_service;
}
public String getProvince_id_of_service(){
return this.province_id_of_service;
}
private String province_name_of_service;
public void setProvince_name_of_service(String province_name_of_service){
this.province_name_of_service=province_name_of_service;
}
public String getProvince_name_of_service(){
return this.province_name_of_service;
}
private String city_id_of_service;
public void setCity_id_of_service(String city_id_of_service){
this.city_id_of_service=city_id_of_service;
}
public String getCity_id_of_service(){
return this.city_id_of_service;
}
private String city_name_of_service;
public void setCity_name_of_service(String city_name_of_service){
this.city_name_of_service=city_name_of_service;
}
public String getCity_name_of_service(){
return this.city_name_of_service;
}
private String area_id_of_service;
public void setArea_id_of_service(String area_id_of_service){
this.area_id_of_service=area_id_of_service;
}
public String getArea_id_of_service(){
return this.area_id_of_service;
}
private String area_name_of_service;
public void setArea_name_of_service(String area_name_of_service){
this.area_name_of_service=area_name_of_service;
}
public String getArea_name_of_service(){
return this.area_name_of_service;
}
private String street_id_of_service;
public void setStreet_id_of_service(String street_id_of_service){
this.street_id_of_service=street_id_of_service;
}
public String getStreet_id_of_service(){
return this.street_id_of_service;
}
private String street_name_of_service;
public void setStreet_name_of_service(String street_name_of_service){
this.street_name_of_service=street_name_of_service;
}
public String getStreet_name_of_service(){
return this.street_name_of_service;
}
private String gps_position_of_car;
public void setGps_position_of_car(String gps_position_of_car){
this.gps_position_of_car=gps_position_of_car;
}
public String getGps_position_of_car(){
return this.gps_position_of_car;
}
private Integer timespan_of_service;
public void setTimespan_of_service(Integer timespan_of_service){
this.timespan_of_service=timespan_of_service;
}
public Integer getTimespan_of_service(){
return this.timespan_of_service;
}
private String car_photo_front_before_service;
public void setCar_photo_front_before_service(String car_photo_front_before_service){
this.car_photo_front_before_service=car_photo_front_before_service;
}
public String getCar_photo_front_before_service(){
return this.car_photo_front_before_service;
}
private String car_photo_after_before_service;
public void setCar_photo_after_before_service(String car_photo_after_before_service){
this.car_photo_after_before_service=car_photo_after_before_service;
}
public String getCar_photo_after_before_service(){
return this.car_photo_after_before_service;
}
private String car_photo_left_before_service;
public void setCar_photo_left_before_service(String car_photo_left_before_service){
this.car_photo_left_before_service=car_photo_left_before_service;
}
public String getCar_photo_left_before_service(){
return this.car_photo_left_before_service;
}
private String car_photo_right_before_service;
public void setCar_photo_right_before_service(String car_photo_right_before_service){
this.car_photo_right_before_service=car_photo_right_before_service;
}
public String getCar_photo_right_before_service(){
return this.car_photo_right_before_service;
}
private String car_photo_front_after_servic;
public void setCar_photo_front_after_servic(String car_photo_front_after_servic){
this.car_photo_front_after_servic=car_photo_front_after_servic;
}
public String getCar_photo_front_after_servic(){
return this.car_photo_front_after_servic;
}
private String car_photo_after_after_servic;
public void setCar_photo_after_after_servic(String car_photo_after_after_servic){
this.car_photo_after_after_servic=car_photo_after_after_servic;
}
public String getCar_photo_after_after_servic(){
return this.car_photo_after_after_servic;
}
private String car_photo_left_after_service;
public void setCar_photo_left_after_service(String car_photo_left_after_service){
this.car_photo_left_after_service=car_photo_left_after_service;
}
public String getCar_photo_left_after_service(){
return this.car_photo_left_after_service;
}
private String car_photo_right_after_servic;
public void setCar_photo_right_after_servic(String car_photo_right_after_servic){
this.car_photo_right_after_servic=car_photo_right_after_servic;
}
public String getCar_photo_right_after_servic(){
return this.car_photo_right_after_servic;
}
private String order_no;
public void setOrder_no(String order_no){
this.order_no=order_no;
}
public String getOrder_no(){
return this.order_no;
}
private String car_id;
public void setCar_id(String car_id){
this.car_id=car_id;
}
public String getCar_id(){
return this.car_id;
}
private String car_no;
public void setCar_no(String car_no){
this.car_no=car_no;
}
public String getCar_no(){
return this.car_no;
}
private String order_member_id;
public void setOrder_member_id(String order_member_id){
this.order_member_id=order_member_id;
}
public String getOrder_member_id(){
return this.order_member_id;
}
private Date order_time;
public void setOrder_time(Date order_time){
this.order_time=order_time;
}
public Date getOrder_time(){
return this.order_time;
}
private double order_total;
public void setOrder_total(double order_total){
this.order_total=order_total;
}
public double getOrder_total(){
return this.order_total;
}
private String order_state_code;
public void setOrder_state_code(String order_state_code){
this.order_state_code=order_state_code;
}
public String getOrder_state_code(){
return this.order_state_code;
}
private String order_state_name;
public void setOrder_state_name(String order_state_name){
this.order_state_name=order_state_name;
}
public String getOrder_state_name(){
return this.order_state_name;
}
private Date order_over_time;
public void setOrder_over_time(Date order_over_time){
this.order_over_time=order_over_time;
}
public Date getOrder_over_time(){
return this.order_over_time;
}
private Integer service_item_count_of_order;
public void setService_item_count_of_order(Integer service_item_count_of_order){
this.service_item_count_of_order=service_item_count_of_order;
}
public Integer getService_item_count_of_order(){
return this.service_item_count_of_order;
}
private String pay_state_code;
public void setPay_state_code(String pay_state_code){
this.pay_state_code=pay_state_code;
}
public String getPay_state_code(){
return this.pay_state_code;
}
private String pay_state_name;
public void setPay_state_name(String pay_state_name){
this.pay_state_name=pay_state_name;
}
public String getPay_state_name(){
return this.pay_state_name;
}
private String payment_channel_code;
public void setPayment_channel_code(String payment_channel_code){
this.payment_channel_code=payment_channel_code;
}
public String getPayment_channel_code(){
return this.payment_channel_code;
}
private String payment_channel_name;
public void setPayment_channel_name(String payment_channel_name){
this.payment_channel_name=payment_channel_name;
}
public String getPayment_channel_name(){
return this.payment_channel_name;
}
private String account_of_pay;
public void setAccount_of_pay(String account_of_pay){
this.account_of_pay=account_of_pay;
}
public String getAccount_of_pay(){
return this.account_of_pay;
}
private double total_payment;
public void setTotal_payment(double total_payment){
this.total_payment=total_payment;
}
public double getTotal_payment(){
return this.total_payment;
}
private Date time_payment;
public void setTime_payment(Date time_payment){
this.time_payment=time_payment;
}
public Date getTime_payment(){
return this.time_payment;
}
private double deduction_amount;
public void setDeduction_amount(double deduction_amount){
this.deduction_amount=deduction_amount;
}
public double getDeduction_amount(){
return this.deduction_amount;
}
private String state_code_refundment;
public void setState_code_refundment(String state_code_refundment){
this.state_code_refundment=state_code_refundment;
}
public String getState_code_refundment(){
return this.state_code_refundment;
}
private String state_name_refundment;
public void setState_name_refundment(String state_name_refundment){
this.state_name_refundment=state_name_refundment;
}
public String getState_name_refundment(){
return this.state_name_refundment;
}
private Date time_refundment;
public void setTime_refundment(Date time_refundment){
this.time_refundment=time_refundment;
}
public Date getTime_refundment(){
return this.time_refundment;
}
private String channel_code_refundment;
public void setChannel_code_refundment(String channel_code_refundment){
this.channel_code_refundment=channel_code_refundment;
}
public String getChannel_code_refundment(){
return this.channel_code_refundment;
}
private String channel_name_refundment;
public void setChannel_name_refundment(String channel_name_refundment){
this.channel_name_refundment=channel_name_refundment;
}
public String getChannel_name_refundment(){
return this.channel_name_refundment;
}
private String account_refundment;
public void setAccount_refundment(String account_refundment){
this.account_refundment=account_refundment;
}
public String getAccount_refundment(){
return this.account_refundment;
}
private Date order_send_time;

public Date getOrder_send_time() {
	return order_send_time;
}

public void setOrder_send_time(Date order_send_time) {
	this.order_send_time = order_send_time;
}

}
