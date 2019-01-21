package com.ccunix.icar.basedb.domain;
import com.ccunix.icar.base.domain.Base_Model_Business;
import java.util.Date;
public class T_u_service_item extends Base_Model_Business {
private String service_type_code;
public void setService_type_code(String service_type_code){
this.service_type_code=service_type_code;
}
public String getService_type_code(){
return this.service_type_code;
}
private String service_city_id;
public void setService_city_id(String service_city_id){
this.service_city_id=service_city_id;
}
public String getService_city_id(){
return this.service_city_id;
}
private String preview_photo;
public void setPreview_photo(String preview_photo){
this.preview_photo=preview_photo;
}
public String getPreview_photo(){
return this.preview_photo;
}
private String service_type_name;
public void setService_type_name(String service_type_name){
this.service_type_name=service_type_name;
}
public String getService_type_name(){
return this.service_type_name;
}
private String logo;
public void setLogo(String logo){
this.logo=logo;
}
public String getLogo(){
return this.logo;
}
private String car_model_type_name;
public void setCar_model_type_name(String car_model_type_name){
this.car_model_type_name=car_model_type_name;
}
public String getCar_model_type_name(){
return this.car_model_type_name;
}
private Integer is_show_in_service_list;
public void setIs_show_in_service_list(Integer is_show_in_service_list){
this.is_show_in_service_list=is_show_in_service_list;
}
public Integer getIs_show_in_service_list(){
return this.is_show_in_service_list;
}
private String car_model_type_code;
public void setCar_model_type_code(String car_model_type_code){
this.car_model_type_code=car_model_type_code;
}
public String getCar_model_type_code(){
return this.car_model_type_code;
}
private String name;
public void setName(String name){
this.name=name;
}
public String getName(){
return this.name;
}
private Integer price;
public void setPrice(Integer price){
this.price=price;
}
public Integer getPrice(){
return this.price;
}
private Integer timespan_of_service;
public void setTimespan_of_service(Integer timespan_of_service){
this.timespan_of_service=timespan_of_service;
}
public Integer getTimespan_of_service(){
return this.timespan_of_service;
}
}
