package com.example.demo.model.extend;

import java.util.Set;

import com.example.demo.model.Role;
import com.example.demo.model.User;

public class UserExtend extends User {

	private static final long serialVersionUID = 1L;
	
	private Set<Role> roles;

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	
}
