package com.ccunix.icar.basedb.domain;
import com.ccunix.icar.base.domain.Base_Model_Business;
import java.util.Date;
public class T_u_apply_cancel_order extends Base_Model_Business {
private String order_id;
public void setOrder_id(String order_id){
this.order_id=order_id;
}
public String getOrder_id(){
return this.order_id;
}
private String apply_user_id;
public void setApply_user_id(String apply_user_id){
this.apply_user_id=apply_user_id;
}
public String getApply_user_id(){
return this.apply_user_id;
}
private String cancel_reason;
public void setCancel_reason(String cancel_reason){
this.cancel_reason=cancel_reason;
}
public String getCancel_reason(){
return this.cancel_reason;
}
private Integer is_agee;
public void setIs_agee(Integer is_agee){
this.is_agee=is_agee;
}
public Integer getIs_agee(){
return this.is_agee;
}
private String auditor_id;
public void setAuditor_id(String auditor_id){
this.auditor_id=auditor_id;
}
public String getAuditor_id(){
return this.auditor_id;
}
private String auditor_name;
public void setAuditor_name(String auditor_name){
this.auditor_name=auditor_name;
}
public String getAuditor_name(){
return this.auditor_name;
}
private String reject_reason;
public void setReject_reason(String reject_reason){
this.reject_reason=reject_reason;
}
public String getReject_reason(){
return this.reject_reason;
}
private String memo;
public void setMemo(String memo){
this.memo=memo;
}
public String getMemo(){
return this.memo;
}
}
