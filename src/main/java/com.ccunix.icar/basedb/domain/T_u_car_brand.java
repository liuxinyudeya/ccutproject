package com.ccunix.icar.basedb.domain;
import com.ccunix.icar.base.domain.Base_Model_Business;
import java.util.Date;
public class T_u_car_brand extends Base_Model_Business {
private String name;
public void setName(String name){
this.name=name;
}
public String getName(){
return this.name;
}
private String first_letter;
public void setFirst_letter(String first_letter){
this.first_letter=first_letter;
}
public String getFirst_letter(){
return this.first_letter;
}
private Integer the_count;
public void setThe_count(Integer the_count){
this.the_count=the_count;
}
public Integer getThe_count(){
return this.the_count;
}
}
