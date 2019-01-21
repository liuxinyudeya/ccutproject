package com.ccunix.icar.basedb.domain;
import com.ccunix.icar.base.domain.Base_Model_Business;
import java.util.Date;
public class Test extends Base_Model_Business {
private Integer height;
public void setHeight(Integer height){
this.height=height;
}
public Integer getHeight(){
return this.height;
}
private String name;
public void setName(String name){
this.name=name;
}
public String getName(){
return this.name;
}
private Date birth;
public void setBirth(Date birth){
this.birth=birth;
}
public Date getBirth(){
return this.birth;
}
}
