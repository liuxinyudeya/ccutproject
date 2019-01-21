package com.ccunix.icar.basedb.domain;
import com.ccunix.icar.base.domain.Base_Model_Business;
import java.util.Date;
public class T_u_accout_franchisee_system extends Base_Model_Business {
private String account_owner_id;
public void setAccount_owner_id(String account_owner_id){
this.account_owner_id=account_owner_id;
}
public String getAccount_owner_id(){
return this.account_owner_id;
}
private String account_owner_name;
public void setAccount_owner_name(String account_owner_name){
this.account_owner_name=account_owner_name;
}
public String getAccount_owner_name(){
return this.account_owner_name;
}
private String account_type_code;
public void setAccount_type_code(String account_type_code){
this.account_type_code=account_type_code;
}
public String getAccount_type_code(){
return this.account_type_code;
}
private String account_type_name;
public void setAccount_type_name(String account_type_name){
this.account_type_name=account_type_name;
}
public String getAccount_type_name(){
return this.account_type_name;
}
private Double total_income;
public void setTotal_income(Double d){
this.total_income=d;
}
public Double getTotal_income(){
return this.total_income;
}
private Double total_expentiture;
public void setTotal_expentiture(Double total_expentiture){
this.total_expentiture=total_expentiture;
}
public Double getTotal_expentiture(){
return this.total_expentiture;
}
private Double total_current;
public void setTotal_current(Double total_current){
this.total_current=total_current;
}
public Double getTotal_current(){
return this.total_current;
}
}
