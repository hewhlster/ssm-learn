package org.fjh.service.impl;

import java.util.List;

import org.fjh.dao.EmpMapper;
import org.fjh.pojo.Emp;
import org.fjh.pojo.EmpVo;
import org.fjh.service.EmpService;
import org.fjh.tag.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**   
	 * 作用：
     * 版本信息：   
     * 日期：2018年1月24日-上午10:14:56   
     * 版权:樊建华 
*/
@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	private EmpMapper empMapper;
	
	public int addEmp(Emp emp) {
		return empMapper.insert(emp);
	}

	public List<Emp> page(Emp emp) {
		// TODO Auto-generated method stub
		return empMapper.list(emp);
	}

	public int delete(String id) {
		// TODO Auto-generated method stub
		return empMapper.deleteByPrimary(id);
	}

	public Page pagination(Emp emp, Integer pageCurrent) {
		Page ret = new Page();
		//1.查询总记录数,计算总页数
		Integer  total=empMapper.getTotalRow(emp);
		//Integer  pageLength = (total% ret.getPageSize()==0)?total/ ret.getPageSize():total/ ret.getPageSize()+1;
		//ret.setPageLength(pageLength);
		ret.setAllRows(total);
		//2.计算起始、结束行号
		int begin,end=0;
		//if( pageCurrent > pageLength){
			//ret.setPageCurrent(1);//重新设定当前页
		//	begin=0;
		//	end = ret.getPageSize()*1;
		//} else {
			ret.setPageCurrent(pageCurrent);
			begin =  (pageCurrent -1)*ret.getPageSize();
			end =ret.getPageSize();//pageCurrent*ret.getPageSize();
		//}
				
		EmpVo vo = new EmpVo();
		vo.setBegin(begin);
		vo.setEnd(end);
		vo.setDid(emp.getDid());
		vo.setEmpno(emp.getEmpno());
		vo.setEname(emp.getEname());
		vo.setJob(emp.getJob());
		
		
		//3.查询数据
		List data=empMapper.list(vo);
				
		//4.将数据保存到page对象
		ret.setData(data);		
		//5.返回page
		return ret;
	}

	@Override
	public int deleteByIds(List<String> ids) {
		// TODO Auto-generated method stub
		return empMapper.deleteByIds(ids);
	}

	@Override
	public Emp getById(String id) {
		// TODO Auto-generated method stub
		return empMapper.selectByPrimaryKey(id);
	}

	@Override
	public Integer updateById(Emp params) {
		// TODO Auto-generated method stub
		return empMapper.updateByPrimaryKey(params);
	}

	@Override
	public Emp getByEmpno(String empno) {
		// TODO Auto-generated method stub
		return empMapper.getByEmpno(empno);
	}

}
