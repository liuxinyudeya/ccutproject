package com.ccunix.icar.basedb.domain;
import com.ccunix.icar.base.domain.Base_Model_Business;
import java.util.Date;
public class T_u_set_menu_service_price extends Base_Model_Business {
private String set_menu_id;
public void setSet_menu_id(String set_menu_id){
this.set_menu_id=set_menu_id;
}
public String getSet_menu_id(){
return this.set_menu_id;
}
private String service_item_id;
public void setService_item_id(String service_item_id){
this.service_item_id=service_item_id;
}
public String getService_item_id(){
return this.service_item_id;
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
private Integer set_menu_no;
public void setSet_menu_no(Integer set_menu_no){
this.set_menu_no=set_menu_no;
}
public Integer getSet_menu_no(){
return this.set_menu_no;
}
private Integer item_count_of_set_menu;
public void setItem_count_of_set_menu(Integer item_count_of_set_menu){
this.item_count_of_set_menu=item_count_of_set_menu;
}
public Integer getItem_count_of_set_menu(){
return this.item_count_of_set_menu;
}
}
