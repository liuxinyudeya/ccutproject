package com.ccunix.icar.basedb.domain;
import com.ccunix.icar.base.domain.Base_Model_Business;
import java.util.Date;
public class T_s_administrive_area extends Base_Model_Business {
private String is_open;
public void setIs_open(String is_open){
this.is_open=is_open;
}
public String getIs_open(){
return this.is_open;
}
private String name;
public void setName(String name){
this.name=name;
}
public String getName(){
return this.name;
}
private Integer this_level;
public void setThis_level(Integer this_level){
this.this_level=this_level;
}
public Integer getThis_level(){
return this.this_level;
}
private String parent_id;
public void setParent_id(String parent_id){
this.parent_id=parent_id;
}
public String getParent_id(){
return this.parent_id;
}
private Integer is_direct;
public void setIs_direct(Integer is_direct){
this.is_direct=is_direct;
}
public Integer getIs_direct(){
return this.is_direct;
}
}
