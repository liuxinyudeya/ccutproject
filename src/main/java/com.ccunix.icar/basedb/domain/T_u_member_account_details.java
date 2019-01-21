package com.ccunix.icar.basedb.domain;
import com.ccunix.icar.base.domain.Base_Model_Business;
import java.util.Date;
public class T_u_member_account_details extends Base_Model_Business {
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
private String in_ex_account_source_type_code;
public void setIn_ex_account_source_type_code(String in_ex_account_source_type_code){
this.in_ex_account_source_type_code=in_ex_account_source_type_code;
}
public String getIn_ex_account_source_type_code(){
return this.in_ex_account_source_type_code;
}
private String in_ex_account_source_type_name;
public void setIn_ex_account_source_type_name(String in_ex_account_source_type_name){
this.in_ex_account_source_type_name=in_ex_account_source_type_name;
}
public String getIn_ex_account_source_type_name(){
return this.in_ex_account_source_type_name;
}
private Double amount_of_in_ex_amount;
public void setAmount_of_in_ex_amount(Double amount_of_in_ex_amount){
this.amount_of_in_ex_amount=amount_of_in_ex_amount;
}
public Double getAmount_of_in_ex_amount(){
return this.amount_of_in_ex_amount;
}
private Double amount_of_in_ex_amount_before;
public void setAmount_of_in_ex_amount_before(Double amount_of_in_ex_amount_before){
this.amount_of_in_ex_amount_before=amount_of_in_ex_amount_before;
}
public Double getAmount_of_in_ex_amount_before(){
return this.amount_of_in_ex_amount_before;
}
private Double amount_of_in_ex_amount_after;
public void setAmount_of_in_ex_amount_after(Double amount_of_in_ex_amount_after){
this.amount_of_in_ex_amount_after=amount_of_in_ex_amount_after;
}
public Double getAmount_of_in_ex_amount_after(){
return this.amount_of_in_ex_amount_after;
}
private String no_in_ex_account;
public void setNo_in_ex_account(String no_in_ex_account){
this.no_in_ex_account=no_in_ex_account;
}
public String getNo_in_ex_account(){
return this.no_in_ex_account;
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
private String in_ex_account_parameter;
public void setIn_ex_account_parameter(String in_ex_account_parameter){
this.in_ex_account_parameter=in_ex_account_parameter;
}
public String getIn_ex_account_parameter(){
return this.in_ex_account_parameter;
}
private Date time_in_ex_account;
public void setTime_in_ex_account(Date time_in_ex_account){
this.time_in_ex_account=time_in_ex_account;
}
public Date getTime_in_ex_account(){
return this.time_in_ex_account;
}
}
