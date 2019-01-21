package com.ccunix.icar.basedb.domain;
import com.ccunix.icar.base.domain.Base_Model_Business;
import java.util.Date;
public class T_u_member_appointment extends Base_Model_Business {
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
private String appointment_id;
public void setAppointment_id(String appointment_id){
this.appointment_id=appointment_id;
}
public String getAppointment_id(){
return this.appointment_id;
}
private Date appointment_start_time;
public void setAppointment_start_time(Date appointment_start_time){
this.appointment_start_time=appointment_start_time;
}
public Date getAppointment_start_time(){
return this.appointment_start_time;
}
private Date appointment_end_time;
public void setAppointment_end_time(Date appointment_end_time){
this.appointment_end_time=appointment_end_time;
}
public Date getAppointment_end_time(){
return this.appointment_end_time;
}
private Integer amount_appointment;
public void setAmount_appointment(Integer amount_appointment){
this.amount_appointment=amount_appointment;
}
public Integer getAmount_appointment(){
return this.amount_appointment;
}
private String appointment_state_code;
public void setAppointment_state_code(String appointment_state_code){
this.appointment_state_code=appointment_state_code;
}
public String getAppointment_state_code(){
return this.appointment_state_code;
}
private String appointment_state_name;
public void setAppointment_state_name(String appointment_state_name){
this.appointment_state_name=appointment_state_name;
}
public String getAppointment_state_name(){
return this.appointment_state_name;
}
private String cancel_reason;
public void setCancel_reason(String cancel_reason){
this.cancel_reason=cancel_reason;
}
public String getCancel_reason(){
return this.cancel_reason;
}
private Integer appointment_service_item_count;
public void setAppointment_service_item_count(Integer appointment_service_item_count){
this.appointment_service_item_count=appointment_service_item_count;
}
public Integer getAppointment_service_item_count(){
return this.appointment_service_item_count;
}
private String province_id_appointment;
public void setProvince_id_appointment(String province_id_appointment){
this.province_id_appointment=province_id_appointment;
}
public String getProvince_id_appointment(){
return this.province_id_appointment;
}
private String province_name_appointment;
public void setProvince_name_appointment(String province_name_appointment){
this.province_name_appointment=province_name_appointment;
}
public String getProvince_name_appointment(){
return this.province_name_appointment;
}
private String city_id_appointment;
public void setCity_id_appointment(String city_id_appointment){
this.city_id_appointment=city_id_appointment;
}
public String getCity_id_appointment(){
return this.city_id_appointment;
}
private String city_name_appointment;
public void setCity_name_appointment(String city_name_appointment){
this.city_name_appointment=city_name_appointment;
}
public String getCity_name_appointment(){
return this.city_name_appointment;
}
private String area_id_appointment;
public void setArea_id_appointment(String area_id_appointment){
this.area_id_appointment=area_id_appointment;
}
public String getArea_id_appointment(){
return this.area_id_appointment;
}
private String area_name_appointment;
public void setArea_name_appointment(String area_name_appointment){
this.area_name_appointment=area_name_appointment;
}
public String getArea_name_appointment(){
return this.area_name_appointment;
}
private String street_id_appointment;
public void setStreet_id_appointment(String street_id_appointment){
this.street_id_appointment=street_id_appointment;
}
public String getStreet_id_appointment(){
return this.street_id_appointment;
}
private String street_name_appointment;
public void setStreet_name_appointment(String street_name_appointment){
this.street_name_appointment=street_name_appointment;
}
public String getStreet_name_appointment(){
return this.street_name_appointment;
}
}
