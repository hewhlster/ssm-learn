package org.fjh.dao;

import org.apache.ibatis.annotations.Param;
import org.fjh.pojo.User;

/**   
	 * 作用：
     * 版本信息：   
     * 日期：2018年1月28日-下午4:43:28   
     * 版权:樊建华 
*/

public interface UserMapper {

	public User selectByUsernameAndPassword(@Param("username")String username,@Param("password")String password);
	
}
