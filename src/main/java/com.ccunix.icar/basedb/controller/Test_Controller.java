package com.ccunix.icar.basedb.controller;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ccunix.icar.base.controller.BaseMultiController;
import com.ccunix.icar.base.domain.AppDataModel;
import com.ccunix.icar.base.domain.AppDataModel_Sec;
import com.ccunix.icar.basedb.domain.Test;
import com.ccunix.icar.basedb.service.Test_Service_Iface;
@Controller
@RequestMapping("Test_Controller")
public class Test_Controller extends BaseMultiController {
@Resource
public Test_Service_Iface test_service_iface;







}