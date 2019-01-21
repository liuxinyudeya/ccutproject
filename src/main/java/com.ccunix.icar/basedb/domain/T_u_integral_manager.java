package com.ccunix.icar.basedb.domain;
import com.ccunix.icar.base.domain.Base_Model_Business;
import java.util.Date;
public class T_u_integral_manager extends Base_Model_Business {
private String item_id;
public void setItem_id(String item_id){
this.item_id=item_id;
}
public String getItem_id(){
return this.item_id;
}
private String goods_name;
public void setGoods_name(String goods_name){
this.goods_name=goods_name;
}
public String getGoods_name(){
return this.goods_name;
}
private Integer total_num;
public void setTotal_num(Integer total_num){
this.total_num=total_num;
}
public Integer getTotal_num(){
return this.total_num;
}
private Integer out_num;
public void setOut_num(Integer out_num){
this.out_num=out_num;
}
public Integer getOut_num(){
return this.out_num;
}
private double integral;
public double getIntegral() {
	return integral;
}
public void setIntegral(double integral) {
	this.integral = integral;
}
private String goods_pic;
public void setGoods_pic(String goods_pic){
this.goods_pic=goods_pic;
}
public String getGoods_pic(){
return this.goods_pic;
}
private String attention;
public void setAttention(String attention){
this.attention=attention;
}
public String getAttention(){
return this.attention;
}
private String integral_type;
public void setIntegral_type(String integral_type){
this.integral_type=integral_type;
}
public String getIntegral_type(){
return this.integral_type;
}
}
