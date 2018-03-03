package org.fjh.service;

import org.fjh.pojo.User;

/**   
	 * 作用：
     * 版本信息：   
     * 日期：2018年1月28日-下午4:45:07   
     * 版权:樊建华 
*/

public interface UserService {
	public User login(String username,String password);
}
