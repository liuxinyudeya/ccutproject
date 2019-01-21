package com.ccunix.icar.basedb.domain;
import com.ccunix.icar.base.domain.Base_Model_Business;
import java.util.Date;
public class T_u_member_self_recommendation extends Base_Model_Business {
private String apply_job;
public void setApply_job(String apply_job){
this.apply_job=apply_job;
}
public String getApply_job(){
return this.apply_job;
}
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
private String applicant_sex;
public void setApplicant_sex(String applicant_sex){
this.applicant_sex=applicant_sex;
}
public String getApplicant_sex(){
return this.applicant_sex;
}
private String mobile;
public void setMobile(String mobile){
this.mobile=mobile;
}
public String getMobile(){
return this.mobile;
}
private String idcard_no;
public void setIdcard_no(String idcard_no){
this.idcard_no=idcard_no;
}
public String getIdcard_no(){
return this.idcard_no;
}
private String province_id_work;
public void setProvince_id_work(String province_id_work){
this.province_id_work=province_id_work;
}
public String getProvince_id_work(){
return this.province_id_work;
}
private String province_name_work;
public void setProvince_name_work(String province_name_work){
this.province_name_work=province_name_work;
}
public String getProvince_name_work(){
return this.province_name_work;
}
private String city_id_work;
public void setCity_id_work(String city_id_work){
this.city_id_work=city_id_work;
}
public String getCity_id_work(){
return this.city_id_work;
}
private String city_name_work;
public void setCity_name_work(String city_name_work){
this.city_name_work=city_name_work;
}
public String getCity_name_work(){
return this.city_name_work;
}
private String area_work;
public void setArea_work(String area_work){
this.area_work=area_work;
}
public String getArea_work(){
return this.area_work;
}
private String experience;
public void setExperience(String experience){
this.experience=experience;
}
public String getExperience(){
return this.experience;
}
private String join_type;
public void setJoin_type(String join_type){
this.join_type=join_type;
}
public String getJoin_type(){
return this.join_type;
}
private String idcard_front_url;
public void setIdcard_front_url(String idcard_front_url){
this.idcard_front_url=idcard_front_url;
}
public String getIdcard_front_url(){
return this.idcard_front_url;
}
private String idcard_back_url;
public void setIdcard_back_url(String idcard_back_url){
this.idcard_back_url=idcard_back_url;
}
public String getIdcard_back_url(){
return this.idcard_back_url;
}
private String driving_license;
public void setDriving_license(String driving_license){
this.driving_license=driving_license;
}
public String getDriving_license(){
return this.driving_license;
}
private Integer is_csstaff_response;
public void setIs_csstaff_response(Integer is_csstaff_response){
this.is_csstaff_response=is_csstaff_response;
}
public Integer getIs_csstaff_response(){
return this.is_csstaff_response;
}
private String responder_name;
public void setResponder_name(String responder_name){
this.responder_name=responder_name;
}
public String getResponder_name(){
return this.responder_name;
}
private Date response_time;
public void setResponse_time(Date response_time){
this.response_time=response_time;
}
public Date getResponse_time(){
return this.response_time;
}
}
