package com.ccunix.icar.basedb.domain;
import com.ccunix.icar.base.domain.Base_Model_Business;
import java.util.Date;
public class T_u_franchisee_advise extends Base_Model_Business {
private String source_id;
public void setSource_id(String source_id){
this.source_id=source_id;
}
public String getSource_id(){
return this.source_id;
}
private String content;
public void setContent(String content){
this.content=content;
}
public String getContent(){
return this.content;
}
private Integer is_dispose;
public void setIs_dispose(Integer is_dispose){
this.is_dispose=is_dispose;
}
public Integer getIs_dispose(){
return this.is_dispose;
}
private String dispose_user;
public void setDispose_user(String dispose_user){
this.dispose_user=dispose_user;
}
public String getDispose_user(){
return this.dispose_user;
}
}
