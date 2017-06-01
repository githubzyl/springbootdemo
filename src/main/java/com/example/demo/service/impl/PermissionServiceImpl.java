package com.example.demo.service.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.Role;
import com.example.demo.model.User;
import com.example.demo.service.PermissionService;


@Service
public class PermissionServiceImpl implements PermissionService{
	
	@Autowired
	private UserMapper userDao;

	@Override
	public User findByUserName(String username) {
		return userDao.findByUserName(username);
	}

	@Override
	public Set<String> getRolesName(Integer id) {
		return new HashSet<>();
	}

	@Override
	public List<Role> getRoleList(Integer id) {
		return new ArrayList<>();
	}

	@Override
	public Set<String> getPermissionsName(Integer id) {
		return new HashSet<>();
	}
	
}
