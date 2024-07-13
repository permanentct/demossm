package com.itheima.dao;

import com.itheima.domain.Student;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentDAO {
    @Insert("insert into test.student(s_id, s_name, s_birth, s_sex) values (#{s_id},#{s_name},#{s_birth},#{s_sex})")
    public void save(Student student);
    @Update("update test.student set s_name=#{s_name},s_birth=#{s_birth},s_id=#{s_id},s_sex=#{s_sex} where s_id=#{s_id}")
    public void update(Student student);
    @Delete("delete from test.student where s_id=#{s_id}")
    public void delete(Integer s_id);
    @Select("select * from test.student where s_id=#{s_id}")
    public Student getById(Integer s_id);
    @Select("select * from test.student ")
    public List<Student> getAll();


}
