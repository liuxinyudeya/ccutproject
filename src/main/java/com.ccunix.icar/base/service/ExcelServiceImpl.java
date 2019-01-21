package com.ccunix.icar.base.service;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.ccunix.icar.base.controller.ExcelController;

@Service
public class ExcelServiceImpl extends BaseService implements ExcelServiceIface {

	@Override
	public void setExcelSession(List<Object> ls, String[] title, String[] attrs, HttpServletRequest request) {

		List ls_result = new ArrayList<>();
		for (int i = 0; i < ls.size(); i++) {
			Object obj = ls.get(i);
			Field[] fs = obj.getClass().getDeclaredFields();
			Class cls = obj.getClass();
			String[] res = new String[title.length];

			for (int k = 0; k < attrs.length; k++) {
				String a = attrs[k];
				for (int j = 0; j < fs.length; j++) {
					String name = fs[j].getName();
					try {
						fs[j].setAccessible(true); // 设置些属性是可以访问的
						if(fs[j].get(obj) != null){
							String s = fs[j].get(obj).toString();
							if (a.toUpperCase().equals(name.toUpperCase())) {
								res[k] = s;
								break;
							}
						}
						
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			ls_result.add(res);
		}

		request.getSession(true).setAttribute(ExcelController.ExcelFileSession_data, ls_result);
		request.getSession(true).setAttribute(ExcelController.ExcelFileSession_title, title);
	}

}
