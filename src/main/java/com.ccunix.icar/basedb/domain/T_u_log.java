package com.ccunix.icar.basedb.domain;
import com.ccunix.icar.base.domain.Base_Model_Business;
import java.util.Date;
public class T_u_log extends Base_Model_Business {
private Integer log_level;
public void setLog_level(Integer log_level){
this.log_level=log_level;
}
public Integer getLog_level(){
return this.log_level;
}
private String title;
public void setTitle(String title){
this.title=title;
}
public String getTitle(){
return this.title;
}
private String log_content;
public void setLog_content(String log_content){
this.log_content=log_content;
}
public String getLog_content(){
return this.log_content;
}
private String parameter;
public void setParameter(String parameter){
this.parameter=parameter;
}
public String getParameter(){
return this.parameter;
}
private String tag;
public void setTag(String tag){
this.tag=tag;
}
public String getTag(){
return this.tag;
}
private Date happen_time;
public void setHappen_time(Date happen_time){
this.happen_time=happen_time;
}
public Date getHappen_time(){
return this.happen_time;
}
}
