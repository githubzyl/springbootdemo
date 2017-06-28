package com.example.demo.service.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.UserExtendMapper;
import com.example.demo.mapper.UserMapper;
import com.example.demo.model.Role;
import com.example.demo.model.User;
import com.example.demo.model.UserCriteria;
import com.example.demo.service.PermissionService;
import com.example.demo.utils.Pager;

@Service
public class PermissionServiceImpl implements PermissionService {

	@Autowired
	private UserMapper userDao;

	@Autowired
	private UserExtendMapper userExtendDao;

	@Override
	public User findByUserName(String username) {
		UserCriteria example = new UserCriteria();
		example.createCriteria().andUsernameEqualTo(username);
		List<User> list = userDao.selectByExample(example);
		if (null != list && list.size() > 0) {
			return list.get(0);
		}
		return null;
	}

	@Override
	public Set<Role> getRolesByUserId(Integer userId) {
		List<Role> list = userExtendDao.selectRolesByUserId(userId);
		Set<Role> roles = new HashSet<>(list);
		return roles;
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

	@Override
	public Pager<User> queryUserForPage(User user, int currentPage, int pageSize) {
		Pager<User> pager = new Pager<>();
		pager.setCurPage(currentPage);
		pager.setPageSize(pageSize);
		UserCriteria example = new UserCriteria();
		//example.createCriteria().andUsernameEqualTo(user.getUsername());
		example.setOrderByClause("status asc");
		int totalCount = userDao.countByExample(example);
		pager.setTotalRow(totalCount);
		List<User> list = userDao.selectByExampleWithRowbounds(example,
				new RowBounds((currentPage - 1) * pageSize, pageSize));
		pager.setResult(list);
		return pager;
	}

}
