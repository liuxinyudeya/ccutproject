package com.ccunix.icar.basedb.domain;
import com.ccunix.icar.base.domain.Base_Model_Business;
import java.util.Date;
public class T_s_system_config extends Base_Model_Business {
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
private String key;
public void setKey(String key){
this.key=key;
}
public String getKey(){
return this.key;
}
private String value;
public void setValue(String value){
this.value=value;
}
public String getValue(){
return this.value;
}
private String description;
public void setDescription(String description){
this.description=description;
}
public String getDescription(){
return this.description;
}
}
