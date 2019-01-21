package com.ccunix.icar.basedb.controller;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ccunix.icar.base.controller.BaseMultiController;
import com.ccunix.icar.base.domain.AppDataModel;
import com.ccunix.icar.base.domain.AppDataModel_Sec;
import com.ccunix.icar.basedb.domain.T_s_weather;
import com.ccunix.icar.basedb.service.T_s_weather_Service_Iface;
@Controller
@RequestMapping("T_s_weather_Controller")
public class T_s_weather_Controller extends BaseMultiController {
@Resource
public T_s_weather_Service_Iface t_s_weather_service_iface;







}