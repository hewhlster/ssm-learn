package org.fjh.converter;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.support.WebBindingInitializer;
import org.springframework.web.context.request.WebRequest;

/**   
	 * 作用：
     * 版本信息：   
     * 日期：2018年1月24日-下午1:01:16   
     * 版权:樊建华 
*/

public class DateBinding implements WebBindingInitializer{

	public void initBinder(WebDataBinder binder, WebRequest arg1) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");  
        dateFormat.setLenient(false);  
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));  
	}


}
