package com.cjc.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cjc.pojo.User;

@Repository
public interface UserMapper {
	List<User> findALL();
}
