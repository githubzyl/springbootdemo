package com.example.demo.service;

import java.util.List;
import java.util.Set;

import com.example.demo.model.Role;
import com.example.demo.model.User;
import com.example.demo.utils.Pager;

public interface PermissionService {

	User findByUserName(String username);
	
	Set<Role> getRolesByUserId(Integer userId);
	
	Set<String> getRolesName(Integer id);
	
	List<Role> getRoleList(Integer id);
	
	Set<String> getPermissionsName(Integer id);
	
	Pager<User> queryUserForPage(User user, int currentPage, int pageSize);
	
}
