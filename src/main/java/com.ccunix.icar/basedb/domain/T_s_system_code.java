package com.ccunix.icar.basedb.domain;
import com.ccunix.icar.base.domain.Base_Model_Business;
import java.util.Date;
public class T_s_system_code extends Base_Model_Business {
private String type;
public void setType(String type){
this.type=type;
}
public String getType(){
return this.type;
}
private String code;
public void setCode(String code){
this.code=code;
}
public String getCode(){
return this.code;
}
private String name;
public void setName(String name){
this.name=name;
}
public String getName(){
return this.name;
}
private String city_id;
public void setCity_id(String city_id){
this.city_id=city_id;
}
public String getCity_id(){
return this.city_id;
}
private String city_name;
public void setCity_name(String city_name){
this.city_name=city_name;
}
public String getCity_name(){
return this.city_name;
}
private String description;
public void setDescription(String description){
this.description=description;
}
public String getDescription(){
return this.description;
}
}
