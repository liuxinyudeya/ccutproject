package com.ccunix.icar.basedb.domain;
import com.ccunix.icar.base.domain.Base_Model_Business;
import java.util.Date;
public class T_u_franchisee_account_details extends Base_Model_Business {
private String account_id;
public void setAccount_id(String account_id){
this.account_id=account_id;
}
public String getAccount_id(){
return this.account_id;
}
private String account_owner_id;
public void setAccount_owner_id(String account_owner_id){
this.account_owner_id=account_owner_id;
}
public String getAccount_owner_id(){
return this.account_owner_id;
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
private String in_ex_type_code;
public void setIn_ex_type_code(String in_ex_type_code){
this.in_ex_type_code=in_ex_type_code;
}
public String getIn_ex_type_code(){
return this.in_ex_type_code;
}
private String in_ex_type_name;
public void setIn_ex_type_name(String in_ex_type_name){
this.in_ex_type_name=in_ex_type_name;
}
public String getIn_ex_type_name(){
return this.in_ex_type_name;
}
private Double total_in_ex_amount;
public void setTotal_in_ex_amount(Double a){
this.total_in_ex_amount=a;
}
public Double getTotal_in_ex_amount(){
return this.total_in_ex_amount;
}
private Double money_before_in_ex_account;
public void setMoney_before_in_ex_account(Double money_before_in_ex_account){
this.money_before_in_ex_account=money_before_in_ex_account;
}
public Double getMoney_before_in_ex_account(){
return this.money_before_in_ex_account;
}
private Double money_after_in_ex_account;
public void setMoney_after_in_ex_account(Double money_after_in_ex_account){
this.money_after_in_ex_account=money_after_in_ex_account;
}
public Double getMoney_after_in_ex_account(){
return this.money_after_in_ex_account;
}
private String batch_no_in_ex_account;
public void setBatch_no_in_ex_account(String batch_no_in_ex_account){
this.batch_no_in_ex_account=batch_no_in_ex_account;
}
public String getBatch_no_in_ex_account(){
return this.batch_no_in_ex_account;
}
private String in_ex_account_type_code;
public void setIn_ex_account_type_code(String in_ex_account_type_code){
this.in_ex_account_type_code=in_ex_account_type_code;
}
public String getIn_ex_account_type_code(){
return this.in_ex_account_type_code;
}
private String in_ex_account_type_name;
public void setIn_ex_account_type_name(String in_ex_account_type_name){
this.in_ex_account_type_name=in_ex_account_type_name;
}
public String getIn_ex_account_type_name(){
return this.in_ex_account_type_name;
}
private String partment;
public void setPartment(String partment){
this.partment=partment;
}
public String getPartment(){
return this.partment;
}
private Date happen_time;
public void setHappen_time(Date happen_time){
this.happen_time=happen_time;
}
public Date getHappen_time(){
return this.happen_time;
}
}
