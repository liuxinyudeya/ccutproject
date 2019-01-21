package com.ccunix.icar.basedb.domain;
import com.ccunix.icar.base.domain.Base_Model_Business;
import java.util.Date;
public class T_s_vphone extends Base_Model_Business {
private String phonenoa;
public void setPhonenoa(String phonenoa){
this.phonenoa=phonenoa;
}
public String getPhonenoa(){
return this.phonenoa;
}
private String phonenob;
public void setPhonenob(String phonenob){
this.phonenob=phonenob;
}
public String getPhonenob(){
return this.phonenob;
}
private String subsid;
public void setSubsid(String subsid){
this.subsid=subsid;
}
public String getSubsid(){
return this.subsid;
}
private String secretno;
public void setSecretno(String secretno){
this.secretno=secretno;
}
public String getSecretno(){
return this.secretno;
}
private String order_id;
public void setOrder_id(String order_id){
this.order_id=order_id;
}
public String getOrder_id(){
return this.order_id;
}
}
