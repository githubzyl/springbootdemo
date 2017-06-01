package com.example.demo.service;

import java.util.List;
import java.util.Set;

import com.example.demo.model.Role;
import com.example.demo.model.User;

public interface PermissionService {

	User findByUserName(String username);
	
	Set<String> getRolesName(Integer id);
	
	List<Role> getRoleList(Integer id);
	
	Set<String> getPermissionsName(Integer id);
}
