package com.cjc.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cjc.service.UserService;

@Controller
public class UsersController {
	@Resource
	private UserService userServicerImpl;
	
	@RequestMapping("show")
	public String show(Model model){
		model.addAttribute("list",userServicerImpl.show());
		return "index.jsp";
	}
}
