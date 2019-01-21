package com.ccunix.icar.basedb.domain;
import com.ccunix.icar.base.domain.Base_Model_Business;
import java.util.Date;
public class T_u_order_implementation extends Base_Model_Business {
private String order_id;
public void setOrder_id(String order_id){
this.order_id=order_id;
}
public String getOrder_id(){
return this.order_id;
}
private String implementation_code;
public void setImplementation_code(String implementation_code){
this.implementation_code=implementation_code;
}
public String getImplementation_code(){
return this.implementation_code;
}
private String implementation_name;
public void setImplementation_name(String implementation_name){
this.implementation_name=implementation_name;
}
public String getImplementation_name(){
return this.implementation_name;
}
private Date happent_time;
public void setHappent_time(Date happent_time){
this.happent_time=happent_time;
}
public Date getHappent_time(){
return this.happent_time;
}
private String order_buyer;
public void setOrder_buyer(String order_buyer){
this.order_buyer=order_buyer;
}
public String getOrder_buyer(){
return this.order_buyer;
}
}
