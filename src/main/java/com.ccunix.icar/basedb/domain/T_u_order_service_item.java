package com.ccunix.icar.basedb.domain;
import com.ccunix.icar.base.domain.Base_Model_Business;
import java.util.Date;
public class T_u_order_service_item extends Base_Model_Business {
private String service_type_name;
public void setService_type_name(String service_type_name){
this.service_type_name=service_type_name;
}
public String getService_type_name(){
return this.service_type_name;
}
private String service_type_code;
public void setService_type_code(String service_type_code){
this.service_type_code=service_type_code;
}
public String getService_type_code(){
return this.service_type_code;
}
private String set_menu_item_list;
public void setSet_menu_item_list(String set_menu_item_list){
this.set_menu_item_list=set_menu_item_list;
}
public String getSet_menu_item_list(){
return this.set_menu_item_list;
}
private Integer set_menu_no;
public void setSet_menu_no(Integer set_menu_no){
this.set_menu_no=set_menu_no;
}
public Integer getSet_menu_no(){
return this.set_menu_no;
}
private String service_item_id;
public void setService_item_id(String service_item_id){
this.service_item_id=service_item_id;
}
public String getService_item_id(){
return this.service_item_id;
}
private String service_item_name;
public void setService_item_name(String service_item_name){
this.service_item_name=service_item_name;
}
public String getService_item_name(){
return this.service_item_name;
}
private Double service_item_price;
public void setService_item_price(Double service_item_price){
this.service_item_price=service_item_price;
}
public Double getService_item_price(){
return this.service_item_price;
}
private String order_id;
public void setOrder_id(String order_id){
this.order_id=order_id;
}
public String getOrder_id(){
return this.order_id;
}
private String order_buyer;
public void setOrder_buyer(String order_buyer){
this.order_buyer=order_buyer;
}
public String getOrder_buyer(){
return this.order_buyer;
}
private Integer order_no;
public void setOrder_no(Integer order_no){
this.order_no=order_no;
}
public Integer getOrder_no(){
return this.order_no;
}
}
