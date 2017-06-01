package com.example.demo.mapper;

import org.apache.ibatis.annotations.Param;

import com.example.demo.model.User;

public interface UserMapper {
	
	User findByUserName(@Param("username") String username);

}
