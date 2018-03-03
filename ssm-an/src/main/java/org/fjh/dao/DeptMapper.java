package org.fjh.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.fjh.pojo.Dept;
import org.fjh.pojo.Emp;

/**   
	 * 作用：
     * 版本信息：   
     * 日期：2018年1月24日-上午10:13:17   
     * 版权:樊建华 
*/

public interface DeptMapper {
	/*
	public int insert(Emp emp);
	
	public List<Emp> list(Emp emp);
	
	public int deleteByPrimary(String empid);
	public int deleteByIds(@Param("ids")List<String> ids);

	public Integer getTotalRow(Emp params);
	
	public Emp selectByPrimaryKey(String empid);
	public int updateByPrimaryKey(Emp params);

	public Emp getByEmpno(String empno);
	*/
	public Dept selectByPrimaryKey(String id);
	
	public List<Dept> list();


}
