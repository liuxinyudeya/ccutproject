package com.ccunix.icar.basedb.domain;
import com.ccunix.icar.base.domain.Base_Model_Business;
import java.util.Date;
public class T_u_money_channel_from_alipay extends Base_Model_Business {
private String alipay_id;
public void setAlipay_id(String alipay_id){
this.alipay_id=alipay_id;
}
public String getAlipay_id(){
return this.alipay_id;
}
private String fund_channel;
public void setFund_channel(String fund_channel){
this.fund_channel=fund_channel;
}
public String getFund_channel(){
return this.fund_channel;
}
private String amount;
public void setAmount(String amount){
this.amount=amount;
}
public String getAmount(){
return this.amount;
}
private String real_amount;
public void setReal_amount(String real_amount){
this.real_amount=real_amount;
}
public String getReal_amount(){
return this.real_amount;
}
}
