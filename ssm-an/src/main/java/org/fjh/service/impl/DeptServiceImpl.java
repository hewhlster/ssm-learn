package org.fjh.service.impl;

import java.util.List;

import org.fjh.dao.DeptMapper;
import org.fjh.pojo.Dept;
import org.fjh.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**   
	 * 作用：
     * 版本信息：   
     * 日期：2018年3月3日-下午3:04:07   
     * 版权:樊建华 
*/

@Service
public class DeptServiceImpl implements DeptService {

	@Autowired
	private DeptMapper deptMapper;
	@Override
	public List<Dept> getDeptList() {
		// TODO Auto-generated method stub
		return deptMapper.list();
	}

}
