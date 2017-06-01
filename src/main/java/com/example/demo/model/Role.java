package com.example.demo.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Role implements Serializable {

	private static final long serialVersionUID = -8139295423941463653L;
	
	private Integer id;
	private String name;
	private Set<User> users = new HashSet<>();
	private Set<Module> modules = new HashSet<>();

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	public Set<Module> getModules() {
		return modules;
	}

	public void setModules(Set<Module> modules) {
		this.modules = modules;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
