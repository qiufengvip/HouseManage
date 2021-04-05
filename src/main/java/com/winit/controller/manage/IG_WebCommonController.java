package com.winit.controller.manage;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



/**
 * @desc  管理员界面
 * @author qiufeng
 * @version 1.0
 * @time 2021年4月5日 下午11:41:56
 */

@Controller
@RequestMapping("web/manage")
public class IG_WebCommonController {
	

	
	/**
	 * @desc 退出登录
	 * @param session
	 * @param view
	 * @return
	 */
	@RequestMapping(value = "/logout")
	public ModelAndView invalidateSession(HttpSession session,ModelAndView view) {
		session.invalidate();
		view.setViewName("login");
		return view;
	}
	
	/**
	 * @desc 用户信息界面
	 * @param session
	 * @param view
	 * @return
	 */
	@RequestMapping(value = "/toUserinfo")
	public ModelAndView toUserinfo(HttpSession session,ModelAndView view) {
		view.setViewName("manage/IG_UserInfo");
		return view;
	}
	
	
	/**
	 * @desc 公告新闻
	 * @param session
	 * @param view
	 * @return
	 */
	@RequestMapping(value = "/toMessage")
	public ModelAndView toMessage(HttpSession session,ModelAndView view) {
		view.setViewName("manage/IG_Message");
		return view;
	}
	
	/**
	 * @desc 家政服务类别
	 * @param session
	 * @param view
	 * @return
	 */
	@RequestMapping(value = "/toClassInfo")
	public ModelAndView toclassInfo(HttpSession session,ModelAndView view) {
		view.setViewName("manage/IG_Class");
		return view;
	}
	
	
	/**
	 * @desc 保姆级别信息
	 * @param session
	 * @param view
	 * @return
	 */
	@RequestMapping(value = "/toLevelInfo")
	public ModelAndView toLevelInfo(HttpSession session,ModelAndView view) {
		view.setViewName("manage/IG_Level");
		return view;
	}
	
	
	/**
	 * @desc 需求信息
	 * @param session
	 * @param view
	 * @return
	 */
	@RequestMapping(value = "/toNeedInfo")
	public ModelAndView toNeedInfo(HttpSession session,ModelAndView view) {
		view.setViewName("manage/IG_Need");
		return view;
	}
	
	/**
	 * @desc 收益信息
	 * @param session
	 * @param view
	 * @return
	 */
	@RequestMapping(value = "/toIncomeInfo")
	public ModelAndView toIncomeInfo(HttpSession session,ModelAndView view) {
		view.setViewName("manage/IG_Income");
		return view;
	}
}
