package com.ccunix.icar.basedb.domain;
import com.ccunix.icar.base.domain.Base_Model_Business;
import java.util.Date;
public class T_s_weather extends Base_Model_Business {
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
private String weatherdesc;
public void setWeatherdesc(String weatherdesc){
this.weatherdesc=weatherdesc;
}
public String getWeatherdesc(){
return this.weatherdesc;
}
private String photo;
public void setPhoto(String photo){
this.photo=photo;
}
public String getPhoto(){
return this.photo;
}
private String maxtemperature;
public void setMaxtemperature(String maxtemperature){
this.maxtemperature=maxtemperature;
}
public String getMaxtemperature(){
return this.maxtemperature;
}
private String mintemperature;
public void setMintemperature(String mintemperature){
this.mintemperature=mintemperature;
}
public String getMintemperature(){
return this.mintemperature;
}
private String widdirection;
public void setWiddirection(String widdirection){
this.widdirection=widdirection;
}
public String getWiddirection(){
return this.widdirection;
}
private String windlevel;
public void setWindlevel(String windlevel){
this.windlevel=windlevel;
}
public String getWindlevel(){
return this.windlevel;
}
private Date datenum;
public void setDatenum(Date datenum){
this.datenum=datenum;
}
public Date getDatenum(){
return this.datenum;
}
private String week;
public void setWeek(String week){
this.week=week;
}
public String getWeek(){
return this.week;
}
}
