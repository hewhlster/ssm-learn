package org.fjh.control;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.fjh.pojo.Emp;
import org.fjh.service.EmpService;
import org.fjh.tag.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 作用： 版本信息： 日期：2018年1月24日-上午10:16:50 版权:樊建华
 */

@Controller
@RequestMapping("/emp")
public class EmpAction {
	@Autowired
	private EmpService empService;

	@RequestMapping("/saveorupdate")
	public @ResponseBody Map saveOrUpdate(Emp e) {
		System.out.println("==>" + e);
		int ret = 0;
		if(e.getEmpid().length()==0)
			ret=empService.addEmp(e);
		else
			ret=empService.updateById(e);
		
		Map map = new HashMap();
		map.put("ret", ret);
		return map;
	}
	
	@RequestMapping("/list")
	public String List(HttpServletRequest requset,Emp e,Model model,@RequestParam(defaultValue="1")Integer pageCurrent){
		
		Page page = empService.pagination(e, pageCurrent);
		//以下代码以转移到pager.jar
//		String url=requset.getRequestURL().toString();
//		StringBuffer paramsurl= new StringBuffer();
//		Map params= requset.getParameterMap();
//		Set<String> keySet = params.keySet();
//		for(String key:keySet){
//			Object value=params.get(key);
//			if( value instanceof String[]){
//				if(   ((String[])value)[0].length()>0  )
//					paramsurl.append("&").append(key).append("=").append(((String[])value)[0]);
//			} else{
//				if( ((String)value).length() >0)
//					paramsurl.append("&").append(key).append("=").append(value);
//			}
//		}
//		
//		url=url+"?"+paramsurl;
//		System.out.println("--->"+paramsurl);
//		if(url!=null)
//			page.setUrl(new StringBuffer(url));
		
		
		//java.util.List<Emp> data = empService.page(e);
		model.addAttribute("page", page);
		return "list";
	}
	
	
	@RequestMapping(value="/deleteselect",method=RequestMethod.POST)
	public @ResponseBody Map deleteSelect(@RequestParam("ids")String[] ids){
		List list = new ArrayList(Arrays.asList(ids));
		int ret=empService.deleteByIds( list);
		Map map = new HashMap();
		map.put("ret", ret);
		return map;
	}
	
	
	@RequestMapping("/delete")
	public  String delete(String empid){
		empService.delete(empid);
		return "redirect:/emp/list.do";
	}
	
	@RequestMapping("/detail")
	public @ResponseBody Emp detail(String id){
		Emp ret = empService.getById(id);
		return ret;
	}
	
	
	@RequestMapping("/checkempno")
	public @ResponseBody Map checkEmpNo(String empno){
		Emp ret=empService.getByEmpno(empno);
		HashMap map = new HashMap();
		if(ret!=null){
			map.put("valid",false);//校验不通过
		} else {
			map.put("valid",true);//通过校验
		}
		return map;
	}
	
	// 注册日期转换器
	@InitBinder
	public void initBinder(WebDataBinder b) {
		//b.registerCustomEditor(java.util.Date.class, new SpecialDateEditor());
	}
}
