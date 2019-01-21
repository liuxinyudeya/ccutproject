package com.ccunix.icar.basedb.domain;
import com.ccunix.icar.base.domain.Base_Model_Business;
import java.util.Date;
public class T_u_car_model extends Base_Model_Business {
private String photo;
public void setPhoto(String photo){
this.photo=photo;
}
public String getPhoto(){
return this.photo;
}
private String car_model_type_code;
public void setCar_model_type_code(String car_model_type_code){
this.car_model_type_code=car_model_type_code;
}
public String getCar_model_type_code(){
return this.car_model_type_code;
}
private Integer price_of_base_service;
public void setPrice_of_base_service(Integer price_of_base_service){
this.price_of_base_service=price_of_base_service;
}
public Integer getPrice_of_base_service(){
return this.price_of_base_service;
}
private String car_model_type_name;
public void setCar_model_type_name(String car_model_type_name){
this.car_model_type_name=car_model_type_name;
}
public String getCar_model_type_name(){
return this.car_model_type_name;
}
private String name;
public void setName(String name){
this.name=name;
}
public String getName(){
return this.name;
}
private String brand_id;
public void setBrand_id(String brand_id){
this.brand_id=brand_id;
}
public String getBrand_id(){
return this.brand_id;
}
private String brand_name;
public void setBrand_name(String brand_name){
this.brand_name=brand_name;
}
public String getBrand_name(){
return this.brand_name;
}
private String first_letter_of_name;
public void setFirst_letter_of_name(String first_letter_of_name){
this.first_letter_of_name=first_letter_of_name;
}
public String getFirst_letter_of_name(){
return this.first_letter_of_name;
}
}
