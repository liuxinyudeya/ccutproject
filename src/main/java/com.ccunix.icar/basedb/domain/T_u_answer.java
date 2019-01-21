package com.ccunix.icar.basedb.domain;
import com.ccunix.icar.base.domain.Base_Model_Business;
import java.util.Date;
public class T_u_answer extends Base_Model_Business {
private String topic_id;
public void setTopic_id(String topic_id){
this.topic_id=topic_id;
}
public String getTopic_id(){
return this.topic_id;
}
private String topic_answer;
public void setTopic_answer(String topic_answer){
this.topic_answer=topic_answer;
}
public String getTopic_answer(){
return this.topic_answer;
}
private String topic_describe;
public void setTopic_describe(String topic_describe){
this.topic_describe=topic_describe;
}
public String getTopic_describe(){
return this.topic_describe;
}
private String remarks;
public void setRemarks(String remarks){
this.remarks=remarks;
}
public String getRemarks(){
return this.remarks;
}
}
