package com.llicat.mapper;

import com.llicat.entity.Department;
import org.apache.ibatis.annotations.*;

/**
 * @author: lipan
 * @date: 2021/1/21 22:05
 */

public interface DepartmenetMapper {

    @Select("select * from department where id=#{id}")
    public Department getDeptById(Integer id);

    @Delete("delete from department where id=#{id}")
    public int deleteDeptById(Integer id);

    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into department(departmentname) values(#{departmentName})")
    public int insertDept(Department department);

    @Update("update department set departmentname=#{departmentName} where id=#{id}")
    public int updateDept(Department department);

}
