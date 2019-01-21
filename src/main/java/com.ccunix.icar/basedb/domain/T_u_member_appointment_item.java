package com.ccunix.icar.basedb.domain;
import com.ccunix.icar.base.domain.Base_Model_Business;
import java.util.Date;
public class T_u_member_appointment_item extends Base_Model_Business {
private String item_id;
public void setItem_id(String item_id){
this.item_id=item_id;
}
public String getItem_id(){
return this.item_id;
}
private String item_name;
public void setItem_name(String item_name){
this.item_name=item_name;
}
public String getItem_name(){
return this.item_name;
}
private Integer item_price;
public void setItem_price(Integer item_price){
this.item_price=item_price;
}
public Integer getItem_price(){
return this.item_price;
}
private String appointment_id;
public void setAppointment_id(String appointment_id){
this.appointment_id=appointment_id;
}
public String getAppointment_id(){
return this.appointment_id;
}
private String member_id_appointment;
public void setMember_id_appointment(String member_id_appointment){
this.member_id_appointment=member_id_appointment;
}
public String getMember_id_appointment(){
return this.member_id_appointment;
}
private Integer order_no;
public void setOrder_no(Integer order_no){
this.order_no=order_no;
}
public Integer getOrder_no(){
return this.order_no;
}
}
