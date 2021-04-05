package com.winit.controller.manage;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.winit.common.baseclass.PageDto;
import com.winit.common.baseclass.ResultUtil;
import com.winit.common.utils.SessionUtil;
import com.winit.entity.dto.ResultDto;
import com.winit.entity.pojo.User;
import com.winit.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController{
	
	@Autowired
	private UserService userService;
	
	
	/**
	 * @desc  获取所有用户信息
	 * @param user 	id:  
					page: 1  页数
					rows: 10  行数
					
					classId:    家政服务类别	 可选
					levelId: 	级别			 可选
					type: 1             类型			 可选
	 * @return
	 */
	@RequestMapping(value="/getUserList",method = RequestMethod.POST)
	public ResultDto userList(User user){
		PageDto<User> pageDto = new PageDto<User>();
		List<User> list = userService.userList(user);
		PageInfo<User> page = new PageInfo<User>(list);
		pageDto.setTotal(page.getTotal());
		pageDto.setResult(list);
		return ResultUtil.success(pageDto, null);
	}
	
	@RequestMapping(value="/allUser/{type}")
	public ResultDto allUser(@PathVariable("type") Integer type){
		return ResultUtil.success(userService.allUser(type), null);
	}
	@RequestMapping(value="/allUser")
	public ResultDto getUser(User user){
		 ResultDto resultDto =new ResultDto();
		List<User> list = userService.getallUser(user);
		if(list.size()>0) {
			resultDto.setResultCode("200");
			resultDto.setData(list);
		}
		return resultDto;
	}

	
	/**
	 * @desc 修改用户 
	 * @param 	user 
	  			id: 		用户id
				username: 	用户名
				password: 	密码
				realname: 	真实姓名
				email:   	邮箱
				type: 		身份 
				
				补全信息
				id: 2  										用户id
				abilityId: 19  								能力
				priceId: 29  								期望工资	
				ageId: 13  									年龄
				educationId: 6  							学历		
				classId: -26214399   						家政服务类别			
				levelId: 187695105    						级别
				provinceCode: 410000  						省代码			
				cityCode: 411400  							市区代码	
				countyCode: 411421  						县区代码
				expericeId: 1  								经验
				cardNumber: 1  								身份证号
				phoneNumber: 2  							手机号		
				photoUrl: file/images/2/1617638631525.png 	头像	
	 * 	
	 * @return
	 */
	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public ResultDto addUser(User user){
		ResultDto resultdto =new ResultDto();
		resultdto=userService.saveUser(user);
		return resultdto;
	}
	
	@RequestMapping(value = "/editUser", method = RequestMethod.POST)
	public ResultDto editUser(User user, HttpSession session){
		if(StringUtils.isBlank(user.getRealname())){
			return ResultUtil.fail("姓名不能为空");
		}
		User u = SessionUtil.getUserDetail(session);
		user.setId(u.getId());
		userService.save(user);
		return ResultUtil.success("用户信息修改成功");
	}
	
	@RequestMapping(value = "/updatePwd", method = RequestMethod.POST)
	public ResultDto updatePwd(User user, HttpSession session){
		if(StringUtils.isBlank(user.getPassword())){
			return ResultUtil.fail("500", "密码不能为空");
		}
		User u = SessionUtil.getUserDetail(session);
		userService.updatePwd(user.getPassword(), u.getId());
		return ResultUtil.success("密码修改成功");
	}
	
	
	/**
	 * @desc  删除用户  
	 * @param user   id: 用户id
	 * @return
	 */
	@RequestMapping(value = "/deleteUser")
	public ResultDto deleteUser(User user){
		userService.deleteUser(user.getId());
		return ResultUtil.success("删除成功");
	}
	
	
	/**
	 * @desc  管理员-审核用户通过
	 * @param user 	id: 用户id
					isEnable: 状态 1 = 通过  0 = 不通过
	 * 
	 * @param session
	 * @return
	 */
	@RequestMapping(value = "/updateselective", method = RequestMethod.POST)
	public ResultDto updateselective(User user, HttpSession session){
		   ResultDto resultdto =new ResultDto();
		   User u = userService.getByUsername(user.getUsername());
		   if(u != null && u.getPassword().equals(user.getPassword())){}
           int result= userService.updateselective(user);
          if(result>0) {
        	  resultdto.setResultCode("200");
        	  resultdto.setResultDesc("成功");
          }else { 
            	  resultdto.setResultCode("400");
            	  resultdto.setResultDesc("后台报错");
          }
          return resultdto;
	}
}
