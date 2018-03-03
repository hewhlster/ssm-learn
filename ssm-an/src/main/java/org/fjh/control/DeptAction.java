package org.fjh.control;

import java.util.List;
import org.fjh.pojo.Dept;
import org.fjh.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**   
	 * 作用：
     * 版本信息：   
     * 日期：2018年3月3日-下午3:02:08   
     * 版权:樊建华 
*/

@Controller
@RequestMapping("/dept")
public class DeptAction {
	@Autowired
	private DeptService deptService;
	
	@RequestMapping("/list")
	public @ResponseBody List<Dept> list(){
		return deptService.getDeptList();
	}
}
