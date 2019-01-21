package com.ccunix.icar.basedb.domain;
import com.ccunix.icar.base.domain.Base_Model_Business;
import java.util.Date;
public class T_u_distribution extends Base_Model_Business {
private String order_id;
public void setOrder_id(String order_id){
this.order_id=order_id;
}
public String getOrder_id(){
return this.order_id;
}
private String order_state_code;
public void setOrder_state_code(String order_state_code){
this.order_state_code=order_state_code;
}
public String getOrder_state_code(){
return this.order_state_code;
}
private String order_state_name;
public void setOrder_state_name(String order_state_name){
this.order_state_name=order_state_name;
}
public String getOrder_state_name(){
return this.order_state_name;
}
private String distribution_state_code;
public void setDistribution_state_code(String distribution_state_code){
this.distribution_state_code=distribution_state_code;
}
public String getDistribution_state_code(){
return this.distribution_state_code;
}
private String distribution_state_name;
public void setDistribution_state_name(String distribution_state_name){
this.distribution_state_name=distribution_state_name;
}
public String getDistribution_state_name(){
return this.distribution_state_name;
}
private Date start_time_of_distribution;
public void setStart_time_of_distribution(Date start_time_of_distribution){
this.start_time_of_distribution=start_time_of_distribution;
}
public Date getStart_time_of_distribution(){
return this.start_time_of_distribution;
}
private Date end_time_of_distribution;
public void setEnd_time_of_distribution(Date end_time_of_distribution){
this.end_time_of_distribution=end_time_of_distribution;
}
public Date getEnd_time_of_distribution(){
return this.end_time_of_distribution;
}
private String order_owner_id;
public void setOrder_owner_id(String order_owner_id){
this.order_owner_id=order_owner_id;
}
public String getOrder_owner_id(){
return this.order_owner_id;
}
private String order_owner_name;
public void setOrder_owner_name(String order_owner_name){
this.order_owner_name=order_owner_name;
}
public String getOrder_owner_name(){
return this.order_owner_name;
}
private String city_id_of_service;
public void setCity_id_of_service(String city_id_of_service){
this.city_id_of_service=city_id_of_service;
}
public String getCity_id_of_service(){
return this.city_id_of_service;
}
private String city_name_of_service;
public void setCity_name_of_service(String city_name_of_service){
this.city_name_of_service=city_name_of_service;
}
public String getCity_name_of_service(){
return this.city_name_of_service;
}
private Double order_amount;
public void setOrder_amount(Double order_amount){
this.order_amount=order_amount;
}
public Double getOrder_amount(){
return this.order_amount;
}
private Double distribution_admount;
public void setDistribution_admount(Double distribution_admount){
this.distribution_admount=distribution_admount;
}
public Double getDistribution_admount(){
return this.distribution_admount;
}
private String account_id_of_ours;
public void setAccount_id_of_ours(String account_id_of_ours){
this.account_id_of_ours=account_id_of_ours;
}
public String getAccount_id_of_ours(){
return this.account_id_of_ours;
}
private Double percentage_of_ours;
public void setPercentage_of_ours(Double percentage_of_ours){
this.percentage_of_ours=percentage_of_ours;
}
public Double getPercentage_of_ours(){
return this.percentage_of_ours;
}
private Double amount_of_ours;
public void setAmount_of_ours(Double amount_of_ours){
this.amount_of_ours=amount_of_ours;
}
public Double getAmount_of_ours(){
return this.amount_of_ours;
}
private String agent_id;
public void setAgent_id(String agent_id){
this.agent_id=agent_id;
}
public String getAgent_id(){
return this.agent_id;
}
private String agent_name;
public void setAgent_name(String agent_name){
this.agent_name=agent_name;
}
public String getAgent_name(){
return this.agent_name;
}
private String city_id_agent;
public void setCity_id_agent(String city_id_agent){
this.city_id_agent=city_id_agent;
}
public String getCity_id_agent(){
return this.city_id_agent;
}
private String city_name_agent;
public void setCity_name_agent(String city_name_agent){
this.city_name_agent=city_name_agent;
}
public String getCity_name_agent(){
return this.city_name_agent;
}
private Double percentage_of_agent;
public void setPercentage_of_agent(Double percentage_of_agent){
this.percentage_of_agent=percentage_of_agent;
}
public Double getPercentage_of_agent(){
return this.percentage_of_agent;
}
private Double amount_of_agent;
public void setAmount_of_agent(Double amount_of_agent){
this.amount_of_agent=amount_of_agent;
}
public Double getAmount_of_agent(){
return this.amount_of_agent;
}
private String team_leader_id;
public void setTeam_leader_id(String team_leader_id){
this.team_leader_id=team_leader_id;
}
public String getTeam_leader_id(){
return this.team_leader_id;
}
private String team_leader_name;
public void setTeam_leader_name(String team_leader_name){
this.team_leader_name=team_leader_name;
}
public String getTeam_leader_name(){
return this.team_leader_name;
}
private String city_id_of_team_leader;
public void setCity_id_of_team_leader(String city_id_of_team_leader){
this.city_id_of_team_leader=city_id_of_team_leader;
}
public String getCity_id_of_team_leader(){
return this.city_id_of_team_leader;
}
private String city_name_of_team_leader;
public void setCity_name_of_team_leader(String city_name_of_team_leader){
this.city_name_of_team_leader=city_name_of_team_leader;
}
public String getCity_name_of_team_leader(){
return this.city_name_of_team_leader;
}
private Double percentage_of_team_leader;
public void setPercentage_of_team_leader(Double percentage_of_team_leader){
this.percentage_of_team_leader=percentage_of_team_leader;
}
public Double getPercentage_of_team_leader(){
return this.percentage_of_team_leader;
}
private Double amount_of_team_leader;
public void setAmount_of_team_leader(Double amount_of_team_leader){
this.amount_of_team_leader=amount_of_team_leader;
}
public Double getAmount_of_team_leader(){
return this.amount_of_team_leader;
}
private String worker_id;
public void setWorker_id(String worker_id){
this.worker_id=worker_id;
}
public String getWorker_id(){
return this.worker_id;
}
private String worker_name;
public void setWorker_name(String worker_name){
this.worker_name=worker_name;
}
public String getWorker_name(){
return this.worker_name;
}
private String city_id_of_worker;
public void setCity_id_of_worker(String city_id_of_worker){
this.city_id_of_worker=city_id_of_worker;
}
public String getCity_id_of_worker(){
return this.city_id_of_worker;
}
private String city_name_of_worker;
public void setCity_name_of_worker(String city_name_of_worker){
this.city_name_of_worker=city_name_of_worker;
}
public String getCity_name_of_worker(){
return this.city_name_of_worker;
}
private Double percentage_of_worker;
public void setPercentage_of_worker(Double percentage_of_worker){
this.percentage_of_worker=percentage_of_worker;
}
public Double getPercentage_of_worker(){
return this.percentage_of_worker;
}
private Double amount_of_worker;
public void setAmount_of_worker(Double amount_of_worker){
this.amount_of_worker=amount_of_worker;
}
public Double getAmount_of_worker(){
return this.amount_of_worker;
}
}
