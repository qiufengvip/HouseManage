package com.winit.controller.visitor;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.winit.common.utils.MD5Utils;
import com.winit.entity.pojo.User;
import com.winit.service.UserService;


/**
 * 注册控制
 * @author 555
 *
 */
@Controller
@RequestMapping("web/visitor")
public class RegisterController {
	
	
	@Autowired
	private UserService  userService;

	/**
	 * 注册页面
	 * @param view
	 * @param session
	 * @return
	 */
	@RequestMapping(value = "/toRegister")
	public ModelAndView toRegister(ModelAndView view,HttpSession session){
		view.setViewName("register");
		return view;
		
	}
	
	
	/**
	 * @desc 点击注册
	 * @param user	username: 用户名
					password: 密码
					type: 	      类型
					realname: 真实姓名
					email: 	      邮箱
	 * 
	 * @param view
	 * @return
	 */
	@RequestMapping(value = "/saveAccount")
	@ResponseBody
	public Map<String,Object>   saveAccount(User user,ModelAndView view) {
		user.setPassword(user.getPassword());
		int result= userService.save(user);
		Map<String,Object> map=new HashMap<String,Object>();
		if(result==-1){
			map.put("errorMsg", "账号已存在");
			map.put("flag", "false");
			return map;
		}
		if(result==-2) {
			map.put("errorMsg", "邮箱已存在");
			map.put("flag", "false");
			return map;
		}
		map.put("flag", "true");
		return map;
	}
	
	
	
	
	
	
	
	
	

}
