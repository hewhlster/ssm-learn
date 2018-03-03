package org.fjh.service.impl;

import org.fjh.dao.UserMapper;
import org.fjh.pojo.User;
import org.fjh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**   
	 * 作用：
     * 版本信息：   
     * 日期：2018年1月28日-下午4:46:09   
     * 版权:樊建华 
*/

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	@Override
	public User login(String username, String password) {
		// TODO Auto-generated method stub
		return userMapper.selectByUsernameAndPassword(username, password);
	}

}
