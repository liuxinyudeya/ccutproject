package com.ccunix.icar.basedb.domain;
import com.ccunix.icar.base.domain.Base_Model_Business;
import java.util.Date;
public class T_s_user extends Base_Model_Business {
private String name;
public void setName(String name){
this.name=name;
}
public String getName(){
return this.name;
}
private String photo;
public void setPhoto(String photo){
this.photo=photo;
}
public String getPhoto(){
return this.photo;
}
}
