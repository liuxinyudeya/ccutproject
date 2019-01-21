package com.ccunix.icar.basedb.domain;
import com.ccunix.icar.base.domain.Base_Model_Business;
import java.util.Date;
public class T_u_coupon extends Base_Model_Business {
private Integer is_disable;
public void setIs_disable(Integer is_disable){
this.is_disable=is_disable;
}
public Integer getIs_disable(){
return this.is_disable;
}
private String descr;
public void setDescr(String descr){
this.descr=descr;
}
public String getDescr(){
return this.descr;
}
private String name;
public void setName(String name){
this.name=name;
}
public String getName(){
return this.name;
}
private String generate_operator_id;
public void setGenerate_operator_id(String generate_operator_id){
this.generate_operator_id=generate_operator_id;
}
public String getGenerate_operator_id(){
return this.generate_operator_id;
}
private String generate_operator_name;
public void setGenerate_operator_name(String generate_operator_name){
this.generate_operator_name=generate_operator_name;
}
public String getGenerate_operator_name(){
return this.generate_operator_name;
}
private String photo;
public void setPhoto(String photo){
this.photo=photo;
}
public String getPhoto(){
return this.photo;
}
private String code;
public void setCode(String code){
this.code=code;
}
public String getCode(){
return this.code;
}
private String receive_code;
public void setReceive_code(String receive_code){
this.receive_code=receive_code;
}
public String getReceive_code(){
return this.receive_code;
}
private String type_code;
public void setType_code(String type_code){
this.type_code=type_code;
}
public String getType_code(){
return this.type_code;
}
private String type_name;
public void setType_name(String type_name){
this.type_name=type_name;
}
public String getType_name(){
return this.type_name;
}
private Double amount;
public void setAmount(Double amount){
this.amount=amount;
}
public Double getAmount(){
return this.amount;
}
private Date receive_limit_start;
public void setReceive_limit_start(Date receive_limit_start){
this.receive_limit_start=receive_limit_start;
}
public Date getReceive_limit_start(){
return this.receive_limit_start;
}
private Date receive_limit_end;
public void setReceive_limit_end(Date receive_limit_end){
this.receive_limit_end=receive_limit_end;
}
public Date getReceive_limit_end(){
return this.receive_limit_end;
}
private Date use_limit_start;
public void setUse_limit_start(Date use_limit_start){
this.use_limit_start=use_limit_start;
}
public Date getUse_limit_start(){
return this.use_limit_start;
}
private Date use_limit_end;
public void setUse_limit_end(Date use_limit_end){
this.use_limit_end=use_limit_end;
}
public Date getUse_limit_end(){
return this.use_limit_end;
}
}
