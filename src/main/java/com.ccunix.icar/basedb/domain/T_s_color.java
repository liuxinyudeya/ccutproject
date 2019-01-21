package com.ccunix.icar.basedb.domain;
import com.ccunix.icar.base.domain.Base_Model_Business;
import java.util.Date;
public class T_s_color extends Base_Model_Business {
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
private String color_value;
public void setColor_value(String color_value){
this.color_value=color_value;
}
public String getColor_value(){
return this.color_value;
}
}
