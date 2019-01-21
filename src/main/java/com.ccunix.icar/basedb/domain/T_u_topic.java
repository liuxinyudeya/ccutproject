package com.ccunix.icar.basedb.domain;
import com.ccunix.icar.base.domain.Base_Model_Business;
import java.util.Date;
public class T_u_topic extends Base_Model_Business {
private String title_number;
public void setTitle_number(String title_number){
this.title_number=title_number;
}
public String getTitle_number(){
return this.title_number;
}
private String topic_name;
public void setTopic_name(String topic_name){
this.topic_name=topic_name;
}
public String getTopic_name(){
return this.topic_name;
}
private Integer mark;
public void setMark(Integer mark){
this.mark=mark;
}
public Integer getMark(){
return this.mark;
}
private String answer;
public void setAnswer(String answer){
this.answer=answer;
}
public String getAnswer(){
return this.answer;
}
private String remarks;
public void setRemarks(String remarks){
this.remarks=remarks;
}
public String getRemarks(){
return this.remarks;
}
}
