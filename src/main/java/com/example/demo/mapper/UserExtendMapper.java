package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import com.example.demo.model.Role;

public interface UserExtendMapper {

	@Select("SELECT DISTINCT r.* from role r,user_role ur where r.id = ur.rid and and ur.uid = #{userId}")
	@ResultType(Role.class)
	List<Role> selectRolesByUserId(@Param("userId") Integer userId);
	
}
