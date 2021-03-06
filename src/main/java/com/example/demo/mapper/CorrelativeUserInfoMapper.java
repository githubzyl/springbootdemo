package com.example.demo.mapper;

import com.example.demo.model.CorrelativeUserInfo;
import com.example.demo.model.CorrelativeUserInfoCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface CorrelativeUserInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_correlative_user_info
     *
     * @mbggenerated
     */
    int countByExample(CorrelativeUserInfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_correlative_user_info
     *
     * @mbggenerated
     */
    int deleteByExample(CorrelativeUserInfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_correlative_user_info
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_correlative_user_info
     *
     * @mbggenerated
     */
    int insert(CorrelativeUserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_correlative_user_info
     *
     * @mbggenerated
     */
    int insertSelective(CorrelativeUserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_correlative_user_info
     *
     * @mbggenerated
     */
    List<CorrelativeUserInfo> selectByExampleWithRowbounds(CorrelativeUserInfoCriteria example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_correlative_user_info
     *
     * @mbggenerated
     */
    List<CorrelativeUserInfo> selectByExample(CorrelativeUserInfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_correlative_user_info
     *
     * @mbggenerated
     */
    CorrelativeUserInfo selectByPrimaryKey(Integer userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_correlative_user_info
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") CorrelativeUserInfo record, @Param("example") CorrelativeUserInfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_correlative_user_info
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") CorrelativeUserInfo record, @Param("example") CorrelativeUserInfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_correlative_user_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(CorrelativeUserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_correlative_user_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(CorrelativeUserInfo record);
}