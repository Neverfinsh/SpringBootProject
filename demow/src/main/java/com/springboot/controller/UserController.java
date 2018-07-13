package com.springboot.controller;

import java.util.Date;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.User;

//@Controller
@RestController
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/getUser")
//	@ResponseBody
	public User getUser() {

		User user = new User();
		user.setAge(18);
		user.setName("Liuwu");
		user.setBirthday(new Date());

		return user;
	}
	
	/**
	 *  使用springboot的controller的访问方式
	 */
	@RequestMapping("getUserBoot")
	 public User getUserSpringBoot(){
		User user = new User();
			user.setAge(18);
			user.setName("Liuwu");
			user.setBirthday(new Date());
		 
		return user;
	 }
	

}
