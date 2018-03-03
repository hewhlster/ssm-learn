package org.fjh.service;

import java.util.List;

import org.fjh.pojo.Emp;
import org.fjh.tag.Page;

/**   
	 * 作用：
     * 版本信息：   
     * 日期：2018年1月24日-上午10:14:12   
     * 版权:樊建华 
*/

public interface EmpService {
	public int addEmp(Emp emp);
	
	public List<Emp> page(Emp emp);
	
	public int delete(String id);
	public int deleteByIds(List<String> ids);
	
	public Page pagination(Emp emp,Integer pageCurrent);
	
	public Emp getById(String id);
	
	public Integer updateById(Emp params);
	
	public Emp getByEmpno(String empno);

}
