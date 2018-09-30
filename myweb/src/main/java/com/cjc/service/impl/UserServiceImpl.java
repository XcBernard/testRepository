package com.cjc.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cjc.mapper.UserMapper;
import com.cjc.pojo.User;
import com.cjc.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Resource
	private UserMapper userMapper;
	
	@Override
	public List<User> show() {
		return userMapper.findALL();
	}

}
