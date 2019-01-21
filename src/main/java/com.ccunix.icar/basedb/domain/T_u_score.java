package com.ccunix.icar.basedb.domain;
import com.ccunix.icar.base.domain.Base_Model_Business;
import java.util.Date;
public class T_u_score extends Base_Model_Business {
private String user_id;
public void setUser_id(String user_id){
this.user_id=user_id;
}
public String getUser_id(){
return this.user_id;
}
private Integer score;
public void setScore(Integer score){
this.score=score;
}
public Integer getScore(){
return this.score;
}
private String remarks;
public void setRemarks(String remarks){
this.remarks=remarks;
}
public String getRemarks(){
return this.remarks;
}
}
