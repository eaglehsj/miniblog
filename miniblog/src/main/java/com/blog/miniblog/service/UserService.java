package com.blog.miniblog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.servlet.tags.EscapeBodyTag;

import com.blog.miniblog.entity.User;
import com.blog.miniblog.repository.UserMapper;



@Component
@Transactional
public class UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	/**
	 * @Title :login
	 * @Description:用户登录
	 * 
	 */
	public User login(String phone,String password){
		User one = new User();
		one.setPhone(phone);
		one.setPassword(password);
		User user=userMapper.selectOne(one);
		if(user != null){
			user.setPassword(null);
			return user;
		}
		else {
			return null;
		}
	}
	
	
	
	
	
	
	
	
	
}
