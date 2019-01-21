package com.ccunix.icar.basedb.domain;
import com.ccunix.icar.base.domain.Base_Model_Business;
import java.util.Date;
public class T_u_apply_draw_money_franchise extends Base_Model_Business {
private String applicant_id;
public void setApplicant_id(String applicant_id){
this.applicant_id=applicant_id;
}
public String getApplicant_id(){
return this.applicant_id;
}
private String applicant_name;
public void setApplicant_name(String applicant_name){
this.applicant_name=applicant_name;
}
public String getApplicant_name(){
return this.applicant_name;
}
private String applicant_mobile;
public void setApplicant_mobile(String applicant_mobile){
this.applicant_mobile=applicant_mobile;
}
public String getApplicant_mobile(){
return this.applicant_mobile;
}
private Date apply_time;
public void setApply_time(Date apply_time){
this.apply_time=apply_time;
}
public Date getApply_time(){
return this.apply_time;
}
private double amount;
public void setAmount(double amount){
this.amount=amount;
}
public double getAmount(){
return this.amount;
}
private double amount_before_draw_money;
public void setAmount_before_draw_money(double amount_before_draw_money){
this.amount_before_draw_money=amount_before_draw_money;
}
public double getAmount_before_draw_money(){
return this.amount_before_draw_money;
}
private double amount_can_be_draw;
public void setAmount_can_be_draw(double amount_can_be_draw){
this.amount_can_be_draw=amount_can_be_draw;
}
public double getAmount_can_be_draw(){
return this.amount_can_be_draw;
}
private String applicant_memo;
public void setApplicant_memo(String applicant_memo){
this.applicant_memo=applicant_memo;
}
public String getApplicant_memo(){
return this.applicant_memo;
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
private Date audit_time;
public void setAudit_time(Date audit_time){
this.audit_time=audit_time;
}
public Date getAudit_time(){
return this.audit_time;
}
private String audit_result_code;
public void setAudit_result_code(String audit_result_code){
this.audit_result_code=audit_result_code;
}
public String getAudit_result_code(){
return this.audit_result_code;
}
private String audit_result_name;
public void setAudit_result_name(String audit_result_name){
this.audit_result_name=audit_result_name;
}
public String getAudit_result_name(){
return this.audit_result_name;
}
private String audit_failed_reason;
public void setAudit_failed_reason(String audit_failed_reason){
this.audit_failed_reason=audit_failed_reason;
}
public String getAudit_failed_reason(){
return this.audit_failed_reason;
}
private Integer is_transfer_account;
public void setIs_transfer_account(Integer is_transfer_account){
this.is_transfer_account=is_transfer_account;
}
public Integer getIs_transfer_account(){
return this.is_transfer_account;
}
private Date transfer_time;
public void setTransfer_time(Date transfer_time){
this.transfer_time=transfer_time;
}
public Date getTransfer_time(){
return this.transfer_time;
}
private String transfer_operator_id;
public void setTransfer_operator_id(String transfer_operator_id){
this.transfer_operator_id=transfer_operator_id;
}
public String getTransfer_operator_id(){
return this.transfer_operator_id;
}
private String transfer_operator_name;
public void setTransfer_operator_name(String transfer_operator_name){
this.transfer_operator_name=transfer_operator_name;
}
public String getTransfer_operator_name(){
return this.transfer_operator_name;
}
private String transfer_to_account;
public void setTransfer_to_account(String transfer_to_account){
this.transfer_to_account=transfer_to_account;
}
public String getTransfer_to_account(){
return this.transfer_to_account;
}
private String account_owner_name;
public void setAccount_owner_name(String account_owner_name){
this.account_owner_name=account_owner_name;
}
public String getAccount_owner_name(){
return this.account_owner_name;
}
}
