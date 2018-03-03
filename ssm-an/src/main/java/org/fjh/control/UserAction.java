package org.fjh.control;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.fjh.pojo.User;
import org.fjh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**   
	 * 作用：
     * 版本信息：   
     * 日期：2018年1月28日-下午4:47:31   
     * 版权:樊建华 
*/

@Controller
@RequestMapping("/user")
public class UserAction {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/login")
	public @ResponseBody Map login(String username,String password,HttpSession session){
		Map map = new HashMap();
		User loginedUser = userService.login(username, password);
		if(null!=loginedUser){
			session.setAttribute("logineduser", loginedUser);
			map.put("ret", 1);
			map.put("url", "emp/list.do");
		} else {
			map.put("ret", 0);
		}
		return map;
	}
	
	@RequestMapping("/logout")
	public void logout(HttpSession session,HttpServletResponse response,HttpServletRequest request) throws IOException{
		//删除登陆信息
		session.removeAttribute("logineduser");
		//会话发上失效
		session.invalidate();
		//返回登陆视图
		String path = request.getContextPath();
		String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
	
		response.sendRedirect(basePath+"login.jsp");
	} 
	

}
