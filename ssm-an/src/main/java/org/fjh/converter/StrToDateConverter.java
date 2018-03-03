package org.fjh.converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

/**   
	 * 作用：
     * 版本信息：   
     * 日期：2018年1月24日-上午11:21:19   
     * 版权:樊建华 
*/

public class StrToDateConverter implements Converter<String, Date> {
	public Date convert(String source) {
		try {
			System.out.println("=====================================>");
			Date date = new SimpleDateFormat("yyyy-MM-dd").parse(source);
			return date;
		} catch (ParseException e) {
			System.out.println("converter error!!!");
		}
		return null;	
	}
}
